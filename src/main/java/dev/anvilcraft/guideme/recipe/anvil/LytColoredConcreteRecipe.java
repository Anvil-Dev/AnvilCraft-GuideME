package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.integration.jei.recipe.ColoredConcreteRecipe;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;

public class LytColoredConcreteRecipe extends BetterLytVBox {
    private final ColoredConcreteRecipe recipe;

    public LytColoredConcreteRecipe(ColoredConcreteRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();
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
            ModBlocks.CEMENT_CAULDRONS.get(recipe.color()).getDefaultState(),
            81,
            40,
            10,
            12,
            RenderSupport.SINGLE_BLOCK);
    }
}
