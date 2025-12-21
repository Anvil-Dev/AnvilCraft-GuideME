package dev.anvilcraft.guideme.recipe.anvil;

import dev.anvilcraft.guideme.recipe.slot.LytBlockSlot;
import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.init.item.ModItems;
import dev.dubhe.anvilcraft.recipe.anvil.MassInjectRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytSlot;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

import static dev.dubhe.anvilcraft.block.entity.SpaceOvercompressorBlockEntity.NEUTRONIUM_INGOT_MASS;

public class LytMassInjectRecipe extends LytVBox {
    private final LytBlockSlot workBlocks;
    private final LytSlot inputItemSlot;
    private final LytSlot outputItemSlot;
    private final MassInjectRecipe recipe;

    public LytMassInjectRecipe(MassInjectRecipe recipe) {
        this.recipe = recipe;
        List<BlockStatePredicate> work = new ArrayList<>();
        work.add(BlockStatePredicate.builder().of(ModBlocks.SPACE_OVERCOMPRESSOR).build());
        append(workBlocks = new LytBlockSlot(work));
        workBlocks.setAnvilAnimation(true);
        workBlocks.setHasAnvil(true);
        append(inputItemSlot = new LytSlot(recipe.getIngredient()));
        append(outputItemSlot = new LytSlot(ModItems.NEUTRONIUM_INGOT.asStack()));
    }

    @Override
    public void render(RenderContext context) {
        workBlocks.render(context);
        inputItemSlot.render(context);
        outputItemSlot.render(context);

        GuiGraphics guiGraphics = context.guiGraphics();
        guiGraphics.drawString(
            Minecraft.getInstance().font,
            Component.translatable("gui.anvilcraft.category.mass_inject.mass_value", recipe.displayMassValue()),
            bounds.x(),
            bounds.y() + 5,
            0xFF000000,
            false
        );
        guiGraphics.drawString(
            Minecraft.getInstance().font,
            Component.translatable("gui.anvilcraft.category.mass_inject.items_needed", Math.ceilDiv(NEUTRONIUM_INGOT_MASS, recipe.getMass())),
            bounds.x(),
            bounds.y() + 50,
            0xFF000000,
            false
        );
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        workBlocks.layout(context, x + 70, y + 15, availableWidth);
        inputItemSlot.layout(context, x + 35, y + 15, availableWidth);
        outputItemSlot.layout(context, x + 102, y + 15, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
