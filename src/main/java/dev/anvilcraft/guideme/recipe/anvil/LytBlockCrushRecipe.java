package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytBlockSlot;
import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCrushRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytSlot;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;

public class LytBlockCrushRecipe extends LytVBox {
    private final LytBlockSlot inputBlocks;
    private final LytBlockSlot outputBlocks;
    private final LytSlot inputSlot;
    private final LytSlot outputSlot;


    public LytBlockCrushRecipe(BlockCrushRecipe recipe) {
        append(inputBlocks = new LytBlockSlot(recipe.getInputBlocks()));
        append(
            outputBlocks = new LytBlockSlot(
                BlockStateUtil.ChanceBlockStatesTransToBlockStatePredicates(
                    recipe.getResultBlocks()
                )
            )
        );
        inputBlocks.setAnvilAnimation(true);
        append(inputSlot = new LytSlot(BlockStateUtil.transToIngredient(inputBlocks.blockStatePredicates.getFirst())));
        append(outputSlot = new LytSlot(BlockStateUtil.transToIngredient(outputBlocks.blockStatePredicates.getFirst())));
    }

    @Override
    public void render(RenderContext context) {
        inputBlocks.render(context);
        outputBlocks.render(context);
        inputSlot.render(context);
        outputSlot.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputBlocks.layout(context, x + 20, y + 10, availableWidth);
        outputBlocks.layout(context, x + 50, y + 10, availableWidth);
        inputSlot.layout(context, x, y + 23, availableWidth);
        outputSlot.layout(context, x + 70, y + 23, availableWidth);
        return new LytRect(x, y, 90, 42);
    }
}
