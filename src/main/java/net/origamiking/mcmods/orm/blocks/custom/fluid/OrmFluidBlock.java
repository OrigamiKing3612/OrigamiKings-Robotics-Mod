package net.origamiking.mcmods.orm.blocks.custom.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldEvents;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.tag.ModFluidTags;

public class OrmFluidBlock extends FluidBlock {
    public OrmFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (this.receiveNeighborFluids(world, pos, state)) {
            world.scheduleFluidTick(pos, state.getFluidState().getFluid(), this.fluid.getTickRate(world));
        }
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (this.receiveNeighborFluids(world, pos, state)) {
            world.scheduleFluidTick(pos, state.getFluidState().getFluid(), this.fluid.getTickRate(world));
        }
    }

    private boolean receiveNeighborFluids(World world, BlockPos pos, BlockState state) {
        if (this.fluid.isIn(FluidTags.LAVA)) {
            boolean bl = world.getBlockState(pos.down()).isOf(Blocks.SOUL_SOIL);
            for (Direction direction : FLOW_DIRECTIONS) {
                BlockPos blockPos = pos.offset(direction.getOpposite());
                if (world.getFluidState(blockPos).isIn(FluidTags.WATER)) {
                    Block block = world.getFluidState(pos).isStill() ? Blocks.OBSIDIAN : Blocks.COBBLESTONE;
                    world.setBlockState(pos, block.getDefaultState());
                    this.playExtinguishSound(world, pos);
                    return false;
                }
                if (!bl || !world.getBlockState(blockPos).isOf(Blocks.BLUE_ICE)) continue;
                world.setBlockState(pos, Blocks.BASALT.getDefaultState());
                this.playExtinguishSound(world, pos);
                return false;
            }
        }
        if (this.fluid.isIn(ModFluidTags.RAW_ENERGON)) {
            for (Direction direction : FLOW_DIRECTIONS) {
                BlockPos blockPos = pos.offset(direction.getOpposite());
                if (world.getFluidState(blockPos).isIn(FluidTags.LAVA)) {
                    Block block = world.getFluidState(pos).isStill() ? EnergonBlocks.ENERGON_BLOCK : EnergonBlocks.RAW_ENERGON_BLOCK;
                    world.setBlockState(pos, block.getDefaultState());
                    this.playExtinguishSound(world, pos);
                    return false;
                }
            }
        }
        if (this.fluid.isIn(ModFluidTags.RAW_DARK_ENERGON)) {
            for (Direction direction : FLOW_DIRECTIONS) {
                BlockPos blockPos = pos.offset(direction.getOpposite());
                if (world.getFluidState(blockPos).isIn(FluidTags.LAVA)) {
                    Block block = world.getFluidState(pos).isStill() ? EnergonBlocks.DARK_ENERGON_BLOCK : EnergonBlocks.RAW_DARK_ENERGON_BLOCK;
                    world.setBlockState(pos, block.getDefaultState());
                    this.playExtinguishSound(world, pos);
                    return false;
                }
            }
        }
        if (this.fluid.isIn(ModFluidTags.OIL)) {
            for (Direction direction : FLOW_DIRECTIONS) {
                BlockPos blockPos = pos.offset(direction.getOpposite());
                if (world.getFluidState(blockPos).isIn(FluidTags.LAVA)) {
                    Block block = Blocks.MAGMA_BLOCK;
                    world.setBlockState(pos, block.getDefaultState());
                    this.playExtinguishSound(world, pos);
                    return false;
                }
            }
        }
        return true;
    }

    private void playExtinguishSound(WorldAccess world, BlockPos pos) {
        world.syncWorldEvent(WorldEvents.LAVA_EXTINGUISHED, pos, 0);
    }
}
