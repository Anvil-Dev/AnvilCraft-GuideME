package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCompressRecipe;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class LytBlockCompressRecipe extends BetterLytVBox {
    private final BlockCompressRecipe recipe;

    public LytBlockCompressRecipe(BlockCompressRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();
        recipe.getInputBlocks();

        float anvilYOffset = ANVIL_ANIMATION;

        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            getSafeX(),
            getSafeY() + anvilYOffset,
            20,
            12,
            RenderSupport.SINGLE_BLOCK
        );

        for (int i = recipe.getInputBlocks().size() - 1; i >= 0; i--) {
            List<BlockState> input = recipe.getInputBlocks().get(i).constructStatesForRender();
            if (input.isEmpty()) continue;
            BlockState renderedState = input.get((int) ((System.currentTimeMillis() / 1000) % input.size()));
            if (renderedState == null) continue;
            RenderSupport.renderBlock(
                guiGraphics,
                renderedState,
                getSafeX(),
                getSafeY() + 10 * i,
                10 - 10 * i,
                12,
                RenderSupport.SINGLE_BLOCK
            );
        }

        RenderSupport.renderBlock(
            guiGraphics, Blocks.ANVIL.defaultBlockState(), getSafeX(), getSafeX(), 10, 12, RenderSupport.SINGLE_BLOCK
        );
        RenderSupport.renderBlock(
            guiGraphics, recipe.getFirstResultBlock().state(), getSafeX(), getSafeY(), 0, 12, RenderSupport.SINGLE_BLOCK
        );
    }
}
