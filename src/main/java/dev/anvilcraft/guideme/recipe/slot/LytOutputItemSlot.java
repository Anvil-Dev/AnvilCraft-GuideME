package dev.anvilcraft.guideme.recipe.slot;

import dev.anvilcraft.guideme.recipe.tooltip.ChanceItemTooltip;
import dev.anvilcraft.lib.recipe.component.ChanceItemStack;
import guideme.document.LytRect;
import guideme.document.block.LytBlock;
import guideme.document.interaction.GuideTooltip;
import guideme.document.interaction.InteractiveElement;
import guideme.layout.LayoutContext;
import guideme.render.GuiAssets;
import guideme.render.GuiSprite;
import guideme.render.RenderContext;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Optional;

public class LytOutputItemSlot extends LytBlock implements InteractiveElement {
    private static final int ITEM_SIZE = 16;

    private final List<ChanceItemStack> resultItems;

    public LytOutputItemSlot(List<ChanceItemStack> resultItems) {
        this.resultItems = resultItems;
    }

    @Override
    protected LytRect computeLayout(LayoutContext context, int x, int y, int availableWidth) {
        int size = resultItems.size();
        if (size == 0) return null;
        if (size == 1) {
            return new LytRect(x + 16, y + 16, ITEM_SIZE, ITEM_SIZE);
        } else if (size <= 4) {
            return new LytRect(x + 8, y + 8, ITEM_SIZE * 2, ITEM_SIZE * 2);
        } else if (size <= 6) {
            return new LytRect(x, y, ITEM_SIZE * 3, ITEM_SIZE * 2);
        } else {
            return new LytRect(x, y, ITEM_SIZE * 3, ITEM_SIZE * (size / 3));
        }
    }

    @Override
    public void render(RenderContext context) {
        GuiSprite texture = GuiAssets.SLOT;
        var x = bounds.x();
        var y = bounds.y();
        int size = resultItems.size();
        if (size == 1) {
            ItemStack stack = resultItems.getFirst().stack();
            LytRect lytRect = new LytRect(bounds.x(), bounds.y(), 18, 18);
            context.renderItem(stack, x + 1, y + 1, ITEM_SIZE, ITEM_SIZE);
            context.fillIcon(lytRect, texture);
        } else if (size <= 4) {
            for (int i = 0; i < size; i++) {
                int row = i / 2;
                int col = i % 2;
                ItemStack stack = resultItems.get(i).stack();
                LytRect lytRect = new LytRect(bounds.x() + 18 * col, bounds.y() + 18 * row, 18, 18);
                context.fillIcon(lytRect, texture);
                context.renderItem(stack, lytRect.x() + 1, lytRect.y() + 1, ITEM_SIZE, ITEM_SIZE);
            }
        } else if (size <= 6) {
            for (int i = 0; i < size; i++) {
                int row = i / 3;
                int col = i % 3;
                ItemStack stack = resultItems.get(i).stack();
                LytRect lytRect = new LytRect(bounds.x() + 18 * col, bounds.y() + 18 * row, 18, 18);
                context.fillIcon(lytRect, texture);
                context.renderItem(stack, lytRect.x() + 1, lytRect.y() + 1, ITEM_SIZE, ITEM_SIZE);
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (i > 9) break;
                int row = i / 3;
                int col = i % 3;
                ItemStack stack = resultItems.get(i).stack();
                LytRect lytRect = new LytRect(bounds.x() + 18 * col, bounds.y() + 18 * row, 18, 18);
                context.fillIcon(lytRect, texture);
                context.renderItem(stack, lytRect.x() + 1, lytRect.y() + 1, ITEM_SIZE, ITEM_SIZE);
            }
        }
    }

    @Override
    public Optional<GuideTooltip> getTooltip(float mouseX, float mouseY) {
        int size = resultItems.size();
        if (size == 0) return Optional.empty();

        if (size == 1) {
            return Optional.of(new ChanceItemTooltip(resultItems.getFirst()));
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
                return Optional.of(new ChanceItemTooltip(resultItems.get(index)));
            }
        }
        return InteractiveElement.super.getTooltip(mouseX, mouseY);
    }

    @Override
    protected void onLayoutMoved(int deltaX, int deltaY) {

    }

    @Override
    public void renderBatch(RenderContext context, MultiBufferSource buffers) {

    }
}
