package space.anatomyuniverse.abitmorebugs.block;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import space.anatomyuniverse.abitmorebugs.BugCore;

import java.util.Set;

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BugCore.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BugCore.MOD_ID);

//    public static final DeferredBlock<Block> BANANA_PEARL_BLOCK =
//            BLOCKS.registerBlock("banana_pearl_block",
//                    props -> new Block(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.COPPER)
//                            .requiresCorrectToolForDrops()
//                            .pushReaction(PushReaction.NORMAL)));
//
//    public static final DeferredBlock<Block> BANANA_PEARL_BRICKS =
//            BLOCKS.registerBlock("banana_pearl_bricks",
//                    props -> new Block(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.COPPER)
//                            .requiresCorrectToolForDrops()
//                            .pushReaction(PushReaction.NORMAL)));
//
//    public static final DeferredBlock<Block> BANANA_PEARL_CHAPITER =
//            BLOCKS.registerBlock("banana_pearl_chapiter",
//                    props -> new BananaPearlChapiter(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.COPPER)
//                            .requiresCorrectToolForDrops()
//                            .pushReaction(PushReaction.NORMAL)));
//
//    public static final DeferredBlock<RotatedPillarBlock> BANANA_PEARL_PILLAR =
//            BLOCKS.registerBlock("banana_pearl_pillar",
//                    props -> new RotatedPillarBlock(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.COPPER)
//                            .requiresCorrectToolForDrops()
//                            .pushReaction(PushReaction.NORMAL)));
//
//
//    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_MUSAVACCA_STEM =
//            BLOCKS.registerBlock("stripped_musavacca_stem",
//                    props -> new RotatedPillarBlock(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.WOOD)
//                            .requiresCorrectToolForDrops()
//                            .pushReaction(PushReaction.NORMAL)));
//
//    public static final DeferredBlock<StrippableLogBlock> MUSAVACCA_STEM =
//            BLOCKS.registerBlock("musavacca_stem",
//                    props -> new StrippableLogBlock(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.WOOD)
//                            .requiresCorrectToolForDrops()
//                            .pushReaction(PushReaction.NORMAL),
//                            STRIPPED_MUSAVACCA_STEM));
//
//    public static final DeferredBlock<SmallBananaPearlBlock> SMALL_BANANA_PEARL_BLOCK =
//            BLOCKS.registerBlock("small_banana_pearl_block",
//                    props -> new SmallBananaPearlBlock(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.COPPER)
//                            .requiresCorrectToolForDrops()
//                            .noOcclusion()
//                            .isSuffocating((state, level, pos) -> false)
//                            .isViewBlocking((state, level, pos) -> false)
//                            .isRedstoneConductor((state, level, pos) -> false)
//                            .isValidSpawn((state, level, pos, entityType) -> false)
//                            .pushReaction(PushReaction.NORMAL)
//                    ));
//
//
//    public static final DeferredBlock<Block> MUSAVACCA_PLANKS =
//            BLOCKS.registerBlock("musavacca_planks",
//                    props -> new Block(props
//                            .mapColor(MapColor.COLOR_ORANGE)
//                            .strength(3.0F, 6.0F)
//                            .sound(SoundType.COPPER)
//                            .requiresCorrectToolForDrops()
//                            .pushReaction(PushReaction.NORMAL)));
//
//    public static final DeferredBlock<Block> MUSAVACCA_LEAVES =
//            BLOCKS.registerBlock("musavacca_leaves", props -> {
//                var p = props
//                        .mapColor(MapColor.PLANT)
//                        .strength(0.2F)
//                        .randomTicks()
//                        .sound(SoundType.GRASS)
//                        .noOcclusion()
//                        .isSuffocating((s, l, pos) -> false)
//                        .isViewBlocking((s, l, pos) -> false)
//                        .pushReaction(PushReaction.DESTROY);
//
//                return new MusavaccaLeaves(0.0F, p);
//            });


    private static final Set<DeferredBlock<? extends Block>> SKIP_BLOCK_ITEMS = Set.of(
            // Add blocks here if you ever want NO BlockItem for them.
    );

    static {
        BLOCKS.getEntries().forEach(entry -> {
            if (!SKIP_BLOCK_ITEMS.contains(entry)) {
                ITEMS.registerSimpleBlockItem(entry);
            }
        });
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    private ModBlocks() {}
}
