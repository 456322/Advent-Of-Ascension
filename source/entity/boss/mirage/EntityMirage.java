package net.tslat.aoa3.entity.boss.mirage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoARangedMob;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntitySpiritualShot;
import net.tslat.aoa3.entity.properties.BossEntity;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ConfigurationUtil;

import javax.annotation.Nullable;

public class EntityMirage extends AoARangedMob implements BossEntity {
	public static final float entityWidth = 0.8f;
	
	public EntityMirage(World world) {
		super(world, entityWidth, 2f);
	}

	@Override
	public float getEyeHeight() {
		return 1.75f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 1;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 750;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 8;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.23;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.MOB_IMMORTAL_LIVING;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_IMMORTAL_DEATH;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.BLOCK_ANVIL_LAND;
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return SoundsRegister.MIRAGE_SHOOT;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityMirage;
	}

	@Override
	public boolean isNonBoss() {
		return false;
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return new EntitySpiritualShot(this, Enums.MobProjectileType.MAGIC);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		
		if (!world.isRemote && rand.nextInt(80) == 0) {
			world.playSound(null, posX, posY, posZ, SoundsRegister.MOB_MIRAGE_TELEPORT, SoundCategory.HOSTILE, 1.0f, 1.0f);
			
			if (world.provider.getDimension() == ConfigurationUtil.MainConfig.dimensionIds.immortallis) {
				switch (rand.nextInt(4)) {
					case 0:
						setLocationAndAngles(167, 24, 8, rand.nextFloat() * 360, 0);
						break;
					case 1:
						setLocationAndAngles(168, 24, -2, rand.nextFloat() * 360, 0);
						break;
					case 2:
						setLocationAndAngles(177, 24, 8, rand.nextFloat() * 360, 0);
						break;
					case 3:
						setLocationAndAngles(177, 24, -2, rand.nextFloat() * 360, 0);
						break;
				}
			}
			else {
				int x = (int)(rand.nextBoolean() ? posX + 5 : posX - 5);
				int z = (int)(rand.nextBoolean() ? posZ + 5 : posZ - 5);

				setLocationAndAngles(x, world.getHeight(x, z), z, rand.nextFloat() * 360, 0);
			}
		}
	}

	@Override
	public boolean startRiding(Entity entity, boolean force) {
		return false;
	}

	@Override
	public ResourceLocation getBossBarTexture() {
		return null;
	}

	@Nullable
	@Override
	public SoundEvent getBossMusic() {
		return null;
	}

	@Override
	public void setAttackTarget(@Nullable EntityLivingBase target) {
		if (target instanceof BossEntity)
			return;

		super.setAttackTarget(target);
	}
}
