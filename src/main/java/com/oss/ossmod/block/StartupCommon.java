package com.oss.ossmod.block;

import com.oss.ossmod.OssMod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class StartupCommon {
	public static TestBlock testBlock;
	public static BlockItem itemTestBlock;
	
	@SubscribeEvent
	public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {
		testBlock = (TestBlock) (new TestBlock().setRegistryName(OssMod.MODID, "test_block_registry_name"));
		blockRegisterEvent.getRegistry().register(testBlock);
	}
	
	@SubscribeEvent
	public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {

	    Item.Properties itemSimpleProperties = new Item.Properties()
	                                                   .stacksTo(2)
	                                                   .tab(ItemGroup.TAB_BUILDING_BLOCKS);  // which inventory tab?
	    itemTestBlock = new BlockItem(testBlock, itemSimpleProperties);
	    itemTestBlock.setRegistryName(testBlock.getRegistryName());
	    itemRegisterEvent.getRegistry().register(itemTestBlock);
	}

}
