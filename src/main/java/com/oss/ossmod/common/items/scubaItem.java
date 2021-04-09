package com.oss.ossmod.common.items;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class scubaItem extends Item {
    public scubaItem(){
        super(new Item.Properties().durability(300).tab(ItemGroup.TAB_MISC));
    }
}
