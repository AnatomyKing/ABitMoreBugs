// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class praying_mantis<T extends PrayingMantis> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "praying_mantis"), "main");
	private final ModelPart root;
	private final ModelPart front_legs;
	private final ModelPart front_legs2;
	private final ModelPart front_legs3;
	private final ModelPart front_legs4;
	private final ModelPart front_legs5;
	private final ModelPart front_legs6;
	private final ModelPart middle_legs;
	private final ModelPart bone;
	private final ModelPart middle_legs2;
	private final ModelPart bone3;
	private final ModelPart back_legs;
	private final ModelPart bone2;
	private final ModelPart back_legs2;
	private final ModelPart bone4;
	private final ModelPart head;
	private final ModelPart antenna;
	private final ModelPart antenna2;
	private final ModelPart body1;
	private final ModelPart wing_cover;
	private final ModelPart wing;
	private final ModelPart wing2;
	private final ModelPart wing_cover2;
	private final ModelPart wing3;
	private final ModelPart wing4;

	public praying_mantis(ModelPart root) {
		this.root = root.getChild("root");
		this.front_legs = this.root.getChild("front_legs");
		this.front_legs2 = this.front_legs.getChild("front_legs2");
		this.front_legs3 = this.front_legs2.getChild("front_legs3");
		this.front_legs4 = this.root.getChild("front_legs4");
		this.front_legs5 = this.front_legs4.getChild("front_legs5");
		this.front_legs6 = this.front_legs5.getChild("front_legs6");
		this.middle_legs = this.root.getChild("middle_legs");
		this.bone = this.middle_legs.getChild("bone");
		this.middle_legs2 = this.root.getChild("middle_legs2");
		this.bone3 = this.middle_legs2.getChild("bone3");
		this.back_legs = this.root.getChild("back_legs");
		this.bone2 = this.back_legs.getChild("bone2");
		this.back_legs2 = this.root.getChild("back_legs2");
		this.bone4 = this.back_legs2.getChild("bone4");
		this.head = this.root.getChild("head");
		this.antenna = this.head.getChild("antenna");
		this.antenna2 = this.head.getChild("antenna2");
		this.body1 = this.root.getChild("body1");
		this.wing_cover = this.body1.getChild("wing_cover");
		this.wing = this.wing_cover.getChild("wing");
		this.wing2 = this.wing.getChild("wing2");
		this.wing_cover2 = this.body1.getChild("wing_cover2");
		this.wing3 = this.wing_cover2.getChild("wing3");
		this.wing4 = this.wing3.getChild("wing4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 22.25F, 0.0F));

		PartDefinition front_legs = root.addOrReplaceChild("front_legs", CubeListBuilder.create(), PartPose.offset(-0.5F, -3.5F, -2.5F));

		PartDefinition body_r1 = front_legs.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(18, 15).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition front_legs2 = front_legs.addOrReplaceChild("front_legs2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -0.5F));

		PartDefinition body_r2 = front_legs2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(12, 19).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition front_legs3 = front_legs2.addOrReplaceChild("front_legs3", CubeListBuilder.create(), PartPose.offset(0.0F, -2.1213F, -2.1213F));

		PartDefinition body_r3 = front_legs3.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(16, 19).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition front_legs4 = root.addOrReplaceChild("front_legs4", CubeListBuilder.create(), PartPose.offset(0.5F, -3.5F, -2.5F));

		PartDefinition body_r4 = front_legs4.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(18, 15).mirror().addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition front_legs5 = front_legs4.addOrReplaceChild("front_legs5", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -0.5F));

		PartDefinition body_r5 = front_legs5.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(12, 19).mirror().addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition front_legs6 = front_legs5.addOrReplaceChild("front_legs6", CubeListBuilder.create(), PartPose.offset(0.0F, -2.1213F, -2.1213F));

		PartDefinition body_r6 = front_legs6.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(16, 19).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition middle_legs = root.addOrReplaceChild("middle_legs", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5F, 0.5F));

		PartDefinition body_r7 = middle_legs.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(12, 11).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.3927F, 0.0F));

		PartDefinition bone = middle_legs.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-1.1339F, -0.6861F, -2.7374F));

		PartDefinition body_r8 = bone.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(12, 15).addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F, 0.0F));

		PartDefinition middle_legs2 = root.addOrReplaceChild("middle_legs2", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5F, 0.5F));

		PartDefinition body_r9 = middle_legs2.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(12, 11).mirror().addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, -0.3927F, 0.0F));

		PartDefinition bone3 = middle_legs2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.1339F, -0.6861F, -2.7374F));

		PartDefinition body_r10 = bone3.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(12, 15).mirror().addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -0.3927F, 0.0F));

		PartDefinition back_legs = root.addOrReplaceChild("back_legs", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5F, 1.0F));

		PartDefinition body_r11 = back_legs.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.3927F, 0.0F));

		PartDefinition bone2 = back_legs.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.1339F, -0.6861F, 2.7374F));

		PartDefinition body_r12 = bone2.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(6, 17).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F, 0.0F));

		PartDefinition back_legs2 = root.addOrReplaceChild("back_legs2", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5F, 1.0F));

		PartDefinition body_r13 = back_legs2.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.3927F, 0.0F));

		PartDefinition bone4 = back_legs2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.1339F, -0.6861F, 2.7374F));

		PartDefinition body_r14 = bone4.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(6, 17).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.3927F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(14, 4).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.25F, -3.0F));

		PartDefinition antenna = head.addOrReplaceChild("antenna", CubeListBuilder.create(), PartPose.offset(-0.2571F, -0.7571F, -1.0F));

		PartDefinition body_r15 = antenna.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(14, 19).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0071F, 0.0071F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition antenna2 = head.addOrReplaceChild("antenna2", CubeListBuilder.create(), PartPose.offset(0.2571F, -0.7571F, -1.0F));

		PartDefinition body_r16 = antenna2.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(14, 19).mirror().addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0071F, 0.0071F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offset(0.0F, -1.501F, 0.1751F));

		PartDefinition body_r17 = body1.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -1.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.0235F, 1.3842F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body_r18 = body1.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4152F, -0.7609F, 0.7854F, 0.0F, 0.0F));

		PartDefinition body_r19 = body1.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(18, 11).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.999F, -2.1751F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wing_cover = body1.addOrReplaceChild("wing_cover", CubeListBuilder.create(), PartPose.offset(-0.498F, -0.4021F, -0.2518F));

		PartDefinition body_r20 = wing_cover.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1433F, 0.2903F, -0.3655F, -0.147F, -0.3655F));

		PartDefinition wing = wing_cover.addOrReplaceChild("wing", CubeListBuilder.create(), PartPose.offset(-0.002F, 0.103F, 0.0767F));

		PartDefinition body_r21 = wing.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, 0.0056F, 0.0613F, -0.3655F, -0.147F, -0.3655F));

		PartDefinition wing2 = wing.addOrReplaceChild("wing2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r22 = wing2.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(12, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, 0.0056F, 0.0613F, -0.3655F, -0.147F, -0.3655F));

		PartDefinition wing_cover2 = body1.addOrReplaceChild("wing_cover2", CubeListBuilder.create(), PartPose.offset(0.498F, -0.4021F, -0.2518F));

		PartDefinition body_r23 = wing_cover2.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1433F, 0.2903F, -0.3655F, 0.147F, 0.3655F));

		PartDefinition wing3 = wing_cover2.addOrReplaceChild("wing3", CubeListBuilder.create(), PartPose.offset(0.002F, 0.103F, 0.0767F));

		PartDefinition body_r24 = wing3.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.002F, 0.0056F, 0.0613F, -0.3655F, 0.147F, 0.3655F));

		PartDefinition wing4 = wing3.addOrReplaceChild("wing4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r25 = wing4.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(12, 6).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.002F, 0.0056F, 0.0613F, -0.3655F, 0.147F, 0.3655F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(PrayingMantis entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}