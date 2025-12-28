package dev.anvilcraft.guideme.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class LangHandler {
    public static void init(RegistrateLangProvider provider) {
        ModInfoLang.init(provider);
        RecipeLang.init(provider);
    }
}
