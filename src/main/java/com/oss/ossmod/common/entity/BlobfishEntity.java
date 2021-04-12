package com.oss.ossmod.common.entity;


import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;

import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

/*
A blobfish entity
*/

public class BlobfishEntity extends AbstractGroupFishEntity {

    public BlobfishEntity(final EntityType<? extends BlobfishEntity> entityType, final World world) {
        super(entityType, world);

    }

    public int getMaxSchoolSize() {
        return 4;
    }

    protected ItemStack getBucketItemStack() {
        return new ItemStack(Items.SALMON_BUCKET);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.SLIME_SQUISH_SMALL;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.SLIME_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return SoundEvents.SLIME_HURT_SMALL;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.SLIME_JUMP_SMALL;
    }

    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.FOLLOW_RANGE, 40.0D);
    }

}
