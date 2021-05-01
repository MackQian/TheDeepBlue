package com.oss.ossmod.common.item;

import java.util.function.Supplier;

import com.oss.ossmod.Registration;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum OssmodItemTier implements IItemTier {
   OCEAN_STONE(3, 1561, 8.0F, 3.0F, 10, () -> {
      return Ingredient.of(Registration.OCEAN_STONE.get());
   });

   private final int level;
   private final int uses;
   private final float speed;
   private final float damage;
   private final int enchantmentValue;
   private final LazyValue<Ingredient> repairIngredient;

   private OssmodItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
	   this.level = level;
	   this.uses = uses;
	   this.speed = speed;
	   this.damage = damage;
	   this.enchantmentValue = enchantmentValue;
	   this.repairIngredient = new LazyValue<>(repairIngredient);
   }

   public int getUses() {
      return this.uses;
   }

   public float getSpeed() {
      return this.speed;
   }

   public float getAttackDamageBonus() {
      return this.damage;
   }

   public int getLevel() {
      return this.level;
   }

   public int getEnchantmentValue() {
      return this.enchantmentValue;
   }

   public Ingredient getRepairIngredient() {
      return this.repairIngredient.get();
   }
}
