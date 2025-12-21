package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytInputItemSlot;
import dev.anvilcraft.guideme.recipe.slot.LytOutputItemSlot;
import dev.anvilcraft.guideme.util.GuideMERenderUtil;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BulgingRecipe;
import dev.dubhe.anvilcraft.recipe.component.HasCauldronSimple;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class LytBulgingRecipe extends LytVBox {
    private final LytInputItemSlot inputItemSlot;
    private final LytOutputItemSlot outputItemSlot;
    private final BulgingRecipe recipe;

    public LytBulgingRecipe(BulgingRecipe recipe) {
        this.recipe = recipe;
        append(inputItemSlot = new LytInputItemSlot(recipe.getInputItems()));
        append(outputItemSlot = new LytOutputItemSlot(recipe.getResultItems()));
    }

    @Override
    public void render(RenderContext context) {
        inputItemSlot.render(context);
        if (!recipe.getResultItems().isEmpty()) outputItemSlot.render(context);

        GuiGraphics guiGraphics = context.guiGraphics();

        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            bounds.x() + 70,
            bounds.y() + GuideMERenderUtil.getAnvilAnimationOffset() + 5,
            20,
            12,
            RenderSupport.SINGLE_BLOCK);
        BlockState state;
        if (recipe.isFromWater()) {
            state = CauldronUtil.fullState(Blocks.WATER_CAULDRON);
        } else if (recipe.isProduceFluid()) {
            state = Blocks.CAULDRON.defaultBlockState();
        } else {
            state = recipe.getHasCauldron().getTransformCauldron().defaultBlockState();
        }
        RenderSupport.renderBlock(guiGraphics, state, bounds.x() + 70, bounds.y() + 24, 10, 12, RenderSupport.SINGLE_BLOCK);

        if (recipe.getResultItems().isEmpty()) {
            Block result = recipe.getHasCauldron().getTransformCauldron();
            if (recipe.isConsumeFluid()) {
                state = CauldronUtil.getStateFromContentAndLevel(result, CauldronUtil.maxLevel(result) - 1);
            } else if (recipe.isProduceFluid()) {
                state = CauldronUtil.getStateFromContentAndLevel(result, 1);
            } else {
                state = CauldronUtil.fullState(result);
            }
            RenderSupport.renderBlock(guiGraphics, state, bounds.x() + 100, bounds.y() + 20, 0, 14, RenderSupport.SINGLE_BLOCK);
        }
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputItemSlot.layout(context, x, y, availableWidth);

        if (!recipe.getResultItems().isEmpty()) {
            outputItemSlot.layout(context, x + 87, y, availableWidth);
        }

        return new LytRect(x, y, 162, 64);
    }
}
