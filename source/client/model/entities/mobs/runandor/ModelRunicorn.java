package net.tslat.aoa3.client.model.entities.mobs.runandor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelRunicorn extends ModelBase {
	private final ModelRenderer root;
	private final ModelRenderer horse;
	private final ModelRenderer part6;
	private final ModelRenderer part8;
	private final ModelRenderer leg4;
	private final ModelRenderer leg3;
	private final ModelRenderer leg2;
	private final ModelRenderer leg1;
	private final ModelRenderer part3;
	private final ModelRenderer part10;
	private final ModelRenderer part2;

	public ModelRunicorn() {
		textureWidth = 128;
		textureHeight = 64;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 24.0F, 0.0F);

		horse = new ModelRenderer(this);
		horse.setRotationPoint(4.0F, -21.0F, -12.0F);
		root.addChild(horse);
		horse.cubeList.add(new ModelBox(horse, 51, 25, -9.0F, -1.0F, 17.0F, 9, 2, 7, 0.0F, true));
		horse.cubeList.add(new ModelBox(horse, 0, 25, -9.0F, 0.0F, 11.0F, 9, 7, 12, 0.0F, true));
		horse.cubeList.add(new ModelBox(horse, 0, 44, -9.0F, 0.0F, 0.0F, 9, 9, 11, 0.0F, true));

		part6 = new ModelRenderer(this);
		part6.setRotationPoint(-1.0F, 6.0F, 7.0F);
		setRotation(part6, 0.9398F, 0.0F, 0.0F);
		horse.addChild(part6);
		part6.cubeList.add(new ModelBox(part6, 55, 17, -7.0F, 0.0F, 0.0F, 7, 5, 3, 0.0F, true));

		part8 = new ModelRenderer(this);
		part8.setRotationPoint(-4.5F, 0.0F, 24.0F);
		setRotation(part8, 0.4833F, 0.0F, 0.0F);
		horse.addChild(part8);
		part8.cubeList.add(new ModelBox(part8, 74, 43, -1.5F, -0.9294F, -1.7709F, 3, 19, 2, 0.0F, true));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-1.0F, 1.0F, 22.0F);
		horse.addChild(leg4);
		leg4.cubeList.add(new ModelBox(leg4, 93, 12, -2.0F, 0.0F, -2.0F, 4, 20, 4, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-8.0F, 1.0F, 22.0F);
		horse.addChild(leg3);
		leg3.cubeList.add(new ModelBox(leg3, 93, 12, -2.0F, 0.0F, -2.0F, 4, 20, 4, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-8.0F, 1.0F, 3.0F);
		horse.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 58, 40, -2.0F, 0.0F, -2.0F, 4, 20, 4, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, 1.0F, 3.0F);
		horse.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 58, 40, -2.0F, 0.0F, -2.0F, 4, 20, 4, 0.0F, true));

		part3 = new ModelRenderer(this);
		part3.setRotationPoint(-2.0F, 4.0F, 3.0F);
		setRotation(part3, 0.6109F, 0.0F, 0.0F);
		horse.addChild(part3);
		part3.cubeList.add(new ModelBox(part3, 0, 0, -4.5F, -12.403F, -3.1885F, 4, 13, 6, 0.0F, true));
		part3.cubeList.add(new ModelBox(part3, 45, 46, -3.0F, -17.403F, 2.3115F, 1, 15, 3, 0.0F, true));

		part10 = new ModelRenderer(this);
		part10.setRotationPoint(-1.0F, -11.8696F, -0.1885F);
		part3.addChild(part10);
		part10.cubeList.add(new ModelBox(part10, 22, 0, -4.0F, -5.0F, -8.0F, 5, 5, 11, 0.0F, true));
		part10.cubeList.add(new ModelBox(part10, 35, 16, 0.0F, -8.0333F, 0.9333F, 1, 3, 1, 0.0F, true));
		part10.cubeList.add(new ModelBox(part10, 35, 16, -4.0F, -8.0333F, 1.0F, 1, 3, 1, 0.0F, true));

		part2 = new ModelRenderer(this);
		part2.setRotationPoint(-3.0F, -3.5333F, 0.0F);
		setRotation(part2, 0.3491F, 0.0F, 0.0F);
		part10.addChild(part2);
		part2.cubeList.add(new ModelBox(part2, 42, 18, 0.5F, -7.0778F, -1.6059F, 2, 9, 2, 0.0F, true));
		part2.cubeList.add(new ModelBox(part2, 35, 16, 1.0F, -10.0778F, -1.1725F, 1, 3, 1, 0.0F, true));
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		root.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
	}
}
