package com.oss.ossmod.common.biomes;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.SimplexNoiseGenerator;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;


public class DeepBlueSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

    private static SimplexNoiseGenerator deep_blue_noise;

    public DeepBlueSurfaceBuilder(Codec<SurfaceBuilderConfig> codec) { super(codec);deep_blue_noise = new SimplexNoiseGenerator(new Random(12345));}

    @Override
    public void apply(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        BlockState air = config.getTopMaterial();
        BlockState stone = config.getUnderMaterial();
        BlockState sand = config.getUnderwaterMaterial();
        BlockPos.Mutable blockpos$Mutable = new BlockPos.Mutable();
        int i = -1;
        int j = (int) (noise / 3.0D + 3.0D + random.nextDouble() * 0.25D);
        int xpos = x & 15;
        int zpos = z & 15;

        Double caveNoiseMultiplier = 0.03;
        Double caveWindow = 0.027;
        Double upperSurfaceMultiplier1 = 0.01;
        Double upperSurfaceMultiplier2 = 0.04;

        int upperSurface = (int)(deep_blue_noise.getValue(x*upperSurfaceMultiplier1,z*upperSurfaceMultiplier1) * 50) + 190;
        upperSurface += (int)(deep_blue_noise.getValue((9999+x)*upperSurfaceMultiplier2,(9999+z)*upperSurfaceMultiplier2) * 10);

        for (int ypos = 255; ypos >= 0; --ypos) {
            blockpos$Mutable.set(xpos, ypos, zpos);
            BlockState curblockstate = chunkIn.getBlockState(blockpos$Mutable);
            curblockstate.getBlock();

            // fill is the block placed anywhere there isn't a solid block.
            // this is water for most of the biome but air above y 210
            BlockState fill = defaultFluid;
            if(ypos > 230) {
                fill = air;
            }

            // noise to mix sand into the biome
            BlockState solid = stone;
            if (deep_blue_noise.getValue(x*0.02,ypos*0.02,z*0.02) > 0.3) {
                solid = sand;
            }

            // solid stone above y 250 so there aren't gaps to the sky
            if(ypos > 250) {
                chunkIn.setBlockState(blockpos$Mutable, solid, false);
                continue;
            }

            //3d noise for my cracked world generation
            if((deep_blue_noise.getValue(x*upperSurfaceMultiplier2, ypos*upperSurfaceMultiplier2, z*upperSurfaceMultiplier2) > 0.7)) {
                chunkIn.setBlockState(blockpos$Mutable, fill, false);
                continue;
            }

            // place the fill block anywhere a cave is
            double caveVal1 = deep_blue_noise.getValue(x*caveNoiseMultiplier, ypos*caveNoiseMultiplier, z*caveNoiseMultiplier);
            if(caveVal1 < caveWindow){
                double caveVal2 = deep_blue_noise.getValue(x*caveNoiseMultiplier, (9999+ypos)*caveNoiseMultiplier, z*caveNoiseMultiplier);
                if (caveVal1*caveVal1 + caveVal2*caveVal2 < caveWindow) {
                    chunkIn.setBlockState(blockpos$Mutable, fill, false);
                    continue;
                }
            }
            // second level of caves
            caveVal1 = deep_blue_noise.getValue((1111+x)*caveNoiseMultiplier, (1111+ypos)*caveNoiseMultiplier, (1111+z)*caveNoiseMultiplier);
            if(caveVal1 < caveWindow){
                double caveVal2 = deep_blue_noise.getValue((1111+x)*caveNoiseMultiplier, (8888+ypos)*caveNoiseMultiplier, (1111+z)*caveNoiseMultiplier);
                if (caveVal1*caveVal1 + caveVal2*caveVal2 < caveWindow) {
                    chunkIn.setBlockState(blockpos$Mutable, fill, false);
                    continue;
                }
            }

            if(ypos > upperSurface) {
                chunkIn.setBlockState(blockpos$Mutable, solid, false);
            } else if(curblockstate == Blocks.CAVE_AIR.defaultBlockState() || curblockstate.getMaterial() == Material.AIR || curblockstate.getMaterial() == Material.WATER) {
                chunkIn.setBlockState(blockpos$Mutable, fill, false);
            } else {
                chunkIn.setBlockState(blockpos$Mutable, solid, false);
            }
        }
    }
}