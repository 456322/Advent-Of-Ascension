package net.tslat.aoa3.content.item.weapon.gun;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.content.entity.projectile.gun.BaseBullet;
import net.tslat.aoa3.library.builder.SoundBuilder;

import javax.annotation.Nullable;

public class Megagun extends BaseGun {
	public Megagun(double dmg, int durability, int firingDelayTicks, float recoil) {
		super(dmg, durability, firingDelayTicks, recoil);
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return AoASounds.ITEM_GUN_MINIGUN_AUTOMATIC_FIRE.get();
	}

	@Override
	protected float getFiringSoundPitchAdjust() {
		return 0.85f;
	}

	@Override
	public void releaseUsing(ItemStack stack, Level level, LivingEntity shooter, int timeCharged) {
		new SoundBuilder(AoASounds.ITEM_GUN_MINIGUN_WINDDOWN).isPlayer().atEntity(shooter).followEntity(shooter).execute();
	}

	@Override
	protected void doFiringSound(LivingEntity shooter, BaseBullet bullet, ItemStack stack, InteractionHand hand) {
		new SoundBuilder(getFiringSound()).isPlayer().atEntity(shooter).varyPitch(getFiringSoundPitchAdjust()).execute();
	}
}
