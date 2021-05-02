package com.oss.ossmod.common.biomes;

import com.oss.ossmod.OssMod;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class DeepBlueBiome {
	// This is where we add the biomes that we want to add to the dimension.
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, OssMod.MODID);

    static {
        createBiome("deep_blue", BiomeMaker::theVoidBiome);
    }

    public static RegistryObject<Biome> createBiome(String name, Supplier<Biome> biome) {
        return BIOMES.register(name, biome);
    }
}