package space.anatomyuniverse.abitmorebugs.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import space.anatomyuniverse.abitmorebugs.BugCore;
import space.anatomyuniverse.abitmorebugs.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

//? if <1.21.4 {
/*import net.neoforged.neoforge.common.data.ExistingFileHelper;
*///?}

public final class ModBlockTagsProvider extends BlockTagsProvider {

    //? if <1.21.4 {
    /*public ModBlockTagsProvider(PackOutput output,
                                CompletableFuture<HolderLookup.Provider> lookupProvider,
                                ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BugCore.MOD_ID, existingFileHelper);
    }
    *///?}

    //? if >=1.21.4 {
    public ModBlockTagsProvider(PackOutput output,
                                CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, BugCore.MOD_ID);
    }
    //?}

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}
