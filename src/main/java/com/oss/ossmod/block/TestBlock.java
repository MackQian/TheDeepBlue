package com.oss.ossmod.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TestBlock extends BreakableBlock {

    public TestBlock() {
        super(Block.Properties.of(Material.STONE));
    }

    public void playerDestroy(World p_180657_1_, PlayerEntity p_180657_2_, BlockPos p_180657_3_, BlockState p_180657_4_, @Nullable TileEntity p_180657_5_, ItemStack p_180657_6_) {
        super.playerDestroy(p_180657_1_, p_180657_2_, p_180657_3_, p_180657_4_, p_180657_5_, p_180657_6_);
            if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, p_180657_6_) == 0) {
                p_180657_1_.setBlockAndUpdate(p_180657_3_, Blocks.WATER.defaultBlockState());
            }
    }
}
