package com.oss.ossmod;

import com.oss.ossmod.common.biomes.DeepBlueBiome;
import com.oss.ossmod.common.biomes.DeepBlueSurfaceBuilder;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import com.oss.ossmod.common.entity.blobfish.BlobfishEntity;
import com.oss.ossmod.common.entity.blobfish.BlobfishRenderer;
import com.oss.ossmod.common.entity.seaurchin.SeaurchinEntity;
import com.oss.ossmod.common.entity.seaurchin.SeaurchinRenderer;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ossmod")
public class OssMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    // The ID used here gets used for identifiers in Minecraft commands/descriptions.
    // ex "locatebiome <MODID>:deepblue" would locate the deepblue biome from this mod.
    public static final String MODID = "ossmod";

    public OssMod() {
        // Register methods to be called while loading the mod.
    	// initial setup method
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // enqueueIMC and processIMC are used for communication between mods.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Client-only methods are registered in doClientStuff.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Deferred Registration
        Registration.init();

    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	// Render any entities that we've made - maybe convert this into a list as we get more...
        RenderingRegistry.registerEntityRenderingHandler(Registration.BLOBFISH.get(), BlobfishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(Registration.SEAURCHIN.get(), SeaurchinRenderer::new);
        // Add biomes to the Manager - there's only going to be one biome in our dimension.
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(OssMod.MODID, "deep_blue")), 10000));

        event.enqueueWork(() -> {
            // Register the entity attributes - maybe convert to a list once more come...
            GlobalEntityTypeAttributes.put(Registration.BLOBFISH.get(), BlobfishEntity.prepareAttributes().build());
            GlobalEntityTypeAttributes.put(Registration.SEAURCHIN.get(), SeaurchinEntity.prepareAttributes().build());

        });

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);


    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
//    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
//    public static class RegistryEvents {
//        @SubscribeEvent
//        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
//            // register a new block here
//            LOGGER.info("HELLO from Register Block");
//        }
//
//        @SubscribeEvent
//        public static void registerEntities() {
//
//        }
//    }

}
