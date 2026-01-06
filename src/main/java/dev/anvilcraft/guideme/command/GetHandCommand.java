package dev.anvilcraft.guideme.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.concurrent.atomic.AtomicInteger;

import static net.minecraft.commands.Commands.literal;

public class GetHandCommand {
    private static int showInfo(CommandContext<CommandSourceStack> ctx) {
        ServerPlayer player = ctx.getSource().getPlayer();
        AtomicInteger returnValue = new AtomicInteger(0);
        if (player == null) return returnValue.get();
        returnValue.set(1);

        ItemStack itemStack = player.getMainHandItem();
        Item item = itemStack.getItem();

        Component message = Component.translatable(
            "command.ac_guideme.item",
            itemStack.getDisplayName()
        ).withStyle(ChatFormatting.GREEN);


        ctx.getSource().sendSystemMessage(copy(message, item.toString()));
        return returnValue.get();
    }

    public static void registerCommand(LiteralArgumentBuilder<CommandSourceStack> parent) {
        LiteralArgumentBuilder<CommandSourceStack> commandRoot = literal("hand")
            .executes(GetHandCommand::showInfo);
        parent.then(commandRoot);
    }

    private static Component copy(Component c, String copy) {
        return Component.literal("- ")
            .withStyle(Style.EMPTY.withClickEvent(new ClickEvent(ClickEvent.Action.COPY_TO_CLIPBOARD, copy)))
            .append(c);
    }
}