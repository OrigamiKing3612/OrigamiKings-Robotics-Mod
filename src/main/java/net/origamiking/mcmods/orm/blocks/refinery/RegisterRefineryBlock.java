package net.origamiking.mcmods.orm.blocks.refinery;

import net.minecraft.block.Block;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class RegisterRefineryBlock extends BlocksUtils {
    public static final Block REFINERY_BLOCK = registerBlock(OrmMain.MOD_ID, "refinery_block", new RefineryBlock()/*new RefineryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).requiresTool().nonOpaque())*/);

    public static void get() {
    }
}
