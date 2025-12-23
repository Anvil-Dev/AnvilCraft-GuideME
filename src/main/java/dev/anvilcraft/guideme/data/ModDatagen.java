package dev.anvilcraft.guideme.data;

import com.tterrag.registrate.providers.ProviderType;
import dev.anvilcraft.guideme.AnvilCraftGuideME;
import dev.anvilcraft.guideme.data.lang.LangHandler;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import static dev.anvilcraft.guideme.AnvilCraftGuideME.REGISTRATE;

@EventBusSubscriber(modid = AnvilCraftGuideME.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModDatagen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
    }

    /**
     * 初始化生成器
     */
    public static void init() {
        REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
