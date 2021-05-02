package com.oss.ossmod.common.entity.blobfish;


import net.minecraft.entity.EntityType;

import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attributes;

/*
A blobfish entity.
This class determines blobfishes' behavior and interactions
with the player/actions of the player.
*/

public class BlobfishEntity extends AbstractGroupFishEntity {

    public BlobfishEntity(final EntityType<? extends BlobfishEntity> entityType, final World world) {
        super(entityType, world);

    }
    // schooling behavior is the default fish schooling behavior with up to 4 entities.
    public int getMaxSchoolSize() {
        return 4;
    }
    // we can pick the blobfish up using a bucket.
    // currently it only gives a bucket of salmon, change this later.
    protected ItemStack getBucketItemStack() {
        return new ItemStack(Items.SALMON_BUCKET);
    }
    // we use slime sounds for the blob fish.
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
    // blob fish is a passive mob, but attack value is added because all creatures have one.
    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.FOLLOW_RANGE, 40.0D);
    }

}
