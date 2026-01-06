package dev.anvilcraft.guideme.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class CommandLang {
    public static void init(RegistrateLangProvider provider) {
        provider.add("command.ac_guideme.item", "Item: %s");
        provider.add("command.ac_guideme.count", "Count: %s");
        provider.add("command.ac_guideme.mod", "Mod: %s");
        provider.add("command.ac_guideme.item_tags", "Item Tags:");
        provider.add("command.ac_guideme.block_tags", "Block Tags:");
    }
}
