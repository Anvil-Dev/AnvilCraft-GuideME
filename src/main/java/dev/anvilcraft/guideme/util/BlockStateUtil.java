package dev.anvilcraft.guideme.util;

import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.anvilcraft.lib.recipe.component.ChanceBlockState;
import dev.dubhe.anvilcraft.recipe.anvil.predicate.block.HasCauldron;
import dev.dubhe.anvilcraft.recipe.component.HasCauldronSimple;
import dev.dubhe.anvilcraft.util.CauldronUtil;
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
}
