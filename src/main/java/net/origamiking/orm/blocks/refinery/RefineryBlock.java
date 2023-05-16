package net.origamiking.orm.blocks.refinery;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import org.jetbrains.annotations.Nullable;
public class RefineryBlock extends BlockWithEntity implements BlockEntityProvider {
    public RefineryBlock() {
        super(OrigamiBlockSettings.of(Material.STONE).nonOpaque());
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return ModRefineryBlock.REFINERY_BLOCK_ENTITY.instantiate(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

//    @Override
//    public void appendTooltip(ItemStack stack, BlockView blockGetter, List<Text> tooltip, TooltipContext tooltipFlag) {
//        tooltip.add(Text.translatable("block." + GeckoLib.MOD_ID + ".fertilizer.tooltip"));
//
//        super.appendTooltip(stack, blockGetter, tooltip, tooltipFlag);
//    }
}
