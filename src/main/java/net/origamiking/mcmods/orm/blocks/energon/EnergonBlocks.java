package net.origamiking.mcmods.orm.blocks.energon;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class EnergonBlocks extends BlocksUtils {
    public static final Block ENERGON_BLOCK = registerBlock(OrmMain.MOD_ID, "energon_block", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(4).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block ENERGON_ORE = registerBlock(OrmMain.MOD_ID, "energon_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(2).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ENERGON_ORE = registerBlock(OrmMain.MOD_ID, "energon_deepslate_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(2).sounds(BlockSoundGroup.STONE)));
    public static final Block COMPACT_ENERGON_BLOCK = registerBlock(OrmMain.MOD_ID, "compact_energon_block", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(8).sounds(BlockSoundGroup.METAL)));

    public static final Block DARK_ENERGON_BLOCK = registerBlock(OrmMain.MOD_ID, "dark_energon_block", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(3).sounds(BlockSoundGroup.METAL)));
    public static final Block DARK_ENERGON_ORE = registerBlock(OrmMain.MOD_ID, "dark_energon_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(1).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_DARK_ENERGON_ORE = registerBlock(OrmMain.MOD_ID, "dark_energon_deepslate_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(1).sounds(BlockSoundGroup.STONE)));

    public static final Block ENERGON_STAIRS = registerBlock(OrmMain.MOD_ID, "energon_stairs", new StairsBlock(EnergonBlocks.ENERGON_BLOCK.getDefaultState(), OrigamiBlockSettings.copyOf(EnergonBlocks.ENERGON_BLOCK).luminance(4).sounds(BlockSoundGroup.METAL)));
    public static final Block ENERGON_SLAB = registerBlock(OrmMain.MOD_ID, "energon_slab", new SlabBlock(OrigamiBlockSettings.copyOf(EnergonBlocks.ENERGON_BLOCK).luminance(4).sounds(BlockSoundGroup.METAL)));
    public static final Block DARK_ENERGON_STAIRS = registerBlock(OrmMain.MOD_ID, "dark_energon_stairs", new StairsBlock(EnergonBlocks.ENERGON_BLOCK.getDefaultState(), OrigamiBlockSettings.copyOf(EnergonBlocks.DARK_ENERGON_BLOCK).luminance(4).sounds(BlockSoundGroup.METAL)));
    public static final Block DARK_ENERGON_SLAB = registerBlock(OrmMain.MOD_ID, "dark_energon_slab", new SlabBlock(OrigamiBlockSettings.copyOf(EnergonBlocks.DARK_ENERGON_BLOCK).luminance(4).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_ENERGON_BLOCK = registerBlock(OrmMain.MOD_ID, "raw_energon_block", new Block(OrigamiBlockSettings.copyOf(EnergonBlocks.ENERGON_BLOCK).luminance(3).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_DARK_ENERGON_BLOCK = registerBlock(OrmMain.MOD_ID, "raw_dark_energon_block", new Block(OrigamiBlockSettings.copyOf(EnergonBlocks.DARK_ENERGON_BLOCK).luminance(2).sounds(BlockSoundGroup.METAL)));
    public static void get() {
    }
}
