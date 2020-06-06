package net.tslat.aoa3.entity.mobs.overworld;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntityHeadlessHunter extends AoAMeleeMob {
	public static final float entityWidth = 1.2f;

	public EntityHeadlessHunter(World world) {
		super(world, entityWidth, 1.9f);
	}

	@Override
	public float getEyeHeight() {
		return 1.7f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.3f;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 40;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 8;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.25d;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_SLIMER_DEATH;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.MOB_SLIMER_HIT;
	}

	@Override
	protected SoundEvent getStepSound() {
		return SoundsRegister.VERY_HEAVY_STEP;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityHeadlessHunter;
	}

	@Override
	public void onKillEntity(EntityLivingBase victim) {
		if (victim instanceof EntityPlayer && rand.nextInt(20) == 0) {
			ItemStack headStack = new ItemStack(Items.SKULL, 1, 3);

			headStack.setTagCompound(new NBTTagCompound());
			headStack.getTagCompound().setTag("SkullOwner", new NBTTagString(((EntityPlayer)victim).getGameProfile().getName()));

			EntityItem playerHead = new EntityItem(world, victim.posX, victim.posY, victim.posZ, headStack);
			world.spawnEntity(playerHead);
		}
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
