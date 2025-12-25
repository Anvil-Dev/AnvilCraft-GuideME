package dev.anvilcraft.guideme.guide.tooltip;

import dev.anvilcraft.lib.recipe.component.ChanceItemStack;
import dev.anvilcraft.lib.util.NumberProviderUtil;
import guideme.document.interaction.GuideTooltip;
import guideme.siteexport.ResourceExporter;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.providers.number.BinomialDistributionGenerator;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static dev.anvilcraft.guideme.util.NumberUtil.*;

public class ChanceItemTooltip implements GuideTooltip {
    private static final DecimalFormat FORMATTER = new DecimalFormat();

    private final ChanceItemStack chanceItemStack;

    public ChanceItemTooltip(ChanceItemStack chanceItemStack) {
        this.chanceItemStack = chanceItemStack;
    }

    @Override
    public ItemStack getIcon() {
        return chanceItemStack.stack();
    }

    @Override
    public List<ClientTooltipComponent> getLines() {
        List<Component> list = new ArrayList<>(Screen.getTooltipFromItem(Minecraft.getInstance(), chanceItemStack.stack()));

        NumberProvider provider = chanceItemStack.count();
        int count = chanceItemStack.stack().getCount();

        if (provider instanceof BinomialDistributionGenerator(NumberProvider n, NumberProvider p)) {
            if (n instanceof ConstantValue(float value) && value == 1) {
                String chance = FORMATTER.format(NumberProviderUtil.expected(p) * 100);
                list.add(Component.translatable("gui.anvilcraft.category.chance", chance)
                    .withStyle(ChatFormatting.GRAY));
            } else {
                addAvgOutput(list, count * NumberProviderUtil.expected(provider));
            }
            addMinMax(list, 0, getMax(n));
        } else if (provider.getClass() != ConstantValue.class) {
            double val = count * NumberProviderUtil.expected(provider);
            if (val != -1) {
                addAvgOutput(list, val);
                if (provider instanceof UniformGenerator) {
                    addMinMax(list, getMin(provider), getMax(provider));
                }
            }
        }

        return list
            .stream()
            .map(Component::getVisualOrderText)
            .map(ClientTooltipComponent::create)
            .toList();
    }

    @Override
    public void exportResources(ResourceExporter exporter) {
        exporter.referenceItem(chanceItemStack.stack());
    }



    private static void addAvgOutput(List<Component> tooltipLines, double avgValue) {
        String avgOutput = FORMATTER.format(avgValue);
        tooltipLines.add(Component.translatable("gui.anvilcraft.category.average_output", avgOutput)
            .withStyle(ChatFormatting.GRAY));
    }

    private static void addMinMax(List<Component> tooltipLines, double min, double max) {
        String minOutput = FORMATTER.format(min);
        String maxOutput = FORMATTER.format(max);

        tooltipLines.add(Component.translatable("gui.anvilcraft.category.min_output", minOutput)
            .withStyle(ChatFormatting.GRAY));
        tooltipLines.add(Component.translatable("gui.anvilcraft.category.max_output", maxOutput)
            .withStyle(ChatFormatting.GRAY));
    }
}
