package dev.anvilcraft.guideme.recipe;

import dev.anvilcraft.guideme.recipe.anvil.LytBaseMultipleToOneSmithingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytBlockCompressRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytBlockCrushRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytBlockSmearRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytBoilingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytBulgingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytChargerChargingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytCollisionRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytCookingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytItemCompressRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytItemCrushRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytItemInjectRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytJewelCraftingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytMassInjectRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytMeshRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytMobTransformRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytMobTransformWithItemRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytNeutronIrradiationRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytSqueezingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytStampingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytSuperHeatingRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytTimeWarpRecipe;
import dev.anvilcraft.guideme.recipe.anvil.LytUnpackRecipe;
import dev.dubhe.anvilcraft.init.item.ModItems;
import dev.dubhe.anvilcraft.init.reicpe.ModRecipeTypes;
import dev.dubhe.anvilcraft.recipe.ChargerChargingRecipe;
import dev.dubhe.anvilcraft.recipe.JewelCraftingRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.MassInjectRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.collision.AnvilCollisionCraftRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCompressRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockCrushRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BlockSmearRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BoilingRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BulgingRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.CookingRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.ItemCompressRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.ItemCrushRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.ItemInjectRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.MeshRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.NeutronIrradiationRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.SqueezingRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.StampingRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.SuperHeatingRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.TimeWarpRecipe;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.UnpackRecipe;
import dev.dubhe.anvilcraft.recipe.multiple.BaseMultipleToOneSmithingRecipe;
import dev.dubhe.anvilcraft.recipe.transform.MobTransformRecipe;
import dev.dubhe.anvilcraft.recipe.transform.MobTransformWithItemRecipe;
import guideme.compiler.tags.RecipeTypeMappingSupplier;
import guideme.document.block.recipes.LytStandardRecipeBox;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeHolder;

public class RecipeTypeContributions implements RecipeTypeMappingSupplier {

    // TODO: BeaconConversion | MultiBlock | EndPortalConversion | Transcendium

    @Override
    public void collect(RecipeTypeMappings mappings) {
        mappings.add(ModRecipeTypes.BLOCK_COMPRESS_TYPE.get(), RecipeTypeContributions::blockCompress);
        mappings.add(ModRecipeTypes.BLOCK_CRUSH_TYPE.get(), RecipeTypeContributions::blockCrush);
        mappings.add(ModRecipeTypes.BLOCK_SMEAR_TYPE.get(), RecipeTypeContributions::blockSmear);
        mappings.add(ModRecipeTypes.BOILING_TYPE.get(), RecipeTypeContributions::boiling);
        mappings.add(ModRecipeTypes.BULGING_TYPE.get(), RecipeTypeContributions::bulging);
        mappings.add(ModRecipeTypes.COOKING_TYPE.get(), RecipeTypeContributions::cooking);
        mappings.add(ModRecipeTypes.ITEM_COMPRESS_TYPE.get(), RecipeTypeContributions::itemCompress);
        mappings.add(ModRecipeTypes.ITEM_CRUSH_TYPE.get(), RecipeTypeContributions::itemCrush);
        mappings.add(ModRecipeTypes.ITEM_INJECT_TYPE.get(), RecipeTypeContributions::itemInject);
        mappings.add(ModRecipeTypes.MASS_INJECT_TYPE.get(), RecipeTypeContributions::massInject);
        mappings.add(ModRecipeTypes.MESH_TYPE.get(), RecipeTypeContributions::mesh);
        mappings.add(ModRecipeTypes.NEUTRON_IRRADIATION.get(), RecipeTypeContributions::neutronIrradiation);
        mappings.add(ModRecipeTypes.SQUEEZING_TYPE.get(), RecipeTypeContributions::squeezing);
        mappings.add(ModRecipeTypes.STAMPING_TYPE.get(), RecipeTypeContributions::stamping);
        mappings.add(ModRecipeTypes.SUPER_HEATING_TYPE.get(), RecipeTypeContributions::superHeating);
        mappings.add(ModRecipeTypes.TIME_WARP_TYPE.get(), RecipeTypeContributions::timeWarp);
        mappings.add(ModRecipeTypes.UNPACK_TYPE.get(), RecipeTypeContributions::unpack);
        mappings.add(ModRecipeTypes.ANVIL_COLLISION_CRAFT.get(), RecipeTypeContributions::collision);
        mappings.add(ModRecipeTypes.MULTIPLE_TO_ONE_SMITHING_TYPE.get(), RecipeTypeContributions::multiple);
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
    private static LytStandardRecipeBox<BoilingRecipe> boiling(RecipeHolder<BoilingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBoilingRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<BulgingRecipe> bulging(RecipeHolder<BulgingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBulgingRecipe(holder.value()))
            .build(holder);
    }
    private static LytStandardRecipeBox<CookingRecipe> cooking(RecipeHolder<CookingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytCookingRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<ItemCompressRecipe> itemCompress(RecipeHolder<ItemCompressRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytItemCompressRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<ItemCrushRecipe> itemCrush(RecipeHolder<ItemCrushRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytItemCrushRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<ItemInjectRecipe> itemInject(RecipeHolder<ItemInjectRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytItemInjectRecipe(holder.value()))
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
    private static LytStandardRecipeBox<MassInjectRecipe> massInject(RecipeHolder<MassInjectRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytMassInjectRecipe(holder.value()))
            .title(
                ModItems.NEUTRONIUM_INGOT.asItem().getDescription().getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<MeshRecipe> mesh(RecipeHolder<MeshRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytMeshRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<NeutronIrradiationRecipe> neutronIrradiation(RecipeHolder<NeutronIrradiationRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytNeutronIrradiationRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<SqueezingRecipe> squeezing(RecipeHolder<SqueezingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytSqueezingRecipe(holder.value()))
            .build(holder);
    }
    private static LytStandardRecipeBox<StampingRecipe> stamping(RecipeHolder<StampingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytStampingRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<SuperHeatingRecipe> superHeating(RecipeHolder<SuperHeatingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytSuperHeatingRecipe(holder.value()))
            .build(holder);
    }
    private static LytStandardRecipeBox<TimeWarpRecipe> timeWarp(RecipeHolder<TimeWarpRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytTimeWarpRecipe(holder.value()))
            .build(holder);
    }
    private static LytStandardRecipeBox<UnpackRecipe> unpack(RecipeHolder<UnpackRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytUnpackRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResultItems()
                    .getFirst()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<AnvilCollisionCraftRecipe> collision(RecipeHolder<AnvilCollisionCraftRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytCollisionRecipe(holder.value()))
            .build(holder);
    }
    private static LytStandardRecipeBox<ChargerChargingRecipe> chargerCharging(RecipeHolder<ChargerChargingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytChargerChargingRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResult()
                    .getDescriptionId()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<JewelCraftingRecipe> jewelCrafting(RecipeHolder<JewelCraftingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytJewelCraftingRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResult()
                    .getDescriptionId()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<MobTransformRecipe> mobTransform(RecipeHolder<MobTransformRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytMobTransformRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .input()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<MobTransformWithItemRecipe> mobTransformWithItem(RecipeHolder<MobTransformWithItemRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytMobTransformWithItemRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .input()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<BaseMultipleToOneSmithingRecipe> multiple(RecipeHolder<BaseMultipleToOneSmithingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBaseMultipleToOneSmithingRecipe(holder.value()))
            .title(
                holder
                    .value()
                    .getResult()
                    .getResult()
                    .getItem()
                    .getDescription()
                    .getString()
            )
            .build(holder);
    }
}