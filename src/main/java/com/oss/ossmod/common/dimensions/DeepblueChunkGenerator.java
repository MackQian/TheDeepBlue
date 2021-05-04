package com.oss.ossmod.common.dimensions;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.DimensionSettings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

// It is unclear how exactly this is different from a surface builder.
// My current theory is that this class decides general information for chunk loading,
// while the surface builder is responsible for creating the actual chunk itself.
public class DeepblueChunkGenerator extends ChunkGenerator {
    // Codecs are essentially a way to encode/decode a Named Binary Tag format (described here:
    // http://web.archive.org/web/20110723210920/http://www.minecraft.net/docs/NBT.txt).
    // This is a relatively recent development, so not much direct documentation is available.
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
    // This should probably get extended, given that we changed from a NoiseChunkGenerator to a regular ChunkGenerator.
    public DeepblueChunkGenerator(BiomeProvider biomeProvider, long seed, Supplier<DimensionSettings> dimensionSettingsSupplier) {
        super(biomeProvider, seed, dimensionSettingsSupplier);
    }
    @Override
    protected Codec<? extends ChunkGenerator> codec() {
        return CODEC;
    }
    // Since there is only one biome, it probably isn't necessary to generate based on noise.
}
