package dev.anvilcraft.addon.template;

import dev.anvilcraft.lib.config.BoundedDiscrete;
import dev.anvilcraft.lib.config.Comment;
import dev.anvilcraft.lib.config.Config;
import net.minecraft.world.item.Item;

import java.util.HashSet;
import java.util.Set;

@Config(name = AnvilCraftAddonTemplate.MOD_ID)
public class AddonConfig {
    @Comment("Whether to log the dirt block on common setup")
    public boolean logDirtBlock = false;

    @Comment("A magic number")
    @BoundedDiscrete(max = 24, min = 2)
    public int magicNumber = 2;

    @Comment("What you want the introduction message to be for the magic number")
    public String magicNumberIntroduction = "";
}
