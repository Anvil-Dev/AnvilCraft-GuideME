package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytBlockSlot;
import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.anvilcraft.lib.recipe.component.ChanceBlockState;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.SqueezingRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class LytSqueezingRecipe extends LytVBox {
    private final LytBlockSlot inputBlocks;
    private final LytBlockSlot outputBlocks;

    public LytSqueezingRecipe(SqueezingRecipe recipe) {
        List<BlockStatePredicate> input = new ArrayList<>(recipe.getInputBlocks());
        List<ChanceBlockState> output = new ArrayList<>(recipe.getResultBlocks());

        input.add(BlockStatePredicate.builder().of(Blocks.CAULDRON).build());
        output.add(ChanceBlockState.of(() -> BlockStateUtil.getCauldron(recipe).getBlock()));
        append(inputBlocks = new LytBlockSlot(input));
        append(
            outputBlocks = new LytBlockSlot(
                BlockStateUtil.ChanceBlockStatesTransToBlockStatePredicates(output)
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
        inputBlocks.layout(context, x + 40, y, availableWidth);
        outputBlocks.layout(context, x + 100, y, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
