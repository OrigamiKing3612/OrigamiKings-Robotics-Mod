package net.origamiking.mcmods.orm.blocks.transformium;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class TransformiumBlocks extends BlocksUtils {
    public static final Block TRANSFORMIUM_BLOCK = registerBlock(OrmMain.MOD_ID, "transformium_block", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block TRANSFORMIUM_STAIRS = registerBlock(OrmMain.MOD_ID, "transformium_stairs", new StairsBlock(TransformiumBlocks.TRANSFORMIUM_BLOCK.getDefaultState(), OrigamiBlockSettings.copyOf(TransformiumBlocks.TRANSFORMIUM_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block TRANSFORMIUM_SLAB = registerBlock(OrmMain.MOD_ID, "transformium_slab", new SlabBlock(OrigamiBlockSettings.copyOf(TransformiumBlocks.TRANSFORMIUM_BLOCK).sounds(BlockSoundGroup.METAL)));

    public static void get() {

    }
}
