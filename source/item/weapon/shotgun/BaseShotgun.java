package net.tslat.aoa3.item.weapon.shotgun;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEnchantments;
import net.tslat.aoa3.common.registration.AoAItemGroups;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.projectile.gun.BaseBullet;
import net.tslat.aoa3.entity.projectile.gun.LimoniteBulletEntity;
import net.tslat.aoa3.entity.projectile.gun.MetalSlugEntity;
import net.tslat.aoa3.item.weapon.gun.BaseGun;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.NumberUtil;

import javax.annotation.Nullable;
import java.util.List;

public class BaseShotgun extends BaseGun {
	protected final int pelletCount;
	protected final float knockbackFactor;

	public BaseShotgun(final double dmg, final int pellets, final int durability, final int fireDelayTicks, final float knockbackFactor, final float recoil) {
		super(AoAItemGroups.SHOTGUNS, dmg, durability, fireDelayTicks, recoil);

		this.pelletCount = pellets;
		this.knockbackFactor = knockbackFactor;
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return AoASounds.ITEM_SHOTGUN_FIRE.get();
	}

	@Override
	public Item getAmmoItem() {
		return AoAItems.SPREADSHOT.get();
	}

	@Override
	public boolean isFullAutomatic() {
		return false;
	}

	public int getPelletCount() {
		return pelletCount;
	}

	@Override
	protected boolean fireGun(LivingEntity shooter, ItemStack stack, Hand hand) {
		BaseBullet bullet = findAndConsumeAmmo(shooter, stack, hand);

		if (bullet == null)
			return false;

		int pellets = getPelletCount();
		float spreadFactor = 0.1f * pellets * (1 - 0.15f * EnchantmentHelper.getItemEnchantmentLevel(AoAEnchantments.FORM.get(), stack));

		for (int i = 0; i < pellets; i++) {
			BaseBullet pellet = new LimoniteBulletEntity(shooter, this, hand, 4, 1.0f, 0, (random.nextFloat() - 0.5f) * spreadFactor, (random.nextFloat() - 0.5f) * spreadFactor, (random.nextFloat() - 0.5f) * spreadFactor);

			shooter.level.addFreshEntity(pellet);
		}

		if (!shooter.level.isClientSide())
			doFiringEffects(shooter, bullet, stack, hand);

		return true;
	}

	@Override
	public BaseBullet createProjectileEntity(LivingEntity shooter, ItemStack gunStack, Hand hand) {
		return new MetalSlugEntity(shooter, this, hand, 4, 0);
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		super.appendHoverText(stack, world, tooltip, flag);

		tooltip.set(1, LocaleUtil.getFormattedItemDescriptionText("items.description.damage.shotgun", LocaleUtil.ItemDescriptionType.ITEM_DAMAGE, new StringTextComponent(NumberUtil.roundToNthDecimalPlace((float)getDamage() * (1 + (0.1f * EnchantmentHelper.getItemEnchantmentLevel(AoAEnchantments.SHELL.get(), stack))), 2)), LocaleUtil.numToComponent(pelletCount)));
	}
}
