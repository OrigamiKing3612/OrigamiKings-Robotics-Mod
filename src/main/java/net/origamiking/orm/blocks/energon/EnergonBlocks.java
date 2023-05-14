package net.origamiking.orm.blocks.energon;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.orm.OrmMain;

public class EnergonBlocks extends BlocksUtils {
    public static final Block ENERGON_BLOCK = registerBlock(OrmMain.MOD_ID, "energon_block", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(4).sounds(BlockSoundGroup.METAL)));
    public static final Block ENERGON_ORE = registerBlock(OrmMain.MOD_ID, "energon_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(2).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ENERGON_ORE = registerBlock(OrmMain.MOD_ID, "energon_deepslate_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(2).sounds(BlockSoundGroup.STONE)));

    public static void get() {}
}
