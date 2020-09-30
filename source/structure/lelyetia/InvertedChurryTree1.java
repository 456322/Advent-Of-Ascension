package net.tslat.aoa3.structure.lelyetia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class InvertedChurryTree1 extends AoAStructure { //StructureSize: 9x40x9
	private static final IBlockState churryLeaves = BlockRegister.CHURRY_LEAVES.getDefaultState();
	private static final IBlockState churryLog = BlockRegister.CHURRY_LOG.getDefaultState();
	private static final IBlockState lelyetianLeaves = BlockRegister.LELYETIAN_LEAVES.getDefaultState();

	public InvertedChurryTree1() {
		super("InvertedChurryTree1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 0, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 0, 5, lelyetianLeaves);
		addBlock(world, basePos, 4, 0, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 0, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 0, 5, lelyetianLeaves);
		addBlock(world, basePos, 5, 0, 3, lelyetianLeaves);
		addBlock(world, basePos, 5, 0, 4, lelyetianLeaves);
		addBlock(world, basePos, 5, 0, 5, lelyetianLeaves);
		addBlock(world, basePos, 3, 1, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 1, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 1, 5, lelyetianLeaves);
		addBlock(world, basePos, 4, 1, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 1, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 1, 5, lelyetianLeaves);
		addBlock(world, basePos, 5, 1, 3, lelyetianLeaves);
		addBlock(world, basePos, 5, 1, 4, lelyetianLeaves);
		addBlock(world, basePos, 5, 1, 5, lelyetianLeaves);
		addBlock(world, basePos, 3, 2, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 2, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 2, 5, lelyetianLeaves);
		addBlock(world, basePos, 4, 2, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 2, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 2, 5, lelyetianLeaves);
		addBlock(world, basePos, 5, 2, 3, lelyetianLeaves);
		addBlock(world, basePos, 5, 2, 4, lelyetianLeaves);
		addBlock(world, basePos, 5, 2, 5, lelyetianLeaves);
		addBlock(world, basePos, 4, 3, 4, churryLog);
		addBlock(world, basePos, 4, 4, 4, churryLog);
		addBlock(world, basePos, 3, 5, 4, churryLeaves);
		addBlock(world, basePos, 4, 5, 3, churryLeaves);
		addBlock(world, basePos, 4, 5, 4, churryLog);
		addBlock(world, basePos, 4, 5, 5, churryLeaves);
		addBlock(world, basePos, 5, 5, 4, churryLeaves);
		addBlock(world, basePos, 3, 6, 3, churryLeaves);
		addBlock(world, basePos, 3, 6, 4, churryLeaves);
		addBlock(world, basePos, 3, 6, 5, churryLeaves);
		addBlock(world, basePos, 4, 6, 3, churryLeaves);
		addBlock(world, basePos, 4, 6, 4, churryLog);
		addBlock(world, basePos, 4, 6, 5, churryLeaves);
		addBlock(world, basePos, 5, 6, 3, churryLeaves);
		addBlock(world, basePos, 5, 6, 4, churryLeaves);
		addBlock(world, basePos, 5, 6, 5, churryLeaves);
		addBlock(world, basePos, 2, 7, 3, churryLeaves);
		addBlock(world, basePos, 2, 7, 4, churryLeaves);
		addBlock(world, basePos, 2, 7, 5, churryLeaves);
		addBlock(world, basePos, 3, 7, 2, churryLeaves);
		addBlock(world, basePos, 3, 7, 3, churryLeaves);
		addBlock(world, basePos, 3, 7, 4, churryLeaves);
		addBlock(world, basePos, 3, 7, 5, churryLeaves);
		addBlock(world, basePos, 3, 7, 6, churryLeaves);
		addBlock(world, basePos, 4, 7, 2, churryLeaves);
		addBlock(world, basePos, 4, 7, 3, churryLeaves);
		addBlock(world, basePos, 4, 7, 4, churryLog);
		addBlock(world, basePos, 4, 7, 5, churryLeaves);
		addBlock(world, basePos, 4, 7, 6, churryLeaves);
		addBlock(world, basePos, 5, 7, 2, churryLeaves);
		addBlock(world, basePos, 5, 7, 3, churryLeaves);
		addBlock(world, basePos, 5, 7, 4, churryLeaves);
		addBlock(world, basePos, 5, 7, 5, churryLeaves);
		addBlock(world, basePos, 5, 7, 6, churryLeaves);
		addBlock(world, basePos, 6, 7, 3, churryLeaves);
		addBlock(world, basePos, 6, 7, 4, churryLeaves);
		addBlock(world, basePos, 6, 7, 5, churryLeaves);
		addBlock(world, basePos, 0, 8, 4, churryLeaves);
		addBlock(world, basePos, 1, 8, 4, churryLeaves);
		addBlock(world, basePos, 2, 8, 3, churryLeaves);
		addBlock(world, basePos, 2, 8, 4, churryLeaves);
		addBlock(world, basePos, 2, 8, 5, churryLeaves);
		addBlock(world, basePos, 3, 8, 2, churryLeaves);
		addBlock(world, basePos, 3, 8, 3, churryLeaves);
		addBlock(world, basePos, 3, 8, 4, churryLeaves);
		addBlock(world, basePos, 3, 8, 5, churryLeaves);
		addBlock(world, basePos, 3, 8, 6, churryLeaves);
		addBlock(world, basePos, 4, 8, 0, churryLeaves);
		addBlock(world, basePos, 4, 8, 1, churryLeaves);
		addBlock(world, basePos, 4, 8, 2, churryLeaves);
		addBlock(world, basePos, 4, 8, 3, churryLeaves);
		addBlock(world, basePos, 4, 8, 4, churryLog);
		addBlock(world, basePos, 4, 8, 5, churryLeaves);
		addBlock(world, basePos, 4, 8, 6, churryLeaves);
		addBlock(world, basePos, 4, 8, 7, churryLeaves);
		addBlock(world, basePos, 4, 8, 8, churryLeaves);
		addBlock(world, basePos, 5, 8, 2, churryLeaves);
		addBlock(world, basePos, 5, 8, 3, churryLeaves);
		addBlock(world, basePos, 5, 8, 4, churryLeaves);
		addBlock(world, basePos, 5, 8, 5, churryLeaves);
		addBlock(world, basePos, 5, 8, 6, churryLeaves);
		addBlock(world, basePos, 6, 8, 3, churryLeaves);
		addBlock(world, basePos, 6, 8, 4, churryLeaves);
		addBlock(world, basePos, 6, 8, 5, churryLeaves);
		addBlock(world, basePos, 7, 8, 4, churryLeaves);
		addBlock(world, basePos, 8, 8, 4, churryLeaves);
		addBlock(world, basePos, 3, 9, 4, churryLeaves);
		addBlock(world, basePos, 4, 9, 3, churryLeaves);
		addBlock(world, basePos, 4, 9, 4, churryLog);
		addBlock(world, basePos, 4, 9, 5, churryLeaves);
		addBlock(world, basePos, 5, 9, 4, churryLeaves);
		addBlock(world, basePos, 4, 10, 4, churryLog);
		addBlock(world, basePos, 4, 11, 4, churryLog);
		addBlock(world, basePos, 4, 12, 4, churryLog);
		addBlock(world, basePos, 4, 13, 4, churryLog);
		addBlock(world, basePos, 3, 14, 4, churryLeaves);
		addBlock(world, basePos, 4, 14, 3, churryLeaves);
		addBlock(world, basePos, 4, 14, 4, churryLog);
		addBlock(world, basePos, 4, 14, 5, churryLeaves);
		addBlock(world, basePos, 5, 14, 4, churryLeaves);
		addBlock(world, basePos, 3, 15, 3, churryLeaves);
		addBlock(world, basePos, 3, 15, 4, churryLeaves);
		addBlock(world, basePos, 3, 15, 5, churryLeaves);
		addBlock(world, basePos, 4, 15, 3, churryLeaves);
		addBlock(world, basePos, 4, 15, 4, churryLog);
		addBlock(world, basePos, 4, 15, 5, churryLeaves);
		addBlock(world, basePos, 5, 15, 3, churryLeaves);
		addBlock(world, basePos, 5, 15, 4, churryLeaves);
		addBlock(world, basePos, 5, 15, 5, churryLeaves);
		addBlock(world, basePos, 2, 16, 3, churryLeaves);
		addBlock(world, basePos, 2, 16, 4, churryLeaves);
		addBlock(world, basePos, 2, 16, 5, churryLeaves);
		addBlock(world, basePos, 3, 16, 2, churryLeaves);
		addBlock(world, basePos, 3, 16, 3, churryLeaves);
		addBlock(world, basePos, 3, 16, 4, churryLeaves);
		addBlock(world, basePos, 3, 16, 5, churryLeaves);
		addBlock(world, basePos, 3, 16, 6, churryLeaves);
		addBlock(world, basePos, 4, 16, 2, churryLeaves);
		addBlock(world, basePos, 4, 16, 3, churryLeaves);
		addBlock(world, basePos, 4, 16, 4, churryLog);
		addBlock(world, basePos, 4, 16, 5, churryLeaves);
		addBlock(world, basePos, 4, 16, 6, churryLeaves);
		addBlock(world, basePos, 5, 16, 2, churryLeaves);
		addBlock(world, basePos, 5, 16, 3, churryLeaves);
		addBlock(world, basePos, 5, 16, 4, churryLeaves);
		addBlock(world, basePos, 5, 16, 5, churryLeaves);
		addBlock(world, basePos, 5, 16, 6, churryLeaves);
		addBlock(world, basePos, 6, 16, 3, churryLeaves);
		addBlock(world, basePos, 6, 16, 4, churryLeaves);
		addBlock(world, basePos, 6, 16, 5, churryLeaves);
		addBlock(world, basePos, 0, 17, 4, churryLeaves);
		addBlock(world, basePos, 1, 17, 4, churryLeaves);
		addBlock(world, basePos, 2, 17, 3, churryLeaves);
		addBlock(world, basePos, 2, 17, 4, churryLeaves);
		addBlock(world, basePos, 2, 17, 5, churryLeaves);
		addBlock(world, basePos, 3, 17, 2, churryLeaves);
		addBlock(world, basePos, 3, 17, 3, churryLeaves);
		addBlock(world, basePos, 3, 17, 4, churryLeaves);
		addBlock(world, basePos, 3, 17, 5, churryLeaves);
		addBlock(world, basePos, 3, 17, 6, churryLeaves);
		addBlock(world, basePos, 4, 17, 0, churryLeaves);
		addBlock(world, basePos, 4, 17, 1, churryLeaves);
		addBlock(world, basePos, 4, 17, 2, churryLeaves);
		addBlock(world, basePos, 4, 17, 3, churryLeaves);
		addBlock(world, basePos, 4, 17, 4, churryLog);
		addBlock(world, basePos, 4, 17, 5, churryLeaves);
		addBlock(world, basePos, 4, 17, 6, churryLeaves);
		addBlock(world, basePos, 4, 17, 7, churryLeaves);
		addBlock(world, basePos, 4, 17, 8, churryLeaves);
		addBlock(world, basePos, 5, 17, 2, churryLeaves);
		addBlock(world, basePos, 5, 17, 3, churryLeaves);
		addBlock(world, basePos, 5, 17, 4, churryLeaves);
		addBlock(world, basePos, 5, 17, 5, churryLeaves);
		addBlock(world, basePos, 5, 17, 6, churryLeaves);
		addBlock(world, basePos, 6, 17, 3, churryLeaves);
		addBlock(world, basePos, 6, 17, 4, churryLeaves);
		addBlock(world, basePos, 6, 17, 5, churryLeaves);
		addBlock(world, basePos, 7, 17, 4, churryLeaves);
		addBlock(world, basePos, 8, 17, 4, churryLeaves);
		addBlock(world, basePos, 3, 18, 4, churryLeaves);
		addBlock(world, basePos, 4, 18, 3, churryLeaves);
		addBlock(world, basePos, 4, 18, 4, churryLog);
		addBlock(world, basePos, 4, 18, 5, churryLeaves);
		addBlock(world, basePos, 5, 18, 4, churryLeaves);
		addBlock(world, basePos, 4, 19, 4, churryLog);
		addBlock(world, basePos, 4, 20, 4, churryLog);
		addBlock(world, basePos, 4, 21, 4, churryLog);
		addBlock(world, basePos, 4, 22, 4, churryLog);
		addBlock(world, basePos, 3, 23, 4, churryLeaves);
		addBlock(world, basePos, 4, 23, 3, churryLeaves);
		addBlock(world, basePos, 4, 23, 4, churryLog);
		addBlock(world, basePos, 4, 23, 5, churryLeaves);
		addBlock(world, basePos, 5, 23, 4, churryLeaves);
		addBlock(world, basePos, 3, 24, 3, churryLeaves);
		addBlock(world, basePos, 3, 24, 4, churryLeaves);
		addBlock(world, basePos, 3, 24, 5, churryLeaves);
		addBlock(world, basePos, 4, 24, 3, churryLeaves);
		addBlock(world, basePos, 4, 24, 4, churryLog);
		addBlock(world, basePos, 4, 24, 5, churryLeaves);
		addBlock(world, basePos, 5, 24, 3, churryLeaves);
		addBlock(world, basePos, 5, 24, 4, churryLeaves);
		addBlock(world, basePos, 5, 24, 5, churryLeaves);
		addBlock(world, basePos, 2, 25, 3, churryLeaves);
		addBlock(world, basePos, 2, 25, 4, churryLeaves);
		addBlock(world, basePos, 2, 25, 5, churryLeaves);
		addBlock(world, basePos, 3, 25, 2, churryLeaves);
		addBlock(world, basePos, 3, 25, 3, churryLeaves);
		addBlock(world, basePos, 3, 25, 4, churryLeaves);
		addBlock(world, basePos, 3, 25, 5, churryLeaves);
		addBlock(world, basePos, 3, 25, 6, churryLeaves);
		addBlock(world, basePos, 4, 25, 2, churryLeaves);
		addBlock(world, basePos, 4, 25, 3, churryLeaves);
		addBlock(world, basePos, 4, 25, 4, churryLog);
		addBlock(world, basePos, 4, 25, 5, churryLeaves);
		addBlock(world, basePos, 4, 25, 6, churryLeaves);
		addBlock(world, basePos, 5, 25, 2, churryLeaves);
		addBlock(world, basePos, 5, 25, 3, churryLeaves);
		addBlock(world, basePos, 5, 25, 4, churryLeaves);
		addBlock(world, basePos, 5, 25, 5, churryLeaves);
		addBlock(world, basePos, 5, 25, 6, churryLeaves);
		addBlock(world, basePos, 6, 25, 3, churryLeaves);
		addBlock(world, basePos, 6, 25, 4, churryLeaves);
		addBlock(world, basePos, 6, 25, 5, churryLeaves);
		addBlock(world, basePos, 0, 26, 4, churryLeaves);
		addBlock(world, basePos, 1, 26, 4, churryLeaves);
		addBlock(world, basePos, 2, 26, 3, churryLeaves);
		addBlock(world, basePos, 2, 26, 4, churryLeaves);
		addBlock(world, basePos, 2, 26, 5, churryLeaves);
		addBlock(world, basePos, 3, 26, 2, churryLeaves);
		addBlock(world, basePos, 3, 26, 3, churryLeaves);
		addBlock(world, basePos, 3, 26, 4, churryLeaves);
		addBlock(world, basePos, 3, 26, 5, churryLeaves);
		addBlock(world, basePos, 3, 26, 6, churryLeaves);
		addBlock(world, basePos, 4, 26, 0, churryLeaves);
		addBlock(world, basePos, 4, 26, 1, churryLeaves);
		addBlock(world, basePos, 4, 26, 2, churryLeaves);
		addBlock(world, basePos, 4, 26, 3, churryLeaves);
		addBlock(world, basePos, 4, 26, 4, churryLog);
		addBlock(world, basePos, 4, 26, 5, churryLeaves);
		addBlock(world, basePos, 4, 26, 6, churryLeaves);
		addBlock(world, basePos, 4, 26, 7, churryLeaves);
		addBlock(world, basePos, 4, 26, 8, churryLeaves);
		addBlock(world, basePos, 5, 26, 2, churryLeaves);
		addBlock(world, basePos, 5, 26, 3, churryLeaves);
		addBlock(world, basePos, 5, 26, 4, churryLeaves);
		addBlock(world, basePos, 5, 26, 5, churryLeaves);
		addBlock(world, basePos, 5, 26, 6, churryLeaves);
		addBlock(world, basePos, 6, 26, 3, churryLeaves);
		addBlock(world, basePos, 6, 26, 4, churryLeaves);
		addBlock(world, basePos, 6, 26, 5, churryLeaves);
		addBlock(world, basePos, 7, 26, 4, churryLeaves);
		addBlock(world, basePos, 8, 26, 4, churryLeaves);
		addBlock(world, basePos, 3, 27, 4, churryLeaves);
		addBlock(world, basePos, 4, 27, 3, churryLeaves);
		addBlock(world, basePos, 4, 27, 4, churryLog);
		addBlock(world, basePos, 4, 27, 5, churryLeaves);
		addBlock(world, basePos, 5, 27, 4, churryLeaves);
		addBlock(world, basePos, 4, 28, 4, churryLog);
		addBlock(world, basePos, 4, 29, 4, churryLog);
		addBlock(world, basePos, 4, 30, 4, churryLog);
		addBlock(world, basePos, 4, 31, 4, churryLog);
		addBlock(world, basePos, 3, 32, 4, churryLeaves);
		addBlock(world, basePos, 4, 32, 3, churryLeaves);
		addBlock(world, basePos, 4, 32, 4, churryLog);
		addBlock(world, basePos, 4, 32, 5, churryLeaves);
		addBlock(world, basePos, 5, 32, 4, churryLeaves);
		addBlock(world, basePos, 3, 33, 3, churryLeaves);
		addBlock(world, basePos, 3, 33, 4, churryLeaves);
		addBlock(world, basePos, 3, 33, 5, churryLeaves);
		addBlock(world, basePos, 4, 33, 3, churryLeaves);
		addBlock(world, basePos, 4, 33, 4, churryLog);
		addBlock(world, basePos, 4, 33, 5, churryLeaves);
		addBlock(world, basePos, 5, 33, 3, churryLeaves);
		addBlock(world, basePos, 5, 33, 4, churryLeaves);
		addBlock(world, basePos, 5, 33, 5, churryLeaves);
		addBlock(world, basePos, 2, 34, 3, churryLeaves);
		addBlock(world, basePos, 2, 34, 4, churryLeaves);
		addBlock(world, basePos, 2, 34, 5, churryLeaves);
		addBlock(world, basePos, 3, 34, 2, churryLeaves);
		addBlock(world, basePos, 3, 34, 3, churryLeaves);
		addBlock(world, basePos, 3, 34, 4, churryLeaves);
		addBlock(world, basePos, 3, 34, 5, churryLeaves);
		addBlock(world, basePos, 3, 34, 6, churryLeaves);
		addBlock(world, basePos, 4, 34, 2, churryLeaves);
		addBlock(world, basePos, 4, 34, 3, churryLeaves);
		addBlock(world, basePos, 4, 34, 4, churryLog);
		addBlock(world, basePos, 4, 34, 5, churryLeaves);
		addBlock(world, basePos, 4, 34, 6, churryLeaves);
		addBlock(world, basePos, 5, 34, 2, churryLeaves);
		addBlock(world, basePos, 5, 34, 3, churryLeaves);
		addBlock(world, basePos, 5, 34, 4, churryLeaves);
		addBlock(world, basePos, 5, 34, 5, churryLeaves);
		addBlock(world, basePos, 5, 34, 6, churryLeaves);
		addBlock(world, basePos, 6, 34, 3, churryLeaves);
		addBlock(world, basePos, 6, 34, 4, churryLeaves);
		addBlock(world, basePos, 6, 34, 5, churryLeaves);
		addBlock(world, basePos, 0, 35, 4, churryLeaves);
		addBlock(world, basePos, 1, 35, 4, churryLeaves);
		addBlock(world, basePos, 2, 35, 3, churryLeaves);
		addBlock(world, basePos, 2, 35, 4, churryLeaves);
		addBlock(world, basePos, 2, 35, 5, churryLeaves);
		addBlock(world, basePos, 3, 35, 2, churryLeaves);
		addBlock(world, basePos, 3, 35, 3, churryLeaves);
		addBlock(world, basePos, 3, 35, 4, churryLeaves);
		addBlock(world, basePos, 3, 35, 5, churryLeaves);
		addBlock(world, basePos, 3, 35, 6, churryLeaves);
		addBlock(world, basePos, 4, 35, 0, churryLeaves);
		addBlock(world, basePos, 4, 35, 1, churryLeaves);
		addBlock(world, basePos, 4, 35, 2, churryLeaves);
		addBlock(world, basePos, 4, 35, 3, churryLeaves);
		addBlock(world, basePos, 4, 35, 4, churryLog);
		addBlock(world, basePos, 4, 35, 5, churryLeaves);
		addBlock(world, basePos, 4, 35, 6, churryLeaves);
		addBlock(world, basePos, 4, 35, 7, churryLeaves);
		addBlock(world, basePos, 4, 35, 8, churryLeaves);
		addBlock(world, basePos, 5, 35, 2, churryLeaves);
		addBlock(world, basePos, 5, 35, 3, churryLeaves);
		addBlock(world, basePos, 5, 35, 4, churryLeaves);
		addBlock(world, basePos, 5, 35, 5, churryLeaves);
		addBlock(world, basePos, 5, 35, 6, churryLeaves);
		addBlock(world, basePos, 6, 35, 3, churryLeaves);
		addBlock(world, basePos, 6, 35, 4, churryLeaves);
		addBlock(world, basePos, 6, 35, 5, churryLeaves);
		addBlock(world, basePos, 7, 35, 4, churryLeaves);
		addBlock(world, basePos, 8, 35, 4, churryLeaves);
		addBlock(world, basePos, 3, 36, 4, churryLeaves);
		addBlock(world, basePos, 4, 36, 3, churryLeaves);
		addBlock(world, basePos, 4, 36, 4, churryLog);
		addBlock(world, basePos, 4, 36, 5, churryLeaves);
		addBlock(world, basePos, 5, 36, 4, churryLeaves);
		addBlock(world, basePos, 4, 37, 4, churryLog);
		addBlock(world, basePos, 4, 38, 4, churryLog);
		addBlock(world, basePos, 4, 39, 4, churryLog);
	}
}
