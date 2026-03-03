// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class hercules_beetle<T extends HerculesBeetle> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hercules_beetle"), "main");
	private final ModelPart root;
	private final ModelPart front_legs;
	private final ModelPart front_legs2;
	private final ModelPart middle_legs;
	private final ModelPart middle_legs2;
	private final ModelPart middle_legs3;
	private final ModelPart back_legs;
	private final ModelPart back_legs2;
	private final ModelPart back_legs3;
	private final ModelPart back_legs4;
	private final ModelPart head;
	private final ModelPart antenna;
	private final ModelPart antenna2;
	private final ModelPart bone2;
	private final ModelPart body1;
	private final ModelPart wing_cover;
	private final ModelPart wing;
	private final ModelPart bone;
	private final ModelPart wing_cover2;
	private final ModelPart wing2;
	private final ModelPart bone3;

	public hercules_beetle(ModelPart root) {
		this.root = root.getChild("root");
		this.front_legs = this.root.getChild("front_legs");
		this.front_legs2 = this.root.getChild("front_legs2");
		this.middle_legs = this.root.getChild("middle_legs");
		this.middle_legs2 = this.root.getChild("middle_legs2");
		this.middle_legs3 = this.root.getChild("middle_legs3");
		this.back_legs = this.root.getChild("back_legs");
		this.back_legs2 = this.root.getChild("back_legs2");
		this.back_legs3 = this.root.getChild("back_legs3");
		this.back_legs4 = this.root.getChild("back_legs4");
		this.head = this.root.getChild("head");
		this.antenna = this.head.getChild("antenna");
		this.antenna2 = this.head.getChild("antenna2");
		this.bone2 = this.head.getChild("bone2");
		this.body1 = this.root.getChild("body1");
		this.wing_cover = this.body1.getChild("wing_cover");
		this.wing = this.wing_cover.getChild("wing");
		this.bone = this.wing.getChild("bone");
		this.wing_cover2 = this.body1.getChild("wing_cover2");
		this.wing2 = this.wing_cover2.getChild("wing2");
		this.bone3 = this.wing2.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 25.5F, 4.0F));

		PartDefinition front_legs = root.addOrReplaceChild("front_legs", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, -2.5F));

		PartDefinition body_r1 = front_legs.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(14, 23).addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -1.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition front_legs2 = root.addOrReplaceChild("front_legs2", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, -2.5F));

		PartDefinition body_r2 = front_legs2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(14, 23).mirror().addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0F, -1.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition middle_legs = root.addOrReplaceChild("middle_legs", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, -1.5F));

		PartDefinition body_r3 = middle_legs.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(24, 23).addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -1.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition middle_legs2 = root.addOrReplaceChild("middle_legs2", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, -1.5F));

		PartDefinition body_r4 = middle_legs2.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(24, 23).addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -1.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition middle_legs3 = root.addOrReplaceChild("middle_legs3", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, -1.5F));

		PartDefinition body_r5 = middle_legs3.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(24, 23).mirror().addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0F, -1.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition back_legs = root.addOrReplaceChild("back_legs", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, 0.5F));

		PartDefinition body_r6 = back_legs.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(14, 29).addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.0F, 2.7489F, 0.0F));

		PartDefinition back_legs2 = root.addOrReplaceChild("back_legs2", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, 0.5F));

		PartDefinition body_r7 = back_legs2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(14, 29).addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.0F, 2.7489F, 0.0F));

		PartDefinition back_legs3 = root.addOrReplaceChild("back_legs3", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, 0.5F));

		PartDefinition body_r8 = back_legs3.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(14, 29).addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.0F, 2.7489F, 0.0F));

		PartDefinition back_legs4 = root.addOrReplaceChild("back_legs4", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, 0.5F));

		PartDefinition body_r9 = back_legs4.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(14, 29).mirror().addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.0F, -2.7489F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -5.5F));

		PartDefinition antenna = head.addOrReplaceChild("antenna", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.5F, -1.0F));

		PartDefinition body_r10 = antenna.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(14, 21).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition antenna2 = head.addOrReplaceChild("antenna2", CubeListBuilder.create(), PartPose.offset(0.5F, -0.5F, -1.0F));

		PartDefinition body_r11 = antenna2.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(14, 21).mirror().addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(24, 29).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
		.texOffs(8, 30).addBox(0.011F, -0.99F, -4.99F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(22, 0).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(30, 6).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(0.001F, -4.0719F, -10.389F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.0F));

		PartDefinition body_r12 = body1.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(22, 6).addBox(-0.5F, -4.6F, -3.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5173F, -1.9157F, -0.3927F, 0.0F, 0.0F));

		PartDefinition wing_cover = body1.addOrReplaceChild("wing_cover", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.5F, 0.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -3.0F, 1.5F));

		PartDefinition wing = wing_cover.addOrReplaceChild("wing", CubeListBuilder.create().texOffs(20, 11).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 1.5F, 1.0F));

		PartDefinition bone = wing.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(20, 17).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 5.5F));

		PartDefinition wing_cover2 = body1.addOrReplaceChild("wing_cover2", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-2.0F, -0.5F, 0.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offset(1.5F, -3.0F, 1.5F));

		PartDefinition wing2 = wing_cover2.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(20, 11).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5F, 1.5F, 1.0F));

		PartDefinition bone3 = wing2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(20, 17).mirror().addBox(-2.0F, 0.0F, -6.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 0.0F, 5.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(HerculesBeetle entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}