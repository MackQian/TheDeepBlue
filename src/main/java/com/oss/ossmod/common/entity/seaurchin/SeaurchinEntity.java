package com.oss.ossmod.common.entity.seaurchin;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

/*
A Sea Urchin entity. Poisons the player if they get near
*/

public class SeaurchinEntity extends WaterMobEntity {

    public SeaurchinEntity(final EntityType<? extends SeaurchinEntity> entityType, final World world) {
        super(entityType, world);

    }

//    protected SoundEvent getAmbientSound() {
//        return SoundEvents.SLIME_SQUISH_SMALL;
//    }

//    protected SoundEvent getDeathSound() {
//        return SoundEvents.SLIME_DEATH;
//    }

//    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
//        return SoundEvents.SLIME_HURT_SMALL;
//    }

    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.FOLLOW_RANGE, 40.0D);
    }

}
