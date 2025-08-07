package net.anatomyworld.abitmorebugs.entity.goliathbeetle.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.anatomyworld.abitmorebugs.BugCore;

import net.anatomyworld.abitmorebugs.entity.goliathbeetle.GoliathBeetle;
import net.anatomyworld.abitmorebugs.entity.goliathbeetle.client.GoliathBeetleModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/**
 * Client renderer – halves the whole model & shadow for larvae (babies).
 */
public final class GoliathBeetleRenderer
        extends MobRenderer<GoliathBeetle, GoliathBeetleModel> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(
                    BugCore.MOD_ID, "textures/entity/goliath_beetle.png");

    private static final float ADULT_SHADOW = 0.3F;

    public GoliathBeetleRenderer(EntityRendererProvider.Context ctx) {
        super(ctx,
                new GoliathBeetleModel(ctx.bakeLayer(GoliathBeetleModel.LAYER_LOCATION)),
                ADULT_SHADOW);
    }

    /* baby = larva (half-scale) */
    @Override
    protected void scale(@NotNull GoliathBeetle beetle,
                         @NotNull PoseStack ps,
                         float partial) {
        if (beetle.isBaby()) {
            ps.scale(0.5F, 0.5F, 0.5F);
            this.shadowRadius = ADULT_SHADOW * 0.5F;
        } else {
            this.shadowRadius = ADULT_SHADOW;
        }
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull GoliathBeetle entity) {
        return TEXTURE;
    }
}
