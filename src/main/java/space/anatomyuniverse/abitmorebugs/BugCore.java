package space.anatomyuniverse.abitmorebugs;

import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

import space.anatomyuniverse.abitmorebugs.block.ModBlocks;
import space.anatomyuniverse.abitmorebugs.render.BugRenderLayers;
import space.anatomyuniverse.abitmorebugs.data.ModDataGenerators;
import space.anatomyuniverse.abitmorebugs.item.ModCreativeTabs;
import space.anatomyuniverse.abitmorebugs.item.ModItems;
import space.anatomyuniverse.abitmorebugs.tint.ModTints;

//? if <1.21.9 {
import net.neoforged.fml.loading.FMLLoader;
//?} else {
/*import net.neoforged.fml.loading.FMLEnvironment;
 *///?}

@Mod(BugCore.MOD_ID)
public final class BugCore {
    public static final String MOD_ID = "abitmorebugs";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final String VERSION = /*$ mod_version*/ "0.0.1";
    public static final String MINECRAFT = /*$ minecraft*/ "1.21.8";

    public BugCore(IEventBus modBus, ModContainer container) {
        // Registries
        ModItems.register(modBus);
        ModBlocks.register(modBus);
        ModCreativeTabs.register(modBus);

        // Common lifecycle
        modBus.addListener(this::commonSetup);

        // Datagen hook (MUST be unconditional)
        modBus.addListener(ModDataGenerators::gatherData);

        // Client-only hooks
        //? if <1.21.9 {
        if (FMLLoader.getDist() == Dist.CLIENT) {
            ModTints.register(modBus);
            modBus.addListener(BugRenderLayers::onModifyBakingResult);
        }
        //?} else {
        /*if (FMLEnvironment.getDist() == Dist.CLIENT) {
            ModTints.register(modBus);
            modBus.addListener(BugRenderLayers::onModifyBakingResult);
        }
        *///?}
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}
}