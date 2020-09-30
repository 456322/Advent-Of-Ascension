package net.tslat.aoa3.structure.deeplands;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.npcs.lottoman.EntityRockyLottoman;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class DeepLottoShelter extends AoAStructure { //StructureSize: 14x4x14
	private static final IBlockState stone = BlockRegister.DEEPLANDS_STONE.getDefaultState();
	private static final IBlockState decayedGlass = BlockRegister.DECAYED_GLASS.getDefaultState();

	public DeepLottoShelter() {
		super("DeepLottoShelter");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, stone);
		addBlock(world, basePos, 0, 0, 1, stone);
		addBlock(world, basePos, 0, 0, 2, stone);
		addBlock(world, basePos, 0, 0, 3, stone);
		addBlock(world, basePos, 0, 0, 4, stone);
		addBlock(world, basePos, 0, 0, 5, stone);
		addBlock(world, basePos, 0, 0, 6, stone);
		addBlock(world, basePos, 0, 0, 7, stone);
		addBlock(world, basePos, 0, 0, 8, stone);
		addBlock(world, basePos, 0, 0, 9, stone);
		addBlock(world, basePos, 0, 0, 10, stone);
		addBlock(world, basePos, 0, 0, 11, stone);
		addBlock(world, basePos, 0, 0, 12, stone);
		addBlock(world, basePos, 0, 0, 13, stone);
		addBlock(world, basePos, 1, 0, 0, stone);
		addBlock(world, basePos, 1, 0, 1, stone);
		addBlock(world, basePos, 1, 0, 2, stone);
		addBlock(world, basePos, 1, 0, 3, stone);
		addBlock(world, basePos, 1, 0, 4, stone);
		addBlock(world, basePos, 1, 0, 5, stone);
		addBlock(world, basePos, 1, 0, 6, stone);
		addBlock(world, basePos, 1, 0, 7, stone);
		addBlock(world, basePos, 1, 0, 8, stone);
		addBlock(world, basePos, 1, 0, 9, stone);
		addBlock(world, basePos, 1, 0, 10, stone);
		addBlock(world, basePos, 1, 0, 11, stone);
		addBlock(world, basePos, 1, 0, 12, stone);
		addBlock(world, basePos, 1, 0, 13, stone);
		addBlock(world, basePos, 2, 0, 0, stone);
		addBlock(world, basePos, 2, 0, 1, stone);
		addBlock(world, basePos, 2, 0, 12, stone);
		addBlock(world, basePos, 2, 0, 13, stone);
		addBlock(world, basePos, 3, 0, 0, stone);
		addBlock(world, basePos, 3, 0, 1, stone);
		addBlock(world, basePos, 3, 0, 4, stone);
		addBlock(world, basePos, 3, 0, 9, stone);
		addBlock(world, basePos, 3, 0, 12, stone);
		addBlock(world, basePos, 3, 0, 13, stone);
		addBlock(world, basePos, 4, 0, 0, stone);
		addBlock(world, basePos, 4, 0, 1, stone);
		addBlock(world, basePos, 4, 0, 3, stone);
		addBlock(world, basePos, 4, 0, 4, stone);
		addBlock(world, basePos, 4, 0, 9, stone);
		addBlock(world, basePos, 4, 0, 10, stone);
		addBlock(world, basePos, 4, 0, 12, stone);
		addBlock(world, basePos, 4, 0, 13, stone);
		addBlock(world, basePos, 5, 0, 0, stone);
		addBlock(world, basePos, 5, 0, 1, stone);
		addBlock(world, basePos, 5, 0, 12, stone);
		addBlock(world, basePos, 5, 0, 13, stone);
		addBlock(world, basePos, 6, 0, 0, stone);
		addBlock(world, basePos, 6, 0, 1, stone);
		addBlock(world, basePos, 6, 0, 12, stone);
		addBlock(world, basePos, 6, 0, 13, stone);
		addBlock(world, basePos, 7, 0, 0, stone);
		addBlock(world, basePos, 7, 0, 1, stone);
		addBlock(world, basePos, 7, 0, 12, stone);
		addBlock(world, basePos, 7, 0, 13, stone);
		addBlock(world, basePos, 8, 0, 0, stone);
		addBlock(world, basePos, 8, 0, 1, stone);
		addBlock(world, basePos, 8, 0, 12, stone);
		addBlock(world, basePos, 8, 0, 13, stone);
		addBlock(world, basePos, 9, 0, 0, stone);
		addBlock(world, basePos, 9, 0, 1, stone);
		addBlock(world, basePos, 9, 0, 3, stone);
		addBlock(world, basePos, 9, 0, 4, stone);
		addBlock(world, basePos, 9, 0, 9, stone);
		addBlock(world, basePos, 9, 0, 10, stone);
		addBlock(world, basePos, 9, 0, 12, stone);
		addBlock(world, basePos, 9, 0, 13, stone);
		addBlock(world, basePos, 10, 0, 0, stone);
		addBlock(world, basePos, 10, 0, 1, stone);
		addBlock(world, basePos, 10, 0, 4, stone);
		addBlock(world, basePos, 10, 0, 9, stone);
		addBlock(world, basePos, 10, 0, 12, stone);
		addBlock(world, basePos, 10, 0, 13, stone);
		addBlock(world, basePos, 11, 0, 0, stone);
		addBlock(world, basePos, 11, 0, 1, stone);
		addBlock(world, basePos, 11, 0, 12, stone);
		addBlock(world, basePos, 11, 0, 13, stone);
		addBlock(world, basePos, 12, 0, 0, stone);
		addBlock(world, basePos, 12, 0, 1, stone);
		addBlock(world, basePos, 12, 0, 2, stone);
		addBlock(world, basePos, 12, 0, 3, stone);
		addBlock(world, basePos, 12, 0, 4, stone);
		addBlock(world, basePos, 12, 0, 5, stone);
		addBlock(world, basePos, 12, 0, 6, stone);
		addBlock(world, basePos, 12, 0, 7, stone);
		addBlock(world, basePos, 12, 0, 8, stone);
		addBlock(world, basePos, 12, 0, 9, stone);
		addBlock(world, basePos, 12, 0, 10, stone);
		addBlock(world, basePos, 12, 0, 11, stone);
		addBlock(world, basePos, 12, 0, 12, stone);
		addBlock(world, basePos, 12, 0, 13, stone);
		addBlock(world, basePos, 13, 0, 0, stone);
		addBlock(world, basePos, 13, 0, 1, stone);
		addBlock(world, basePos, 13, 0, 2, stone);
		addBlock(world, basePos, 13, 0, 3, stone);
		addBlock(world, basePos, 13, 0, 4, stone);
		addBlock(world, basePos, 13, 0, 5, stone);
		addBlock(world, basePos, 13, 0, 6, stone);
		addBlock(world, basePos, 13, 0, 7, stone);
		addBlock(world, basePos, 13, 0, 8, stone);
		addBlock(world, basePos, 13, 0, 9, stone);
		addBlock(world, basePos, 13, 0, 10, stone);
		addBlock(world, basePos, 13, 0, 11, stone);
		addBlock(world, basePos, 13, 0, 12, stone);
		addBlock(world, basePos, 13, 0, 13, stone);
		addBlock(world, basePos, 1, 1, 1, stone);
		addBlock(world, basePos, 1, 1, 2, decayedGlass);
		addBlock(world, basePos, 1, 1, 3, decayedGlass);
		addBlock(world, basePos, 1, 1, 4, decayedGlass);
		addBlock(world, basePos, 1, 1, 5, decayedGlass);
		addBlock(world, basePos, 1, 1, 6, decayedGlass);
		addBlock(world, basePos, 1, 1, 7, decayedGlass);
		addBlock(world, basePos, 1, 1, 8, decayedGlass);
		addBlock(world, basePos, 1, 1, 9, decayedGlass);
		addBlock(world, basePos, 1, 1, 10, decayedGlass);
		addBlock(world, basePos, 1, 1, 11, decayedGlass);
		addBlock(world, basePos, 1, 1, 12, stone);
		addBlock(world, basePos, 2, 1, 1, decayedGlass);
		addBlock(world, basePos, 2, 1, 12, decayedGlass);
		addBlock(world, basePos, 3, 1, 1, decayedGlass);
		addBlock(world, basePos, 3, 1, 12, decayedGlass);
		addBlock(world, basePos, 4, 1, 1, decayedGlass);
		addBlock(world, basePos, 4, 1, 4, stone);
		addBlock(world, basePos, 4, 1, 9, stone);
		addBlock(world, basePos, 4, 1, 12, decayedGlass);
		addBlock(world, basePos, 5, 1, 1, decayedGlass);
		addBlock(world, basePos, 5, 1, 12, decayedGlass);
		addBlock(world, basePos, 6, 1, 1, decayedGlass);
		addBlock(world, basePos, 6, 1, 12, decayedGlass);
		addBlock(world, basePos, 7, 1, 1, decayedGlass);
		addBlock(world, basePos, 7, 1, 12, decayedGlass);
		addBlock(world, basePos, 8, 1, 1, decayedGlass);
		addBlock(world, basePos, 8, 1, 12, decayedGlass);
		addBlock(world, basePos, 9, 1, 1, decayedGlass);
		addBlock(world, basePos, 9, 1, 4, stone);
		addBlock(world, basePos, 9, 1, 9, stone);
		addBlock(world, basePos, 9, 1, 12, decayedGlass);
		addBlock(world, basePos, 10, 1, 1, decayedGlass);
		addBlock(world, basePos, 10, 1, 12, decayedGlass);
		addBlock(world, basePos, 11, 1, 1, decayedGlass);
		addBlock(world, basePos, 11, 1, 12, decayedGlass);
		addBlock(world, basePos, 12, 1, 1, stone);
		addBlock(world, basePos, 12, 1, 2, decayedGlass);
		addBlock(world, basePos, 12, 1, 3, decayedGlass);
		addBlock(world, basePos, 12, 1, 4, decayedGlass);
		addBlock(world, basePos, 12, 1, 5, decayedGlass);
		addBlock(world, basePos, 12, 1, 6, decayedGlass);
		addBlock(world, basePos, 12, 1, 7, decayedGlass);
		addBlock(world, basePos, 12, 1, 8, decayedGlass);
		addBlock(world, basePos, 12, 1, 9, decayedGlass);
		addBlock(world, basePos, 12, 1, 10, decayedGlass);
		addBlock(world, basePos, 12, 1, 11, decayedGlass);
		addBlock(world, basePos, 12, 1, 12, stone);
		addBlock(world, basePos, 4, 2, 4, stone);
		addBlock(world, basePos, 4, 2, 9, stone);
		addBlock(world, basePos, 9, 2, 4, stone);
		addBlock(world, basePos, 9, 2, 9, stone);
		addBlock(world, basePos, 4, 3, 4, stone);
		addBlock(world, basePos, 4, 3, 5, stone);
		addBlock(world, basePos, 4, 3, 6, stone);
		addBlock(world, basePos, 4, 3, 7, stone);
		addBlock(world, basePos, 4, 3, 8, stone);
		addBlock(world, basePos, 4, 3, 9, stone);
		addBlock(world, basePos, 5, 3, 4, stone);
		addBlock(world, basePos, 5, 3, 5, decayedGlass);
		addBlock(world, basePos, 5, 3, 6, decayedGlass);
		addBlock(world, basePos, 5, 3, 7, decayedGlass);
		addBlock(world, basePos, 5, 3, 8, decayedGlass);
		addBlock(world, basePos, 5, 3, 9, stone);
		addBlock(world, basePos, 6, 3, 4, stone);
		addBlock(world, basePos, 6, 3, 5, decayedGlass);
		addBlock(world, basePos, 6, 3, 6, stone);
		addBlock(world, basePos, 6, 3, 7, stone);
		addBlock(world, basePos, 6, 3, 8, decayedGlass);
		addBlock(world, basePos, 6, 3, 9, stone);
		addBlock(world, basePos, 7, 3, 4, stone);
		addBlock(world, basePos, 7, 3, 5, decayedGlass);
		addBlock(world, basePos, 7, 3, 6, stone);
		addBlock(world, basePos, 7, 3, 7, stone);
		addBlock(world, basePos, 7, 3, 8, decayedGlass);
		addBlock(world, basePos, 7, 3, 9, stone);
		addBlock(world, basePos, 8, 3, 4, stone);
		addBlock(world, basePos, 8, 3, 5, decayedGlass);
		addBlock(world, basePos, 8, 3, 6, decayedGlass);
		addBlock(world, basePos, 8, 3, 7, decayedGlass);
		addBlock(world, basePos, 8, 3, 8, decayedGlass);
		addBlock(world, basePos, 8, 3, 9, stone);
		addBlock(world, basePos, 9, 3, 4, stone);
		addBlock(world, basePos, 9, 3, 5, stone);
		addBlock(world, basePos, 9, 3, 6, stone);
		addBlock(world, basePos, 9, 3, 7, stone);
		addBlock(world, basePos, 9, 3, 8, stone);
		addBlock(world, basePos, 9, 3, 9, stone);
	}

	@Override
	protected void spawnEntities(World world, Random rand, BlockPos basePos) {
		EntityRockyLottoman lottoman = new EntityRockyLottoman(world);

		lottoman.setLocationAndAngles(basePos.getX() + 7, basePos.getY() + 1, basePos.getZ() + 7, rand.nextFloat() * 360, 0);
		world.spawnEntity(lottoman);
	}
}
