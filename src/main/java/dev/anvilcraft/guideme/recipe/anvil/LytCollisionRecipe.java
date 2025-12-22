package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytInputItemSlot;
import dev.anvilcraft.guideme.recipe.slot.LytOutputItemSlot;
import dev.anvilcraft.guideme.recipe.slot.LytSimpleItemSlot;
import dev.anvilcraft.guideme.util.BlockTransformUtil;
import dev.anvilcraft.guideme.util.TextureConstants;
import dev.dubhe.anvilcraft.recipe.anvil.collision.AnvilCollisionCraftRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytSlot;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class LytCollisionRecipe extends LytVBox {
    private final LytSlot inputAnvilSlot;
    private final LytSimpleItemSlot hitBlockSlot;
    private final LytOutputItemSlot outputItemSlot;
    private final LytOutputItemSlot transOutputBlockSlot;
    private final LytInputItemSlot transInputBlockSlot;
    private final AnvilCollisionCraftRecipe recipe;

    public LytCollisionRecipe(AnvilCollisionCraftRecipe recipe) {
        this.recipe = recipe;
        append(transInputBlockSlot = new LytInputItemSlot(BlockTransformUtil.getItemIngredientPredicate(recipe.transformBlocks())));
        append(transOutputBlockSlot = new LytOutputItemSlot(BlockTransformUtil.getChanceItemStacks(recipe.transformBlocks())));
        append(outputItemSlot = new LytOutputItemSlot(recipe.outputItems()));
        append(
            inputAnvilSlot = new LytSlot(
                Ingredient.of(
                    recipe.anvil()
                        .getBlocks()
                        .stream()
                        .map(
                            blockHolder -> new ItemStack(blockHolder.value())
                        )
                )
            )
        );
        append(
            hitBlockSlot = new LytSimpleItemSlot(
                Ingredient.of(
                    recipe.hitBlock()
                        .getBlocks()
                        .stream()
                        .map(
                            blockHolder -> new ItemStack(blockHolder.value())
                        )
                )
            )
        );
        hitBlockSlot.setItemSize(32);
    }

    @Override
    public void render(RenderContext context) {
        inputAnvilSlot.render(context);
        hitBlockSlot.render(context);
        outputItemSlot.render(context);
        transInputBlockSlot.render(context);
        transOutputBlockSlot.render(context);
        context.fillIcon(new LytRect(bounds.x() + 40, bounds.y() - 5, 64, 64), TextureConstants.EXPLOSION);
        if (!transInputBlockSlot.getMergedIngredients().isEmpty() && !transOutputBlockSlot.getResultItems().isEmpty()) {
            context.fillIcon(new LytRect(bounds.x() + 124, bounds.y() + 16, 14, 22), TextureConstants.CONVERSION);
        }

        GuiGraphics guiGraphics = context.guiGraphics();
        guiGraphics.drawString(
            Minecraft.getInstance().font,
            Component.translatable("gui.anvilcraft.category.anvil_collision.consume", recipe.consume()),
            bounds.x(),
            bounds.y() + 48,
            0xFF000000,
            false
        );
        guiGraphics.drawString(
            Minecraft.getInstance().font,
            Component.translatable("gui.anvilcraft.category.anvil_collision.speed", recipe.speed()),
            bounds.x(),
            bounds.y() + 58,
            0xFF000000,
            false
        );
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        inputAnvilSlot.layout(context, x + 10, y + 15, availableWidth);
        hitBlockSlot.layout(context, x + 51, y + 11, availableWidth);
        outputItemSlot.layout(context, x + 90, y, availableWidth);
        transInputBlockSlot.layout(context, x + 90, y + 25, availableWidth);
        transOutputBlockSlot.layout(context, x + 90, y - 20, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
