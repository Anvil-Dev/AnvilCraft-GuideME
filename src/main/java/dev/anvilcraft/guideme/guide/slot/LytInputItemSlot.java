package dev.anvilcraft.guideme.guide.slot;

import dev.anvilcraft.lib.recipe.component.ItemIngredientPredicate;
import guideme.document.LytRect;
import guideme.document.block.LytBlock;
import guideme.document.interaction.GuideTooltip;
import guideme.document.interaction.InteractiveElement;
import guideme.document.interaction.ItemTooltip;
import guideme.layout.LayoutContext;
import guideme.render.GuiAssets;
import guideme.render.GuiSprite;
import guideme.render.RenderContext;
import lombok.Getter;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class LytInputItemSlot extends LytBlock implements InteractiveElement {
    private static final int ITEM_SIZE = 16;
    private static final int SLOT_SIZE = 18;
    private static final int CYCLE_TIME = 2000;

    @Getter
    private final List<ItemIngredientPredicate> mergedIngredients;

    public LytInputItemSlot(List<ItemIngredientPredicate> mergedIngredients) {
        this.mergedIngredients = mergedIngredients;
    }

    @Override
    protected LytRect computeLayout(LayoutContext context, int x, int y, int availableWidth) {
        int size = mergedIngredients.size();
        if (size <= 1) {
            return new LytRect(x + 32, y + 16, SLOT_SIZE, SLOT_SIZE);
        } else if (size <= 4) {
            return new LytRect(x + 24, y + 12, SLOT_SIZE * 2, SLOT_SIZE * 2);
        } else if (size <= 6) {
            return new LytRect(x + 8, y + 8, SLOT_SIZE * 3, SLOT_SIZE * 2);
        } else {
            return new LytRect(x + 8, y + 4, SLOT_SIZE * 3, SLOT_SIZE * 3);
        }
    }

    @Override
    public void render(RenderContext context) {
        GuiSprite texture = GuiAssets.SLOT;
        var x = bounds.x();
        var y = bounds.y();
        int size = mergedIngredients.size();
        if (size == 1) {
            ItemIngredientPredicate ingredient = mergedIngredients.getFirst();
            LytRect lytRect = new LytRect(bounds.x(), bounds.y(), SLOT_SIZE, SLOT_SIZE);
            context.renderItem(ingredient.getItems()[0], x + 1, y + 1, ITEM_SIZE, ITEM_SIZE);
            context.fillIcon(lytRect, texture);
        } else if (size <= 4) {
            for (int i = 0; i < size; i++) {
                int row = i / 2;
                int col = i % 2;
                ItemStack stack = getDisplayedStack(mergedIngredients.get(i).getItems());
                LytRect lytRect = new LytRect(bounds.x() + SLOT_SIZE * col, bounds.y() + SLOT_SIZE * row, SLOT_SIZE, SLOT_SIZE);
                context.fillIcon(lytRect, texture);
                context.renderItem(stack, lytRect.x() + 1, lytRect.y() + 1, ITEM_SIZE, ITEM_SIZE);
            }
        } else if (size <= 6) {
            for (int i = 0; i < size; i++) {
                int row = i / 3;
                int col = i % 3;
                ItemStack stack = getDisplayedStack(mergedIngredients.get(i).getItems());
                LytRect lytRect = new LytRect(bounds.x() + SLOT_SIZE * col, bounds.y() + SLOT_SIZE * row, SLOT_SIZE, SLOT_SIZE);
                context.fillIcon(lytRect, texture);
                context.renderItem(stack, lytRect.x() + 1, lytRect.y() + 1, ITEM_SIZE, ITEM_SIZE);
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (i > 9) break;
                int row = i / 3;
                int col = i % 3;
                ItemStack stack = getDisplayedStack(mergedIngredients.get(i).getItems());
                LytRect lytRect = new LytRect(bounds.x() + SLOT_SIZE * col, bounds.y() + SLOT_SIZE * row, SLOT_SIZE, SLOT_SIZE);
                context.fillIcon(lytRect, texture);
                context.renderItem(stack, lytRect.x() + 1, lytRect.y() + 1, ITEM_SIZE, ITEM_SIZE);
            }
        }
    }

    @Override
    public Optional<GuideTooltip> getTooltip(float mouseX, float mouseY) {
        int size = mergedIngredients.size();
        if (size == 0) return Optional.empty();

        if (size == 1) {
            return Optional.of(new ItemTooltip(getDisplayedStack(mergedIngredients.getFirst().getItems())));
        } else {
            int cols;
            if (size <= 4) {
                cols = 2;
            } else {
                cols = 3;
            }

            int localMouseX = (int) (mouseX - bounds.x());
            int localMouseY = (int) (mouseY - bounds.y());

            if (localMouseX < 0 || localMouseY < 0) {
                return Optional.empty();
            }

            int col = localMouseX / 18;
            int row = localMouseY / 18;

            int index = row * cols + col;

            if (index < size) {
                return Optional.of(new ItemTooltip(getDisplayedStack(mergedIngredients.get(index).getItems())));
            }
        }
        return InteractiveElement.super.getTooltip(mouseX, mouseY);
    }

    private ItemStack getDisplayedStack(ItemStack[] stacks) {
        if (stacks.length == 0) {
            return ItemStack.EMPTY;
        }
        var cycle = System.nanoTime() / TimeUnit.MILLISECONDS.toNanos(CYCLE_TIME);
        return stacks[(int) (cycle % stacks.length)];
    }

    @Override
    protected void onLayoutMoved(int deltaX, int deltaY) {

    }

    @Override
    public void renderBatch(RenderContext context, MultiBufferSource buffers) {

    }
}
