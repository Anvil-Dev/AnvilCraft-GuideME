package dev.anvilcraft.guideme;

import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import dev.anvilcraft.guideme.data.ModDatagen;
import dev.anvilcraft.guideme.init.guideme.GuideME;
import dev.anvilcraft.guideme.init.item.AddonItems;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(AnvilCraftGuideME.MOD_ID)
public class AnvilCraftGuideME {
    public static final String MOD_ID = "anvilcraft_guideme";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Registrate REGISTRATE = Registrate.create(MOD_ID);

    public AnvilCraftGuideME(@NotNull IEventBus modEventBus, @NotNull ModContainer modContainer) {
        AddonItems.register();
        ModDatagen.init();

        GuideME.init();
    }

    public static @NotNull ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
