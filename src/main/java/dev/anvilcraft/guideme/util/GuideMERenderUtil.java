package dev.anvilcraft.guideme.util;

import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.dubhe.anvilcraft.client.support.RenderSupport;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GuideMERenderUtil {
    private static float TIME = 0f;
    private static long LAST_UPDATE = System.nanoTime();

    public static float getAnvilAnimationOffset() {
        long now = System.nanoTime();
        float deltaTime = (now - LAST_UPDATE) / 1_000_000_000f;
        TIME += deltaTime * 4.0f;
        LAST_UPDATE = now;
        float cycleTime = (TIME % 10);
        if (cycleTime >= 2) return 0;
        double progress = cycleTime / 2;
        double smoothProgress = progress * progress * (3 - 2 * progress);
        return (float) (Math.sin(smoothProgress * Math.PI) * 9);
    }

    public static int getDisplayPage(int size) {
        var cycle = System.nanoTime() / TimeUnit.MILLISECONDS.toNanos(2000);
        return ((int) (cycle % size));
    }

    public static void renderAnvil(
        GuiGraphics guiGraphics,
        int x,
        float y,
        int z
    ) {
        RenderSupport.renderBlock(
            guiGraphics,
            Blocks.ANVIL.defaultBlockState(),
            x,
            y,
            z,
            12,
            RenderSupport.SINGLE_BLOCK
        );
    }

    public static void renderedBlock(
        GuiGraphics guiGraphics,
        List<BlockStatePredicate> list,
        int x,
        int y
    ) {
        int z = 25;
        List<BlockStatePredicate> list1 = new ArrayList<>(list);
        for (int i = list1.size() - 1; i >= 0; i--) {
            List<BlockState> input = list1.get(i).constructStatesForRender();
            if (input.isEmpty()) continue;
            BlockState renderedState = input.get((int) ((System.currentTimeMillis() / 1000) % input.size()));
            if (renderedState == null) continue;
            RenderSupport.renderBlock(
                guiGraphics,
                renderedState,
                x,
                y + 10 * i,
                z - 10 * i,
                12,
                RenderSupport.SINGLE_BLOCK
            );
        }
    }

    public static void renderedBlockStatesAndAnvilAnimation(
        GuiGraphics guiGraphics,
        List<BlockStatePredicate> list,
        int startX,
        int startY
    ) {
        int z = 25;
        List<BlockStatePredicate> list1 = new ArrayList<>(list);
        list1.addFirst(BlockStatePredicate.builder().of(Blocks.ANVIL).build());
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (i == 0) {
                renderAnvil(
                    guiGraphics,
                    startX,
                    startY - 9 + getAnvilAnimationOffset(),
                    z
                );
            } else {
                List<BlockState> input = list1.get(i).constructStatesForRender();
                if (input.isEmpty()) continue;
                BlockState renderedState = input.get(getDisplayPage(input.size()));
                if (renderedState == null) continue;
                RenderSupport.renderBlock(
                    guiGraphics,
                    renderedState,
                    startX,
                    startY + 10 * i,
                    z - 10 * i,
                    12,
                    RenderSupport.SINGLE_BLOCK
                );
            }
        }
    }

    public static void renderedBlockStatesAndAnvil(
        GuiGraphics guiGraphics,
        List<BlockStatePredicate> list,
        int startX,
        int startY
    ) {
        int z = 25;
        List<BlockStatePredicate> list1 = new ArrayList<>(list);
        list1.addFirst(BlockStatePredicate.builder().of(Blocks.ANVIL).build());
        for (int i = list1.size() - 1; i >= 0; i--) {
            List<BlockState> input = list1.get(i).constructStatesForRender();
            if (input.isEmpty()) continue;
            BlockState renderedState = input.get((int) ((System.currentTimeMillis() / 1000) % input.size()));
            if (renderedState == null) continue;
            RenderSupport.renderBlock(
                guiGraphics,
                renderedState,
                startX,
                startY + 10 * i,
                z - 10 * i,
                12,
                RenderSupport.SINGLE_BLOCK
            );
        }
    }
}