package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.box.BetterLytVBox;
import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.anvilcraft.lib.recipe.component.ChanceBlockState;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.recipe.anvil.predicate.block.HasCauldron;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.SqueezingRecipe;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class LytSqueezingRecipe extends BetterLytVBox {
    private final SqueezingRecipe recipe;

    public LytSqueezingRecipe(SqueezingRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();

        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            50,
            12 + ANVIL_ANIMATION,
            20,
            12,
            RenderSupport.SINGLE_BLOCK
        );

        List<BlockState> input = new ArrayList<>();
        for (BlockStatePredicate predicate : recipe.getInputBlocks()) {
            input.addAll(predicate.constructStatesForRender());
        }
        if (input.isEmpty()) return;
        BlockState renderedState = input.get((int) ((System.currentTimeMillis() / 1000) % input.size()));
        if (renderedState == null) return;
        RenderSupport.renderBlock(guiGraphics, renderedState, 50, 30, 10, 12, RenderSupport.SINGLE_BLOCK);
        RenderSupport.renderBlock(guiGraphics, Blocks.CAULDRON.defaultBlockState(), 50, 40, 0, 12, RenderSupport.SINGLE_BLOCK);

        RenderSupport.renderBlock(guiGraphics, Blocks.ANVIL.defaultBlockState(), 110, 20, 20, 12, RenderSupport.SINGLE_BLOCK);
        RenderSupport.renderBlock(guiGraphics, getCauldron(recipe), 110, 40, 0, 12, RenderSupport.SINGLE_BLOCK);
        List<ChanceBlockState> result = recipe.getResultBlocks();
        if (result.isEmpty()) return;
        renderedState = result.get((int) ((System.currentTimeMillis() / 1000) % result.size())).state();
        RenderSupport.renderBlock(guiGraphics, renderedState, 110, 30, 10, 12, RenderSupport.SINGLE_BLOCK);
    }

    static BlockState getCauldron(SqueezingRecipe recipe) {
        if (recipe.isProduceFluid()) {
            return Blocks.CAULDRON.defaultBlockState();
        } else {
            return CauldronUtil.fullState(HasCauldron.getDefaultCauldron(recipe.getHasCauldron().transform()));
        }
    }
}
