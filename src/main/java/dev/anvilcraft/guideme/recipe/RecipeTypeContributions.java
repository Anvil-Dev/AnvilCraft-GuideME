package dev.anvilcraft.guideme.recipe;

import dev.anvilcraft.guideme.recipe.anvil.LytBlockCompressRecipe;
import dev.dubhe.anvilcraft.init.reicpe.ModRecipeTypes;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCompressRecipe;
import guideme.compiler.tags.RecipeTypeMappingSupplier;
import guideme.document.block.recipes.LytStandardRecipeBox;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeHolder;

public class RecipeTypeContributions implements RecipeTypeMappingSupplier {
    @Override
    public void collect(RecipeTypeMappings mappings) {
        mappings.add(ModRecipeTypes.BLOCK_COMPRESS_TYPE.get(), RecipeTypeContributions::blockCompress);
    }

    private static LytStandardRecipeBox<BlockCompressRecipe> blockCompress(RecipeHolder<BlockCompressRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBlockCompressRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getFirstResultBlock()
                    .state()
                    .getBlock()
                    .asItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
}