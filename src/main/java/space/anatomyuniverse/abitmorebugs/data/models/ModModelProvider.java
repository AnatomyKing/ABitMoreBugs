package space.anatomyuniverse.abitmorebugs.data.models;

import net.minecraft.data.PackOutput;
import space.anatomyuniverse.abitmorebugs.BugCore;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.block.Chapiter;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.block.CubeAll;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.block.CubeCrafterLike;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.block.CubeOwn;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.block.Log;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.block.Stairs;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.item.FlatItems;
import space.anatomyuniverse.abitmorebugs.data.models.helpers.item.HandheldItems;

//? if <1.21.4 {
/*import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
*///?} else {
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
//?}

//? if <1.21.4 {
/*public final class ModModelProvider extends BlockStateProvider {

    public ModModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BugCore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // -------------------------
        // Block section
        // -------------------------
        registerBlockModels(this);

        // -------------------------
        // Item section
        // -------------------------
        registerItemModels(itemModels());

        // Pre-1.21.4 foliage block items still use normal block item models here.
        // Runtime tinting happens in your ModTints class.
        // CubeOwnTintedFoliage.generate(this, ModelSets.cubeOwnTintedFoliageModels());
    }

    private static void registerBlockModels(BlockStateProvider blocks) {
        CubeAll.generate(blocks, ModelSets.cubeAllBlocks());
        Chapiter.generate(blocks, ModelSets.chapiterBlocks());
        Log.generate(blocks, ModelSets.logBlocks());
        Stairs.generate(blocks, ModelSets.stairsBlocks());
        CubeCrafterLike.generate(blocks, ModelSets.cubeCrafterLikeBlocks());

        // Existing custom block model ids
        CubeOwn.generate(blocks, ModelSets.cubeOwnModels());
    }

    private static void registerItemModels(ItemModelProvider items) {
        FlatItems.generate(items, ModelSets.flatItems());
        HandheldItems.generate(items, ModelSets.handheldItems());
    }
}
*///?} else {
public final class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, BugCore.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blocks, ItemModelGenerators items) {
        // -------------------------
        // Block section
        // -------------------------
        registerBlockModels(blocks);

        // Existing custom foliage block models with tinted block-items / client items
        // CubeOwnTintedFoliage.generate(blocks, items, ModelSets.cubeOwnTintedFoliageModels());

        // -------------------------
        // Item section
        // -------------------------
        registerItemModels(items);
    }

    private static void registerBlockModels(BlockModelGenerators blocks) {
        CubeAll.generate(blocks, ModelSets.cubeAllBlocks());
        Chapiter.generate(blocks, ModelSets.chapiterBlocks());
        Log.generate(blocks, ModelSets.logBlocks());
        Stairs.generate(blocks, ModelSets.stairsBlocks());
        CubeCrafterLike.generate(blocks, ModelSets.cubeCrafterLikeBlocks());

        // Existing custom block model ids
        CubeOwn.generate(blocks, ModelSets.cubeOwnModels());
    }

    private static void registerItemModels(ItemModelGenerators items) {
        FlatItems.generate(items, ModelSets.flatItems());
        HandheldItems.generate(items, ModelSets.handheldItems());
    }
}
//?}