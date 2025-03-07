package net.tslat.aoa3.content.block.functional.utility;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.common.registration.item.AoAItems;
import net.tslat.aoa3.util.BlockUtil;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LootUtil;

public class RuneRandomizer extends Block {
	public RuneRandomizer() {
		super(new BlockUtil.CompactProperties(Material.STONE, MaterialColor.COLOR_CYAN).stats(10f, 15f).get());
	}

	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		ItemStack heldItem = player.getItemInHand(hand);

		if (heldItem.getItem() == AoAItems.UNPOWERED_RUNE.get() || heldItem.getItem() == AoAItems.CHARGED_RUNE.get()) {
			if (player instanceof ServerPlayer) {
				if (!player.isCreative())
					heldItem.shrink(1);

				ItemUtil.givePlayerMultipleItems(player, LootUtil.generateLoot((ServerLevel)world, new ResourceLocation(AdventOfAscension.MOD_ID, "misc/rune_randomizer"), LootUtil.getGiftContext((ServerLevel)world, BlockUtil.posToVec(pos), player)));

				player.level.playSound(null, pos.getX(), pos.getY(), pos.getZ(), AoASounds.BLOCK_RUNE_RANDOMIZER_USE.get(), SoundSource.BLOCKS, 1.0f, 1.0f);
			}

			return InteractionResult.SUCCESS;
		}

		return InteractionResult.PASS;
	}
}
