package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytBlockSlot;
import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCompressRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytSlot;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;

public class LytBlockCompressRecipe extends LytVBox {
    private final LytBlockSlot inputBlocks;
    private final LytBlockSlot outputBlocks;
    private final LytSlot inputFirstSlot;
    private final LytSlot inputSecondSlot;
    private final LytSlot outputSlot;

    public LytBlockCompressRecipe(BlockCompressRecipe recipe) {
        append(inputBlocks = new LytBlockSlot(recipe.getInputBlocks()));
        append(
            outputBlocks = new LytBlockSlot(
                BlockStateUtil.ChanceBlockStatesTransToBlockStatePredicates(
                    recipe.getResultBlocks()
                )
            )
        );
        inputBlocks.setAnvilAnimation(true);

        append(inputFirstSlot = new LytSlot(BlockStateUtil.transToIngredient(inputBlocks.blockStatePredicates.getFirst())));
        append(inputSecondSlot = new LytSlot(BlockStateUtil.transToIngredient(inputBlocks.blockStatePredicates.getLast())));
        append(outputSlot = new LytSlot(BlockStateUtil.transToIngredient(outputBlocks.blockStatePredicates.getFirst())));
    }

    @Override
    public void render(RenderContext context) {
        inputBlocks.render(context);
        outputBlocks.render(context);
        inputFirstSlot.render(context);
        inputSecondSlot.render(context);
        outputSlot.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputBlocks.layout(context, x + 20, y - 2, availableWidth);
        outputBlocks.layout(context, x + 50, y + 15, availableWidth);
        inputFirstSlot.layout(context, x, y + 10, availableWidth);
        inputSecondSlot.layout(context, x, y + 30, availableWidth);
        outputSlot.layout(context, x + 70, y + 30, availableWidth);
        int size = Math.max(inputBlocks.blockStatePredicates.size(), outputBlocks.blockStatePredicates.size());
        return new LytRect(x, y, 90, size * 24);
    }
}
