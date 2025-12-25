package dev.anvilcraft.guideme.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class LangHandler {

    /**
     * 语言文件初始化
     *
     * @param p 提供器
     */
    public static void init(RegistrateLangProvider p) {
        p.add("gui.ac_guideme.loaded", "%s is Loaded!");
        p.add("gui.ac_guideme.unloaded", "%s isn't Loaded!");
    }
}
