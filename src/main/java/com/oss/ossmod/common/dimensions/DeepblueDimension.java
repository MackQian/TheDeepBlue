package com.oss.ossmod.common.dimensions;

import com.oss.ossmod.OssMod;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

// the code in this package is based on the code from the following site:
// https://github.com/quek04/The-Undergarden.

// From what I've seen so far, the code will probably need some
// refactoring needed to get the dimension completely working.
public class DeepblueDimension {
	public static final RegistryKey<DimensionType> DEEPBLUE_DIMENSION =
			RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, name("deepblue"));
	public static final RegistryKey<World> DEEPBLUE_WORLD =
			RegistryKey.create(Registry.DIMENSION_REGISTRY, name("deepblue"));

    // for use with initializing registries
    private static ResourceLocation name(String name) {
        return new ResourceLocation(OssMod.MODID, name);
    }
    
    // call this during registration
    public static void registerDimension() {
        Registry.register(Registry.CHUNK_GENERATOR, name("chunk_generator"), DeepblueChunkGenerator.CODEC);
        Registry.register(Registry.BIOME_SOURCE, name("biome_provider"), DeepblueBiomeProvider.CODEC);
    }
}
