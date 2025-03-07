package net.tslat.aoa3.content.item.weapon.greatblade;

import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.common.registration.item.AoATiers;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.WorldUtil;

import javax.annotation.Nullable;
import java.util.List;

public class CreepoidGreatblade extends BaseGreatblade {
	public CreepoidGreatblade() {
		super(AoATiers.CREEPOID_GREATBLADE);
	}

	@Override
	protected void doMeleeEffect(ItemStack stack, LivingEntity target, LivingEntity attacker, float attackCooldown) {
		if (attackCooldown > 0.85f) {
			double offset = target.getBbWidth() / 1.99d;
			double offsetX = Mth.clamp(attacker.getX() - target.getX(), -offset, offset);
			double offsetY = Mth.clamp(attacker.getY() + attacker.getEyeHeight() - target.getY(), -0.1, target.getBbHeight() + 0.1);
			double offsetZ = Mth.clamp(attacker.getZ() - target.getZ(), -offset, offset);

			WorldUtil.createExplosion(attacker, attacker.level, target.getX() + offsetX, target.getY() + offsetY, target.getZ() + offsetZ, 1.5f);
		}
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(LocaleUtil.Constants.EXPLODES_ON_HIT, LocaleUtil.ItemDescriptionType.BENEFICIAL));
	}
}
