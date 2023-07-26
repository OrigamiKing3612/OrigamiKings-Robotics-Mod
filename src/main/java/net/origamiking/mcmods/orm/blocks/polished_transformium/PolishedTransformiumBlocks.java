package net.origamiking.mcmods.orm.blocks.polished_transformium;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;

public class PolishedTransformiumBlocks extends BlocksUtils {
    public static final Block POLISHED_TRANSFORMIUM_BLOCK = registerBlock(OrmMain.MOD_ID, "polished_transformium_block", new Block(OrigamiBlockSettings.copyOf(TransformiumBlocks.TRANSFORMIUM_BLOCK).requiresTool()));
    public static final Block POLISHED_TRANSFORMIUM_STAIRS = registerBlock(OrmMain.MOD_ID, "polished_transformium_stairs", new StairsBlock(POLISHED_TRANSFORMIUM_BLOCK.getDefaultState(), OrigamiBlockSettings.copyOf(POLISHED_TRANSFORMIUM_BLOCK)));
    public static final Block POLISHED_TRANSFORMIUM_SLAB = registerBlock(OrmMain.MOD_ID, "polished_transformium_slab", new SlabBlock(OrigamiBlockSettings.copyOf(POLISHED_TRANSFORMIUM_BLOCK)));
    public static final Block POLISHED_TRANSFORMIUM_WALL = registerBlock(OrmMain.MOD_ID, "polished_transformium_wall", new WallBlock(OrigamiBlockSettings.copyOf(POLISHED_TRANSFORMIUM_BLOCK)));

    public static void get() {}
}
