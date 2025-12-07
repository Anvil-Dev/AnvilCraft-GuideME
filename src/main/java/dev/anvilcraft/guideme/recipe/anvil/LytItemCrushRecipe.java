package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.box.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.ItemCrushRecipe;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;

public class LytItemCrushRecipe extends BetterLytVBox {
    private final ItemCrushRecipe recipe;

    public LytItemCrushRecipe(ItemCrushRecipe recipe) {
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
            RenderSupport.SINGLE_BLOCK
        );
        RenderSupport.renderBlock(
            guiGraphics,
            ModBlocks.CRUSHING_TABLE.getDefaultState(),
            81,
            40,
            10,
            12,
            RenderSupport.SINGLE_BLOCK
        );
    }
}
