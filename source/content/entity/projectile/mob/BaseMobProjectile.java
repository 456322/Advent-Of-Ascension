package net.tslat.aoa3.content.entity.projectile.mob;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.tslat.aoa3.content.entity.base.AoARangedAttacker;

public abstract class BaseMobProjectile extends ThrowableProjectile {
	protected Type projectileType;
	protected AoARangedAttacker shooter;

	public BaseMobProjectile(EntityType<? extends ThrowableProjectile> entityType, Level world) {
		super(entityType, world);
	}

	public BaseMobProjectile(EntityType<? extends ThrowableProjectile> entityType, Level world, AoARangedAttacker shooter, double posX, double posY, double posZ, Type projectileType) {
		super(entityType, world);

		setPos(posX, posY, posZ);
		setDeltaMovement(random.nextGaussian() / 33 + 0.03, -2, random.nextGaussian() / 33 + 0.03);

		this.projectileType = projectileType;
		this.shooter = shooter;
	}

	public BaseMobProjectile(EntityType<? extends ThrowableProjectile> entityType, Level world, AoARangedAttacker shooter, Entity target, Type projectileType) {
		this(entityType, world, shooter, target.getX(), target.getY() + 25, target.getZ(), projectileType);
	}

	public BaseMobProjectile(EntityType<? extends ThrowableProjectile> entityType, Level world, AoARangedAttacker shooter, Type projectileType) {
		super(entityType, world);

		if (shooter instanceof LivingEntity owner) {
			setOwner(owner);
			setPos(owner.getX(), owner.getY() + owner.getEyeHeight() - 0.10000000149011612D, owner.getZ());
		}

		this.projectileType = projectileType;
		this.shooter = shooter;
	}

	public Type getProjectileType() {
		return projectileType;
	}

	@Override
	public float getGravity() {
		return 0.0f;
	}

	@Override
	protected void defineSynchedData() {}

	@Override
	public void tick() {
		super.tick();

		if (tickCount > 500)
			discard();
	}

	@Override
	protected void onHit(HitResult result) {
 		if (result.getType() != HitResult.Type.BLOCK || level.getBlockState(new BlockPos(result.getLocation())).getMaterial().blocksMotion()) {
			if (!level.isClientSide) {
				if (result instanceof EntityHitResult entityHitResult) {
					if (entityHitResult.getEntity() == shooter || shooter == null)
						return;

					onHitEntity(entityHitResult);
					shooter.doRangedAttackEntity(this, entityHitResult.getEntity());
				}
				else if (result instanceof BlockHitResult blockHitResult) {
					if (shooter != null) {
						onHitBlock(blockHitResult);
						shooter.doRangedAttackBlock(this, level.getBlockState(new BlockPos(result.getLocation())), new BlockPos(result.getLocation()), blockHitResult.getDirection());
					}
				}

				discard();
			}
		}
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
	}

	public enum Type {
		MAGIC,
		PHYSICAL,
		GUN,
		OTHER
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}
}
