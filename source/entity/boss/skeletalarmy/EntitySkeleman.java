package net.tslat.aoa3.entity.boss.skeletalarmy;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoARangedMob;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntitySpiritualShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class EntitySkeleman extends AoARangedMob {
	public static final float entityWidth = 0.7f;

	public EntitySkeleman(World world) {
		super(world, entityWidth, 1.6875f);
	}

	@Override
	public float getEyeHeight() {
		return 1.40625f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 30;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 2;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.207;
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return SoundsRegister.SKELEMAN_SHOOT;
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return new EntitySpiritualShot(this, Enums.MobProjectileType.MAGIC);
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SKELETON_AMBIENT;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SKELETON_DEATH;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_SKELETON_HURT;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (source.getImmediateSource() instanceof EntitySpiritualShot)
			return false;

		return super.attackEntityFrom(source, amount);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

	@Override
	protected SoundEvent getStepSound() {
		return null;
	}
}
