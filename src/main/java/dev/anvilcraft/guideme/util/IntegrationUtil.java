package dev.anvilcraft.guideme.util;

import net.neoforged.fml.loading.LoadingModList;
import net.neoforged.fml.loading.moddiscovery.ModFileInfo;

import javax.annotation.Nullable;

public class IntegrationUtil {
    public static @Nullable String getVersion(String modId) {
        ModFileInfo info = LoadingModList.get().getModFileById(modId);
        if (info == null) return null;
        return info.versionString();
    }

    public static @Nullable String getName(String modId) {
        ModFileInfo info = LoadingModList.get().getModFileById(modId);
        if (info == null) return null;
        return info.moduleName();
    }
}
