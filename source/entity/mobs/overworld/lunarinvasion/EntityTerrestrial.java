package net.tslat.aoa3.entity.mobs.overworld.lunarinvasion;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EntityTerrestrial extends AoAMeleeMob {
	public static final float entityWidth = 1.2f;

	public EntityTerrestrial(World world) {
		super(world, entityWidth, 2.357f);
	}

	@Override
	public float getEyeHeight() {
		return 2.25f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.2d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 65;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 6;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.MOB_TERRESTRIAL_LIVING;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_TERRESTRIAL_DEATH;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.MOB_TERRESTRIAL_HIT;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityTerrestrial;
	}

	@Override
	protected void doMeleeEffect(Entity target) {
		if (target instanceof EntityLivingBase)
			((EntityLivingBase)target).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 150, 2, true, true));
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
