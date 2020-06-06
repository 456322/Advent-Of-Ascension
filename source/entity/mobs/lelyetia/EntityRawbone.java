package net.tslat.aoa3.entity.mobs.lelyetia;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.entity.properties.SpecialPropertyEntity;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.EntityUtil;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.TreeSet;

public class EntityRawbone extends AoAMeleeMob implements SpecialPropertyEntity {
	public static final float entityWidth = 0.625f;

	public EntityRawbone(World world) {
		super(world, entityWidth, 1.0625f);

		mobProperties.add(Enums.MobProperties.RANGED_IMMUNE);
	}

	@Override
	public float getEyeHeight() {
		return 1f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 64;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 7;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.MOB_RAWBONE_LIVING;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_RAWBONE_DEATH;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.MOB_RAWBONE_HIT;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityRawbone;
	}

	@Override
	protected void doMeleeEffect(Entity target) {
		if (target instanceof EntityLivingBase)
			((EntityLivingBase)target).addPotionEffect(new PotionEffect(MobEffects.HUNGER, 250, 2, true, true));
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

	@Override
	protected boolean isSpecialImmuneTo(DamageSource source, int damage) {
		return EntityUtil.isRangedDamage(source, this, damage);
	}

	@Nonnull
	@Override
	public TreeSet<Enums.MobProperties> getMobProperties() {
		return mobProperties;
	}
}
