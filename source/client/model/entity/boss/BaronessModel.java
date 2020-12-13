package net.tslat.aoa3.client.model.entity.boss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class BaronessModel extends EntityModel<MobEntity> {
	private final ModelRenderer head4;
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArm2;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer head6;
	private final ModelRenderer head5;
	private final ModelRenderer rightArm3;
	private final ModelRenderer rightArm4;
	private final ModelRenderer rightArm5;
	private final ModelRenderer rightArm6;
	private final ModelRenderer head2;
	private final ModelRenderer r2;
	private final ModelRenderer head3;
	private final ModelRenderer r1;
	private final ModelRenderer leftArm3;
	private final ModelRenderer rightArm7;
	private final ModelRenderer leftArm4;
	private final ModelRenderer rightArm8;
	private final ModelRenderer leftArm5;
	private final ModelRenderer rightArm9;

	public BaronessModel(float delta) {
		textureWidth = 128;
		textureHeight = 64;

		head4 = new ModelRenderer(this, 104, 3);
		head4.addBox(-3F, -18F, -3F, 6, 5, 6, delta);
		head4.setRotationPoint(0F, -2F, 0F);
		head4.setTextureSize(64, 32);
		head4.mirror = true;
		setRotation(head4, 0F, 0F, 0F);
		body = new ModelRenderer(this, 7, 41);
		body.addBox(-5F, 15F, -3F, 10, 5, 6, delta);
		body.setRotationPoint(0F, -2F, 0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightArm = new ModelRenderer(this, 40, 49);
		rightArm.addBox(-7F, -8F, 1F, 3, 2, 1, delta);
		rightArm.setRotationPoint(-6F, 0F, 0F);
		rightArm.setTextureSize(64, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0F, 0F, 0F);
		leftArm = new ModelRenderer(this, 40, 49);
		leftArm.addBox(4F, -8F, 1F, 3, 2, 1, delta);
		leftArm.setRotationPoint(6F, 0F, 0F);
		leftArm.setTextureSize(64, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0F, 0F, 0F);
		rightArm2 = new ModelRenderer(this, 79, 25);
		rightArm2.addBox(-2F, -9F, -5F, 2, 3, 2, delta);
		rightArm2.setRotationPoint(-6F, 0F, 0F);
		rightArm2.setTextureSize(64, 32);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.4363323F, 0F, 0F);
		leftArm2 = new ModelRenderer(this, 40, 16);
		leftArm2.addBox(-1F, 0F, -2F, 4, 10, 4, delta);
		leftArm2.setRotationPoint(6F, 0F, 0F);
		leftArm2.setTextureSize(64, 32);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0F, 0F, 0F);
		body2 = new ModelRenderer(this, 16, 16);
		body2.addBox(-4F, 0F, -2F, 8, 10, 4, delta);
		body2.setRotationPoint(0F, -2F, 0F);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0F, 0F, 0F);
		body3 = new ModelRenderer(this, 3, 52);
		body3.addBox(-5.5F, 20F, -3.5F, 11, 5, 7, delta);
		body3.setRotationPoint(0F, -2F, 0F);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 0F, 0F, 0F);
		body4 = new ModelRenderer(this, 11, 31);
		body4.addBox(-4.5F, 10F, -2.5F, 9, 5, 5, delta);
		body4.setRotationPoint(0F, -2F, 0F);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 0F, 0F, 0F);
		head6 = new ModelRenderer(this, 32, 2);
		head6.addBox(-5F, -8F, -5F, 10, 2, 10, delta);
		head6.setRotationPoint(0F, -2F, 0F);
		head6.setTextureSize(64, 32);
		head6.mirror = true;
		setRotation(head6, 0F, 0F, 0F);
		head5 = new ModelRenderer(this, 72, 1);
		head5.addBox(-4F, -13F, -4F, 8, 5, 8, delta);
		head5.setRotationPoint(0F, -2F, 0F);
		head5.setTextureSize(64, 32);
		head5.mirror = true;
		setRotation(head5, 0F, 0F, 0F);
		rightArm3 = new ModelRenderer(this, 40, 16);
		rightArm3.addBox(-3F, 0F, -2F, 4, 10, 4, delta);
		rightArm3.setRotationPoint(-6F, 0F, 0F);
		rightArm3.setTextureSize(64, 32);
		rightArm3.mirror = true;
		setRotation(rightArm3, 0F, 0F, 0F);
		rightArm4 = new ModelRenderer(this, 69, 16);
		rightArm4.addBox(-2F, -4F, -7F, 2, 26, 2, delta);
		rightArm4.setRotationPoint(-6F, 0F, 0F);
		rightArm4.setTextureSize(64, 32);
		rightArm4.mirror = true;
		setRotation(rightArm4, 0.4363323F, 0F, 0F);
		rightArm5 = new ModelRenderer(this, 79, 16);
		rightArm5.addBox(-2F, -6F, -9F, 2, 2, 6, delta);
		rightArm5.setRotationPoint(-6F, 0F, 0F);
		rightArm5.setTextureSize(64, 32);
		rightArm5.mirror = true;
		setRotation(rightArm5, 0.4363323F, 0F, 0F);
		rightArm6 = new ModelRenderer(this, 79, 16);
		rightArm6.addBox(-2F, -11F, -9F, 2, 2, 6, delta);
		rightArm6.setRotationPoint(-6F, 0F, 0F);
		rightArm6.setTextureSize(64, 32);
		rightArm6.mirror = true;
		setRotation(rightArm6, 0.4363323F, 0F, 0F);
		head2 = new ModelRenderer(this, 40, 40);
		head2.addBox(-4F, 0F, -4F, 8, 7, 0, delta);
		head2.setRotationPoint(0F, -2F, 0F);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0F, 0F, 0F);
		r2 = new ModelRenderer(this, 97, 16);
		r2.addBox(-3F, -3F, 10F, 6, 6, 6, delta);
		r2.setRotationPoint(0F, -21F, 0F);
		r2.setTextureSize(64, 32);
		r2.mirror = true;
		setRotation(r2, 0F, 0F, 0F);
		head3 = new ModelRenderer(this, 0, 0);
		head3.addBox(-4F, -6F, -4F, 8, 6, 8, delta);
		head3.setRotationPoint(0F, -2F, 0F);
		head3.setTextureSize(64, 32);
		head3.mirror = true;
		setRotation(head3, 0F, 0F, 0F);
		r1 = new ModelRenderer(this, 97, 16);
		r1.addBox(-3F, -3F, -16F, 6, 6, 6, delta);
		r1.setRotationPoint(0F, -21F, 0F);
		r1.setTextureSize(64, 32);
		r1.mirror = true;
		setRotation(r1, 0F, 0F, 0F);
		leftArm3 = new ModelRenderer(this, 40, 30);
		leftArm3.addBox(-2F, -3F, -4F, 6, 3, 6, delta);
		leftArm3.setRotationPoint(6F, 0F, 0F);
		leftArm3.setTextureSize(64, 32);
		leftArm3.mirror = true;
		setRotation(leftArm3, 0F, 0F, 0F);
		rightArm7 = new ModelRenderer(this, 40, 30);
		rightArm7.addBox(-4F, -3F, -4F, 6, 3, 6, delta);
		rightArm7.setRotationPoint(-6F, 0F, 0F);
		rightArm7.setTextureSize(64, 32);
		rightArm7.mirror = true;
		setRotation(rightArm7, 0F, 0F, 0F);
		leftArm4 = new ModelRenderer(this, 47, 54);
		leftArm4.addBox(-1F, -6F, 1F, 2, 3, 1, delta);
		leftArm4.setRotationPoint(6F, 0F, 0F);
		leftArm4.setTextureSize(64, 32);
		leftArm4.mirror = true;
		setRotation(leftArm4, 0F, 0F, 0F);
		rightArm8 = new ModelRenderer(this, 47, 54);
		rightArm8.addBox(-1F, -6F, 1F, 2, 3, 1, delta);
		rightArm8.setRotationPoint(-6F, 0F, 0F);
		rightArm8.setTextureSize(64, 32);
		rightArm8.mirror = true;
		setRotation(rightArm8, 0F, 0F, 0F);
		leftArm5 = new ModelRenderer(this, 40, 54);
		leftArm5.addBox(2F, -8F, 1F, 2, 5, 1, delta);
		leftArm5.setRotationPoint(6F, 0F, 0F);
		leftArm5.setTextureSize(64, 32);
		leftArm5.mirror = true;
		setRotation(leftArm5, 0F, 0F, 0F);
		rightArm9 = new ModelRenderer(this, 40, 54);
		rightArm9.addBox(-4F, -8F, 1F, 2, 5, 1, delta);
		rightArm9.setRotationPoint(-6F, 0F, 0F);
		rightArm9.setTextureSize(64, 32);
		rightArm9.mirror = true;
		setRotation(rightArm9, 0F, 0F, 0F);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		this.r1.rotateAngleY = (ageInTicks * 0.067F) * 1.25F;
		this.r2.rotateAngleY = (ageInTicks * 0.067F) * 1.25F;

		this.head2.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
		this.head2.rotateAngleX = headPitch / (170F / (float)Math.PI);

		this.head3.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
		this.head3.rotateAngleX = headPitch / (170F / (float)Math.PI);

		this.head4.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
		this.head4.rotateAngleX = headPitch / (170F / (float)Math.PI);

		this.head5.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
		this.head5.rotateAngleX = headPitch / (170F / (float)Math.PI);

		this.head6.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
		this.head6.rotateAngleX = headPitch / (170F / (float)Math.PI);

		this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
		this.rightArm.rotateAngleZ = 0.0F;

		this.rightArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F + 0.436F;
		this.rightArm2.rotateAngleZ = 0.0F;

		this.rightArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
		this.rightArm3.rotateAngleZ = 0.0F;

		this.rightArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F + 0.436F;
		this.rightArm4.rotateAngleZ = 0.0F;

		this.rightArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F + 0.436F;
		this.rightArm5.rotateAngleZ = 0.0F;

		this.rightArm6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F + 0.436F;
		this.rightArm6.rotateAngleZ = 0.0F;

		this.rightArm7.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
		this.rightArm7.rotateAngleZ = 0.0F;

		this.rightArm8.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
		this.rightArm8.rotateAngleZ = 0.0F;

		this.rightArm9.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
		this.rightArm9.rotateAngleZ = 0.0F;

		this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
		this.leftArm.rotateAngleZ = 0.0F;

		this.leftArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
		this.leftArm2.rotateAngleZ = 0.0F;

	}

}
