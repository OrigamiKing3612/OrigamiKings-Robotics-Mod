package net.origamiking.mcmods.orm.blocks.random;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.force_field.ForceFieldBlock;

public class RandomBlocks extends BlocksUtils {
    public static final Block FORCE_FIELD_BLOCK = registerBlock(OrmMain.MOD_ID, "force_field_block", new ForceFieldBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).nonOpaque().requiresTool().collidable(false).luminance(1).hardness(100f)));

    public static void get() {

    }
}
