package net.tslat.aoa3.item.weapon.gun;

import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.SoundsRegister;

import javax.annotation.Nullable;

public class MechanicalAssaultRifle extends BaseGun {
	public MechanicalAssaultRifle(double dmg, int durability, int firingDelayTicks, float recoil) {
		super(dmg, durability, firingDelayTicks, recoil);
		setTranslationKey("MechanicalAssaultRifle");
		setRegistryName("aoa3:mechanical_assault_rifle");
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return SoundsRegister.REVOLVER_FIRE;
	}
}
