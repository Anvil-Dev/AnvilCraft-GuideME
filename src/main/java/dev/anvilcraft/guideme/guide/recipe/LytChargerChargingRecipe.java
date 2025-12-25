package dev.anvilcraft.guideme.guide.recipe;

import dev.anvilcraft.guideme.guide.slot.LytBlockSlot;
import dev.dubhe.anvilcraft.block.ChargerBlock;
import dev.dubhe.anvilcraft.init.block.ModBlocks;
import dev.dubhe.anvilcraft.recipe.ChargerChargingRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytSlot;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

public class LytChargerChargingRecipe extends LytVBox {
    private final LytBlockSlot workBlock;
    private final LytSlot inputItemSlot;
    private final LytSlot outputItemSlot;
    private final int power;
    private final int time;

    private static final String KEY_CATEGORY = "gui.anvilcraft.category.charger_charging";
    private static final String KEY_POWER_CONSUME = KEY_CATEGORY + ".power_consume";
    private static final String KEY_POWER_PRODUCE = KEY_CATEGORY + ".power_produce";
    private static final String KEY_TIME = KEY_CATEGORY + ".time";

    public LytChargerChargingRecipe(ChargerChargingRecipe recipe) {
        this.power = recipe.getPower();
        this.time = recipe.getTime();
        if (power < 0) {
            append(workBlock = new LytBlockSlot(ModBlocks.CHARGER.getDefaultState().trySetValue(ChargerBlock.OVERLOAD, false)));
        } else {
            append(workBlock = new LytBlockSlot(ModBlocks.DISCHARGER.getDefaultState().trySetValue(ChargerBlock.OVERLOAD, false)));
        }

        append(inputItemSlot = new LytSlot(recipe.getIngredient()));
        append(outputItemSlot = new LytSlot(recipe.getResult()));
    }

    @Override
    public void render(RenderContext context) {
        workBlock.render(context);
        inputItemSlot.render(context);
        outputItemSlot.render(context);

        GuiGraphics guiGraphics = context.guiGraphics();
        guiGraphics.drawString(
            Minecraft.getInstance().font,
            Component.translatable(power < 0 ? KEY_POWER_CONSUME : KEY_POWER_PRODUCE, Math.abs(power)),
            bounds.x(),
            bounds.y() + 40,
            0xFF000000,
            false
        );
        guiGraphics.drawString(
            Minecraft.getInstance().font,
            Component.translatable(KEY_TIME, 0.05 * time),
            bounds.x(),
            bounds.y() + 53,
            0xFF000000,
            false
        );
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        workBlock.layout(context, x + 70, y + 15, availableWidth);
        inputItemSlot.layout(context, x + 30, y + 10, availableWidth);
        outputItemSlot.layout(context, x + 105, y + 10, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
