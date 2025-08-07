package net.anatomyworld.abitmorebugs.data;

import net.anatomyworld.abitmorebugs.BugCore;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/** Generates pickaxe / needs_stone_tool JSON tags. */
public final class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(
            PackOutput                         output,
            CompletableFuture<HolderLookup.Provider> lookup,
            ExistingFileHelper helper) {

        super(output, lookup, BugCore.MOD_ID, helper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {



    }
}


