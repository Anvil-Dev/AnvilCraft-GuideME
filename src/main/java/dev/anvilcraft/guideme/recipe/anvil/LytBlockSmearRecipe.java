package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytBlockSlot;
import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockSmearRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;

public class LytBlockSmearRecipe extends LytVBox {
    private final LytBlockSlot inputBlocks;
    private final LytBlockSlot outputBlocks;

    public LytBlockSmearRecipe(BlockSmearRecipe recipe) {
        append(inputBlocks = new LytBlockSlot(recipe.getInputBlocks()));
        append(
            outputBlocks = new LytBlockSlot(
                BlockStateUtil.ChanceBlockStatesTransToBlockStatePredicates(
                    recipe.getResultBlocks()
                )
            )
        );
        inputBlocks.setAnvilAnimation(true);
        inputBlocks.setHasAnvil(true);
        outputBlocks.setHasAnvil(true);
    }

    @Override
    public void render(RenderContext context) {
        inputBlocks.render(context);
        outputBlocks.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputBlocks.layout(context, x + 20, y - 2, availableWidth);
        outputBlocks.layout(context, x + 87, y + 15, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
