package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.box.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCrushRecipe;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class LytBlockCrushRecipe extends BetterLytVBox {
    private final BlockCrushRecipe recipe;

    public LytBlockCrushRecipe(BlockCrushRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();

        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            getSafeX(),
            getSafeY() + ANVIL_ANIMATION,
            20,
            12,
            RenderSupport.SINGLE_BLOCK);

        renderInput: {
            List<BlockState> input = recipe.getFirstInputBlock().constructStatesForRender();
            if (input.isEmpty()) break renderInput;
            BlockState renderedState = input.get((int) ((System.currentTimeMillis() / 1000) % input.size()));
            if (renderedState == null) break renderInput;
            RenderSupport.renderBlock(guiGraphics, renderedState, 50, 40, 10, 12, RenderSupport.SINGLE_BLOCK);
        }

        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            getSafeX(),
            getSafeY(),
            10,
            12,
            RenderSupport.SINGLE_BLOCK
        );
        RenderSupport.renderBlock(
            guiGraphics,
            recipe.getFirstResultBlock().state(),
            getSafeX(),
            getSafeY(),
            0,
            12,
            RenderSupport.SINGLE_BLOCK
        );
    }
}
