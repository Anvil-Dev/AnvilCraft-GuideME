package dev.anvilcraft.guideme.recipe.anvil;

import com.google.common.collect.ImmutableList;
import dev.anvilcraft.guideme.recipe.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.integration.jei.recipe.VoidDecayRecipe;
import dev.dubhe.anvilcraft.util.LevelLike;
import guideme.render.RenderContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;

import java.util.HashMap;
import java.util.Map;

public class LytVoidDecayRecipe extends BetterLytVBox {
    private final VoidDecayRecipe recipe;
    private final Map<VoidDecayRecipe, LevelLike> cache = new HashMap<>();

    private static final ImmutableList<BlockPos> CATALYST_POS = ImmutableList.of(
        new BlockPos(1, 0, 1),
        new BlockPos(1, 1, 0),
        new BlockPos(1, 1, 2),
        new BlockPos(1, 2, 1),
        new BlockPos(0, 1, 1)
    );
    private static final BlockPos CENTER_POS = new BlockPos(1, 1, 1);

    public LytVoidDecayRecipe(VoidDecayRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();

        LevelLike level = cache.get(recipe);
        if (level == null) {
            LevelLike showCase = new LevelLike(Minecraft.getInstance().level);
            CATALYST_POS.forEach(pos -> showCase.setBlockState(pos, recipe.catalyst.defaultBlockState()));
            showCase.setBlockState(CENTER_POS, recipe.center.defaultBlockState());
            cache.put(recipe, showCase);
            level = showCase;
        }

        RenderSupport.renderLevelLike(level, guiGraphics, 24, 36, 60, 0.5f);
    }
}
