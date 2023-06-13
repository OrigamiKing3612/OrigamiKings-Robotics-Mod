package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    protected ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(EnergonBlocks.ENERGON_BLOCK);
        addDrop(EnergonBlocks.ENERGON_ORE);
        addDrop(EnergonBlocks.DEEPSLATE_ENERGON_ORE);
        addDrop(Ore13Blocks.ORE_13_BLOCK);
        addDrop(Ore13Blocks.ORE_13_ORE);
        addDrop(Ore13Blocks.DEEPSLATE_ORE_13_ORE);
        addDrop(TransformiumBlocks.TRANSFORMIUM_BLOCK);
        addDrop(EnergonBlocks.COMPACT_ENERGON_BLOCK);
    }
}
