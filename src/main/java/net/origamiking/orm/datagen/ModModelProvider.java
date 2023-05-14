package net.origamiking.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.origamiking.orm.blocks.energon.EnergonBlocks;
import net.origamiking.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.orm.items.energon.EnergonItems;
import net.origamiking.orm.items.ore13.Ore13Items;
import net.origamiking.orm.items.transformium.TransformiumItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.ENERGON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.ENERGON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.DEEPSLATE_ENERGON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(Ore13Blocks.ORE_13_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(Ore13Blocks.ORE_13_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(Ore13Blocks.DEEPSLATE_ORE_13_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(TransformiumBlocks.TRANSFORMIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EnergonItems.ENERGON, Models.GENERATED);
        itemModelGenerator.register(Ore13Items.ORE_13, Models.GENERATED);
        itemModelGenerator.register(TransformiumItems.TRANSFORMIUM, Models.GENERATED);
    }
}
