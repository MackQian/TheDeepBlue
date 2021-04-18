package com.oss.ossmod;

import com.oss.ossmod.block.SoakedStoneBlock;
import com.oss.ossmod.common.entity.blobfish.BlobfishEntity;
import com.oss.ossmod.common.entity.seaurchin.SeaurchinEntity;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.oss.ossmod.OssMod.MODID;

// Registration code template from McJty
// https://github.com/McJty/YouTubeModding14/blob/1.16/src/main/java/com/mcjty/mytutorial/setup/Registration.java

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MODID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

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
    
    // Registering soaked stone
    public static final RegistryObject<SoakedStoneBlock> SOAKEDSTONEBLOCK = BLOCKS.register("soaked_stone_block", SoakedStoneBlock::new);
    public static final RegistryObject<Item> SOAKEDSTONEBLOCK_ITEM = ITEMS.register("soaked_stone_block", () -> new BlockItem(SOAKEDSTONEBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
//    public static final RegistryObject<TileEntityType<SoakedStoneBlockTile>> SOAKEDSTONEBLOCK_TILE = TILES.register("soakedstoneblock", () -> TileEntityType.Builder.of(SoakedStoneBlockTile::new, SOAKEDSTONEBLOCK.get()).build(null));


    // Registering the Blobfish

    // Possibly change entityclassification.create to entityclassification.watercreature
    public static final RegistryObject<EntityType<BlobfishEntity>> BLOBFISH = ENTITIES.register("blobfish", () -> EntityType.Builder.of(BlobfishEntity::new, EntityClassification.CREATURE)
            .sized(0.5f, 0.5f)
            .setShouldReceiveVelocityUpdates(false)
            .build("blobfish"));

    public static final RegistryObject<EntityType<SeaurchinEntity>> SEAURCHIN = ENTITIES.register("seaurchin", () -> EntityType.Builder.of(SeaurchinEntity::new, EntityClassification.CREATURE)
            .sized(0.5f, 0.5f)
            .setShouldReceiveVelocityUpdates(false)
            .build("seaurchin"));
}