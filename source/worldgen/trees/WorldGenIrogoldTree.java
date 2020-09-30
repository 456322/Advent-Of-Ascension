package net.tslat.aoa3.worldgen.trees;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.block.functional.saplings.SaplingBlock;
import net.tslat.aoa3.common.registration.BlockRegister;

import javax.annotation.Nullable;
import java.util.Random;

public class WorldGenIrogoldTree extends WorldGenTree {
	public WorldGenIrogoldTree(@Nullable SaplingBlock sapling) {
		super(sapling);
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		BlockPos multiSaplingPos = findMultiSaplingPosition(world, rand, pos, 2);

		if ((sapling == null && rand.nextBoolean()) || multiSaplingPos == null) {
			return generateTree1(world, rand, pos);
		}
		else {
			return generateTree2(world, rand, multiSaplingPos == null ? pos : multiSaplingPos);
		}
	}

	private boolean generateTree1(World world, Random rand, BlockPos pos) {
		int trunkHeight = 7 + rand.nextInt(5);

		if (!checkSafeHeight(world, pos, trunkHeight + 2, 1))
			return false;

		if (!checkAndPrepSoil(world, pos, 1))
			return false;

		BlockPos.MutableBlockPos movablePos = new BlockPos.MutableBlockPos(pos.down());
		IBlockState log = BlockRegister.IRO_LOG.getDefaultState();
		IBlockState leaves = BlockRegister.IROGOLD_LEAVES.getDefaultState();

		for (int i = 0; i < trunkHeight; i++) {
			placeBlock(world, movablePos.move(EnumFacing.UP), log);
		}

		for (int x = -3; x <= 3; x++) {
			for (int y = 0; y <= 2; y++) {
				for (int z = -3; z <= 3; z++) {
					if (Math.abs(x) < 4 - y - Math.abs(z) || Math.abs(z) < 4 - y - Math.abs(x))
						placeBlock(world, movablePos.add(x, y, z), leaves);
				}
			}
		}

		placeBlock(world, movablePos.add(0, -1, 1), leaves);
		placeBlock(world, movablePos.add(0, -1, -1), leaves);
		placeBlock(world, movablePos.add(1, -1, 0), leaves);
		placeBlock(world, movablePos.add(-1, -1, 0), leaves);

		return true;
	}

	private boolean generateTree2(World world, Random rand, BlockPos pos) {
		int trunkHeight = 7 + rand.nextInt(5);

		if (!checkSafeHeight(world, pos, trunkHeight + 2, 2))
			return false;

		if (!checkAndPrepSoil(world, pos, 2))
			return false;

		IBlockState log = BlockRegister.IRO_LOG.getDefaultState();
		IBlockState leaves = BlockRegister.IROGOLD_LEAVES.getDefaultState();

		for (int i = 0; i < trunkHeight; i++) {
			for (int x = 0; x <= 1; x++) {
				for (int z = 0; z <= 1; z++) {
					placeBlock(world, pos.add(x, i, z), log);
				}
			}
		}

		pos = pos.up(trunkHeight - 1);
		int branchWidth = 2 + rand.nextInt(3);

		for (int i = branchWidth - 1; i <= branchWidth; i++) {
			for (int j = -1; j <= 1; j += 2) {
				int i2 = (j < 0 ? i - 1 : i) * j;

				placeBlock(world, pos.add(i2, 0, 0), log);
				placeBlock(world, pos.add(i2, 0, 1), log);
				placeBlock(world, pos.add(0, 0, i2), log);
				placeBlock(world, pos.add(1, 0, i2), log);

				if (i == branchWidth) {
					for (EnumFacing dir : EnumFacing.VALUES) {
						BlockPos leafPos = pos.offset(dir);

						placeBlock(world, leafPos.add(i2, 0, 0), leaves);
						placeBlock(world, leafPos.add(i2, 0, 1), leaves);
						placeBlock(world, leafPos.add(0, 0, i2), leaves);
						placeBlock(world, leafPos.add(1, 0, i2), leaves);
					}
				}
			}
		}

		return true;
	}
}
