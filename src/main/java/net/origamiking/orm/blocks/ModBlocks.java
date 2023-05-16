package net.origamiking.orm.blocks;

import net.origamiking.orm.blocks.energon.EnergonBlocks;
import net.origamiking.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.orm.blocks.refinery.ModRefineryBlock;
import net.origamiking.orm.blocks.transformium.TransformiumBlocks;

public class ModBlocks {
    public static void register() {
        EnergonBlocks.get();
        Ore13Blocks.get();
        TransformiumBlocks.get();
        ModRefineryBlock.get();
    }
}
