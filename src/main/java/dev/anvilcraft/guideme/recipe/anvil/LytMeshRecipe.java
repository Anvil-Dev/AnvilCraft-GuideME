package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.MeshRecipe;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;

public class LytMeshRecipe extends BetterLytVBox {
    private final MeshRecipe recipe;

    public LytMeshRecipe(MeshRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();
        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            81,
            12 + ANVIL_ANIMATION,
            20,
            12,
            RenderSupport.SINGLE_BLOCK
        );

        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.SCAFFOLDING.defaultBlockState(),
            81,
            30,
            10,
            12,
            RenderSupport.SINGLE_BLOCK
        );
    }
}
