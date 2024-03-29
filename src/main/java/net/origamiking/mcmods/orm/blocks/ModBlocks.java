package net.origamiking.mcmods.orm.blocks;

import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.polished_transformium.PolishedTransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.random.RandomBlocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium_alloy.TransformiumAlloyBlocks;

public class ModBlocks {
    public static void register() {
        EnergonBlocks.get();
        Ore13Blocks.get();
        TransformiumBlocks.get();
        TransformiumAlloyBlocks.get();
        RandomBlocks.get();
        BlockRegistry.get();
        PolishedTransformiumBlocks.get();
    }
}
