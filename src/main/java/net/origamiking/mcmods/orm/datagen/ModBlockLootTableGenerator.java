package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.origamiking.mcmods.orm.blocks.chip_refinery.RegisterChipRefineryBlock;
import net.origamiking.mcmods.orm.blocks.compacter.RegisterCompacterBlock;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.refinery.RegisterRefineryBlock;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    protected ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(EnergonBlocks.ENERGON_BLOCK);
//        addDrop(EnergonBlocks.ENERGON_ORE);
//        addDrop(EnergonBlocks.DEEPSLATE_ENERGON_ORE);
        addDrop(Ore13Blocks.ORE_13_BLOCK);
//        addDrop(Ore13Blocks.ORE_13_ORE);
//        addDrop(Ore13Blocks.DEEPSLATE_ORE_13_ORE);
        addDrop(TransformiumBlocks.TRANSFORMIUM_BLOCK);
        addDrop(EnergonBlocks.COMPACT_ENERGON_BLOCK);
        addDrop(RegisterChipRefineryBlock.CHIP_REFINERY_BLOCK);
        addDrop(RegisterCompacterBlock.COMPACTER_BLOCK);
        addDrop(RegisterRefineryBlock.REFINERY_BLOCK);
        addDrop(EnergonBlocks.DARK_ENERGON_BLOCK);
        addDrop(EnergonBlocks.DARK_ENERGON_STAIRS);
        addDrop(EnergonBlocks.DARK_ENERGON_SLAB);
        addDrop(EnergonBlocks.ENERGON_STAIRS);
        addDrop(EnergonBlocks.ENERGON_SLAB);
        addDrop(TransformiumBlocks.TRANSFORMIUM_SLAB);
        addDrop(TransformiumBlocks.TRANSFORMIUM_STAIRS);
        addDrop(Ore13Blocks.ORE_13_SLAB);
        addDrop(Ore13Blocks.ORE_13_STAIR);
    }
}
