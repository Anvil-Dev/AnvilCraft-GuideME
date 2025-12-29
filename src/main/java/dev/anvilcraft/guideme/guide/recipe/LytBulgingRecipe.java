package dev.anvilcraft.guideme.guide.recipe;

import dev.anvilcraft.guideme.guide.slot.LytBlockSlot;
import dev.anvilcraft.guideme.guide.slot.LytInputItemSlot;
import dev.anvilcraft.guideme.guide.slot.LytOutputItemSlot;
import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BulgingRecipe;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class LytBulgingRecipe extends LytVBox {
    private final LytInputItemSlot inputItemSlot;
    private final LytOutputItemSlot outputItemSlot;

    private final LytBlockSlot inputBlockSlot;
    private final LytBlockSlot outputBlockSlot;

    public LytBulgingRecipe(BulgingRecipe recipe) {
        append(inputItemSlot = new LytInputItemSlot(recipe.getInputItems()));
        append(outputItemSlot = new LytOutputItemSlot(recipe.getResultItems()));

        BlockState state;
        if (recipe.isFromWater()) {
            state = CauldronUtil.fullState(Blocks.WATER_CAULDRON);
        } else if (recipe.isProduceFluid()) {
            state = Blocks.CAULDRON.defaultBlockState();
        } else {
            state = recipe.getHasCauldron().getTransformCauldron().defaultBlockState();
        }
        append(inputBlockSlot = new LytBlockSlot(state));
        append(outputBlockSlot = new LytBlockSlot(BlockStateUtil.getCauldron(recipe.getHasCauldron())));
        inputBlockSlot.setHasAnvil(true);
        inputBlockSlot.setAnvilAnimation(true);
        outputBlockSlot.setRender(!recipe.getResultItems().isEmpty());
    }

    @Override
    public void render(RenderContext context) {
        inputItemSlot.render(context);
        outputItemSlot.render(context);
        inputBlockSlot.render(context);
        outputBlockSlot.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputItemSlot.layout(context, x, y, availableWidth);
        outputItemSlot.layout(context, x + 80, y, availableWidth);
        inputBlockSlot.layout(context, x + 70, y + 10, availableWidth);
        outputBlockSlot.layout(context, x + 100, y + 10, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
