package dev.anvilcraft.guideme.recipe;

import dev.anvilcraft.guideme.recipe.anvil.LytBlockCompressRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytBlockCrushRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytBlockSmearRecipe;
import dev.dubhe.anvilcraft.init.reicpe.ModRecipeTypes;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCompressRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCrushRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockSmearRecipe;
import guideme.compiler.tags.RecipeTypeMappingSupplier;
import guideme.document.block.recipes.LytStandardRecipeBox;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeHolder;

public class RecipeTypeContributions implements RecipeTypeMappingSupplier {
    @Override
    public void collect(RecipeTypeMappings mappings) {
        mappings.add(ModRecipeTypes.BLOCK_COMPRESS_TYPE.get(), RecipeTypeContributions::blockCompress);
        mappings.add(ModRecipeTypes.BLOCK_CRUSH_TYPE.get(), RecipeTypeContributions::blockCrush);
        mappings.add(ModRecipeTypes.BLOCK_SMEAR_TYPE.get(), RecipeTypeContributions::blockSmear);
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
    private static LytStandardRecipeBox<BlockCrushRecipe> blockCrush(RecipeHolder<BlockCrushRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBlockCrushRecipe(holder.value()))
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
    private static LytStandardRecipeBox<BlockSmearRecipe> blockSmear(RecipeHolder<BlockSmearRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBlockSmearRecipe(holder.value()))
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