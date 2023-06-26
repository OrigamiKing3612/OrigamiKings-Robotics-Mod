package net.origamiking.mcmods.orm.blocks.unicron_head;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.predicate.block.BlockStatePredicate;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class UnicronHeadBlock extends SkullBlock {
    @Nullable
    private static BlockPattern UnicronBossPattern;
    @Nullable
    private static BlockPattern UnicronDispenserPattern;

    public UnicronHeadBlock(SkullType skullType, Settings settings) {
        super(skullType, settings);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof SkullBlockEntity) {
            UnicronHeadBlock.onPlaced(world, pos, (SkullBlockEntity)blockEntity);
        }
    }
    public static void onPlaced(World world, BlockPos pos, SkullBlockEntity blockEntity) {
        boolean bl;
        if (world.isClient) {
            return;
        }
        BlockState blockState = blockEntity.getCachedState();
        boolean bl2 = bl = blockState.isOf(Blocks.WITHER_SKELETON_SKULL/) || blockState.isOf(Blocks.WITHER_SKELETON_WALL_SKULL/);
        if (!bl || pos.getY() < world.getBottomY() || world.getDifficulty() == Difficulty.PEACEFUL) {
            return;
        }
        BlockPattern.Result result = UnicronHeadBlock.getUnicronBossPattern().searchAround(world, pos);
        if (result == null) {
            return;
        }
        WitherEntity witherEntity = EntityType.WITHER.create(world);/
        if (witherEntity != null) {
            CarvedPumpkinBlock.breakPatternBlocks(world, result);
            BlockPos blockPos = result.translate(1, 2, 0).getBlockPos();
            witherEntity.refreshPositionAndAngles((double)blockPos.getX() + 0.5, (double)blockPos.getY() + 0.55, (double)blockPos.getZ() + 0.5, result.getForwards().getAxis() == Direction.Axis.X ? 0.0f : 90.0f, 0.0f);
            witherEntity.bodyYaw = result.getForwards().getAxis() == Direction.Axis.X ? 0.0f : 90.0f;
            witherEntity.onSummoned();
            for (ServerPlayerEntity serverPlayerEntity : world.getNonSpectatingEntities(ServerPlayerEntity.class, witherEntity.getBoundingBox().expand(50.0))) {
                Criteria.SUMMONED_ENTITY.trigger(serverPlayerEntity, witherEntity);
            }
            world.spawnEntity(witherEntity);
            CarvedPumpkinBlock.updatePatternBlocks(world, result);
        }
    }
    public static boolean canDispense(World world, BlockPos pos, ItemStack stack) {
        if (stack.isOf(Items.WITHER_SKELETON_SKULL/) && pos.getY() >= world.getBottomY() + 2 && world.getDifficulty() != Difficulty.PEACEFUL && !world.isClient) {
            return UnicronHeadBlock.getUnicronDispenserPattern().searchAround(world, pos) != null;
        }
        return false;
    }
    private static BlockPattern getUnicronBossPattern() {
        if (UnicronBossPattern == null) {
            UnicronBossPattern = BlockPatternBuilder.start()/
                    .aisle("^^^", "###", "~#~")
                    .where('#', pos -> pos.getBlockState().isIn(BlockTags.WITHER_SUMMON_BASE_BLOCKS))
                    .where('^', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(Blocks.WITHER_SKELETON_SKULL)
                            .or(BlockStatePredicate.forBlock(Blocks.WITHER_SKELETON_WALL_SKULL))))
                    .where('~', pos -> pos.getBlockState().isAir()).build();
        }
        return UnicronBossPattern;
    }

    private static BlockPattern getUnicronDispenserPattern() {
        if (UnicronDispenserPattern == null) {
            UnicronDispenserPattern = BlockPatternBuilder.start()/
                    .aisle("   ", "###", "~#~")
                    .where('#', pos -> pos.getBlockState()
                            .isIn(BlockTags.WITHER_SUMMON_BASE_BLOCKS/))
                    .where('~', pos -> pos.getBlockState().isAir()).build();
        }
        return UnicronDispenserPattern;
    }
}
