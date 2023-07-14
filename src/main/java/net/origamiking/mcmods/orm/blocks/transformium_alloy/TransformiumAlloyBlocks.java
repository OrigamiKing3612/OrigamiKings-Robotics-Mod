package net.origamiking.mcmods.orm.blocks.transformium_alloy;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;

public class TransformiumAlloyBlocks extends BlocksUtils {
    public static final Block TRANSFORMIUM_ALLOY_BLOCK = registerBlock(OrmMain.MOD_ID, "transformium_alloy_block", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block TRANSFORMIUM_ALLOY_STAIRS = registerBlock(OrmMain.MOD_ID, "transformium_alloy_stairs", new StairsBlock(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK.getDefaultState(), OrigamiBlockSettings.copyOf(TransformiumBlocks.TRANSFORMIUM_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block TRANSFORMIUM_ALLOY_SLAB = registerBlock(OrmMain.MOD_ID, "transformium_alloy_slab", new SlabBlock(OrigamiBlockSettings.copyOf(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK).sounds(BlockSoundGroup.METAL)));

    public static final Block TRANSFORMIUM_ALLOY_BRICK_BLOCK = registerBlock(OrmMain.MOD_ID, "transformium_alloy_bricks_block", new Block(OrigamiBlockSettings.copyOf(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block TRANSFORMIUM_ALLOY_BRICK_STAIRS = registerBlock(OrmMain.MOD_ID, "transformium_alloy_bricks_stairs", new StairsBlock(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK.getDefaultState(), OrigamiBlockSettings.copyOf(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block TRANSFORMIUM_ALLOY_BRICK_SLAB = registerBlock(OrmMain.MOD_ID, "transformium_alloy_bricks_slab", new SlabBlock(OrigamiBlockSettings.copyOf(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK).sounds(BlockSoundGroup.METAL)));

    public static void get() {

    }
}
