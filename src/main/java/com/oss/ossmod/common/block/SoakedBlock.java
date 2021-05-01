package com.oss.ossmod.common.block;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BreakableBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SoakedBlock extends BreakableBlock {

    public SoakedBlock(AbstractBlock.Properties props) {
        super(props);
    }

    public void playerDestroy(World world, PlayerEntity playerEntity, BlockPos blockPos, BlockState blockState, @Nullable TileEntity tileEntity, ItemStack itemStack) {
        super.playerDestroy(world, playerEntity, blockPos, blockState, tileEntity, itemStack);
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, itemStack) == 0) {
            world.setBlockAndUpdate(blockPos, Blocks.WATER.defaultBlockState());
        }
    }
}
