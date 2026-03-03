
package space.anatomyuniverse.abitmorebugs.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import space.anatomyuniverse.abitmorebugs.block.ModBlocks;

import java.util.Set;

public final class ModBlockLootProvider extends BlockLootSubProvider {

    public ModBlockLootProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelfAll(
//                ModBlocks.BANANA_PEARL_BLOCK.get(),
//                ModBlocks.BANANA_PEARL_BRICKS.get(),
//                ModBlocks.BANANA_PEARL_CHAPITER.get(),
//                ModBlocks.BANANA_PEARL_PILLAR.get(),
//                ModBlocks.MUSAVACCA_STEM.get(),
//                ModBlocks.STRIPPED_MUSAVACCA_STEM.get(),
//                ModBlocks.MUSAVACCA_PLANKS.get(),
//                ModBlocks.MUSAVACCA_LEAVES.get(),
//                ModBlocks.SMALL_BANANA_PEARL_BLOCK.get()


        );
    }

    private void dropSelfAll(Block... blocks) {
        for (Block b : blocks) dropSelf(b);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream()
                .map(h -> (Block) h.get())
                .toList();
    }
}
