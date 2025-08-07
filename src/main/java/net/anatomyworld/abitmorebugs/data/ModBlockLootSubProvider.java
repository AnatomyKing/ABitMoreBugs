package net.anatomyworld.abitmorebugs.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.stream.Collectors;


public final class ModBlockLootSubProvider extends BlockLootSubProvider {


    public ModBlockLootSubProvider(HolderLookup.Provider lookup) {
        super(Set.<Item>of(),                        // no explosion-immune blocks
                FeatureFlags.DEFAULT_FLAGS,            // all vanilla flags enabled
                lookup);
    }

    /** Actual loot-table contents. */
    @Override
    protected void generate() {
    }

    /** Validation list – every registered block must appear here. */

}
