package net.anatomyworld.abitmorebugs.item;

import net.anatomyworld.abitmorebugs.BugCore;
import net.anatomyworld.abitmorebugs.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BugCore.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HARAMBE_TAB =
            CREATIVE_TABS.register("harambe_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + BugCore.MOD_ID + ".harambe_tab"))
                    .icon(() -> new ItemStack(ModItems.GOLIATH_BEETLE_SPAWN_EGG.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.GOLIATH_BEETLE_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
