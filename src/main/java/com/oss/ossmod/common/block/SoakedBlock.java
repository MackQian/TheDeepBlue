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

// any block declared as a soaked block will behave similarly to the original block
// except that it will also spawn a water source block on destruction.
// NOTE - breaking the block drops the original block, NOT the soaked version.
//  Silk Touch will drop the soaked block, but not spawn a water source block.
public class SoakedBlock extends BreakableBlock {

    public SoakedBlock(AbstractBlock.Properties props) {
        super(props);
    }
    // do whatever the original block does on destruction, then if the tool that mined
    // the block did not have silk touch, spawn a water source block where the mined block was. 
    public void playerDestroy(World world, PlayerEntity playerEntity, BlockPos blockPos, BlockState blockState, @Nullable TileEntity tileEntity, ItemStack itemStack) {
        super.playerDestroy(world, playerEntity, blockPos, blockState, tileEntity, itemStack);
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, itemStack) == 0) {
            world.setBlockAndUpdate(blockPos, Blocks.WATER.defaultBlockState());
        }
    }
}
