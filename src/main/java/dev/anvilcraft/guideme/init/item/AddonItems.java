package dev.anvilcraft.guideme.init.item;

import com.tterrag.registrate.util.entry.ItemEntry;
import dev.dubhe.anvilcraft.AnvilCraft;
import dev.dubhe.anvilcraft.init.item.ModItemGroups;
import dev.dubhe.anvilcraft.util.DataGenUtil;
import net.minecraft.core.component.DataComponents;

import static dev.anvilcraft.guideme.AnvilCraftGuideME.REGISTRATE;

public class AddonItems {
    static {
        AnvilCraft.REGISTRATE.defaultCreativeTab(ModItemGroups.ANVILCRAFT_TOOL.getKey());
    }

    public static final ItemEntry<GuideMEBookItem> GUIDEME_BOOK = REGISTRATE
        .item("guideme_book", GuideMEBookItem::new)
        .model(DataGenUtil::noExtraModelOrState)
        .properties(properties -> properties.stacksTo(1).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true))
        .register();

    public static void register() {
    }
}
