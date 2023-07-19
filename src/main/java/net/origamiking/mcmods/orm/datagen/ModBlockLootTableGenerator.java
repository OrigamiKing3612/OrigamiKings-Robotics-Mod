package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium_alloy.TransformiumAlloyBlocks;

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
        addDrop(BlockRegistry.CHIP_REFINERY_BLOCK);
        addDrop(BlockRegistry.COMPACTER_BLOCK);
        addDrop(BlockRegistry.REFINERY_BLOCK);
        addDrop(EnergonBlocks.DARK_ENERGON_BLOCK);
        addDrop(EnergonBlocks.DARK_ENERGON_STAIRS);
        addDrop(EnergonBlocks.DARK_ENERGON_SLAB);
        addDrop(EnergonBlocks.ENERGON_STAIRS);
        addDrop(EnergonBlocks.ENERGON_SLAB);
        addDrop(TransformiumBlocks.TRANSFORMIUM_SLAB);
        addDrop(TransformiumBlocks.TRANSFORMIUM_STAIRS);
        addDrop(Ore13Blocks.ORE_13_SLAB);
        addDrop(Ore13Blocks.ORE_13_STAIRS);
        addDrop(BlockRegistry.FORCE_FIELD_BLOCK);
        addDrop(TransformiumBlocks.TRANSFORMIUM_BLOCK);
        addDrop(TransformiumBlocks.TRANSFORMIUM_STAIRS);
        addDrop(TransformiumBlocks.TRANSFORMIUM_SLAB);
        addDrop(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK);
        addDrop(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS);
        addDrop(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB);
        addDrop(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK);
        addDrop(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS);
        addDrop(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB);
    }
}
