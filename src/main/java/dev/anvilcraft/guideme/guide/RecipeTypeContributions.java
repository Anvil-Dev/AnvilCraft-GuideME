package dev.anvilcraft.guideme.guide;

import dev.anvilcraft.guideme.guide.recipe.LytBaseMultipleToOneSmithingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytBlockCompressRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytBlockCrushRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytBlockSmearRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytBoilingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytBulgingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytChargerChargingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytCollisionRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytCookingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytItemCompressRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytItemCrushRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytItemInjectRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytJewelCraftingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytMassInjectRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytMeshRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytMobTransformRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytMobTransformWithItemRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytNeutronIrradiationRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytSqueezingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytStampingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytSuperHeatingRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytTimeWarpRecipe;
import dev.anvilcraft.guideme.guide.recipe.LytUnpackRecipe;
import dev.anvilcraft.guideme.guide.recipe.vanilla.VanillaRecipes;
import dev.dubhe.anvilcraft.init.recipe.ModRecipeTypes;
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
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class RecipeTypeContributions implements RecipeTypeMappingSupplier {

    // TODO: BeaconConversion | MultiBlock | EndPortalConversion | Transcendium | MobTransform

    @Override
    public void collect(RecipeTypeMappings mappings) {
        // Vanilla
        mappings.add(RecipeType.STONECUTTING, VanillaRecipes::createStonecutter);

        // Anvil
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
        mappings.add(ModRecipeTypes.CHARGER_CHARGING_TYPE.get(), RecipeTypeContributions::chargerCharging);
        mappings.add(ModRecipeTypes.JEWEL_CRAFTING_TYPE.get(), RecipeTypeContributions::jewelCrafting);
        mappings.add(ModRecipeTypes.MULTIPLE_TO_ONE_SMITHING_TYPE.get(), RecipeTypeContributions::multiple);
    }

    private static LytStandardRecipeBox<BlockCompressRecipe> blockCompress(RecipeHolder<BlockCompressRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBlockCompressRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.block_compress"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<BlockCrushRecipe> blockCrush(RecipeHolder<BlockCrushRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBlockCrushRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.block_crush"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<BlockSmearRecipe> blockSmear(RecipeHolder<BlockSmearRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBlockSmearRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.block_smear"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<BoilingRecipe> boiling(RecipeHolder<BoilingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBoilingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.boiling"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<BulgingRecipe> bulging(RecipeHolder<BulgingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBulgingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.bulging"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<CookingRecipe> cooking(RecipeHolder<CookingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytCookingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.cooking"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<ItemCompressRecipe> itemCompress(RecipeHolder<ItemCompressRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytItemCompressRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.item_compress"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<ItemCrushRecipe> itemCrush(RecipeHolder<ItemCrushRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytItemCrushRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.item_crush"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<ItemInjectRecipe> itemInject(RecipeHolder<ItemInjectRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytItemInjectRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.item_inject"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<MassInjectRecipe> massInject(RecipeHolder<MassInjectRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytMassInjectRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.mass_inject"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<MeshRecipe> mesh(RecipeHolder<MeshRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytMeshRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.mesh"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<NeutronIrradiationRecipe> neutronIrradiation(RecipeHolder<NeutronIrradiationRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytNeutronIrradiationRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.neutron_irradiation"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<SqueezingRecipe> squeezing(RecipeHolder<SqueezingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytSqueezingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.squeezing"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<StampingRecipe> stamping(RecipeHolder<StampingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytStampingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.stamping"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<SuperHeatingRecipe> superHeating(RecipeHolder<SuperHeatingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytSuperHeatingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.super_heating"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<TimeWarpRecipe> timeWarp(RecipeHolder<TimeWarpRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytTimeWarpRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.time_warp"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<UnpackRecipe> unpack(RecipeHolder<UnpackRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytUnpackRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.unpack"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<AnvilCollisionCraftRecipe> collision(RecipeHolder<AnvilCollisionCraftRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytCollisionRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.anvil_collision"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<ChargerChargingRecipe> chargerCharging(RecipeHolder<ChargerChargingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytChargerChargingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.charger_charging"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<JewelCraftingRecipe> jewelCrafting(RecipeHolder<JewelCraftingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytJewelCraftingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.jewel_crafting"))
            )
            .build(holder);
    }
    private static LytStandardRecipeBox<BaseMultipleToOneSmithingRecipe> multiple(RecipeHolder<BaseMultipleToOneSmithingRecipe> holder) {
        return LytStandardRecipeBox
            .builder()
            .icon(Items.ANVIL)
            .customBody(new LytBaseMultipleToOneSmithingRecipe(holder.value()))
            .title(
                appendComponent(Component.translatable("gui.anvilcraft.category.multiple_to_one_smithing"))
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

    private static String appendComponent(FormattedText formattedText) {
        AtomicReference<String> string = new AtomicReference<>();
        formattedText.visit(
            (style, text) -> {
                string.set(text);
                return Optional.empty();
                },
            Style.EMPTY
        );
        return string.get();
    }
}