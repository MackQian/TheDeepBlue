package com.oss.ossmod.common.items;


import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;

public class scubaItem extends Item {
    public scubaItem(){
        super(new Item.Properties().durability(600).tab(ItemGroup.TAB_MISC));
    }

    @Override
    public boolean canEquip(ItemStack stack, EquipmentSlotType armorType, Entity entity) {
        return armorType==EquipmentSlotType.CHEST;
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if(player.isUnderWater()){
            if(!player.hasEffect(Effects.WATER_BREATHING) && stack.getDamageValue()<stack.getMaxDamage()){
                stack.hurt(1,random,null);
                player.addEffect(new EffectInstance(Effects.WATER_BREATHING,20));
            }
        }
        else{
            stack.setDamageValue(stack.getDamageValue()-1);
        }
    }

}
