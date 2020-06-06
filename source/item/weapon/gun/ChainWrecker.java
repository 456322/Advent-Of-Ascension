package net.tslat.aoa3.item.weapon.gun;

import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.SoundsRegister;

import javax.annotation.Nullable;

public class ChainWrecker extends BaseGun {
	public ChainWrecker(double dmg, int durability, int firingDelayTicks, float recoil) {
		super(dmg, durability, firingDelayTicks, recoil);
		setTranslationKey("ChainWrecker");
		setRegistryName("aoa3:chain_wrecker");
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return SoundsRegister.CHAINGUN_FIRE;
	}
}
