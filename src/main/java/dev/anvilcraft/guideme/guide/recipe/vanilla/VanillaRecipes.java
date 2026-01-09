package dev.anvilcraft.guideme.guide.recipe.vanilla;

import guideme.document.block.LytSlotGrid;
import guideme.document.block.recipes.LytStandardRecipeBox;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.Blocks;

public class VanillaRecipes {

    private VanillaRecipes() {
    }

    public static LytStandardRecipeBox<StonecutterRecipe> createStonecutter(RecipeHolder<StonecutterRecipe> recipe) {
        return LytStandardRecipeBox.builder()
            .title(Blocks.STONECUTTER.asItem().getDescription().getString())
            .icon(Blocks.STONECUTTER)
            .input(LytSlotGrid.row(recipe.value().getIngredients(), true))
            .outputFromResultOf(recipe)
            .build(recipe);
    }
}
