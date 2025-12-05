package dev.anvilcraft.guideme.init.item;

import guideme.GuidesCommon;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import static dev.anvilcraft.guideme.AnvilCraftGuideME.GID;

public class GuideMEBookItem extends Item {

    public GuideMEBookItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (world.isClientSide) {
            GuidesCommon.openGuide(player, GID);
        }
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }
}
