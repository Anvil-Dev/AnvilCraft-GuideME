package dev.anvilcraft.guideme.recipe.anvil;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.anvilcraft.guideme.recipe.BetterLytVBox;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.BulgingRecipe;
import dev.dubhe.anvilcraft.recipe.component.HasCauldronSimple;
import dev.dubhe.anvilcraft.util.CauldronUtil;
import guideme.render.RenderContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class LytBulgingRecipe extends BetterLytVBox {
    private final BulgingRecipe recipe;

    public LytBulgingRecipe(BulgingRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void render(RenderContext context) {
        GuiGraphics guiGraphics = context.guiGraphics();
        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            81,
            22 + ANVIL_ANIMATION,
            20,
            12,
            RenderSupport.SINGLE_BLOCK);
        BlockState state;
        if (recipe.isFromWater()) {
            state = CauldronUtil.fullState(Blocks.WATER_CAULDRON);
        } else if (recipe.isProduceFluid()) {
            state = Blocks.CAULDRON.defaultBlockState();
        } else {
            state = recipe.getHasCauldron().getTransformCauldron().defaultBlockState();
        }
        RenderSupport.renderBlock(guiGraphics, state, 81, 40, 10, 12, RenderSupport.SINGLE_BLOCK);

        if (!recipe.getResultItems().isEmpty()) {
            HasCauldronSimple hasCauldron = recipe.getHasCauldron();
            if (recipe.isConsumeFluid()) {
                PoseStack pose = guiGraphics.pose();
                pose.pushPose();
                pose.scale(0.8f, 0.8f, 1.0f);
                guiGraphics.drawString(
                    Minecraft.getInstance().font,
                    Component.translatable(
                        "gui.anvilcraft.category.bulging.consume_fluid",
                        hasCauldron.consume(),
                        hasCauldron.getFluidCauldron().getName()
                    ),
                    0,
                    70,
                    0xFF000000,
                    false
                );
                pose.popPose();
            } else if (recipe.isProduceFluid()) {
                PoseStack pose = guiGraphics.pose();
                pose.pushPose();
                pose.scale(0.8f, 0.8f, 1.0f);
                guiGraphics.drawString(
                    Minecraft.getInstance().font,
                    Component.translatable(
                        "gui.anvilcraft.category.bulging.produce_fluid",
                        -hasCauldron.consume(),
                        hasCauldron.getTransformCauldron().getName()
                    ),
                    0,
                    70,
                    0xFF000000,
                    false
                );
                pose.popPose();
            }
        } else {
            Block result = recipe.getHasCauldron().getTransformCauldron();
            if (recipe.isConsumeFluid()) {
                state = CauldronUtil.getStateFromContentAndLevel(result, CauldronUtil.maxLevel(result) - 1);
            } else if (recipe.isProduceFluid()) {
                state = CauldronUtil.getStateFromContentAndLevel(result, 1);
            } else {
                state = CauldronUtil.fullState(result);
            }
            RenderSupport.renderBlock(guiGraphics, state, 133, 30, 0, 12, RenderSupport.SINGLE_BLOCK);
        }
    }
}
