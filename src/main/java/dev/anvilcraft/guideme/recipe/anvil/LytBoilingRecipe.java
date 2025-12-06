package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BoilingRecipe;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;

public class LytBoilingRecipe extends BetterLytVBox {
    private final BoilingRecipe recipe;

    public LytBoilingRecipe(BoilingRecipe recipe) {
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
        RenderSupport.renderBlock(
            guiGraphics,
            CauldronUtil.fullState(Blocks.WATER_CAULDRON),
            getSafeX(),
            getSafeY(),
            10,
            12,
            RenderSupport.SINGLE_BLOCK);
        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.CAMPFIRE.defaultBlockState().setValue(CampfireBlock.LIT, true),
            getSafeX(),
            getSafeY(),
            0,
            12,
            RenderSupport.SINGLE_BLOCK);
    }
}
