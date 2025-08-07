package net.anatomyworld.abitmorebugs;

import com.mojang.logging.LogUtils;
import net.anatomyworld.abitmorebugs.data.ModDataGenerators;
import net.anatomyworld.abitmorebugs.entity.ModEntities;
import net.anatomyworld.abitmorebugs.entity.goliathbeetle.client.GoliathBeetleRenderer;
import net.anatomyworld.abitmorebugs.entity.goliathbeetle.client.GoliathBeetleModel;
import net.anatomyworld.abitmorebugs.item.ModCreativeTabs;
import net.anatomyworld.abitmorebugs.item.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import org.slf4j.Logger;

@Mod(BugCore.MOD_ID)
public final class BugCore {
    public static final String MOD_ID = "abitmorebugs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BugCore(IEventBus modBus, ModContainer container) {
        // Register all mod content
        ModEntities.register(modBus);
        ModItems.register(modBus);
        ModCreativeTabs.register(modBus);


        // Common setup event
        modBus.addListener(this::commonSetup);

        // Config registration, data generation omitted for brevity...
        modBus.addListener(ModDataGenerators::gatherData);
    }

    private void commonSetup(final FMLCommonSetupEvent e) {
        // Common setup tasks (if any)
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static final class ClientEvents {
        @SubscribeEvent
        public static void layerDefs(EntityRenderersEvent.RegisterLayerDefinitions e) {
            // Beetle model registration

            e.registerLayerDefinition(
                    GoliathBeetleModel.LAYER_LOCATION,
                    GoliathBeetleModel::createBodyLayer
            );
        }

        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent e) {
            e.enqueueWork(() -> {
                // Register entity renderers

                net.minecraft.client.renderer.entity.EntityRenderers.register(
                        ModEntities.GOLIATH_BEETLE.get(),
                        GoliathBeetleRenderer::new
                );
            });
        }
    }
}

