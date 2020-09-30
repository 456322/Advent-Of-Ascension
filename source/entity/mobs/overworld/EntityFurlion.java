package net.tslat.aoa3.entity.mobs.overworld;

import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntityFurlion extends AoAMeleeMob {
	public static final float entityWidth = 1.0f;

	public EntityFurlion(World world) {
		super(world, entityWidth, 1f);
	}

	@Override
	public float getEyeHeight() {
		return 0.8125f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 20;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 2.5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.329;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.MOB_FURLION_LIVING;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_FURLION_DEATH;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.MOB_FURLION_HIT;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityFurlion;
	}

	@Override
	protected boolean isDaylightMob() {
		return true;
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
