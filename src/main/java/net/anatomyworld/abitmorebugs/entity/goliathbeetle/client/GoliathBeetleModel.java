package net.anatomyworld.abitmorebugs.entity.goliathbeetle.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.anatomyworld.abitmorebugs.BugCore;
import net.anatomyworld.abitmorebugs.entity.goliathbeetle.GoliathBeetle;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/** Blockbench export (64 × 64 UV) – 4 April 2026 revision. */
public class GoliathBeetleModel extends EntityModel<GoliathBeetle> {

    /* ---------------- layer id ---------------- */
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(
                    ResourceLocation.fromNamespaceAndPath(
                            BugCore.MOD_ID, "goliath_beetle"),
                    "main");

    /* animated parts we move in setupAnim() */
    private final ModelPart root;
    private final ModelPart wing_cover, wing_cover2;
    private final ModelPart front_legs, front_legs2;
    private final ModelPart middle_legs, middle_legs2;
    private final ModelPart back_legs,  back_legs2;
    private final ModelPart antenna, antenna2;

    public GoliathBeetleModel(ModelPart root) {
        this.root         = root.getChild("root");
        this.wing_cover   = this.root.getChild("body1").getChild("wing_cover");
        this.wing_cover2  = this.root.getChild("body1").getChild("wing_cover2");
        this.front_legs   = this.root.getChild("front_legs");
        this.front_legs2  = this.root.getChild("front_legs2");
        this.middle_legs  = this.root.getChild("middle_legs");
        this.middle_legs2 = this.root.getChild("middle_legs2");
        this.back_legs    = this.root.getChild("back_legs");
        this.back_legs2   = this.root.getChild("back_legs2");
        this.antenna      = this.root.getChild("head").getChild("antenna");
        this.antenna2     = this.root.getChild("head").getChild("antenna2");
    }

    /* ---------------- geometry – new export -------------------------- */
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition root = partdefinition.addOrReplaceChild("root",
                CubeListBuilder.create(),
                PartPose.offset(0.0F, 23.0F, 0.0F));

        PartDefinition body1 = root.addOrReplaceChild("body1",
                CubeListBuilder.create().texOffs(24, 8)
                        .addBox(-2.5F, -1.0F, -1.5F, 5, 2, 3),
                PartPose.offset(0, -2, -4));

        /* wing covers & wings */
        PartDefinition wing_cover = body1.addOrReplaceChild("wing_cover",
                CubeListBuilder.create().texOffs(0, 14)
                        .addBox(-3, -1, 0, 3, 2, 7, new CubeDeformation(0.01F)),
                PartPose.offset(0, -0.5F, 1.5F));

        PartDefinition wing = wing_cover.addOrReplaceChild("wing",
                CubeListBuilder.create().texOffs(0, 8)
                        .addBox(-0.5F, 0, -0.5F, 6, 0, 6),
                PartPose.offset(-2.5F, 0.5F, 1));

        wing.addOrReplaceChild("bone",
                CubeListBuilder.create().texOffs(20, 14)
                        .addBox(-2.5F, 0, -6, 5, 0, 6),
                PartPose.offset(2, 0, 5.5F));

        PartDefinition wing_cover2 = body1.addOrReplaceChild("wing_cover2",
                CubeListBuilder.create().texOffs(0, 14).mirror()
                        .addBox(0, -1, 0, 3, 2, 7, new CubeDeformation(0.01F))
                        .mirror(false),
                PartPose.offset(0, -0.5F, 1.5F));

        PartDefinition wing2 = wing_cover2.addOrReplaceChild("wing2",
                CubeListBuilder.create().texOffs(0, 8).mirror()
                        .addBox(-5.5F, 0, -0.5F, 6, 0, 6).mirror(false),
                PartPose.offset(2.5F, 0.5F, 1));

        wing2.addOrReplaceChild("bone2",
                CubeListBuilder.create().texOffs(20, 14).mirror()
                        .addBox(-2.5F, 0, -6, 5, 0, 6).mirror(false),
                PartPose.offset(-2, 0, 5.5F));

        body1.addOrReplaceChild("body2",
                CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-2, 0.5F, 0.5F, 4, 1, 7),
                PartPose.ZERO);

        /* -------- legs (new rotations) -------------------------------- */
        PartDefinition front_legs = root.addOrReplaceChild("front_legs",
                CubeListBuilder.create(),
                PartPose.offset(-2, -1, -2.5F));

        front_legs.addOrReplaceChild("body_r1",
                CubeListBuilder.create().texOffs(22, 22)
                        .addBox(0, -0.5F, -5, 0, 1, 5),
                PartPose.offsetAndRotation(0, 0, 0,
                        0.3927F, 0.3927F, 0));

        PartDefinition front_legs2 = root.addOrReplaceChild("front_legs2",
                CubeListBuilder.create(),
                PartPose.offset(2, -1, -2.5F));

        front_legs2.addOrReplaceChild("body_r2",
                CubeListBuilder.create().texOffs(22, 22).mirror()
                        .addBox(0, -0.5F, -5, 0, 1, 5).mirror(false),
                PartPose.offsetAndRotation(0, 0, 0,
                        0.3927F, -0.3927F, 0));

        PartDefinition middle_legs = root.addOrReplaceChild("middle_legs",
                CubeListBuilder.create(),
                PartPose.offset(-2, -1, -1.5F));

        middle_legs.addOrReplaceChild("body_r3",
                CubeListBuilder.create().texOffs(24, 2)
                        .addBox(0, -0.5F, -5, 0, 1, 5),
                PartPose.offsetAndRotation(0, 0, 0,
                        -2.7489F, 0.7854F, (float) Math.PI));

        PartDefinition middle_legs2 = root.addOrReplaceChild("middle_legs2",
                CubeListBuilder.create(),
                PartPose.offset(2, -1, -1.5F));

        middle_legs2.addOrReplaceChild("body_r4",
                CubeListBuilder.create().texOffs(24, 2).mirror()
                        .addBox(0, -0.5F, -5, 0, 1, 5).mirror(false),
                PartPose.offsetAndRotation(0, 0, 0,
                        -2.7489F, -0.7854F, (float) Math.PI));

        PartDefinition back_legs = root.addOrReplaceChild("back_legs",
                CubeListBuilder.create(),
                PartPose.offset(-2, -1, 0.5F));

        back_legs.addOrReplaceChild("body_r5",
                CubeListBuilder.create().texOffs(2, 25)
                        .addBox(0, -0.5F, -5, 0, 1, 5),
                PartPose.offsetAndRotation(0, 0, 0,
                        -2.7489F, 0.3927F, (float) Math.PI));

        PartDefinition back_legs2 = root.addOrReplaceChild("back_legs2",
                CubeListBuilder.create(),
                PartPose.offset(2, -1, 0.5F));

        back_legs2.addOrReplaceChild("body_r6",
                CubeListBuilder.create().texOffs(2, 25).mirror()
                        .addBox(0, -0.5F, -5, 0, 1, 5).mirror(false),
                PartPose.offsetAndRotation(0, 0, 0,
                        -2.7489F, -0.3927F, (float) Math.PI));

        /* head + antennae */
        PartDefinition head = root.addOrReplaceChild("head",
                CubeListBuilder.create().texOffs(14, 28)
                        .addBox(-1, -0.5F, -2, 2, 1, 2),
                PartPose.offset(0, -1.5F, -5.5F));

        PartDefinition antenna = head.addOrReplaceChild("antenna",
                CubeListBuilder.create(),
                PartPose.offset(-1, -0.5F, -1.75F));

        antenna.addOrReplaceChild("body_r7",
                CubeListBuilder.create().texOffs(14, 23)
                        .addBox(0, -1, -0.75F, 0, 1, 1),
                PartPose.offsetAndRotation(0, 0, 0,
                        0, 0.3927F, 0));

        PartDefinition antenna2 = head.addOrReplaceChild("antenna2",
                CubeListBuilder.create(),
                PartPose.offset(1, -0.5F, -1.75F));

        antenna2.addOrReplaceChild("body_r8",
                CubeListBuilder.create().texOffs(14, 23).mirror()
                        .addBox(0, -1, -0.75F, 0, 1, 1).mirror(false),
                PartPose.offsetAndRotation(0, 0, 0,
                        0, -0.3927F, 0));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    /* ---------------- crawl animation (unchanged) -------------------- */
    @Override
    public void setupAnim(@NotNull GoliathBeetle beetle,
                          float walk, float walkAmt,
                          float age,  float headYaw, float headPitch) {

        antenna .zRot = (float) Math.sin(age * 0.3F) * 0.2F;
        antenna2.zRot = (float) Math.sin(age * 0.3F + Math.PI) * 0.2F;

        float swing = walk * 0.6662F;
        front_legs .xRot = (float) Math.cos(swing) * walkAmt;
        front_legs2.xRot = front_legs.xRot;
        middle_legs .xRot = (float) Math.cos(swing + Math.PI) * walkAmt;
        middle_legs2.xRot = middle_legs.xRot;
        back_legs  .xRot = front_legs.xRot;
        back_legs2 .xRot = front_legs.xRot;

        wing_cover .zRot = (float) Math.cos(swing * 0.5F) * 0.02F;
        wing_cover2.zRot = -wing_cover.zRot;
    }

    /* ---------------- render (5 params) ------------------------------ */
    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack,
                               @NotNull VertexConsumer vertices,
                               int packedLight, int packedOverlay,
                               int packedRGB) {
        root.render(poseStack, vertices, packedLight, packedOverlay);
    }
}
