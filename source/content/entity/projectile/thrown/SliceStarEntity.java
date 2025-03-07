package net.tslat.aoa3.content.entity.projectile.thrown;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.tslat.aoa3.common.registration.entity.AoAProjectiles;
import net.tslat.aoa3.common.registration.item.AoAWeapons;
import net.tslat.aoa3.content.entity.projectile.HardProjectile;
import net.tslat.aoa3.content.entity.projectile.gun.BaseBullet;
import net.tslat.aoa3.content.item.weapon.gun.BaseGun;

public class SliceStarEntity extends BaseBullet implements HardProjectile, ItemSupplier {
	public SliceStarEntity(EntityType<? extends ThrowableProjectile> entityType, Level world) {
		super(entityType, world);
	}

	public SliceStarEntity(Level world) {
		super(AoAProjectiles.SLICE_STAR.get(), world);
	}

	public SliceStarEntity(LivingEntity shooter, BaseGun gun) {
		super(AoAProjectiles.SLICE_STAR.get(), shooter, gun, 1.0f, 0, 3.0f);
	}

	public SliceStarEntity(LivingEntity shooter, BaseGun gun, InteractionHand hand, int maxAge, int piercingValue) {
		super(AoAProjectiles.SLICE_STAR.get(), shooter, gun, hand, maxAge, 1.0f, piercingValue);
	}

	public SliceStarEntity(Level world, double x, double y, double z) {
		super(AoAProjectiles.SLICE_STAR.get(), world, x, y, z);
	}

	@Override
	public float getGravity() {
		return 0.05f;
	}

	@Override
	public void doEntityImpact(Entity target, Vec3 impactLocation) {
		target.hurt(DamageSource.thrown(this, null), (float)AoAWeapons.SLICE_STAR.get().getDamage());
	}

	@Override
	protected void onHit(HitResult result) {
		if (result instanceof BlockHitResult && tickCount <= 1 && getOwner() == null)
			return;

		super.onHit(result);
	}

	@Override
	public ItemStack getItem() {
		return new ItemStack(AoAWeapons.SLICE_STAR.get());
	}
}
