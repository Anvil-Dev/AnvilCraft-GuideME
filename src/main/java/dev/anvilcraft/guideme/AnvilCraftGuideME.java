package dev.anvilcraft.guideme;

import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import dev.anvilcraft.guideme.data.ModDatagen;
import dev.anvilcraft.guideme.guide.element.ItemEntityShapeCompiler;
import guideme.Guide;
import guideme.scene.element.SceneElementTagCompiler;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(AnvilCraftGuideME.MOD_ID)
public class AnvilCraftGuideME {
    public static final String MOD_ID = "anvilcraft_guideme";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Registrate REGISTRATE = Registrate.create(MOD_ID);
    public static final ResourceLocation GID = AnvilCraftGuideME.of("guideme");

    @Getter
    private static Guide guideme;

    public AnvilCraftGuideME(IEventBus modEventBus, ModContainer modContainer) {
        ModDatagen.init();
        this.guide();
    }

    private void guide() {
        guideme = Guide.builder(GID)
            .folder("ac_guidebook")
            .extension(SceneElementTagCompiler.EXTENSION_POINT, new ItemEntityShapeCompiler())
            .build();
    }

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
