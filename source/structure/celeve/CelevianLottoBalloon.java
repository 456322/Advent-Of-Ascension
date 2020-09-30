package net.tslat.aoa3.structure.celeve;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.npcs.lottoman.EntityCelevianLottoman;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CelevianLottoBalloon extends AoAStructure { //StructureSize: 9x18x9
	private static final IBlockState blueCelevus = BlockRegister.BLUE_CELEVUS_LEAVES.getDefaultState();
	private static final IBlockState celevusStem = BlockRegister.CELEVE_STEM.getDefaultState();
	private static final IBlockState whitewashBricks = BlockRegister.WHITEWASH_BRICKS.getDefaultState();
	private static final IBlockState bloodstoneBricks = BlockRegister.BLOODSTONE_BRICKS.getDefaultState();

	public CelevianLottoBalloon() {
		super("CelevianLottoBalloon");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, blueCelevus);
		addBlock(world, basePos, 3, 0, 4, blueCelevus);
		addBlock(world, basePos, 3, 0, 5, blueCelevus);
		addBlock(world, basePos, 4, 0, 3, blueCelevus);
		addBlock(world, basePos, 4, 0, 4, blueCelevus);
		addBlock(world, basePos, 4, 0, 5, blueCelevus);
		addBlock(world, basePos, 5, 0, 3, blueCelevus);
		addBlock(world, basePos, 5, 0, 4, blueCelevus);
		addBlock(world, basePos, 5, 0, 5, blueCelevus);
		addBlock(world, basePos, 3, 1, 3, blueCelevus);
		addBlock(world, basePos, 3, 1, 4, blueCelevus);
		addBlock(world, basePos, 3, 1, 5, blueCelevus);
		addBlock(world, basePos, 4, 1, 3, blueCelevus);
		addBlock(world, basePos, 4, 1, 4, blueCelevus);
		addBlock(world, basePos, 4, 1, 5, blueCelevus);
		addBlock(world, basePos, 5, 1, 3, blueCelevus);
		addBlock(world, basePos, 5, 1, 4, blueCelevus);
		addBlock(world, basePos, 5, 1, 5, blueCelevus);
		addBlock(world, basePos, 3, 2, 3, blueCelevus);
		addBlock(world, basePos, 3, 2, 4, blueCelevus);
		addBlock(world, basePos, 3, 2, 5, blueCelevus);
		addBlock(world, basePos, 4, 2, 3, blueCelevus);
		addBlock(world, basePos, 4, 2, 4, blueCelevus);
		addBlock(world, basePos, 4, 2, 5, blueCelevus);
		addBlock(world, basePos, 5, 2, 3, blueCelevus);
		addBlock(world, basePos, 5, 2, 4, blueCelevus);
		addBlock(world, basePos, 5, 2, 5, blueCelevus);
		addBlock(world, basePos, 4, 3, 4, celevusStem);
		addBlock(world, basePos, 4, 4, 4, celevusStem);
		addBlock(world, basePos, 4, 5, 4, celevusStem);
		addBlock(world, basePos, 4, 6, 4, celevusStem);
		addBlock(world, basePos, 4, 7, 4, celevusStem);
		addBlock(world, basePos, 1, 8, 1, whitewashBricks);
		addBlock(world, basePos, 1, 8, 2, whitewashBricks);
		addBlock(world, basePos, 1, 8, 3, whitewashBricks);
		addBlock(world, basePos, 1, 8, 4, whitewashBricks);
		addBlock(world, basePos, 1, 8, 5, whitewashBricks);
		addBlock(world, basePos, 1, 8, 6, whitewashBricks);
		addBlock(world, basePos, 1, 8, 7, whitewashBricks);
		addBlock(world, basePos, 2, 8, 1, whitewashBricks);
		addBlock(world, basePos, 2, 8, 2, bloodstoneBricks);
		addBlock(world, basePos, 2, 8, 3, bloodstoneBricks);
		addBlock(world, basePos, 2, 8, 4, bloodstoneBricks);
		addBlock(world, basePos, 2, 8, 5, bloodstoneBricks);
		addBlock(world, basePos, 2, 8, 6, bloodstoneBricks);
		addBlock(world, basePos, 2, 8, 7, whitewashBricks);
		addBlock(world, basePos, 3, 8, 1, whitewashBricks);
		addBlock(world, basePos, 3, 8, 2, bloodstoneBricks);
		addBlock(world, basePos, 3, 8, 3, whitewashBricks);
		addBlock(world, basePos, 3, 8, 4, whitewashBricks);
		addBlock(world, basePos, 3, 8, 5, whitewashBricks);
		addBlock(world, basePos, 3, 8, 6, bloodstoneBricks);
		addBlock(world, basePos, 3, 8, 7, whitewashBricks);
		addBlock(world, basePos, 4, 8, 1, whitewashBricks);
		addBlock(world, basePos, 4, 8, 2, bloodstoneBricks);
		addBlock(world, basePos, 4, 8, 3, whitewashBricks);
		addBlock(world, basePos, 4, 8, 4, whitewashBricks);
		addBlock(world, basePos, 4, 8, 5, whitewashBricks);
		addBlock(world, basePos, 4, 8, 6, bloodstoneBricks);
		addBlock(world, basePos, 4, 8, 7, whitewashBricks);
		addBlock(world, basePos, 5, 8, 1, whitewashBricks);
		addBlock(world, basePos, 5, 8, 2, bloodstoneBricks);
		addBlock(world, basePos, 5, 8, 3, whitewashBricks);
		addBlock(world, basePos, 5, 8, 4, whitewashBricks);
		addBlock(world, basePos, 5, 8, 5, whitewashBricks);
		addBlock(world, basePos, 5, 8, 6, bloodstoneBricks);
		addBlock(world, basePos, 5, 8, 7, whitewashBricks);
		addBlock(world, basePos, 6, 8, 1, whitewashBricks);
		addBlock(world, basePos, 6, 8, 2, bloodstoneBricks);
		addBlock(world, basePos, 6, 8, 3, bloodstoneBricks);
		addBlock(world, basePos, 6, 8, 4, bloodstoneBricks);
		addBlock(world, basePos, 6, 8, 5, bloodstoneBricks);
		addBlock(world, basePos, 6, 8, 6, bloodstoneBricks);
		addBlock(world, basePos, 6, 8, 7, whitewashBricks);
		addBlock(world, basePos, 7, 8, 1, whitewashBricks);
		addBlock(world, basePos, 7, 8, 2, whitewashBricks);
		addBlock(world, basePos, 7, 8, 3, whitewashBricks);
		addBlock(world, basePos, 7, 8, 4, whitewashBricks);
		addBlock(world, basePos, 7, 8, 5, whitewashBricks);
		addBlock(world, basePos, 7, 8, 6, whitewashBricks);
		addBlock(world, basePos, 7, 8, 7, whitewashBricks);
		addBlock(world, basePos, 1, 9, 1, whitewashBricks);
		addBlock(world, basePos, 1, 9, 2, whitewashBricks);
		addBlock(world, basePos, 1, 9, 3, whitewashBricks);
		addBlock(world, basePos, 1, 9, 4, whitewashBricks);
		addBlock(world, basePos, 1, 9, 5, whitewashBricks);
		addBlock(world, basePos, 1, 9, 6, whitewashBricks);
		addBlock(world, basePos, 1, 9, 7, whitewashBricks);
		addBlock(world, basePos, 2, 9, 1, whitewashBricks);
		addBlock(world, basePos, 2, 9, 7, whitewashBricks);
		addBlock(world, basePos, 3, 9, 1, whitewashBricks);
		addBlock(world, basePos, 3, 9, 7, whitewashBricks);
		addBlock(world, basePos, 4, 9, 1, whitewashBricks);
		addBlock(world, basePos, 4, 9, 7, whitewashBricks);
		addBlock(world, basePos, 5, 9, 1, whitewashBricks);
		addBlock(world, basePos, 5, 9, 7, whitewashBricks);
		addBlock(world, basePos, 6, 9, 1, whitewashBricks);
		addBlock(world, basePos, 6, 9, 7, whitewashBricks);
		addBlock(world, basePos, 7, 9, 1, whitewashBricks);
		addBlock(world, basePos, 7, 9, 2, whitewashBricks);
		addBlock(world, basePos, 7, 9, 3, whitewashBricks);
		addBlock(world, basePos, 7, 9, 4, whitewashBricks);
		addBlock(world, basePos, 7, 9, 5, whitewashBricks);
		addBlock(world, basePos, 7, 9, 6, whitewashBricks);
		addBlock(world, basePos, 7, 9, 7, whitewashBricks);
		addBlock(world, basePos, 1, 10, 1, celevusStem);
		addBlock(world, basePos, 1, 10, 7, celevusStem);
		addBlock(world, basePos, 7, 10, 1, celevusStem);
		addBlock(world, basePos, 7, 10, 7, celevusStem);
		addBlock(world, basePos, 1, 11, 1, celevusStem);
		addBlock(world, basePos, 1, 11, 7, celevusStem);
		addBlock(world, basePos, 7, 11, 1, celevusStem);
		addBlock(world, basePos, 7, 11, 7, celevusStem);
		addBlock(world, basePos, 1, 12, 1, celevusStem);
		addBlock(world, basePos, 1, 12, 7, celevusStem);
		addBlock(world, basePos, 7, 12, 1, celevusStem);
		addBlock(world, basePos, 7, 12, 7, celevusStem);
		addBlock(world, basePos, 1, 13, 1, celevusStem);
		addBlock(world, basePos, 1, 13, 7, celevusStem);
		addBlock(world, basePos, 7, 13, 1, celevusStem);
		addBlock(world, basePos, 7, 13, 7, celevusStem);
		addBlock(world, basePos, 1, 14, 1, celevusStem);
		addBlock(world, basePos, 1, 14, 7, celevusStem);
		addBlock(world, basePos, 7, 14, 1, celevusStem);
		addBlock(world, basePos, 7, 14, 7, celevusStem);
		addBlock(world, basePos, 0, 15, 0, blueCelevus);
		addBlock(world, basePos, 0, 15, 1, blueCelevus);
		addBlock(world, basePos, 0, 15, 2, blueCelevus);
		addBlock(world, basePos, 0, 15, 6, blueCelevus);
		addBlock(world, basePos, 0, 15, 7, blueCelevus);
		addBlock(world, basePos, 0, 15, 8, blueCelevus);
		addBlock(world, basePos, 1, 15, 0, blueCelevus);
		addBlock(world, basePos, 1, 15, 1, blueCelevus);
		addBlock(world, basePos, 1, 15, 2, blueCelevus);
		addBlock(world, basePos, 1, 15, 6, blueCelevus);
		addBlock(world, basePos, 1, 15, 7, blueCelevus);
		addBlock(world, basePos, 1, 15, 8, blueCelevus);
		addBlock(world, basePos, 2, 15, 0, blueCelevus);
		addBlock(world, basePos, 2, 15, 1, blueCelevus);
		addBlock(world, basePos, 2, 15, 2, blueCelevus);
		addBlock(world, basePos, 2, 15, 6, blueCelevus);
		addBlock(world, basePos, 2, 15, 7, blueCelevus);
		addBlock(world, basePos, 2, 15, 8, blueCelevus);
		addBlock(world, basePos, 6, 15, 0, blueCelevus);
		addBlock(world, basePos, 6, 15, 1, blueCelevus);
		addBlock(world, basePos, 6, 15, 2, blueCelevus);
		addBlock(world, basePos, 6, 15, 6, blueCelevus);
		addBlock(world, basePos, 6, 15, 7, blueCelevus);
		addBlock(world, basePos, 6, 15, 8, blueCelevus);
		addBlock(world, basePos, 7, 15, 0, blueCelevus);
		addBlock(world, basePos, 7, 15, 1, blueCelevus);
		addBlock(world, basePos, 7, 15, 2, blueCelevus);
		addBlock(world, basePos, 7, 15, 6, blueCelevus);
		addBlock(world, basePos, 7, 15, 7, blueCelevus);
		addBlock(world, basePos, 7, 15, 8, blueCelevus);
		addBlock(world, basePos, 8, 15, 0, blueCelevus);
		addBlock(world, basePos, 8, 15, 1, blueCelevus);
		addBlock(world, basePos, 8, 15, 2, blueCelevus);
		addBlock(world, basePos, 8, 15, 6, blueCelevus);
		addBlock(world, basePos, 8, 15, 7, blueCelevus);
		addBlock(world, basePos, 8, 15, 8, blueCelevus);
		addBlock(world, basePos, 0, 16, 0, blueCelevus);
		addBlock(world, basePos, 0, 16, 1, blueCelevus);
		addBlock(world, basePos, 0, 16, 2, blueCelevus);
		addBlock(world, basePos, 0, 16, 6, blueCelevus);
		addBlock(world, basePos, 0, 16, 7, blueCelevus);
		addBlock(world, basePos, 0, 16, 8, blueCelevus);
		addBlock(world, basePos, 1, 16, 0, blueCelevus);
		addBlock(world, basePos, 1, 16, 1, blueCelevus);
		addBlock(world, basePos, 1, 16, 2, blueCelevus);
		addBlock(world, basePos, 1, 16, 6, blueCelevus);
		addBlock(world, basePos, 1, 16, 7, blueCelevus);
		addBlock(world, basePos, 1, 16, 8, blueCelevus);
		addBlock(world, basePos, 2, 16, 0, blueCelevus);
		addBlock(world, basePos, 2, 16, 1, blueCelevus);
		addBlock(world, basePos, 2, 16, 2, blueCelevus);
		addBlock(world, basePos, 2, 16, 6, blueCelevus);
		addBlock(world, basePos, 2, 16, 7, blueCelevus);
		addBlock(world, basePos, 2, 16, 8, blueCelevus);
		addBlock(world, basePos, 6, 16, 0, blueCelevus);
		addBlock(world, basePos, 6, 16, 1, blueCelevus);
		addBlock(world, basePos, 6, 16, 2, blueCelevus);
		addBlock(world, basePos, 6, 16, 6, blueCelevus);
		addBlock(world, basePos, 6, 16, 7, blueCelevus);
		addBlock(world, basePos, 6, 16, 8, blueCelevus);
		addBlock(world, basePos, 7, 16, 0, blueCelevus);
		addBlock(world, basePos, 7, 16, 1, blueCelevus);
		addBlock(world, basePos, 7, 16, 2, blueCelevus);
		addBlock(world, basePos, 7, 16, 6, blueCelevus);
		addBlock(world, basePos, 7, 16, 7, blueCelevus);
		addBlock(world, basePos, 7, 16, 8, blueCelevus);
		addBlock(world, basePos, 8, 16, 0, blueCelevus);
		addBlock(world, basePos, 8, 16, 1, blueCelevus);
		addBlock(world, basePos, 8, 16, 2, blueCelevus);
		addBlock(world, basePos, 8, 16, 6, blueCelevus);
		addBlock(world, basePos, 8, 16, 7, blueCelevus);
		addBlock(world, basePos, 8, 16, 8, blueCelevus);
		addBlock(world, basePos, 0, 17, 0, blueCelevus);
		addBlock(world, basePos, 0, 17, 1, blueCelevus);
		addBlock(world, basePos, 0, 17, 2, blueCelevus);
		addBlock(world, basePos, 0, 17, 6, blueCelevus);
		addBlock(world, basePos, 0, 17, 7, blueCelevus);
		addBlock(world, basePos, 0, 17, 8, blueCelevus);
		addBlock(world, basePos, 1, 17, 0, blueCelevus);
		addBlock(world, basePos, 1, 17, 1, blueCelevus);
		addBlock(world, basePos, 1, 17, 2, blueCelevus);
		addBlock(world, basePos, 1, 17, 6, blueCelevus);
		addBlock(world, basePos, 1, 17, 7, blueCelevus);
		addBlock(world, basePos, 1, 17, 8, blueCelevus);
		addBlock(world, basePos, 2, 17, 0, blueCelevus);
		addBlock(world, basePos, 2, 17, 1, blueCelevus);
		addBlock(world, basePos, 2, 17, 2, blueCelevus);
		addBlock(world, basePos, 2, 17, 6, blueCelevus);
		addBlock(world, basePos, 2, 17, 7, blueCelevus);
		addBlock(world, basePos, 2, 17, 8, blueCelevus);
		addBlock(world, basePos, 6, 17, 0, blueCelevus);
		addBlock(world, basePos, 6, 17, 1, blueCelevus);
		addBlock(world, basePos, 6, 17, 2, blueCelevus);
		addBlock(world, basePos, 6, 17, 6, blueCelevus);
		addBlock(world, basePos, 6, 17, 7, blueCelevus);
		addBlock(world, basePos, 6, 17, 8, blueCelevus);
		addBlock(world, basePos, 7, 17, 0, blueCelevus);
		addBlock(world, basePos, 7, 17, 1, blueCelevus);
		addBlock(world, basePos, 7, 17, 2, blueCelevus);
		addBlock(world, basePos, 7, 17, 6, blueCelevus);
		addBlock(world, basePos, 7, 17, 7, blueCelevus);
		addBlock(world, basePos, 7, 17, 8, blueCelevus);
		addBlock(world, basePos, 8, 17, 0, blueCelevus);
		addBlock(world, basePos, 8, 17, 1, blueCelevus);
		addBlock(world, basePos, 8, 17, 2, blueCelevus);
		addBlock(world, basePos, 8, 17, 6, blueCelevus);
		addBlock(world, basePos, 8, 17, 7, blueCelevus);
		addBlock(world, basePos, 8, 17, 8, blueCelevus);
	}

	@Override
	protected void spawnEntities(World world, Random rand, BlockPos basePos) {
		EntityCelevianLottoman lottoman = new EntityCelevianLottoman(world);

		lottoman.setLocationAndAngles(basePos.getX() + 4, basePos.getY() + 9, basePos.getZ() + 4, rand.nextFloat() * 360, 0);
		world.spawnEntity(lottoman);
	}
}
