package net.tslat.aoa3.client.model.entity.mob.shyrelands;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class ArcWizardModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer r1;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer rightArm2;
	private final ModelRenderer rightArm3;
	private final ModelRenderer rightArm4;

	public ArcWizardModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 46, 3);
		head.addBox(4.0F, -13.0F, 1.0F, 1, 4, 2);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureSize(64, 32);
		setRotation(head, 0.0F, 0.0F, 0.0F);
		body = new ModelRenderer(this, 16, 37);
		body.addBox(-0.5F, 6.0F, -2.0F, 1, 4, 4);
		body.setRotationPoint(0.0F, -4.0F, 0.0F);
		body.setTextureSize(64, 32);
		setRotation(body, 0.0F, 0.0F, 0.0F);
		rightArm = new ModelRenderer(this, 38, 42);
		rightArm.addBox(-3.0F, -14.0F, -7.0F, 4, 5, 2);
		rightArm.setRotationPoint(-5.0F, -3.0F, 0.0F);
		rightArm.setTextureSize(64, 32);
		setRotation(rightArm, 0.3490659F, 0.0F, 0.0F);
		leftArm = new ModelRenderer(this, 40, 16);
		leftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 16, 4);
		leftArm.setRotationPoint(5.0F, -3.0F, 0.0F);
		leftArm.setTextureSize(64, 32);
		setRotation(leftArm, 0.0F, 0.0F, 0.0F);
		rightLeg = new ModelRenderer(this, 0, 16);
		rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightLeg.setTextureSize(64, 32);
		setRotation(rightLeg, 0.0F, 0.0F, 0.0F);
		leftLeg = new ModelRenderer(this, 0, 16);
		leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftLeg.setTextureSize(64, 32);
		setRotation(leftLeg, 0.0F, 0.0F, 0.0F);
		r1 = new ModelRenderer(this, 52, 8);
		r1.addBox(-2.0F, -14.0F, -1.0F, 4, 6, 2);
		r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		r1.setTextureSize(64, 32);
		setRotation(r1, 0.0F, 0.0F, 0.0F);
		head2 = new ModelRenderer(this, 46, 3);
		head2.addBox(-5.0F, -13.0F, 1.0F, 1, 4, 2);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head2.setTextureSize(64, 32);
		setRotation(head2, 0.0F, 0.0F, 0.0F);
		head3 = new ModelRenderer(this, 26, 3);
		head3.addBox(4.0F, -9.0F, -4.0F, 1, 4, 8);
		head3.setRotationPoint(0.0F, 0.0F, 0.0F);
		head3.setTextureSize(64, 32);
		setRotation(head3, 0.0F, 0.0F, 0.0F);
		head4 = new ModelRenderer(this, 26, 3);
		head4.addBox(-5.0F, -9.0F, -4.0F, 1, 4, 8);
		head4.setRotationPoint(0.0F, 0.0F, 0.0F);
		head4.setTextureSize(64, 32);
		setRotation(head4, 0.0F, 0.0F, 0.0F);
		head5 = new ModelRenderer(this, 39, 3);
		head5.addBox(4.0F, -11.0F, -3.0F, 1, 2, 2);
		head5.setRotationPoint(0.0F, 0.0F, 0.0F);
		head5.setTextureSize(64, 32);
		setRotation(head5, 0.0F, 0.0F, 0.0F);
		head6 = new ModelRenderer(this, 39, 3);
		head6.addBox(-5.0F, -11.0F, -3.0F, 1, 2, 2);
		head6.setRotationPoint(0.0F, 0.0F, 0.0F);
		head6.setTextureSize(64, 32);
		setRotation(head6, 0.0F, 0.0F, 0.0F);
		head7 = new ModelRenderer(this, 0, 0);
		head7.addBox(-4.0F, -7.0F, -4.0F, 8, 2, 8);
		head7.setRotationPoint(0.0F, 0.0F, 0.0F);
		head7.setTextureSize(64, 32);
		setRotation(head7, 0.0F, 0.0F, 0.0F);
		body2 = new ModelRenderer(this, 16, 16);
		body2.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
		body2.setRotationPoint(0.0F, -4.0F, 0.0F);
		body2.setTextureSize(64, 32);
		setRotation(body2, 0.0F, 0.0F, 0.0F);
		body3 = new ModelRenderer(this, 16, 26);
		body3.addBox(-4.0F, 10.0F, -2.0F, 8, 6, 4);
		body3.setRotationPoint(0.0F, -4.0F, 0.0F);
		body3.setTextureSize(64, 32);
		setRotation(body3, 0.0F, 0.0F, 0.0F);
		body4 = new ModelRenderer(this, 16, 37);
		body4.addBox(-3.0F, 6.0F, -2.0F, 1, 4, 4);
		body4.setRotationPoint(0.0F, -4.0F, 0.0F);
		body4.setTextureSize(64, 32);
		setRotation(body4, 0.0F, 0.0F, 0.0F);
		body5 = new ModelRenderer(this, 16, 37);
		body5.addBox(2.0F, 6.0F, -2.0F, 1, 4, 4);
		body5.setRotationPoint(0.0F, -4.0F, 0.0F);
		body5.setTextureSize(64, 32);
		setRotation(body5, 0.0F, 0.0F, 0.0F);
		rightArm2 = new ModelRenderer(this, 40, 16);
		rightArm2.addBox(-3.0F, -2.0F, -2.0F, 4, 16, 4);
		rightArm2.setRotationPoint(-5.0F, -3.0F, 0.0F);
		rightArm2.setTextureSize(64, 32);
		setRotation(rightArm2, 0.0F, 0.0F, 0.0F);
		rightArm3 = new ModelRenderer(this, 56, 20);
		rightArm3.addBox(-2.0F, -5.0F, -7.0F, 2, 28, 2);
		rightArm3.setRotationPoint(-5.0F, -3.0F, 0.0F);
		rightArm3.setTextureSize(64, 32);
		setRotation(rightArm3, 0.3490659F, 0.0F, 0.0F);
		rightArm4 = new ModelRenderer(this, 38, 37);
		rightArm4.addBox(-4.0F, -8.0F, -7.0F, 6, 2, 2);
		rightArm4.setRotationPoint(-5.0F, -3.0F, 0.0F);
		rightArm4.setTextureSize(64, 32);
		setRotation(rightArm4, 0.3490659F, 0.0F, 0.0F);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		rightLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		rightLeg.rotateAngleY = 0.0F;

		leftLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount);

		r1.rotateAngleY = (ageInTicks * 0.067F * 1.25F);

		rightArm.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 2.0F * limbSwingAmount * 0.5F + 0.349F);
		rightArm.rotateAngleZ = 0.0F;

		rightArm2.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 2.0F * limbSwingAmount * 0.5F);
		rightArm2.rotateAngleZ = 0.0F;

		rightArm3.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 2.0F * limbSwingAmount * 0.5F + 0.349F);
		rightArm3.rotateAngleZ = 0.0F;

		rightArm4.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 2.0F * limbSwingAmount * 0.5F + 0.349F);
		rightArm4.rotateAngleZ = 0.0F;

		leftArm.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F);
		leftArm.rotateAngleZ = 0.0F;
	}
}
