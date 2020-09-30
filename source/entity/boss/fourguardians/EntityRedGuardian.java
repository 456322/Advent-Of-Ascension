package net.tslat.aoa3.entity.boss.fourguardians;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoARangedMob;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntityRedGuardianShot;
import net.tslat.aoa3.entity.properties.BossEntity;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ModUtil;

import javax.annotation.Nullable;

public class EntityRedGuardian extends AoARangedMob implements BossEntity {
	private static final ResourceLocation bossBarTexture = new ResourceLocation("aoa3", "textures/gui/bossbars/red_guardian.png");
	public static final float entityWidth = 1.5f;

	private EntityBlueGuardian blueGuardian;
	private EntityGreenGuardian greenGuardian;
	private EntityYellowGuardian yellowGuardian;

	public EntityRedGuardian(World world) {
		super(world, entityWidth, 2.625f);
	}

	@Override
	public float getEyeHeight() {
		return 1.875f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 750;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 20;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.207;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_GUARDIAN_DEATH;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.MOB_GUARDIAN_HIT;
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return SoundsRegister.GUARDIAN_SHOOT;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		if (checkGuardian(blueGuardian) && checkGuardian(greenGuardian) && checkGuardian(yellowGuardian))
			return LootSystemRegister.entityRedGuardian;

		return null;
	}

	@Override
	public boolean isNonBoss() {
		return false;
	}

	public void setGreenGuardian(EntityGreenGuardian greenGuardian) {
		this.greenGuardian = greenGuardian;
	}

	public void setBlueGuardian(EntityBlueGuardian blueGuardian) {
		this.blueGuardian = blueGuardian;
	}

	public void setYellowGuardian(EntityYellowGuardian yellowGuardian) {
		this.yellowGuardian = yellowGuardian;
	}

	private boolean checkGuardian(EntityLivingBase guardian) {
		return guardian == null || guardian.isDead || guardian.getHealth() == 0;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();

		if (world.isRemote && ticksExisted == 1)
			playMusic(null);
	}

	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);

		if (!world.isRemote) {
			setDead();

			if (checkGuardian(yellowGuardian) && checkGuardian(greenGuardian) && checkGuardian(blueGuardian)) {
				for (EntityPlayerMP pl : world.getEntitiesWithinAABB(EntityPlayerMP.class, getEntityBoundingBox().grow(20))) {
					ModUtil.completeAdvancement(pl, "haven/guard_that", "kill_four_guardians");
				}
			}
		}
	}

	@Override
	public void doProjectileEntityImpact(BaseMobProjectile projectile, Entity target) {
		if (target instanceof AoARangedMob && target instanceof BossEntity)
			return;

		super.doProjectileEntityImpact(projectile, target);
	}

	@Override
	public void doProjectileImpactEffect(BaseMobProjectile projectile, Entity target) {
		if (target instanceof EntityLivingBase)
			((EntityLivingBase)target).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 40, 2, true, true));
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return new EntityRedGuardianShot(this, Enums.MobProjectileType.MAGIC);
	}

	@Override
	public void setAttackTarget(@Nullable EntityLivingBase target) {
		if (target instanceof BossEntity)
			return;

		super.setAttackTarget(target);
	}

	@Override
	public ResourceLocation getBossBarTexture() {
		return bossBarTexture;
	}

	@Nullable
	@Override
	public SoundEvent getBossMusic() {
		return SoundsRegister.FOUR_GUARDIANS_MUSIC;
	}
}
