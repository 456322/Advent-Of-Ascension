package net.tslat.aoa3.entity.npc.skillmaster;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAArmour;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.entity.base.AoATrader;

import javax.annotation.Nullable;

public class RunationMasterEntity extends AoATrader {
	private static final Int2ObjectMap<VillagerTrades.ITrade[]> TRADES = new TradeListBuilder()
			.trades(1,
					BuildableTrade.trade(AoAArmour.RUNATION_ARMOUR.helmet).cost(AoAItems.LUNAVER_COIN).xp(150).stock(5),
					BuildableTrade.trade(AoAArmour.RUNATION_ARMOUR.chestplate).cost(AoAItems.LUNAVER_COIN).xp(150).stock(5),
					BuildableTrade.trade(AoAArmour.RUNATION_ARMOUR.leggings).cost(AoAItems.LUNAVER_COIN).xp(150).stock(5),
					BuildableTrade.trade(AoAArmour.RUNATION_ARMOUR.boots).cost(AoAItems.LUNAVER_COIN).xp(150).stock(5)).build();

	public RunationMasterEntity(EntityType<? extends AoATrader> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected int getMaxTradesToUnlock(int newProfessionLevel) {
		return newProfessionLevel == 1 ? 4 : 2;
	}

	@Nullable
	@Override
	public Int2ObjectMap<VillagerTrades.ITrade[]> getTradesMap() {
		return TRADES;
	}
}
