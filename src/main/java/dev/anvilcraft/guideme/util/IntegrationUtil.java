package dev.anvilcraft.guideme.util;

import net.neoforged.fml.loading.LoadingModList;
import net.neoforged.fml.loading.moddiscovery.ModFileInfo;

import javax.annotation.Nullable;

public class IntegrationUtil {
    public static @Nullable String getVersion(String modId) {
        ModFileInfo fileInfo = LoadingModList.get().getModFileById(modId);
        if (fileInfo == null) return null;
        return fileInfo.versionString();
    }

    public static @Nullable String getName(String modId) {
        ModFileInfo fileInfo = LoadingModList.get().getModFileById(modId);
        if (fileInfo == null) return null;
        return fileInfo.moduleName();
    }
}
