package net.origamiking.mcmods.orm.blocks;

import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;

public class ModBlocks {
    public static void register() {
        EnergonBlocks.get();
        Ore13Blocks.get();
        TransformiumBlocks.get();
    }
}
