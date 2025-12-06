package dev.anvilcraft.guideme.recipe;

import dev.anvilcraft.guideme.util.BlockStateUtil;
import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.anvilcraft.lib.recipe.component.ItemIngredientPredicate;
import guideme.siteexport.ExportableResourceProvider;

import java.util.List;

public abstract class LytBetterStandardBox<T> extends BetterLytVBox implements ExportableResourceProvider {
    private final List<BlockStatePredicate> blockStatePredicates;
    private final List<ItemIngredientPredicate> itemIngredientPredicates;

    LytBetterStandardBox(List<BlockStatePredicate> blockStatePredicates) {
        this.blockStatePredicates = blockStatePredicates;
        this.itemIngredientPredicates = BlockStateUtil.BlockStatePredicatesTransToItemIngredientPredicate(blockStatePredicates);
    }
}
