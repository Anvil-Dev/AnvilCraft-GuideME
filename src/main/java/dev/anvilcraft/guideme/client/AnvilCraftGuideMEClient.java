package dev.anvilcraft.guideme.client;

import dev.anvilcraft.guideme.AnvilCraftGuideME;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod(value = AnvilCraftGuideME.MOD_ID, dist = Dist.CLIENT)
public class AnvilCraftGuideMEClient {
    public AnvilCraftGuideMEClient(@NotNull IEventBus modBus, @NotNull ModContainer container) {

    }
}
