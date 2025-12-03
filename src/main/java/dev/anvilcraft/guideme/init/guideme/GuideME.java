package dev.anvilcraft.guideme.init.guideme;

import dev.anvilcraft.guideme.AnvilCraftGuideME;
import guideme.Guide;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;

public class GuideME {
    @Getter
    private static Guide guideme;
    public static final ResourceLocation GID = AnvilCraftGuideME.of("book");


    public static void init() {
        guideme = Guide.builder(GID)
            .folder("ac_guidebook")
            .build();
    }
}
