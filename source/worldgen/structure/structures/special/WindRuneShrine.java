package net.tslat.aoa3.worldgen.structure.structures.special;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.tslat.aoa3.worldgen.feature.features.config.IntRangeConfig;
import net.tslat.aoa3.worldgen.structure.structures.AoAStructureBase;
import net.tslat.aoa3.worldgen.structure.structures.AoAStructureStart;

public class WindRuneShrine extends AoAStructureBase<IntRangeConfig> {
	public WindRuneShrine(GenerationStage.Decoration decorationStage, String templatePoolPath) {
		super(IntRangeConfig.CODEC, decorationStage, templatePoolPath);
	}

	@Override
	protected AoAStartFactory<IntRangeConfig> getStructureStart() {
		return (structure, chunkX, chunkZ, boundingBox, references, seed) -> new AoAStructureStart<IntRangeConfig>(structure, chunkX, chunkZ, boundingBox, references, seed) {
			@Override
			protected boolean shouldGenerateOnWorldSurface() {
				return false;
			}

			@Override
			public void generatePieces(DynamicRegistries dynamicRegistry, ChunkGenerator chunkGenerator, TemplateManager templateManager, int chunkX, int chunkZ, Biome biome, IntRangeConfig config) {
				int x = (chunkX << 4) + 7;
				int z = (chunkZ << 4) + 7;
				int y = chunkGenerator.getFirstFreeHeight(x, z, Heightmap.Type.WORLD_SURFACE_WG);

				if (y < 100)
					return;

				final BlockPos.Mutable chunkCenter = new BlockPos.Mutable(x, y + config.getValue(random), z);

				if (checkAndAdjustGeneration(chunkGenerator, chunkCenter, biome, config))
					generateStructurePieces(dynamicRegistry, getStructurePieceDepth(), chunkGenerator, templateManager, chunkCenter, getRandom(), false, shouldGenerateOnWorldSurface());
			}
		};
	}
}
