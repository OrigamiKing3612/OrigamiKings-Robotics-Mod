package net.origamiking.mcmods.orm.blocks.compacter;

import net.minecraft.block.Block;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class RegisterCompacterBlock extends BlocksUtils {
    public static final Block COMPACTER_BLOCK = registerBlock(OrmMain.MOD_ID, "compacter_block", new CompacterBlock()/*new RefineryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).requiresTool().nonOpaque())*/);

    public static void get() {
    }
}
