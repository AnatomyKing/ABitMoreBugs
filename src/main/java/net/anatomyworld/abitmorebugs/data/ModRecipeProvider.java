package net.anatomyworld.abitmorebugs.data;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput out,
                             CompletableFuture<HolderLookup.Provider> lookup) {
        super(out, lookup);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput out) {

    }
}
