package net.origamiking.mcmods.orm.blocks.ore13;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class Ore13Blocks extends BlocksUtils {
    public static final Block ORE_13_BLOCK = registerBlock(OrmMain.MOD_ID, "ore_13_block", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block ORE_13_ORE = registerBlock(OrmMain.MOD_ID, "ore_13_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ORE_13_ORE = registerBlock(OrmMain.MOD_ID, "ore_13_deepslate_ore", new Block(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static void get() {}
}
