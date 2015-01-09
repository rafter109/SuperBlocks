package com.totallyminecraft.superblocks.world;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by Jake on 1/1/2015.
 */
public class WorldGeneratorSuperBlocks implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 0:
                GenerateOverworld(random, chunkX * 16, chunkZ * 16, world);
                break;

        }
    }

        public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
        {
            WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.stone);
            for(int i = 0; i < chancesToSpawn; i++)
            {
                int posX = blockXPos + random.nextInt(16);
                int posY = minY + random.nextInt(maxY - minY);
                int posZ = blockZPos + random.nextInt(16);
                minable.generate(world, random, posX, posY, posZ);
            }
        }

    private void GenerateOverworld(Random random, int x, int z, World world) {
        this.addOreSpawn(ModBlocks.testBlock, world, random, x, z, 10, 15, 30, 0, 128);
    }

}
