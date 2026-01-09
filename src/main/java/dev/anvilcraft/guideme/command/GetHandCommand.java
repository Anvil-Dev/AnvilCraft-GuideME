package dev.anvilcraft.guideme.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static net.minecraft.commands.Commands.literal;

public class GetHandCommand {

    public static void registerCommand(LiteralArgumentBuilder<CommandSourceStack> parent) {
        LiteralArgumentBuilder<CommandSourceStack> commandRoot = literal("hand").executes(GetHandCommand::showInfo);
        parent.then(commandRoot);
    }

    private static int showInfo(CommandContext<CommandSourceStack> ctx) {
        ServerPlayer player = ctx.getSource().getPlayer();
        AtomicInteger returnValue = new AtomicInteger(0);
        if (player == null) return returnValue.get();
        returnValue.set(1);
        List<Component> components = new ArrayList<>();

        ItemStack itemStack = player.getMainHandItem();
        Item item = itemStack.getItem();


        components.add(Component.nullToEmpty("=========="));

        // Item ID
        MutableComponent itemMessage = Component.translatable("command.ac_guideme.item", item.toString())
            .withStyle(ChatFormatting.GREEN, ChatFormatting.BOLD);
        components.add(copy(itemMessage, item.toString()));

        // Count
        int count = itemStack.getCount();
        Component countMessage = Component.translatable("command.ac_guideme.count", count).withStyle(ChatFormatting.YELLOW);
        components.add(copy(countMessage, String.valueOf(count)));

        // Mod
        String modId = item.getCreatorModId(itemStack);
        Component ModMessage = Component.translatable("command.ac_guideme.mod", modId).withStyle(ChatFormatting.RED);
        components.add(copy(ModMessage, modId));

        // Item Tag
        Holder<Item> itemHolder = itemStack.getItemHolder();
        List<TagKey<Item>> itemTagKeys = itemHolder.tags().toList();
        if (!itemHolder.tags().toList().isEmpty()) {
            Component head = Component.translatable("command.ac_guideme.item_tags").withStyle(ChatFormatting.DARK_AQUA);
            components.add(head);
            for (TagKey<Item> tagKey : itemTagKeys) {
                String tagId = "#%s".formatted(tagKey.location());
                components.add(copy(Component.literal(tagId).withStyle(ChatFormatting.AQUA), tagId));
            }
        }

        // Block Tag
        if (item instanceof BlockItem blockItem) {
            Block block = blockItem.getBlock();
            Holder<Block> blockHolder = block.builtInRegistryHolder();
            List<TagKey<Block>> blockTagKeys = blockHolder.tags().toList();
            if (!blockTagKeys.isEmpty()) {
                Component head = Component.translatable("command.ac_guideme.block_tags").withStyle(ChatFormatting.DARK_AQUA);
                components.add(head);
                for (TagKey<Block> tagKey : blockTagKeys) {
                    String tagId = "#%s".formatted(tagKey.location());
                    components.add(copy(Component.literal(tagId).withStyle(ChatFormatting.AQUA), tagId));
                }
            }
        }


        components.add(Component.nullToEmpty("=========="));

        for (Component component : components) {
            player.sendSystemMessage(component);
        }

        return returnValue.get();
    }

    private static Component copy(Component component, String info) {
        return Component.literal("- ")
            .withStyle(Style.EMPTY.withClickEvent(new ClickEvent(ClickEvent.Action.COPY_TO_CLIPBOARD, info)))
            .append(component);
    }
}