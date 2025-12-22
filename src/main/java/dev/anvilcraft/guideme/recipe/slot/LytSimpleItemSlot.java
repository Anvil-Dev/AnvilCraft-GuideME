package dev.anvilcraft.guideme.recipe.slot;

import guideme.document.LytRect;
import guideme.document.block.LytBlock;
import guideme.document.interaction.GuideTooltip;
import guideme.document.interaction.InteractiveElement;
import guideme.document.interaction.ItemTooltip;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class LytSimpleItemSlot extends LytBlock implements InteractiveElement {
    private static final int CYCLE_TIME = 2000;

    @Setter
    @Getter
    private boolean largeSlot;
    @Setter
    @Getter
    private int itemSize;

    private final ItemStack[] stacks;

    public LytSimpleItemSlot(Ingredient ingredient) {
        this.stacks = ingredient.getItems();
    }

    public LytSimpleItemSlot(ItemStack stack) {
        this.stacks = new ItemStack[] { stack };
    }

    @Override
    protected LytRect computeLayout(LayoutContext context, int x, int y, int availableWidth) {
        return new LytRect(x, y, itemSize, itemSize);
    }

    @Override
    protected void onLayoutMoved(int deltaX, int deltaY) {
    }

    @Override
    public void renderBatch(RenderContext context, MultiBufferSource buffers) {

    }

    @Override
    public void render(RenderContext context) {
        var stack = getDisplayedStack();
        if (!stack.isEmpty()) {
            context.renderItem(stack, bounds.x(), bounds.y(), 1, itemSize, itemSize);
        }
    }

    @Override
    public Optional<GuideTooltip> getTooltip(float x, float y) {
        var stack = getDisplayedStack();
        if (stack.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(new ItemTooltip(stack));
    }

    private ItemStack getDisplayedStack() {
        if (stacks.length == 0) {
            return ItemStack.EMPTY;
        }

        var cycle = System.nanoTime() / TimeUnit.MILLISECONDS.toNanos(CYCLE_TIME);
        return stacks[(int) (cycle % stacks.length)];
    }
}
