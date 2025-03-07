package net.tslat.aoa3.content.block.functional.misc;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.tslat.aoa3.util.EntityUtil;
import net.tslat.effectslib.api.util.EffectBuilder;

public class GiantSnailAcid extends AcidBlock {
	@Override
	public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entity) {
		if (EntityUtil.isVulnerableEntity(entity, new DamageSource("acid"))) {
			entity.hurt(new DamageSource("acid"), 4);
			EntityUtil.applyPotions(entity, new EffectBuilder(MobEffects.MOVEMENT_SLOWDOWN, 40));
		}
	}
}
