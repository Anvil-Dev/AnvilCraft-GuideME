package dev.anvilcraft.guideme.util;

import dev.anvilcraft.lib.recipe.component.ChanceItemStack;
import dev.anvilcraft.lib.recipe.component.ItemIngredientPredicate;
import dev.dubhe.anvilcraft.recipe.anvil.collision.BlockTransform;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockTransformUtil {
    public static List<ChanceItemStack> getChanceItemStacks(List<BlockTransform> transformBlocks) {
        List<ChanceItemStack> itemStacks = new ArrayList<>();
        for (BlockTransform transform : transformBlocks) {
            ChanceItemStack itemStack = ChanceItemStack.of(transform.outputBlock().state().getBlock(), transform.outputBlock().chance());
            itemStacks.add(itemStack);
        }
        return itemStacks;
    }

    public static List<ItemIngredientPredicate> getItemIngredientPredicate(List<BlockTransform> transformBlocks) {
        List<ItemIngredientPredicate> list = new ArrayList<>();
        for (BlockTransform transform : transformBlocks) {
            for (Holder<Block> block : transform.inputBlock().getBlocks()) {
                list.add(ItemIngredientPredicate.of(block.value()).build());
            }
        }
        return list;
    }
}
