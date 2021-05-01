package com.oss.ossmod.common.block;

import java.util.Random;

import com.oss.ossmod.Registration;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

public class SoakedOreBlock extends SoakedBlock {

    public SoakedOreBlock(AbstractBlock.Properties props) {
        super(props);
    }

    protected int xpOnDrop(Random rand) {
        if (this == Registration.OCEAN_STONE_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else {
            return 0;
        }
    }

    public void spawnAfterBreak(BlockState blockState, ServerWorld serverWorld, BlockPos pos, ItemStack stack) {
        super.spawnAfterBreak(blockState, serverWorld, pos, stack);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
    }

}