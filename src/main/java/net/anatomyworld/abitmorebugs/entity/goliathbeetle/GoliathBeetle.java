package net.anatomyworld.abitmorebugs.entity.goliathbeetle;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

/**
 * Small ground insect – no breeding, basic wander AI only.
 */
public class GoliathBeetle extends Spider {

    public GoliathBeetle(EntityType<? extends GoliathBeetle> type, Level level) {
        super(type, level);
    }

    /* ------------------------------------------------------------------ */
    /*  Attributes – tougher than a bee, still squishy                    */
    /* ------------------------------------------------------------------ */
    public static @NotNull AttributeSupplier.Builder createAttributes() {
        return Spider.createLivingAttributes()
                .add(Attributes.MAX_HEALTH,    8.0D)   // 4 hearts
                .add(Attributes.MOVEMENT_SPEED,0.30D)  // fast scuttle
                .add(Attributes.FOLLOW_RANGE, 12.0D);
    }

    /* ------------------------------------------------------------------ */
    /*  Optional: custom loot (drops nothing extra here)                  */
    /* ------------------------------------------------------------------ */
    @Override
    protected void dropCustomDeathLoot(@NotNull ServerLevel level,
                                       @NotNull DamageSource source,
                                       boolean recentlyHit) {
        super.dropCustomDeathLoot(level, source, recentlyHit);
    }
}
