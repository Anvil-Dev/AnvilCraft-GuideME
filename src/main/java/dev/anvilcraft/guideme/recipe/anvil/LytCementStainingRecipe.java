package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.box.BetterLytVBox;
import dev.dubhe.anvilcraft.block.state.Color;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.integration.jei.recipe.CementStainingRecipe;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;

public class LytCementStainingRecipe extends BetterLytVBox {
    private final CementStainingRecipe recipe;


    public LytCementStainingRecipe(CementStainingRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();
        Color color = recipe.resultBlock().getColor();
        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            81,
            22 + ANVIL_ANIMATION,
            20,
            12,
            RenderSupport.SINGLE_BLOCK);
        RenderSupport.renderBlock(
            guiGraphics,
            ModBlocks.CEMENT_CAULDRONS.get(color).getDefaultState(),
            81,
            40,
            10,
            12,
            RenderSupport.SINGLE_BLOCK);

        RenderSupport.renderBlock(guiGraphics, recipe.resultBlock().defaultBlockState(), 133, 30, 0, 12, RenderSupport.SINGLE_BLOCK);
    }
}
