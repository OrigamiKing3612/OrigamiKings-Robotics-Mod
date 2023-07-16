package net.origamiking.mcmods.orm.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.tag.TagKey;
import net.origamiking.mcmods.oapi.tag.TagUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class ModBlockTags extends TagUtils {
    public static final TagKey<Block> ENERGON_BLOCKS = blockTagKey(OrmMain.MOD_ID,"energon_blocks");
    public static final TagKey<Block> ORE_13_BLOCKS = blockTagKey(OrmMain.MOD_ID, "ore_13_blocks");
    public static final TagKey<Block> TRANSFORMIUM_BLOCKS = blockTagKey(OrmMain.MOD_ID, "transformium_blocks");

    public static final TagKey<Block> ENERGON_ORES = blockTagKey(OrmMain.MOD_ID, "energon_ores");
    public static final TagKey<Block> ORE_13_ORES = blockTagKey(OrmMain.MOD_ID, "ore_13_ores");

    public static void get() {

    }
}
