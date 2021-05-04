package com.oss.ossmod.common.dimensions;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.DimensionSettings;
import net.minecraft.world.gen.NoiseChunkGenerator;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

// It is unclear how exactly this is different from a surface builder.
// My current theory is that this class decides what chunks to load, while
// the surface builder is responsible for creating the actual chunk itself.
public class DeepblueChunkGenerator extends NoiseChunkGenerator {

    public static final Codec<DeepblueChunkGenerator> CODEC = RecordCodecBuilder.create(
            (instance) -> instance.group(
                    BiomeProvider.CODEC.fieldOf("biome_source")
                            .forGetter((chunkGenerator) -> chunkGenerator.biomeSource),
                    Codec.LONG.fieldOf("seed")
                            .orElseGet(42069315)//default value for now
                            .forGetter((chunkGenerator) -> chunkGenerator.seed),
                    DimensionSettings.CODEC.fieldOf("settings")
                            .forGetter((chunkGenerator) -> chunkGenerator.settings))
                    .apply(instance, instance.stable(DeepblueChunkGenerator::new)));

    public DeepblueChunkGenerator(BiomeProvider biomeProvider, long seed, Supplier<DimensionSettings> dimensionSettingsSupplier) {
        super(biomeProvider, seed, dimensionSettingsSupplier);
    }

    @Override
    protected Codec<? extends ChunkGenerator> codec() {
        return CODEC;
    }
}