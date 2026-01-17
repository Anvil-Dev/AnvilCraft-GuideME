package dev.anvilcraft.guideme.guide.recipe;

import dev.anvilcraft.guideme.guide.slot.LytSimpleItemSlot;
import dev.anvilcraft.guideme.util.TextureConstants;
import dev.dubhe.anvilcraft.recipe.multiple.BaseMultipleToOneSmithingRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class LytBaseMultipleToOneSmithingRecipe extends LytVBox {
    private static final int[] INPUT_X = {
        76,
        76,
        58,
        94,
        94,
        58,
        94,
        58
    };
    private static final int[] INPUT_Y = {
        -10,
        26,
        8,
        8,
        -10,
        -10,
        26,
        26
    };

    private final LytSimpleItemSlot templateSlot;
    private final LytSimpleItemSlot materialSlot;
    private final LytSimpleItemSlot outputSlot;
    private final List<LytSimpleItemSlot> slots = new ArrayList<>();

    public LytBaseMultipleToOneSmithingRecipe(BaseMultipleToOneSmithingRecipe recipe) {
        append(templateSlot = new LytSimpleItemSlot(Ingredient.of(recipe.getTemplate().getItems())));
        append(materialSlot = new LytSimpleItemSlot(Ingredient.of(recipe.getMaterial().getItems())));
        append(outputSlot = new LytSimpleItemSlot(recipe.getResult().result().getDefaultInstance()));
        for (int i = 0; i < Math.min(8, recipe.getInputs().size()); i++) {
            LytSimpleItemSlot slot;
            append(slot = new LytSimpleItemSlot(Ingredient.of(recipe.getInputs().get(i).getItems())));
            slots.add(slot);
        }
    }

    @Override
    public void render(RenderContext context) {
        templateSlot.render(context);
        materialSlot.render(context);
        outputSlot.render(context);
        for (LytSimpleItemSlot slot : slots) {
            slot.render(context);
        }
        context.fillIcon(new LytRect(bounds.x() - 3, bounds.y() - 14, 176, 64), TextureConstants.MULTIPLE_TO_ONE_SMITHING);
        super.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        templateSlot.layout(context, x + 5, y + 21, availableWidth);
        materialSlot.layout(context, x + 77, y + 9, availableWidth);
        outputSlot.layout(context, x + 148, y + 21, availableWidth);
        for (int i = 0; i < Math.min(8, slots.size()); i++) {
            slots.get(i).layout(context, x + INPUT_X[i] + 1, y + INPUT_Y[i] + 1, availableWidth);
        }
        return new LytRect(x, y, 170, 47);
    }
}
