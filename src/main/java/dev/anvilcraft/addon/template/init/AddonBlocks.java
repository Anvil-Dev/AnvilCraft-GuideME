package dev.anvilcraft.addon.template.init;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

import static dev.anvilcraft.addon.template.AnvilCraftAddonTemplate.REGISTRATE;

public class AddonBlocks {
    static {
        REGISTRATE.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.getKey());
    }

    public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE
        .block("example_block", Block::new)
        .simpleItem()
        .register();

    public static void register() {
    }
}
