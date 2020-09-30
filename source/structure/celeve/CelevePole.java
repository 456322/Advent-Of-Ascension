package net.tslat.aoa3.structure.celeve;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CelevePole extends AoAStructure { //StructureSize: 6x26x6
	private static final IBlockState redCelevus = BlockRegister.RED_CELEVUS_LEAVES.getDefaultState();
	private static final IBlockState celevusStem = BlockRegister.CELEVE_STEM.getDefaultState();

	public CelevePole() {
		super("CelevePole");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 2, celevusStem);
		addBlock(world, basePos, 2, 0, 3, celevusStem);
		addBlock(world, basePos, 3, 0, 2, celevusStem);
		addBlock(world, basePos, 3, 0, 3, redCelevus);
		addBlock(world, basePos, 2, 1, 2, celevusStem);
		addBlock(world, basePos, 2, 1, 3, celevusStem);
		addBlock(world, basePos, 3, 1, 2, redCelevus);
		addBlock(world, basePos, 3, 1, 3, celevusStem);
		addBlock(world, basePos, 2, 2, 2, redCelevus);
		addBlock(world, basePos, 2, 2, 3, celevusStem);
		addBlock(world, basePos, 3, 2, 2, celevusStem);
		addBlock(world, basePos, 3, 2, 3, celevusStem);
		addBlock(world, basePos, 2, 3, 2, celevusStem);
		addBlock(world, basePos, 2, 3, 3, redCelevus);
		addBlock(world, basePos, 3, 3, 2, celevusStem);
		addBlock(world, basePos, 3, 3, 3, celevusStem);
		addBlock(world, basePos, 2, 4, 2, celevusStem);
		addBlock(world, basePos, 2, 4, 3, celevusStem);
		addBlock(world, basePos, 3, 4, 2, celevusStem);
		addBlock(world, basePos, 3, 4, 3, redCelevus);
		addBlock(world, basePos, 2, 5, 2, celevusStem);
		addBlock(world, basePos, 2, 5, 3, celevusStem);
		addBlock(world, basePos, 3, 5, 2, redCelevus);
		addBlock(world, basePos, 3, 5, 3, celevusStem);
		addBlock(world, basePos, 2, 6, 2, redCelevus);
		addBlock(world, basePos, 2, 6, 3, celevusStem);
		addBlock(world, basePos, 3, 6, 2, celevusStem);
		addBlock(world, basePos, 3, 6, 3, celevusStem);
		addBlock(world, basePos, 2, 7, 2, celevusStem);
		addBlock(world, basePos, 2, 7, 3, redCelevus);
		addBlock(world, basePos, 3, 7, 2, celevusStem);
		addBlock(world, basePos, 3, 7, 3, celevusStem);
		addBlock(world, basePos, 2, 8, 2, celevusStem);
		addBlock(world, basePos, 2, 8, 3, celevusStem);
		addBlock(world, basePos, 3, 8, 2, celevusStem);
		addBlock(world, basePos, 3, 8, 3, redCelevus);
		addBlock(world, basePos, 2, 9, 2, celevusStem);
		addBlock(world, basePos, 2, 9, 3, celevusStem);
		addBlock(world, basePos, 3, 9, 2, redCelevus);
		addBlock(world, basePos, 3, 9, 3, celevusStem);
		addBlock(world, basePos, 2, 10, 2, redCelevus);
		addBlock(world, basePos, 2, 10, 3, celevusStem);
		addBlock(world, basePos, 3, 10, 2, celevusStem);
		addBlock(world, basePos, 3, 10, 3, celevusStem);
		addBlock(world, basePos, 2, 11, 2, celevusStem);
		addBlock(world, basePos, 2, 11, 3, redCelevus);
		addBlock(world, basePos, 3, 11, 2, celevusStem);
		addBlock(world, basePos, 3, 11, 3, celevusStem);
		addBlock(world, basePos, 2, 12, 2, celevusStem);
		addBlock(world, basePos, 2, 12, 3, celevusStem);
		addBlock(world, basePos, 3, 12, 2, celevusStem);
		addBlock(world, basePos, 3, 12, 3, redCelevus);
		addBlock(world, basePos, 2, 13, 2, celevusStem);
		addBlock(world, basePos, 2, 13, 3, celevusStem);
		addBlock(world, basePos, 3, 13, 2, redCelevus);
		addBlock(world, basePos, 3, 13, 3, celevusStem);
		addBlock(world, basePos, 2, 14, 2, redCelevus);
		addBlock(world, basePos, 2, 14, 3, celevusStem);
		addBlock(world, basePos, 3, 14, 2, celevusStem);
		addBlock(world, basePos, 3, 14, 3, celevusStem);
		addBlock(world, basePos, 2, 15, 2, celevusStem);
		addBlock(world, basePos, 2, 15, 3, redCelevus);
		addBlock(world, basePos, 3, 15, 2, celevusStem);
		addBlock(world, basePos, 3, 15, 3, celevusStem);
		addBlock(world, basePos, 2, 16, 2, celevusStem);
		addBlock(world, basePos, 2, 16, 3, celevusStem);
		addBlock(world, basePos, 3, 16, 2, celevusStem);
		addBlock(world, basePos, 3, 16, 3, redCelevus);
		addBlock(world, basePos, 2, 17, 2, celevusStem);
		addBlock(world, basePos, 2, 17, 3, celevusStem);
		addBlock(world, basePos, 3, 17, 2, redCelevus);
		addBlock(world, basePos, 3, 17, 3, celevusStem);
		addBlock(world, basePos, 2, 18, 2, redCelevus);
		addBlock(world, basePos, 2, 18, 3, celevusStem);
		addBlock(world, basePos, 3, 18, 2, celevusStem);
		addBlock(world, basePos, 3, 18, 3, celevusStem);
		addBlock(world, basePos, 2, 19, 2, celevusStem);
		addBlock(world, basePos, 2, 19, 3, redCelevus);
		addBlock(world, basePos, 3, 19, 2, celevusStem);
		addBlock(world, basePos, 3, 19, 3, celevusStem);
		addBlock(world, basePos, 1, 20, 1, redCelevus);
		addBlock(world, basePos, 1, 20, 2, redCelevus);
		addBlock(world, basePos, 1, 20, 3, redCelevus);
		addBlock(world, basePos, 1, 20, 4, redCelevus);
		addBlock(world, basePos, 2, 20, 1, redCelevus);
		addBlock(world, basePos, 2, 20, 2, redCelevus);
		addBlock(world, basePos, 2, 20, 3, redCelevus);
		addBlock(world, basePos, 2, 20, 4, redCelevus);
		addBlock(world, basePos, 3, 20, 1, redCelevus);
		addBlock(world, basePos, 3, 20, 2, redCelevus);
		addBlock(world, basePos, 3, 20, 3, redCelevus);
		addBlock(world, basePos, 3, 20, 4, redCelevus);
		addBlock(world, basePos, 4, 20, 1, redCelevus);
		addBlock(world, basePos, 4, 20, 2, redCelevus);
		addBlock(world, basePos, 4, 20, 3, redCelevus);
		addBlock(world, basePos, 4, 20, 4, redCelevus);
		addBlock(world, basePos, 0, 21, 0, redCelevus);
		addBlock(world, basePos, 0, 21, 1, redCelevus);
		addBlock(world, basePos, 0, 21, 2, redCelevus);
		addBlock(world, basePos, 0, 21, 3, redCelevus);
		addBlock(world, basePos, 0, 21, 4, redCelevus);
		addBlock(world, basePos, 0, 21, 5, redCelevus);
		addBlock(world, basePos, 1, 21, 0, redCelevus);
		addBlock(world, basePos, 1, 21, 1, redCelevus);
		addBlock(world, basePos, 1, 21, 2, redCelevus);
		addBlock(world, basePos, 1, 21, 3, redCelevus);
		addBlock(world, basePos, 1, 21, 4, redCelevus);
		addBlock(world, basePos, 1, 21, 5, redCelevus);
		addBlock(world, basePos, 2, 21, 0, redCelevus);
		addBlock(world, basePos, 2, 21, 1, redCelevus);
		addBlock(world, basePos, 2, 21, 2, redCelevus);
		addBlock(world, basePos, 2, 21, 3, redCelevus);
		addBlock(world, basePos, 2, 21, 4, redCelevus);
		addBlock(world, basePos, 2, 21, 5, redCelevus);
		addBlock(world, basePos, 3, 21, 0, redCelevus);
		addBlock(world, basePos, 3, 21, 1, redCelevus);
		addBlock(world, basePos, 3, 21, 2, redCelevus);
		addBlock(world, basePos, 3, 21, 3, redCelevus);
		addBlock(world, basePos, 3, 21, 4, redCelevus);
		addBlock(world, basePos, 3, 21, 5, redCelevus);
		addBlock(world, basePos, 4, 21, 0, redCelevus);
		addBlock(world, basePos, 4, 21, 1, redCelevus);
		addBlock(world, basePos, 4, 21, 2, redCelevus);
		addBlock(world, basePos, 4, 21, 3, redCelevus);
		addBlock(world, basePos, 4, 21, 4, redCelevus);
		addBlock(world, basePos, 4, 21, 5, redCelevus);
		addBlock(world, basePos, 5, 21, 0, redCelevus);
		addBlock(world, basePos, 5, 21, 1, redCelevus);
		addBlock(world, basePos, 5, 21, 2, redCelevus);
		addBlock(world, basePos, 5, 21, 3, redCelevus);
		addBlock(world, basePos, 5, 21, 4, redCelevus);
		addBlock(world, basePos, 5, 21, 5, redCelevus);
		addBlock(world, basePos, 0, 22, 0, redCelevus);
		addBlock(world, basePos, 0, 22, 1, redCelevus);
		addBlock(world, basePos, 0, 22, 2, redCelevus);
		addBlock(world, basePos, 0, 22, 3, redCelevus);
		addBlock(world, basePos, 0, 22, 4, redCelevus);
		addBlock(world, basePos, 0, 22, 5, redCelevus);
		addBlock(world, basePos, 1, 22, 0, redCelevus);
		addBlock(world, basePos, 1, 22, 1, redCelevus);
		addBlock(world, basePos, 1, 22, 2, redCelevus);
		addBlock(world, basePos, 1, 22, 3, redCelevus);
		addBlock(world, basePos, 1, 22, 4, redCelevus);
		addBlock(world, basePos, 1, 22, 5, redCelevus);
		addBlock(world, basePos, 2, 22, 0, redCelevus);
		addBlock(world, basePos, 2, 22, 1, redCelevus);
		addBlock(world, basePos, 2, 22, 2, redCelevus);
		addBlock(world, basePos, 2, 22, 3, redCelevus);
		addBlock(world, basePos, 2, 22, 4, redCelevus);
		addBlock(world, basePos, 2, 22, 5, redCelevus);
		addBlock(world, basePos, 3, 22, 0, redCelevus);
		addBlock(world, basePos, 3, 22, 1, redCelevus);
		addBlock(world, basePos, 3, 22, 2, redCelevus);
		addBlock(world, basePos, 3, 22, 3, redCelevus);
		addBlock(world, basePos, 3, 22, 4, redCelevus);
		addBlock(world, basePos, 3, 22, 5, redCelevus);
		addBlock(world, basePos, 4, 22, 0, redCelevus);
		addBlock(world, basePos, 4, 22, 1, redCelevus);
		addBlock(world, basePos, 4, 22, 2, redCelevus);
		addBlock(world, basePos, 4, 22, 3, redCelevus);
		addBlock(world, basePos, 4, 22, 4, redCelevus);
		addBlock(world, basePos, 4, 22, 5, redCelevus);
		addBlock(world, basePos, 5, 22, 0, redCelevus);
		addBlock(world, basePos, 5, 22, 1, redCelevus);
		addBlock(world, basePos, 5, 22, 2, redCelevus);
		addBlock(world, basePos, 5, 22, 3, redCelevus);
		addBlock(world, basePos, 5, 22, 4, redCelevus);
		addBlock(world, basePos, 5, 22, 5, redCelevus);
		addBlock(world, basePos, 0, 23, 0, redCelevus);
		addBlock(world, basePos, 0, 23, 1, redCelevus);
		addBlock(world, basePos, 0, 23, 2, redCelevus);
		addBlock(world, basePos, 0, 23, 3, redCelevus);
		addBlock(world, basePos, 0, 23, 4, redCelevus);
		addBlock(world, basePos, 0, 23, 5, redCelevus);
		addBlock(world, basePos, 1, 23, 0, redCelevus);
		addBlock(world, basePos, 1, 23, 1, redCelevus);
		addBlock(world, basePos, 1, 23, 2, redCelevus);
		addBlock(world, basePos, 1, 23, 3, redCelevus);
		addBlock(world, basePos, 1, 23, 4, redCelevus);
		addBlock(world, basePos, 1, 23, 5, redCelevus);
		addBlock(world, basePos, 2, 23, 0, redCelevus);
		addBlock(world, basePos, 2, 23, 1, redCelevus);
		addBlock(world, basePos, 2, 23, 2, redCelevus);
		addBlock(world, basePos, 2, 23, 3, redCelevus);
		addBlock(world, basePos, 2, 23, 4, redCelevus);
		addBlock(world, basePos, 2, 23, 5, redCelevus);
		addBlock(world, basePos, 3, 23, 0, redCelevus);
		addBlock(world, basePos, 3, 23, 1, redCelevus);
		addBlock(world, basePos, 3, 23, 2, redCelevus);
		addBlock(world, basePos, 3, 23, 3, redCelevus);
		addBlock(world, basePos, 3, 23, 4, redCelevus);
		addBlock(world, basePos, 3, 23, 5, redCelevus);
		addBlock(world, basePos, 4, 23, 0, redCelevus);
		addBlock(world, basePos, 4, 23, 1, redCelevus);
		addBlock(world, basePos, 4, 23, 2, redCelevus);
		addBlock(world, basePos, 4, 23, 3, redCelevus);
		addBlock(world, basePos, 4, 23, 4, redCelevus);
		addBlock(world, basePos, 4, 23, 5, redCelevus);
		addBlock(world, basePos, 5, 23, 0, redCelevus);
		addBlock(world, basePos, 5, 23, 1, redCelevus);
		addBlock(world, basePos, 5, 23, 2, redCelevus);
		addBlock(world, basePos, 5, 23, 3, redCelevus);
		addBlock(world, basePos, 5, 23, 4, redCelevus);
		addBlock(world, basePos, 5, 23, 5, redCelevus);
		addBlock(world, basePos, 0, 24, 0, redCelevus);
		addBlock(world, basePos, 0, 24, 1, redCelevus);
		addBlock(world, basePos, 0, 24, 2, redCelevus);
		addBlock(world, basePos, 0, 24, 3, redCelevus);
		addBlock(world, basePos, 0, 24, 4, redCelevus);
		addBlock(world, basePos, 0, 24, 5, redCelevus);
		addBlock(world, basePos, 1, 24, 0, redCelevus);
		addBlock(world, basePos, 1, 24, 1, redCelevus);
		addBlock(world, basePos, 1, 24, 2, redCelevus);
		addBlock(world, basePos, 1, 24, 3, redCelevus);
		addBlock(world, basePos, 1, 24, 4, redCelevus);
		addBlock(world, basePos, 1, 24, 5, redCelevus);
		addBlock(world, basePos, 2, 24, 0, redCelevus);
		addBlock(world, basePos, 2, 24, 1, redCelevus);
		addBlock(world, basePos, 2, 24, 2, redCelevus);
		addBlock(world, basePos, 2, 24, 3, redCelevus);
		addBlock(world, basePos, 2, 24, 4, redCelevus);
		addBlock(world, basePos, 2, 24, 5, redCelevus);
		addBlock(world, basePos, 3, 24, 0, redCelevus);
		addBlock(world, basePos, 3, 24, 1, redCelevus);
		addBlock(world, basePos, 3, 24, 2, redCelevus);
		addBlock(world, basePos, 3, 24, 3, redCelevus);
		addBlock(world, basePos, 3, 24, 4, redCelevus);
		addBlock(world, basePos, 3, 24, 5, redCelevus);
		addBlock(world, basePos, 4, 24, 0, redCelevus);
		addBlock(world, basePos, 4, 24, 1, redCelevus);
		addBlock(world, basePos, 4, 24, 2, redCelevus);
		addBlock(world, basePos, 4, 24, 3, redCelevus);
		addBlock(world, basePos, 4, 24, 4, redCelevus);
		addBlock(world, basePos, 4, 24, 5, redCelevus);
		addBlock(world, basePos, 5, 24, 0, redCelevus);
		addBlock(world, basePos, 5, 24, 1, redCelevus);
		addBlock(world, basePos, 5, 24, 2, redCelevus);
		addBlock(world, basePos, 5, 24, 3, redCelevus);
		addBlock(world, basePos, 5, 24, 4, redCelevus);
		addBlock(world, basePos, 5, 24, 5, redCelevus);
		addBlock(world, basePos, 1, 25, 1, redCelevus);
		addBlock(world, basePos, 1, 25, 2, redCelevus);
		addBlock(world, basePos, 1, 25, 3, redCelevus);
		addBlock(world, basePos, 1, 25, 4, redCelevus);
		addBlock(world, basePos, 2, 25, 1, redCelevus);
		addBlock(world, basePos, 2, 25, 2, redCelevus);
		addBlock(world, basePos, 2, 25, 3, redCelevus);
		addBlock(world, basePos, 2, 25, 4, redCelevus);
		addBlock(world, basePos, 3, 25, 1, redCelevus);
		addBlock(world, basePos, 3, 25, 2, redCelevus);
		addBlock(world, basePos, 3, 25, 3, redCelevus);
		addBlock(world, basePos, 3, 25, 4, redCelevus);
		addBlock(world, basePos, 4, 25, 1, redCelevus);
		addBlock(world, basePos, 4, 25, 2, redCelevus);
		addBlock(world, basePos, 4, 25, 3, redCelevus);
		addBlock(world, basePos, 4, 25, 4, redCelevus);
	}
}
