/*
package net.tslat.aoa3.content.entity.tablet;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.content.item.tablet.TabletItem;
import net.tslat.aoa3.library.builder.EffectBuilder;
import net.tslat.aoa3.util.EntityUtil;

public class AwarenessTabletEntity extends SoulTabletEntity {
	public AwarenessTabletEntity(EntityType<? extends SoulTabletEntity> entityType, World world) {
		this(entityType, world, null);
	}

	public AwarenessTabletEntity(EntityType<? extends SoulTabletEntity> entityType, World world, ServerPlayerEntity placer) {
		super(entityType, world, placer);
	}

	@Override
	protected void doTickEffect() {
		EntityUtil.applyPotions(getTargetsWithinRadius(LivingEntity.class, entity -> entity instanceof IMob && entity.isAlive()), new EffectBuilder(Effects.GLOWING, 10).hideParticles().isAmbient());
	}

	@Override
	public TabletItem getRelevantItem() {
		return (TabletItem)AoAItems.AWARENESS_TABLET.get();
	}
}
*/
