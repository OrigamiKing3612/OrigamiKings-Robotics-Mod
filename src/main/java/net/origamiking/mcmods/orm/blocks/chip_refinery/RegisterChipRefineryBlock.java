package net.origamiking.mcmods.orm.blocks.chip_refinery;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class RegisterChipRefineryBlock extends BlocksUtils {
    public static final Block CHIP_REFINERY_BLOCK = registerBlock(OrmMain.MOD_ID, "chip_refinery", new ChipRefineryBlock(OrigamiBlockSettings.of(Material.STONE).requiresTool().strength(3.5f).sounds(BlockSoundGroup.STONE)));
    public static void get() {}
}
