package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.box.BetterLytVBox;
import dev.anvilcraft.guideme.recipe.box.LytBlockSlot;
import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCompressRecipe;
import guideme.document.LytRect;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;

public class LytBlockCompressRecipe extends BetterLytVBox {
    private final LytBlockSlot inputBlocks;
    private final LytBlockSlot outputBlocks;

    public LytBlockCompressRecipe(BlockCompressRecipe recipe) {
        append(inputBlocks = new LytBlockSlot(recipe.getInputBlocks()));
        append(outputBlocks = new LytBlockSlot(
            BlockStateUtil.ChanceBlockStatesTransToBlockStatePredicates(recipe.getResultBlocks()))
        );
        inputBlocks.setAnvilAnimation(true);
    }

    @Override
    public void render(RenderContext context) {
        inputBlocks.render(context);
        outputBlocks.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputBlocks.layout(context, x + 10, y + 10, availableWidth);
        outputBlocks.layout(context, x + 30, y + 10, availableWidth);
        int size = Math.max(inputBlocks.blockStatePredicates.size(), outputBlocks.blockStatePredicates.size());
        return new LytRect(x, y, 90, size * 32);
    }
}
