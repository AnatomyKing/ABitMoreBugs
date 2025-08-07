package net.anatomyworld.abitmorebugs.entity;

import net.anatomyworld.abitmorebugs.BugCore;
import net.anatomyworld.abitmorebugs.entity.goliathbeetle.GoliathBeetle;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, BugCore.MOD_ID);



    public static final DeferredHolder<EntityType<?>, EntityType<GoliathBeetle>> GOLIATH_BEETLE =
            ENTITIES.register("goliath_beetle",
                    () -> EntityType.Builder.<GoliathBeetle>of(GoliathBeetle::new, MobCategory.CREATURE)
                            .sized(0.9F, 1.4F)
                            .build(BugCore.MOD_ID + ":goliath_beetle"));

    private static void onEntityAttributeEvent(EntityAttributeCreationEvent e) {
        e.put(GOLIATH_BEETLE.get(), GoliathBeetle.createAttributes().build());


    }



    public static void register(IEventBus bus) {
        ENTITIES.register(bus);
        bus.addListener(ModEntities::onEntityAttributeEvent);
    }
}
