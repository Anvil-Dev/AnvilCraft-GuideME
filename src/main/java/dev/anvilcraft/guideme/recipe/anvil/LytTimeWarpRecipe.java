package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytBlockSlot;
import dev.anvilcraft.guideme.recipe.slot.LytInputItemSlot;
import dev.anvilcraft.guideme.recipe.slot.LytOutputItemSlot;
import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.dubhe.anvilcraft.block.CorruptedBeaconBlock;
import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.TimeWarpRecipe;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;

public class LytTimeWarpRecipe extends LytVBox {
    private final LytInputItemSlot inputItemSlot;
    private final LytOutputItemSlot outputItemSlot;

    private final LytBlockSlot workBlocks;
    private final LytBlockSlot outputBlockSlot;

    public LytTimeWarpRecipe(TimeWarpRecipe recipe) {
        append(inputItemSlot = new LytInputItemSlot(recipe.getInputItems()));
        append(outputItemSlot = new LytOutputItemSlot(recipe.getResultItems()));

        append(workBlocks = new LytBlockSlot(
            CauldronUtil.fullState(recipe.getHasCauldron().getFluidCauldron()),
            ModBlocks.CORRUPTED_BEACON.getDefaultState().trySetValue(CorruptedBeaconBlock.LIT, false))
        );
        append(outputBlockSlot = new LytBlockSlot(BlockStateUtil.getCauldron(recipe.getHasCauldron())));
        workBlocks.setHasAnvil(true);
        workBlocks.setAnvilAnimation(true);
        outputBlockSlot.setRender(!recipe.getResultItems().isEmpty());
    }

    @Override
    public void render(RenderContext context) {
        inputItemSlot.render(context);
        outputItemSlot.render(context);
        workBlocks.render(context);
        outputBlockSlot.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputItemSlot.layout(context, x, y, availableWidth);
        outputItemSlot.layout(context, x + 87, y, availableWidth);
        workBlocks.layout(context, x + 70, y, availableWidth);
        outputBlockSlot.layout(context, x + 105, y + 15, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
