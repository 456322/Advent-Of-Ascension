package net.tslat.aoa3.entity.mobs.overworld.lunarinvasion;

import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAFlyingRangedMob;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntityModuloShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EntityModulo extends AoAFlyingRangedMob {
	public static final float entityWidth = 1.0f;

	public EntityModulo(World world) {
		super(world, entityWidth, 1.2f);
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 45;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 4.5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.1;
	}

	@Override
	protected double getBaseArmour() {
		return 4d;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.MOB_MODULO_LIVING;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.MOB_MODULO_HIT;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_MODULO_DEATH;
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return SoundsRegister.ILLUSION_SMG_FIRE;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityModulo;
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return new EntityModuloShot(this, Enums.MobProjectileType.MAGIC);
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}

	@Nonnull
	@Override
	protected Enums.CreatureEvents getEventRequirement() {
		return Enums.CreatureEvents.LUNAR_INVASION;
	}
}
