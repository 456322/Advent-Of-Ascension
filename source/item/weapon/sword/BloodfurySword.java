package net.tslat.aoa3.item.weapon.sword;

import net.tslat.aoa3.item.weapon.AdventWeapon;

public class BloodfurySword extends BaseSword {
	public BloodfurySword(final ToolMaterial material, final double speed) {
		super(material, speed);
		setTranslationKey("Bloodfury");
		setRegistryName("aoa3:bloodfury");
	}
}
