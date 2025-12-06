package dev.anvilcraft.guideme.util;

public class GuideMERenderUtil {
    private static float TIME = 0f;
    private static long LAST_UPDATE = System.nanoTime();

    public static float getAnvilAnimationOffset() {
        long now = System.nanoTime();
        float deltaTime = (now - LAST_UPDATE) / 1_000_000_000f;
        TIME += deltaTime * 4.0f;
        LAST_UPDATE = now;
        float cycleTime = (TIME % 5);
        if (cycleTime >= 2) return 0;
        double progress = cycleTime / 2;
        double smoothProgress = progress * progress * (3 - 2 * progress);
        return (float) (Math.sin(smoothProgress * Math.PI) * 9);
    }

    public static int getDisplayPage(int size) {
        return (int) ((System.currentTimeMillis() / 1000) % size);
    }
}
