package net.origamiking.mcmods.orm.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.custom.chip_refinery.ChipRefineryBlock;
import net.origamiking.mcmods.orm.blocks.custom.compacter.CompacterBlock;
import net.origamiking.mcmods.orm.blocks.custom.force_field.ForceFieldBlock;
import net.origamiking.mcmods.orm.blocks.custom.refinery.RefineryBlock;

public class BlockRegistry extends BlocksUtils {
    public static final Block CHIP_REFINERY_BLOCK = registerBlock(OrmMain.MOD_ID, "chip_refinery", new ChipRefineryBlock(OrigamiBlockSettings.create().requiresTool().strength(3.5f).sounds(BlockSoundGroup.STONE)));
    public static final Block COMPACTER_BLOCK = registerBlock(OrmMain.MOD_ID, "compacter_block", new CompacterBlock()/*new RefineryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).requiresTool().nonOpaque())*/);
    public static final Block REFINERY_BLOCK = registerBlock(OrmMain.MOD_ID, "refinery_block", new RefineryBlock()/*new RefineryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).requiresTool().nonOpaque())*/);
    public static final Block FORCE_FIELD_BLOCK = registerBlock(OrmMain.MOD_ID, "force_field_block", new ForceFieldBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).nonOpaque().requiresTool().collidable(false).luminance(1).hardness(100f)));

    public static void get() {
    }
}
