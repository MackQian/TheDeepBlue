package com.oss.ossmod;

import com.oss.ossmod.common.biomes.DeepBlueBiome;
import com.oss.ossmod.common.biomes.DeepBlueSurfaceBuilder;
import com.oss.ossmod.common.item.scubaItem;
import com.oss.ossmod.common.block.SoakedSandBlock;
import com.oss.ossmod.common.block.SoakedStoneBlock;
import com.oss.ossmod.common.entity.blobfish.BlobfishEntity;
import com.oss.ossmod.common.entity.seaurchin.SeaurchinEntity;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.oss.ossmod.OssMod.MODID;

// Registration code template from McJty
// https://github.com/McJty/YouTubeModding14/blob/1.16/src/main/java/com/mcjty/mytutorial/setup/Registration.java

// Registration is how we make whatever we've written in the mod actually known to the game.
// Without it, the game doesn't actually "register" whatever we've added and unknown behavior occurs.
public class Registration {
	// There are separate registries for every type of object that needs to be registered.
	// e.x. there is a Block registry, an Item registry, and an Entity registry (seen below).
	// a DeferredRegisters are essentially containers to facilitate the actual registration events in init().
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MODID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

//    Example: adding a registry for a block called "FirstBlock"
//    public static final RegistryObject<FirstBlock> FIRSTBLOCK = BLOCKS.register("firstblock", FirstBlock::new);
//    public static final RegistryObject<Item> FIRSTBLOCK_ITEM = ITEMS.register("firstblock", () -> new BlockItem(FIRSTBLOCK.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
//    public static final RegistryObject<TileEntityType<FirstBlockTile>> FIRSTBLOCK_TILE = TILES.register("firstblock", () -> TileEntityType.Builder.of(FirstBlockTile::new, FIRSTBLOCK.get()).build(null));

//    Example: adding a registry for a container block
//    public static final RegistryObject<ContainerType<FirstBlockContainer>> FIRSTBLOCK_CONTAINER = CONTAINERS.register("firstblock", () -> IForgeContainerType.create((windowId, inv, data) -> {
//        BlockPos pos = data.readBlockPos();
//        World world = inv.player.getCommandSenderWorld();
//        return new FirstBlockContainer(windowId, world, pos, inv, inv.player);
//    }));
    
    // Registering block properties and the actual item forms
    // Soaked Stone
    public static final RegistryObject<SoakedStoneBlock> SOAKED_STONE_BLOCK = BLOCKS.register("soaked_stone_block", () -> new SoakedStoneBlock(Block.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Item> SOAKED_STONE_BLOCK_ITEM = ITEMS.register("soaked_stone_block", () -> new BlockItem(SOAKED_STONE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    // Soaked Sand
    public static final RegistryObject<SoakedSandBlock> SOAKED_SAND_BLOCK = BLOCKS.register("soaked_sand_block", () -> new SoakedSandBlock(Block.Properties.of(Material.SAND).strength(0.5f).harvestTool(ToolType.SHOVEL)));
    public static final RegistryObject<Item> SOAKED_SAND_BLOCK_ITEM = ITEMS.register("soaked_sand_block", () -> new BlockItem(SOAKED_SAND_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));


    // Registering entities that we have created.
    // Possibly change entityclassification.create to entityclassification.watercreature
    // Blobfish
    public static final RegistryObject<EntityType<BlobfishEntity>> BLOBFISH = ENTITIES.register("blobfish", () -> EntityType.Builder.of(BlobfishEntity::new, EntityClassification.CREATURE)
            .sized(0.5f, 0.5f)
            .setShouldReceiveVelocityUpdates(false)
            .build("blobfish"));
    // SeaUrchin
    public static final RegistryObject<EntityType<SeaurchinEntity>> SEAURCHIN = ENTITIES.register("seaurchin", () -> EntityType.Builder.of(SeaurchinEntity::new, EntityClassification.CREATURE)
            .sized(0.5f, 0.5f)
            .setShouldReceiveVelocityUpdates(false)
            .build("seaurchin"));
    
    // Item Registration
    public static final RegistryObject<scubaItem> SCUBA_ITEM = ITEMS.register("scuba_item", scubaItem::new);
    
    // Biome registration
    public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, OssMod.MODID);
    public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> DEEP_BLUE_SURFACE_BUILDER = SURFACE_BUILDERS.register("deep_blue_surface_builder", () -> new DeepBlueSurfaceBuilder(SurfaceBuilderConfig.CODEC));
    
    // this actually registers all of the content added to the DeferredRegisters above.
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        SURFACE_BUILDERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        DeepBlueBiome.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}