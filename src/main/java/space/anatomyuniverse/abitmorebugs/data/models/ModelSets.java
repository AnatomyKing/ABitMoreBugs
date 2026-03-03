package space.anatomyuniverse.abitmorebugs.data.models;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import space.anatomyuniverse.abitmorebugs.block.ModBlocks;
import space.anatomyuniverse.abitmorebugs.item.ModItems;

import java.util.Map;

public final class ModelSets {
    private ModelSets() {}

    public static Block[] cubeAllBlocks() {
        return new Block[] {
        };
    }

    public static Map<Block, String> cubeOwnModels() {
        return Map.of(
        );
    }

    public static Block[] chapiterBlocks() {
        return new Block[] {
        };
    }

    public static Block[] logBlocks() {
        return new Block[] {
        };
    }

    public static Block[] stairsBlocks() {
        return new Block[] {
        };
    }

    /** Crafter-like cube blocks (6 textures: _bottom/_top/_north/_south/_west/_east). */
    public static Block[] cubeCrafterLikeBlocks() {
        return new Block[] {
        };
    }

    /** Non-block items that need item/generated models. */
    public static ItemLike[] flatItems() {
        return new ItemLike[] {
        };
    }

    /** Non-block items that need item/handheld models. */
    public static ItemLike[] handheldItems() {
        return new ItemLike[] {
                ModItems.CATCHER.get()
        };
    }

    /*
    public static Map<Block, String> cubeOwnTintedFoliageModels() {
        return Map.of(
                // ModBlocks.SOME_LEAVES.get(), "abitmorebugs:block/some_leaves"
        );
    }
    */
}