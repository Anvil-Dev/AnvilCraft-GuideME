package dev.anvilcraft.guideme.util;

import dev.anvilcraft.guideme.AnvilCraftGuideME;
import dev.dubhe.anvilcraft.AnvilCraft;
import guideme.render.GuiAssets;
import guideme.render.GuiSprite;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static guideme.render.GuiAssets.sprite;

public final class TextureConstants {
    // Background
    public static final GuiSprite HEAVY_IRON_1 = sprite(AnvilCraftGuideME.of("background/heavy_iron_1"));
    public static final GuiSprite HEAVY_IRON_2 = sprite(AnvilCraftGuideME.of("background/heavy_iron_2"));
    public static final GuiSprite HEAVY_IRON_3 = sprite(AnvilCraftGuideME.of("background/heavy_iron_3"));
    public static final GuiSprite ROYAL = sprite(AnvilCraftGuideME.of("background/royal"));
    public static final GuiSprite EMBER = sprite(AnvilCraftGuideME.of("background/ember"));
    public static final GuiSprite MULTIPLE_TO_ONE_SMITHING = sprite(AnvilCraftGuideME.of("background/multiple_to_one_smithing_guideme"));

    public static final GuiSprite CONVERSION = sprite(AnvilCraftGuideME.of("arrow/block_conversion"));
    public static final GuiSprite EXPLOSION = sprite(AnvilCraftGuideME.of("explosion"));
}