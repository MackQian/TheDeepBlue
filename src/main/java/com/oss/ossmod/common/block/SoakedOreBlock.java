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
// This behaves the same as the SoakedBlock except that it also drops exp.
public class SoakedOreBlock extends SoakedBlock {

    public SoakedOreBlock(AbstractBlock.Properties props) {
        super(props);
    }
    // If we add more types of ore, then we would need to add more if statements
    // or refactor this function to draw from some stored data somewhere.
    protected int xpOnDrop(Random rand) {
        if (this == Registration.OCEAN_STONE_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else {
            return 0;
        }
    }
    // this will spawn whatever the original block spawned and presumably will do more once it is added.
    public void spawnAfterBreak(BlockState blockState, ServerWorld serverWorld, BlockPos pos, ItemStack stack) {
        super.spawnAfterBreak(blockState, serverWorld, pos, stack);
    }
    // this makes sure that players can't abuse silk touch to farm exp from soaked ore blocks
    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
    }

}