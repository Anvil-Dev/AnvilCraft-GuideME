package dev.anvilcraft.guideme.event;

import dev.anvilcraft.guideme.AnvilCraftGuideME;
import dev.dubhe.anvilcraft.api.event.CheckIntegrationLoadedEvent;
import dev.dubhe.anvilcraft.api.event.GuideBookEvent;
import guideme.GuidesCommon;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import static dev.anvilcraft.guideme.AnvilCraftGuideME.GID;

@EventBusSubscriber(modid = AnvilCraftGuideME.MOD_ID)
public class AddonGuideEventListener {
    @SubscribeEvent
    public static void onHasGuide(GuideBookEvent.HasGuideBookEvent event) {
        event.hasGuideBook();
    }

    @SubscribeEvent
    public static void onOpenGuide(GuideBookEvent.OpenGuideBookEvent event) {
        GuidesCommon.openGuide(event.getPlayer(), GID);
    }

    @SubscribeEvent
    public static void onHasGuide(CheckIntegrationLoadedEvent event) {
        if (event.getId().equals("guideme")) {
            event.setLoaded();
        }
    }
}
