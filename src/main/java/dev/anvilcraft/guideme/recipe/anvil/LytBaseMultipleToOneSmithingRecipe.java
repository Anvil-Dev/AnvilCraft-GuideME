package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.util.TextureConstants;
import dev.dubhe.anvilcraft.recipe.multiple.BaseMultipleToOneSmithingRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytSlot;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class LytBaseMultipleToOneSmithingRecipe extends LytVBox {
    private static int[] INPUT_X = {76, 76, 58, 94, 94, 58, 94, 58};
    private static int[] INPUT_Y = {-9, 27, 9, 9, -9, -9, 27, 27};

    private final LytSlot templateSlot;
    private final LytSlot materialSlot;
    private final LytSlot outputSlot;
    private final List<LytSlot> slots = new ArrayList<>();

    public LytBaseMultipleToOneSmithingRecipe(BaseMultipleToOneSmithingRecipe recipe) {
        append(templateSlot = new LytSlot(Ingredient.of(recipe.getTemplate().getItems())));
        append(materialSlot = new LytSlot(Ingredient.of(recipe.getMaterial().getItems())));
        append(outputSlot = new LytSlot(recipe.getResult().getResult()));
        for (int i = 0; i < Math.min(8, recipe.getInputs().size()); i++) {
            LytSlot slot = new LytSlot(Ingredient.of(recipe.getInputs().get(i).getItems()));
            slots.add(slot);
        }
        for (LytSlot slot : slots) {
            append(slot);
        }
    }

    @Override
    public void render(RenderContext context) {
        templateSlot.render(context);
        materialSlot.render(context);
        outputSlot.render(context);
        for (LytSlot slot : slots) {
            slot.render(context);
        }
        context.fillIcon(
            new LytRect(bounds.x() - 3, bounds.y() - 14, 176, 64),
            TextureConstants.MULTIPLE_TO_ONE_SMITHING
        );
        super.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        templateSlot.layout(context, x + 4, y + 20, availableWidth);
        materialSlot.layout(context, x + 76, y + 9, availableWidth);
        outputSlot.layout(context, x + 147, y + 20, availableWidth);
        for (int i = 0; i < Math.min(8, slots.size()); i++) {
            slots.get(i).layout(context, x + INPUT_X[i], y + INPUT_Y[i], availableWidth);
        }
        return new LytRect(x, y, 170, 47);
    }
}
