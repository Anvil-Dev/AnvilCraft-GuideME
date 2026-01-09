package dev.anvilcraft.guideme.guide.recipe;

import dev.anvilcraft.guideme.guide.slot.LytSimpleItemSlot;
import dev.anvilcraft.guideme.util.TextureConstants;
import dev.dubhe.anvilcraft.recipe.JewelCraftingRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;

import java.util.ArrayList;
import java.util.List;

public class LytJewelCraftingRecipe extends LytVBox {
    private final LytSimpleItemSlot copySlot;
    private final LytSimpleItemSlot resultSlot;
    private final List<LytSimpleItemSlot> slots = new ArrayList<>();

    public LytJewelCraftingRecipe(JewelCraftingRecipe recipe) {
        append(copySlot = new LytSimpleItemSlot(recipe.result.copy()));
        append(resultSlot = new LytSimpleItemSlot(recipe.result.copy()));
        for (var entry : recipe.mergedIngredients) {
            LytSimpleItemSlot slot;
            append(slot = new LytSimpleItemSlot(entry.getKey()));
            slots.add(slot);
        }
    }

    @Override
    public void render(RenderContext context) {
        copySlot.render(context);
        resultSlot.render(context);
        for (LytSimpleItemSlot slot : slots) {
            slot.render(context);
        }
        context.fillIcon(new LytRect(bounds.x() - 5, bounds.y() - 15, 176, 77), TextureConstants.STONE);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        copySlot.layout(context, x + 75, y + 4, availableWidth);
        resultSlot.layout(context, x + 129, y + 36, availableWidth);
        for (int i = 0; i < slots.size(); i++) {
            slots.get(i).layout(context, x + i * 18 + 21, y + 36, availableWidth);
        }
        return new LytRect(x, y, 166, 57);
    }
}
