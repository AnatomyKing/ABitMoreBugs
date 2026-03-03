// file: C:/mods/Musavacca/src/main/java/space/anatomyuniverse/musavacca/tint/ModTints.java
package space.anatomyuniverse.abitmorebugs.tint;

import net.minecraft.client.renderer.BiomeColors;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import space.anatomyuniverse.abitmorebugs.block.ModBlocks;

public final class ModTints {
    private ModTints() {}

    public static void register(IEventBus modBus) {
        // Runtime block tint handler is needed on ALL versions (world rendering).
        modBus.addListener(ModTints::registerBlockColorHandlers);

        // Runtime item tint handler is only needed before 1.21.4.
        // 1.21.4+ uses client item definitions (assets/<modid>/items/*.json) for item tinting.
        //? if <1.21.4 {
        /*modBus.addListener(ModTints::registerItemColorHandlers);
         *///?}
    }

    public static void registerBlockColorHandlers(RegisterColorHandlersEvent.Block event) {
        event.register((state, level, pos, tintIndex) -> {
                    // Only tint the foliage layer (usually layer/tint index 0)
                    if (tintIndex != 0) {
                        return 0xFFFFFFFF;
                    }

                    // In-world placed block: biome foliage color (vanilla-like behavior)
                    if (level != null && pos != null) {
                        return BiomeColors.getAverageFoliageColor(level, pos);
                    }

                    // Fallback for previews / missing world context
                    return TintColorUtil.defaultFoliageItemTint();
                }
//                ModBlocks.MUSAVACCA_LEAVES.get()

        );
    }

    //? if <1.21.4 {
    /*public static void registerItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        event.register((stack, tintIndex) -> {
                    // Tint layer 0 only, just like vanilla foliage-style item tinting
                    if (tintIndex == 0) {
                        return TintColorUtil.defaultFoliageItemTint();
                    }
                    return 0xFFFFFFFF;
                }
                // Block items are items too (pre-1.21.4 runtime item tint system)
//                ModBlocks.MUSAVACCA_LEAVES.get()
        );
    }
    *///?}
}