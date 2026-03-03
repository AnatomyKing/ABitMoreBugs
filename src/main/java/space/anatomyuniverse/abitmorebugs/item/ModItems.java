package space.anatomyuniverse.abitmorebugs.item;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import space.anatomyuniverse.abitmorebugs.BugCore;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BugCore.MOD_ID);

    public static final DeferredItem<Item> CATCHER =
            ITEMS.registerItem("catcher", props -> new Item(props.rarity(Rarity.COMMON)));
//
//    public static final DeferredItem<Item> BIG_BANANA_PEARL =
//            ITEMS.registerItem("big_banana_pearl", props -> new Item(props.rarity(Rarity.RARE)));
//
//    public static final DeferredItem<Item> SMALL_BANANA_PEARL =
//            ITEMS.registerItem("small_banana_pearl",
//                    props -> new SmallBananaPearlItem(
//                            props.rarity(Rarity.RARE)
//                    ));
//
//    public static final DeferredItem<Item> BANANA =
//            ITEMS.registerItem("banana",
//                    props -> new Item(props.food(Foods.APPLE)));
//
//
//    public static final DeferredItem<Item> FLINT_AND_PEARL =
//            ITEMS.registerItem("flint_and_pearl",
//                    props -> new FlintAndSteelItem(
//                            props.durability(64).rarity(Rarity.COMMON)
//                    ));


    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    private ModItems() {}
}
