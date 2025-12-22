package dev.anvilcraft.guideme.guide.recipe;

import dev.anvilcraft.guideme.guide.slot.LytBlockSlot;
import dev.anvilcraft.guideme.guide.slot.LytInputItemSlot;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.ItemInjectRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;

public class LytItemInjectRecipe extends LytVBox {
    private final LytBlockSlot inputBlockSlot;
    private final LytBlockSlot outputBlockSlot;
    private final LytInputItemSlot inputItemSlot;

    public LytItemInjectRecipe(ItemInjectRecipe recipe) {
        append(inputBlockSlot = new LytBlockSlot(recipe.getInputBlocks()));
        append(outputBlockSlot = new LytBlockSlot(recipe.getFirstResultBlock().state()));
        inputBlockSlot.setAnvilAnimation(true);
        inputBlockSlot.setHasAnvil(true);
        append(inputItemSlot = new LytInputItemSlot(recipe.getInputItems()));
    }

    @Override
    public void render(RenderContext context) {
        inputBlockSlot.render(context);
        outputBlockSlot.render(context);
        inputItemSlot.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputBlockSlot.layout(context, x + 70, y + 15, availableWidth);
        outputBlockSlot.layout(context, x + 105, y + 15, availableWidth);
        inputItemSlot.layout(context, x, y, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
