package dev.anvilcraft.guideme.util;

import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.anvilcraft.lib.recipe.component.ChanceBlockState;
import dev.anvilcraft.lib.recipe.component.ItemIngredientPredicate;
import dev.dubhe.anvilcraft.recipe.anvil.predicate.block.HasCauldron;
import dev.dubhe.anvilcraft.recipe.component.HasCauldronSimple;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class BlockStateUtil {
    public static List<BlockStatePredicate> ChanceBlockStatesTransToBlockStatePredicates(
        List<ChanceBlockState> chanceBlockStateList
    ) {
        List<BlockStatePredicate> blockStatePredicateList = new ArrayList<>();
        for (ChanceBlockState chanceBlockState : chanceBlockStateList) {
            BlockStatePredicate blockStatePredicate = BlockStatePredicate
                .builder()
                .of(chanceBlockState.state().getBlock())
                .nbt(chanceBlockState.nbt())
                .build();
            blockStatePredicateList.add(blockStatePredicate);
        }
        return blockStatePredicateList;
    }

    public static BlockState getCauldron(HasCauldronSimple hasCauldron) {
        boolean isProduceFluid = HasCauldron.isNotEmpty(hasCauldron.transform()) && hasCauldron.consume() < 0;
        if (isProduceFluid) {
            return Blocks.CAULDRON.defaultBlockState();
        } else {
            return CauldronUtil.fullState(HasCauldron.getDefaultCauldron(hasCauldron.transform()));
        }
    }

    public static List<ItemIngredientPredicate> BlockStatePredicatesTransToItemIngredientPredicate(
        List<BlockStatePredicate> blockStatePredicateList
    ) {
        List<ItemIngredientPredicate> ingredientPredicateList = new ArrayList<>();
        if (blockStatePredicateList != null) {
            for (BlockStatePredicate blockStatePredicate : blockStatePredicateList) {
                HolderSet<Block> blockStates = blockStatePredicate.getBlocks();
                for (Holder<Block> blockState : blockStates) {
                    Item item = blockState.value().asItem();
                    ingredientPredicateList.add(ItemIngredientPredicate.of(item).build());
                }
            }
        }
        return ingredientPredicateList;
    }

    public static List<BlockState> blockStatePredicatesTransToRenderBlockStates(
        BlockStatePredicate blockStatePredicate
    ) {
        return blockStatePredicate.constructStatesForRender();
    }

    public static Ingredient transToIngredient(BlockStatePredicate blockState) {
        return Ingredient.of(blockState
            .getBlocks()
            .stream()
            .map(blockHolder ->
                new ItemStack(
                    blockHolder.value().asItem()
                )
            )
        );
    }
}
