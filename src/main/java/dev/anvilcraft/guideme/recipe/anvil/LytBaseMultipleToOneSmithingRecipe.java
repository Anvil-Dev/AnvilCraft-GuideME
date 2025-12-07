package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.box.BetterLytVBox;
import dev.dubhe.anvilcraft.recipe.multiple.BaseMultipleToOneSmithingRecipe;
import guideme.render.RenderContext;
import net.minecraft.client.gui.GuiGraphics;

public class LytBaseMultipleToOneSmithingRecipe extends BetterLytVBox {
    private final BaseMultipleToOneSmithingRecipe recipe;

    public LytBaseMultipleToOneSmithingRecipe(BaseMultipleToOneSmithingRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();
    }
}
