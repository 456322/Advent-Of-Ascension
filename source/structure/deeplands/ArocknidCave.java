package net.tslat.aoa3.structure.deeplands;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ArocknidCave extends AoAStructure { //StructureSize: 15x9x15
	private static final IBlockState stone = BlockRegister.DEEPLANDS_STONE.getDefaultState();
	private static final IBlockState arocknidSpawner = BlockRegister.AROCKNID_SPAWNER.getDefaultState();

	public ArocknidCave() {
		super("ArocknidCave");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 5, stone);
		addBlock(world, basePos, 0, 0, 9, stone);
		addBlock(world, basePos, 1, 0, 3, stone);
		addBlock(world, basePos, 1, 0, 4, stone);
		addBlock(world, basePos, 1, 0, 10, stone);
		addBlock(world, basePos, 1, 0, 11, stone);
		addBlock(world, basePos, 2, 0, 2, stone);
		addBlock(world, basePos, 2, 0, 12, stone);
		addBlock(world, basePos, 3, 0, 1, stone);
		addBlock(world, basePos, 3, 0, 13, stone);
		addBlock(world, basePos, 4, 0, 1, stone);
		addBlock(world, basePos, 4, 0, 13, stone);
		addBlock(world, basePos, 5, 0, 0, stone);
		addBlock(world, basePos, 5, 0, 14, stone);
		addBlock(world, basePos, 7, 0, 7, arocknidSpawner);
		addBlock(world, basePos, 9, 0, 0, stone);
		addBlock(world, basePos, 9, 0, 14, stone);
		addBlock(world, basePos, 10, 0, 1, stone);
		addBlock(world, basePos, 10, 0, 13, stone);
		addBlock(world, basePos, 11, 0, 1, stone);
		addBlock(world, basePos, 11, 0, 13, stone);
		addBlock(world, basePos, 12, 0, 2, stone);
		addBlock(world, basePos, 12, 0, 12, stone);
		addBlock(world, basePos, 13, 0, 3, stone);
		addBlock(world, basePos, 13, 0, 4, stone);
		addBlock(world, basePos, 13, 0, 10, stone);
		addBlock(world, basePos, 13, 0, 11, stone);
		addBlock(world, basePos, 14, 0, 5, stone);
		addBlock(world, basePos, 14, 0, 9, stone);
		addBlock(world, basePos, 0, 1, 5, stone);
		addBlock(world, basePos, 0, 1, 9, stone);
		addBlock(world, basePos, 1, 1, 3, stone);
		addBlock(world, basePos, 1, 1, 4, stone);
		addBlock(world, basePos, 1, 1, 10, stone);
		addBlock(world, basePos, 1, 1, 11, stone);
		addBlock(world, basePos, 2, 1, 2, stone);
		addBlock(world, basePos, 2, 1, 12, stone);
		addBlock(world, basePos, 3, 1, 1, stone);
		addBlock(world, basePos, 3, 1, 13, stone);
		addBlock(world, basePos, 4, 1, 1, stone);
		addBlock(world, basePos, 4, 1, 13, stone);
		addBlock(world, basePos, 5, 1, 0, stone);
		addBlock(world, basePos, 5, 1, 14, stone);
		addBlock(world, basePos, 9, 1, 0, stone);
		addBlock(world, basePos, 9, 1, 14, stone);
		addBlock(world, basePos, 10, 1, 1, stone);
		addBlock(world, basePos, 10, 1, 13, stone);
		addBlock(world, basePos, 11, 1, 1, stone);
		addBlock(world, basePos, 11, 1, 13, stone);
		addBlock(world, basePos, 12, 1, 2, stone);
		addBlock(world, basePos, 12, 1, 12, stone);
		addBlock(world, basePos, 13, 1, 3, stone);
		addBlock(world, basePos, 13, 1, 4, stone);
		addBlock(world, basePos, 13, 1, 10, stone);
		addBlock(world, basePos, 13, 1, 11, stone);
		addBlock(world, basePos, 14, 1, 5, stone);
		addBlock(world, basePos, 14, 1, 9, stone);
		addBlock(world, basePos, 0, 2, 5, stone);
		addBlock(world, basePos, 0, 2, 9, stone);
		addBlock(world, basePos, 1, 2, 3, stone);
		addBlock(world, basePos, 1, 2, 4, stone);
		addBlock(world, basePos, 1, 2, 10, stone);
		addBlock(world, basePos, 1, 2, 11, stone);
		addBlock(world, basePos, 2, 2, 2, stone);
		addBlock(world, basePos, 2, 2, 12, stone);
		addBlock(world, basePos, 3, 2, 1, stone);
		addBlock(world, basePos, 3, 2, 13, stone);
		addBlock(world, basePos, 4, 2, 1, stone);
		addBlock(world, basePos, 4, 2, 13, stone);
		addBlock(world, basePos, 5, 2, 0, stone);
		addBlock(world, basePos, 5, 2, 14, stone);
		addBlock(world, basePos, 9, 2, 0, stone);
		addBlock(world, basePos, 9, 2, 14, stone);
		addBlock(world, basePos, 10, 2, 1, stone);
		addBlock(world, basePos, 10, 2, 13, stone);
		addBlock(world, basePos, 11, 2, 1, stone);
		addBlock(world, basePos, 11, 2, 13, stone);
		addBlock(world, basePos, 12, 2, 2, stone);
		addBlock(world, basePos, 12, 2, 12, stone);
		addBlock(world, basePos, 13, 2, 3, stone);
		addBlock(world, basePos, 13, 2, 4, stone);
		addBlock(world, basePos, 13, 2, 10, stone);
		addBlock(world, basePos, 13, 2, 11, stone);
		addBlock(world, basePos, 14, 2, 5, stone);
		addBlock(world, basePos, 14, 2, 9, stone);
		addBlock(world, basePos, 0, 3, 6, stone);
		addBlock(world, basePos, 0, 3, 7, stone);
		addBlock(world, basePos, 0, 3, 8, stone);
		addBlock(world, basePos, 1, 3, 3, stone);
		addBlock(world, basePos, 1, 3, 4, stone);
		addBlock(world, basePos, 1, 3, 5, stone);
		addBlock(world, basePos, 1, 3, 9, stone);
		addBlock(world, basePos, 1, 3, 10, stone);
		addBlock(world, basePos, 1, 3, 11, stone);
		addBlock(world, basePos, 2, 3, 2, stone);
		addBlock(world, basePos, 2, 3, 12, stone);
		addBlock(world, basePos, 3, 3, 1, stone);
		addBlock(world, basePos, 3, 3, 13, stone);
		addBlock(world, basePos, 4, 3, 1, stone);
		addBlock(world, basePos, 4, 3, 13, stone);
		addBlock(world, basePos, 5, 3, 1, stone);
		addBlock(world, basePos, 5, 3, 13, stone);
		addBlock(world, basePos, 6, 3, 0, stone);
		addBlock(world, basePos, 6, 3, 14, stone);
		addBlock(world, basePos, 7, 3, 0, stone);
		addBlock(world, basePos, 7, 3, 14, stone);
		addBlock(world, basePos, 8, 3, 0, stone);
		addBlock(world, basePos, 8, 3, 14, stone);
		addBlock(world, basePos, 9, 3, 1, stone);
		addBlock(world, basePos, 9, 3, 13, stone);
		addBlock(world, basePos, 10, 3, 1, stone);
		addBlock(world, basePos, 10, 3, 13, stone);
		addBlock(world, basePos, 11, 3, 1, stone);
		addBlock(world, basePos, 11, 3, 13, stone);
		addBlock(world, basePos, 12, 3, 2, stone);
		addBlock(world, basePos, 12, 3, 12, stone);
		addBlock(world, basePos, 13, 3, 3, stone);
		addBlock(world, basePos, 13, 3, 4, stone);
		addBlock(world, basePos, 13, 3, 5, stone);
		addBlock(world, basePos, 13, 3, 9, stone);
		addBlock(world, basePos, 13, 3, 10, stone);
		addBlock(world, basePos, 13, 3, 11, stone);
		addBlock(world, basePos, 14, 3, 6, stone);
		addBlock(world, basePos, 14, 3, 7, stone);
		addBlock(world, basePos, 14, 3, 8, stone);
		addBlock(world, basePos, 1, 4, 4, stone);
		addBlock(world, basePos, 1, 4, 5, stone);
		addBlock(world, basePos, 1, 4, 6, stone);
		addBlock(world, basePos, 1, 4, 7, stone);
		addBlock(world, basePos, 1, 4, 8, stone);
		addBlock(world, basePos, 1, 4, 9, stone);
		addBlock(world, basePos, 1, 4, 10, stone);
		addBlock(world, basePos, 2, 4, 3, stone);
		addBlock(world, basePos, 2, 4, 11, stone);
		addBlock(world, basePos, 3, 4, 2, stone);
		addBlock(world, basePos, 3, 4, 12, stone);
		addBlock(world, basePos, 4, 4, 1, stone);
		addBlock(world, basePos, 4, 4, 13, stone);
		addBlock(world, basePos, 5, 4, 1, stone);
		addBlock(world, basePos, 5, 4, 13, stone);
		addBlock(world, basePos, 6, 4, 1, stone);
		addBlock(world, basePos, 6, 4, 13, stone);
		addBlock(world, basePos, 7, 4, 1, stone);
		addBlock(world, basePos, 7, 4, 13, stone);
		addBlock(world, basePos, 8, 4, 1, stone);
		addBlock(world, basePos, 8, 4, 13, stone);
		addBlock(world, basePos, 9, 4, 1, stone);
		addBlock(world, basePos, 9, 4, 13, stone);
		addBlock(world, basePos, 10, 4, 1, stone);
		addBlock(world, basePos, 10, 4, 13, stone);
		addBlock(world, basePos, 11, 4, 2, stone);
		addBlock(world, basePos, 11, 4, 12, stone);
		addBlock(world, basePos, 12, 4, 3, stone);
		addBlock(world, basePos, 12, 4, 11, stone);
		addBlock(world, basePos, 13, 4, 4, stone);
		addBlock(world, basePos, 13, 4, 5, stone);
		addBlock(world, basePos, 13, 4, 6, stone);
		addBlock(world, basePos, 13, 4, 7, stone);
		addBlock(world, basePos, 13, 4, 8, stone);
		addBlock(world, basePos, 13, 4, 9, stone);
		addBlock(world, basePos, 13, 4, 10, stone);
		addBlock(world, basePos, 1, 5, 5, stone);
		addBlock(world, basePos, 1, 5, 6, stone);
		addBlock(world, basePos, 1, 5, 7, stone);
		addBlock(world, basePos, 1, 5, 8, stone);
		addBlock(world, basePos, 1, 5, 9, stone);
		addBlock(world, basePos, 2, 5, 4, stone);
		addBlock(world, basePos, 2, 5, 10, stone);
		addBlock(world, basePos, 3, 5, 3, stone);
		addBlock(world, basePos, 3, 5, 11, stone);
		addBlock(world, basePos, 4, 5, 2, stone);
		addBlock(world, basePos, 4, 5, 12, stone);
		addBlock(world, basePos, 5, 5, 1, stone);
		addBlock(world, basePos, 5, 5, 13, stone);
		addBlock(world, basePos, 6, 5, 1, stone);
		addBlock(world, basePos, 6, 5, 13, stone);
		addBlock(world, basePos, 7, 5, 1, stone);
		addBlock(world, basePos, 7, 5, 13, stone);
		addBlock(world, basePos, 8, 5, 1, stone);
		addBlock(world, basePos, 8, 5, 13, stone);
		addBlock(world, basePos, 9, 5, 1, stone);
		addBlock(world, basePos, 9, 5, 13, stone);
		addBlock(world, basePos, 10, 5, 2, stone);
		addBlock(world, basePos, 10, 5, 12, stone);
		addBlock(world, basePos, 11, 5, 3, stone);
		addBlock(world, basePos, 11, 5, 11, stone);
		addBlock(world, basePos, 12, 5, 4, stone);
		addBlock(world, basePos, 12, 5, 10, stone);
		addBlock(world, basePos, 13, 5, 5, stone);
		addBlock(world, basePos, 13, 5, 6, stone);
		addBlock(world, basePos, 13, 5, 7, stone);
		addBlock(world, basePos, 13, 5, 8, stone);
		addBlock(world, basePos, 13, 5, 9, stone);
		addBlock(world, basePos, 2, 6, 5, stone);
		addBlock(world, basePos, 2, 6, 6, stone);
		addBlock(world, basePos, 2, 6, 7, stone);
		addBlock(world, basePos, 2, 6, 8, stone);
		addBlock(world, basePos, 2, 6, 9, stone);
		addBlock(world, basePos, 3, 6, 4, stone);
		addBlock(world, basePos, 3, 6, 10, stone);
		addBlock(world, basePos, 4, 6, 3, stone);
		addBlock(world, basePos, 4, 6, 11, stone);
		addBlock(world, basePos, 5, 6, 2, stone);
		addBlock(world, basePos, 5, 6, 12, stone);
		addBlock(world, basePos, 6, 6, 2, stone);
		addBlock(world, basePos, 6, 6, 12, stone);
		addBlock(world, basePos, 7, 6, 2, stone);
		addBlock(world, basePos, 7, 6, 12, stone);
		addBlock(world, basePos, 8, 6, 2, stone);
		addBlock(world, basePos, 8, 6, 12, stone);
		addBlock(world, basePos, 9, 6, 2, stone);
		addBlock(world, basePos, 9, 6, 12, stone);
		addBlock(world, basePos, 10, 6, 3, stone);
		addBlock(world, basePos, 10, 6, 11, stone);
		addBlock(world, basePos, 11, 6, 4, stone);
		addBlock(world, basePos, 11, 6, 10, stone);
		addBlock(world, basePos, 12, 6, 5, stone);
		addBlock(world, basePos, 12, 6, 6, stone);
		addBlock(world, basePos, 12, 6, 7, stone);
		addBlock(world, basePos, 12, 6, 8, stone);
		addBlock(world, basePos, 12, 6, 9, stone);
		addBlock(world, basePos, 3, 7, 5, stone);
		addBlock(world, basePos, 3, 7, 6, stone);
		addBlock(world, basePos, 3, 7, 7, stone);
		addBlock(world, basePos, 3, 7, 8, stone);
		addBlock(world, basePos, 3, 7, 9, stone);
		addBlock(world, basePos, 4, 7, 4, stone);
		addBlock(world, basePos, 4, 7, 5, stone);
		addBlock(world, basePos, 4, 7, 6, stone);
		addBlock(world, basePos, 4, 7, 7, stone);
		addBlock(world, basePos, 4, 7, 8, stone);
		addBlock(world, basePos, 4, 7, 9, stone);
		addBlock(world, basePos, 4, 7, 10, stone);
		addBlock(world, basePos, 5, 7, 3, stone);
		addBlock(world, basePos, 5, 7, 4, stone);
		addBlock(world, basePos, 5, 7, 5, stone);
		addBlock(world, basePos, 5, 7, 9, stone);
		addBlock(world, basePos, 5, 7, 10, stone);
		addBlock(world, basePos, 5, 7, 11, stone);
		addBlock(world, basePos, 6, 7, 3, stone);
		addBlock(world, basePos, 6, 7, 4, stone);
		addBlock(world, basePos, 6, 7, 10, stone);
		addBlock(world, basePos, 6, 7, 11, stone);
		addBlock(world, basePos, 7, 7, 3, stone);
		addBlock(world, basePos, 7, 7, 4, stone);
		addBlock(world, basePos, 7, 7, 10, stone);
		addBlock(world, basePos, 7, 7, 11, stone);
		addBlock(world, basePos, 8, 7, 3, stone);
		addBlock(world, basePos, 8, 7, 4, stone);
		addBlock(world, basePos, 8, 7, 10, stone);
		addBlock(world, basePos, 8, 7, 11, stone);
		addBlock(world, basePos, 9, 7, 3, stone);
		addBlock(world, basePos, 9, 7, 4, stone);
		addBlock(world, basePos, 9, 7, 5, stone);
		addBlock(world, basePos, 9, 7, 9, stone);
		addBlock(world, basePos, 9, 7, 10, stone);
		addBlock(world, basePos, 9, 7, 11, stone);
		addBlock(world, basePos, 10, 7, 4, stone);
		addBlock(world, basePos, 10, 7, 5, stone);
		addBlock(world, basePos, 10, 7, 6, stone);
		addBlock(world, basePos, 10, 7, 7, stone);
		addBlock(world, basePos, 10, 7, 8, stone);
		addBlock(world, basePos, 10, 7, 9, stone);
		addBlock(world, basePos, 10, 7, 10, stone);
		addBlock(world, basePos, 11, 7, 5, stone);
		addBlock(world, basePos, 11, 7, 6, stone);
		addBlock(world, basePos, 11, 7, 7, stone);
		addBlock(world, basePos, 11, 7, 8, stone);
		addBlock(world, basePos, 11, 7, 9, stone);
		addBlock(world, basePos, 5, 8, 6, stone);
		addBlock(world, basePos, 5, 8, 7, stone);
		addBlock(world, basePos, 5, 8, 8, stone);
		addBlock(world, basePos, 6, 8, 5, stone);
		addBlock(world, basePos, 6, 8, 6, stone);
		addBlock(world, basePos, 6, 8, 7, stone);
		addBlock(world, basePos, 6, 8, 8, stone);
		addBlock(world, basePos, 6, 8, 9, stone);
		addBlock(world, basePos, 7, 8, 5, stone);
		addBlock(world, basePos, 7, 8, 6, stone);
		addBlock(world, basePos, 7, 8, 7, stone);
		addBlock(world, basePos, 7, 8, 8, stone);
		addBlock(world, basePos, 7, 8, 9, stone);
		addBlock(world, basePos, 8, 8, 5, stone);
		addBlock(world, basePos, 8, 8, 6, stone);
		addBlock(world, basePos, 8, 8, 7, stone);
		addBlock(world, basePos, 8, 8, 8, stone);
		addBlock(world, basePos, 8, 8, 9, stone);
		addBlock(world, basePos, 9, 8, 6, stone);
		addBlock(world, basePos, 9, 8, 7, stone);
		addBlock(world, basePos, 9, 8, 8, stone);
	}
}
