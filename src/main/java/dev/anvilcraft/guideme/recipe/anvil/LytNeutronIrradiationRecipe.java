package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.NeutronIrradiationRecipe;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class LytNeutronIrradiationRecipe extends BetterLytVBox {
    private final NeutronIrradiationRecipe recipe;

    public LytNeutronIrradiationRecipe(NeutronIrradiationRecipe recipe) {
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
        Block material = recipe.getHasCauldron().getFluidCauldron();
        RenderSupport.renderBlock(
            guiGraphics,
            CauldronUtil.fullState(material),
            81,
            30,
            10,
            12,
            RenderSupport.SINGLE_BLOCK
        );

        BlockState block = ModBlocks.NEUTRON_IRRADIATOR
            .get()
            .defaultBlockState();

        RenderSupport.renderBlock(
            guiGraphics,
            block,
            81,
            40,
            0,
            12,
            RenderSupport.SINGLE_BLOCK
        );
    }
}
