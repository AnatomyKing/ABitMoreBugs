package net.anatomyworld.abitmorebugs.item;

import net.anatomyworld.abitmorebugs.BugCore;
import net.anatomyworld.abitmorebugs.entity.ModEntities;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(BugCore.MOD_ID);



    public static final DeferredItem<DeferredSpawnEggItem> GOLIATH_BEETLE_SPAWN_EGG =
            ITEMS.register("goliath_beetle_spawn_egg",
                    () -> new DeferredSpawnEggItem(
                            ModEntities.GOLIATH_BEETLE, // accepts DeferredHolder directly
                            0xC9BB99,               // egg base colour
                            0x27221F,               // spots colour
                            new Item.Properties()));


    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
