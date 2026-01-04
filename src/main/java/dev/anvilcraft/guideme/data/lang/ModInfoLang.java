package dev.anvilcraft.guideme.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class ModInfoLang {
    public static void init(RegistrateLangProvider p) {
        p.add("gui.ac_guideme.mod_info.loaded", "%s is Loaded!");
        p.add("gui.ac_guideme.mod_info.unloaded", "%s isn't Loaded!");
    }
}
