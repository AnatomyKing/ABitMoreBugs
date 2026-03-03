// file: C:/mods/Musavacca/src/main/java/space/anatomyuniverse/musavacca/tint/TintColorUtil.java
package space.anatomyuniverse.abitmorebugs.tint;

import net.minecraft.world.level.FoliageColor;

public final class TintColorUtil {
    private TintColorUtil() {}

    /**
     * Vanilla foliage default tint used for inventory/hand item tinting and item tint JSON generation.
     *
     * IMPORTANT:
     * Do NOT use FoliageColor.get(temp, humidity) for datagen constants, because the foliage color map
     * may not be initialized during datagen, which can produce black (-16777216 / 0xFF000000).
     *
     * We return the vanilla fallback default foliage color instead.
     */
    public static int defaultFoliageItemTint() {
        //? if <1.21.4 {
         /*return FoliageColor.getDefaultColor();
        *///?} else {
        return FoliageColor.FOLIAGE_DEFAULT;  // -12012264
        //?}
    }

}