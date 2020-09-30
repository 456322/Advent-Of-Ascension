package net.tslat.aoa3.structure.lelyetia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class AchonyTree2 extends AoAStructure { //StructureSize: 7x32x7
	private static final IBlockState achonyLeaves = BlockRegister.ACHONY_LEAVES.getDefaultState();
	private static final IBlockState achonyLog = BlockRegister.ACHONY_LOG.getDefaultState();
	private static final IBlockState lelyetianLeaves = BlockRegister.LELYETIAN_LEAVES.getDefaultState();

	public AchonyTree2() {
		super("AchonyTree2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, achonyLog);
		addBlock(world, basePos, 3, 1, 3, achonyLog);
		addBlock(world, basePos, 2, 2, 2, achonyLeaves);
		addBlock(world, basePos, 2, 2, 3, achonyLeaves);
		addBlock(world, basePos, 2, 2, 4, achonyLeaves);
		addBlock(world, basePos, 3, 2, 2, achonyLeaves);
		addBlock(world, basePos, 3, 2, 3, achonyLog);
		addBlock(world, basePos, 3, 2, 4, achonyLeaves);
		addBlock(world, basePos, 4, 2, 2, achonyLeaves);
		addBlock(world, basePos, 4, 2, 3, achonyLeaves);
		addBlock(world, basePos, 4, 2, 4, achonyLeaves);
		addBlock(world, basePos, 3, 3, 3, achonyLog);
		addBlock(world, basePos, 3, 4, 3, achonyLog);
		addBlock(world, basePos, 3, 5, 3, achonyLog);
		addBlock(world, basePos, 2, 6, 2, achonyLeaves);
		addBlock(world, basePos, 2, 6, 3, achonyLeaves);
		addBlock(world, basePos, 2, 6, 4, achonyLeaves);
		addBlock(world, basePos, 3, 6, 2, achonyLeaves);
		addBlock(world, basePos, 3, 6, 3, achonyLog);
		addBlock(world, basePos, 3, 6, 4, achonyLeaves);
		addBlock(world, basePos, 4, 6, 2, achonyLeaves);
		addBlock(world, basePos, 4, 6, 3, achonyLeaves);
		addBlock(world, basePos, 4, 6, 4, achonyLeaves);
		addBlock(world, basePos, 3, 7, 3, achonyLog);
		addBlock(world, basePos, 3, 8, 3, achonyLog);
		addBlock(world, basePos, 2, 9, 2, achonyLeaves);
		addBlock(world, basePos, 2, 9, 3, achonyLeaves);
		addBlock(world, basePos, 2, 9, 4, achonyLeaves);
		addBlock(world, basePos, 3, 9, 2, achonyLeaves);
		addBlock(world, basePos, 3, 9, 3, achonyLog);
		addBlock(world, basePos, 3, 9, 4, achonyLeaves);
		addBlock(world, basePos, 4, 9, 2, achonyLeaves);
		addBlock(world, basePos, 4, 9, 3, achonyLeaves);
		addBlock(world, basePos, 4, 9, 4, achonyLeaves);
		addBlock(world, basePos, 3, 10, 3, achonyLog);
		addBlock(world, basePos, 3, 11, 3, achonyLog);
		addBlock(world, basePos, 3, 12, 3, achonyLog);
		addBlock(world, basePos, 3, 13, 3, achonyLog);
		addBlock(world, basePos, 2, 14, 2, achonyLeaves);
		addBlock(world, basePos, 2, 14, 3, achonyLeaves);
		addBlock(world, basePos, 2, 14, 4, achonyLeaves);
		addBlock(world, basePos, 3, 14, 2, achonyLeaves);
		addBlock(world, basePos, 3, 14, 3, achonyLog);
		addBlock(world, basePos, 3, 14, 4, achonyLeaves);
		addBlock(world, basePos, 4, 14, 2, achonyLeaves);
		addBlock(world, basePos, 4, 14, 3, achonyLeaves);
		addBlock(world, basePos, 4, 14, 4, achonyLeaves);
		addBlock(world, basePos, 3, 15, 3, achonyLog);
		addBlock(world, basePos, 3, 16, 3, achonyLog);
		addBlock(world, basePos, 3, 17, 3, achonyLog);
		addBlock(world, basePos, 2, 18, 2, achonyLeaves);
		addBlock(world, basePos, 2, 18, 3, achonyLeaves);
		addBlock(world, basePos, 2, 18, 4, achonyLeaves);
		addBlock(world, basePos, 3, 18, 2, achonyLeaves);
		addBlock(world, basePos, 3, 18, 3, achonyLog);
		addBlock(world, basePos, 3, 18, 4, achonyLeaves);
		addBlock(world, basePos, 4, 18, 2, achonyLeaves);
		addBlock(world, basePos, 4, 18, 3, achonyLeaves);
		addBlock(world, basePos, 4, 18, 4, achonyLeaves);
		addBlock(world, basePos, 3, 19, 3, achonyLog);
		addBlock(world, basePos, 3, 20, 3, achonyLog);
		addBlock(world, basePos, 2, 21, 2, achonyLeaves);
		addBlock(world, basePos, 2, 21, 3, achonyLeaves);
		addBlock(world, basePos, 2, 21, 4, achonyLeaves);
		addBlock(world, basePos, 3, 21, 2, achonyLeaves);
		addBlock(world, basePos, 3, 21, 3, achonyLog);
		addBlock(world, basePos, 3, 21, 4, achonyLeaves);
		addBlock(world, basePos, 4, 21, 2, achonyLeaves);
		addBlock(world, basePos, 4, 21, 3, achonyLeaves);
		addBlock(world, basePos, 4, 21, 4, achonyLeaves);
		addBlock(world, basePos, 1, 22, 1, achonyLeaves);
		addBlock(world, basePos, 1, 22, 2, achonyLeaves);
		addBlock(world, basePos, 1, 22, 3, achonyLeaves);
		addBlock(world, basePos, 1, 22, 4, achonyLeaves);
		addBlock(world, basePos, 1, 22, 5, achonyLeaves);
		addBlock(world, basePos, 2, 22, 1, achonyLeaves);
		addBlock(world, basePos, 2, 22, 2, achonyLeaves);
		addBlock(world, basePos, 2, 22, 3, achonyLeaves);
		addBlock(world, basePos, 2, 22, 4, achonyLeaves);
		addBlock(world, basePos, 2, 22, 5, achonyLeaves);
		addBlock(world, basePos, 3, 22, 1, achonyLeaves);
		addBlock(world, basePos, 3, 22, 2, achonyLeaves);
		addBlock(world, basePos, 3, 22, 3, achonyLeaves);
		addBlock(world, basePos, 3, 22, 4, achonyLeaves);
		addBlock(world, basePos, 3, 22, 5, achonyLeaves);
		addBlock(world, basePos, 4, 22, 1, achonyLeaves);
		addBlock(world, basePos, 4, 22, 2, achonyLeaves);
		addBlock(world, basePos, 4, 22, 3, achonyLeaves);
		addBlock(world, basePos, 4, 22, 4, achonyLeaves);
		addBlock(world, basePos, 4, 22, 5, achonyLeaves);
		addBlock(world, basePos, 5, 22, 1, achonyLeaves);
		addBlock(world, basePos, 5, 22, 2, achonyLeaves);
		addBlock(world, basePos, 5, 22, 3, achonyLeaves);
		addBlock(world, basePos, 5, 22, 4, achonyLeaves);
		addBlock(world, basePos, 5, 22, 5, achonyLeaves);
		addBlock(world, basePos, 0, 23, 0, achonyLeaves);
		addBlock(world, basePos, 0, 23, 1, achonyLeaves);
		addBlock(world, basePos, 0, 23, 2, achonyLeaves);
		addBlock(world, basePos, 0, 23, 3, achonyLeaves);
		addBlock(world, basePos, 0, 23, 4, achonyLeaves);
		addBlock(world, basePos, 0, 23, 5, achonyLeaves);
		addBlock(world, basePos, 0, 23, 6, achonyLeaves);
		addBlock(world, basePos, 1, 23, 0, achonyLeaves);
		addBlock(world, basePos, 1, 23, 6, achonyLeaves);
		addBlock(world, basePos, 2, 23, 0, achonyLeaves);
		addBlock(world, basePos, 2, 23, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 23, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 23, 4, lelyetianLeaves);
		addBlock(world, basePos, 2, 23, 6, achonyLeaves);
		addBlock(world, basePos, 3, 23, 0, achonyLeaves);
		addBlock(world, basePos, 3, 23, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 23, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 23, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 23, 6, achonyLeaves);
		addBlock(world, basePos, 4, 23, 0, achonyLeaves);
		addBlock(world, basePos, 4, 23, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 23, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 23, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 23, 6, achonyLeaves);
		addBlock(world, basePos, 5, 23, 0, achonyLeaves);
		addBlock(world, basePos, 5, 23, 6, achonyLeaves);
		addBlock(world, basePos, 6, 23, 0, achonyLeaves);
		addBlock(world, basePos, 6, 23, 1, achonyLeaves);
		addBlock(world, basePos, 6, 23, 2, achonyLeaves);
		addBlock(world, basePos, 6, 23, 3, achonyLeaves);
		addBlock(world, basePos, 6, 23, 4, achonyLeaves);
		addBlock(world, basePos, 6, 23, 5, achonyLeaves);
		addBlock(world, basePos, 6, 23, 6, achonyLeaves);
		addBlock(world, basePos, 0, 24, 0, achonyLeaves);
		addBlock(world, basePos, 0, 24, 1, achonyLeaves);
		addBlock(world, basePos, 0, 24, 5, achonyLeaves);
		addBlock(world, basePos, 0, 24, 6, achonyLeaves);
		addBlock(world, basePos, 1, 24, 0, achonyLeaves);
		addBlock(world, basePos, 1, 24, 6, achonyLeaves);
		addBlock(world, basePos, 2, 24, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 24, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 24, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 24, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 24, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 24, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 24, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 24, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 24, 4, lelyetianLeaves);
		addBlock(world, basePos, 5, 24, 0, achonyLeaves);
		addBlock(world, basePos, 5, 24, 6, achonyLeaves);
		addBlock(world, basePos, 6, 24, 0, achonyLeaves);
		addBlock(world, basePos, 6, 24, 1, achonyLeaves);
		addBlock(world, basePos, 6, 24, 5, achonyLeaves);
		addBlock(world, basePos, 6, 24, 6, achonyLeaves);
		addBlock(world, basePos, 0, 25, 0, achonyLeaves);
		addBlock(world, basePos, 0, 25, 6, achonyLeaves);
		addBlock(world, basePos, 2, 25, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 25, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 25, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 25, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 25, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 25, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 25, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 25, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 25, 4, lelyetianLeaves);
		addBlock(world, basePos, 6, 25, 0, achonyLeaves);
		addBlock(world, basePos, 6, 25, 6, achonyLeaves);
		addBlock(world, basePos, 2, 26, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 26, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 26, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 26, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 26, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 26, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 26, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 26, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 26, 4, lelyetianLeaves);
		addBlock(world, basePos, 2, 27, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 27, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 27, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 27, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 27, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 27, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 27, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 27, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 27, 4, lelyetianLeaves);
		addBlock(world, basePos, 2, 28, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 28, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 28, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 28, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 28, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 28, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 28, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 28, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 28, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 29, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 30, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 31, 3, lelyetianLeaves);
	}
}
