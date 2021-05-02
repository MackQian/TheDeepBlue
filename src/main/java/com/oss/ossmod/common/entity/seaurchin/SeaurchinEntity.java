package com.oss.ossmod.common.entity.seaurchin;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IndirectEntityDamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/*
A Sea Urchin entity. Poisons the player if they make contact.
*/

public class SeaurchinEntity extends WaterMobEntity {

    public SeaurchinEntity(final EntityType<? extends SeaurchinEntity> entityType, final World world) {
        super(entityType, world);

    }
    // the Sea Urchin will try to attack the player if they are near.
    protected void registerGoals() {
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
    }
    // poison any living entities that it hurts.
    public boolean doHurtTarget(Entity p_70652_1_) {
        if (super.doHurtTarget(p_70652_1_)) {
            if (p_70652_1_ instanceof LivingEntity) {
                ((LivingEntity)p_70652_1_).addEffect(new EffectInstance(Effects.POISON, 50, 0));
            }
            return true;
        } else {
            return false;
        }
    }
    // if the urchin was hurt by a living entity, poison it.
    @Override
    public boolean hurt(@Nullable DamageSource damageSource, float damage) {
        if (damageSource != null) {
            Entity entity = damageSource.getEntity();
            if (entity != null) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new EffectInstance(Effects.POISON, 150, 0));
                }
            }
        }
        return super.hurt(damageSource, damage);
    }
    // standard attributes, its damage is poison-based.
    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 0.5D)
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.FOLLOW_RANGE, 40.0D)
                .add(Attributes.MOVEMENT_SPEED, Double.MIN_NORMAL)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5D);
    }
}
