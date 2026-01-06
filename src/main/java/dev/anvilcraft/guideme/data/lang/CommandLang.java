package dev.anvilcraft.guideme.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class CommandLang {
    public static void init(RegistrateLangProvider provider) {
        provider.add("command.ac_guideme.item", "Item: %s");
    }
}
