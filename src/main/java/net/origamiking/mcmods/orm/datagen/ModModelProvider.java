package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium_alloy.TransformiumAlloyBlocks;
import net.origamiking.mcmods.orm.fluid.ModFluids;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;
import net.origamiking.mcmods.orm.items.transformium_alloy.TransformiumAlloyItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool energonTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EnergonBlocks.ENERGON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool darkEnergonTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EnergonBlocks.DARK_ENERGON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ore13TexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ore13Blocks.ORE_13_BLOCK);
        BlockStateModelGenerator.BlockTexturePool transformiumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(TransformiumBlocks.TRANSFORMIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool transformiumAlloyTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK);
        BlockStateModelGenerator.BlockTexturePool transformiumAlloyBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.COMPACT_ENERGON_BLOCK);
        energonTexturePool.stairs(EnergonBlocks.ENERGON_STAIRS);
        energonTexturePool.slab(EnergonBlocks.ENERGON_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.ENERGON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.DEEPSLATE_ENERGON_ORE);

        darkEnergonTexturePool.stairs(EnergonBlocks.DARK_ENERGON_STAIRS);
        darkEnergonTexturePool.slab(EnergonBlocks.DARK_ENERGON_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.DARK_ENERGON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.DEEPSLATE_DARK_ENERGON_ORE);

        ore13TexturePool.stairs(Ore13Blocks.ORE_13_STAIRS);
        ore13TexturePool.slab(Ore13Blocks.ORE_13_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(Ore13Blocks.ORE_13_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(Ore13Blocks.DEEPSLATE_ORE_13_ORE);

        transformiumTexturePool.stairs(TransformiumBlocks.TRANSFORMIUM_STAIRS);
        transformiumTexturePool.slab(TransformiumBlocks.TRANSFORMIUM_SLAB);
        transformiumTexturePool.wall(TransformiumBlocks.TRANSFORMIUM_WALL);

        transformiumAlloyTexturePool.stairs(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS);
        transformiumAlloyTexturePool.slab(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB);
        transformiumAlloyTexturePool.wall(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL);

        transformiumAlloyBricksTexturePool.stairs(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS);
        transformiumAlloyBricksTexturePool.slab(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB);
        transformiumAlloyBricksTexturePool.wall(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(BlockRegistry.FORCE_FIELD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.RAW_ENERGON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EnergonBlocks.RAW_DARK_ENERGON_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EnergonItems.ENERGON, Models.GENERATED);
        itemModelGenerator.register(EnergonItems.DARK_ENERGON, Models.GENERATED);
        itemModelGenerator.register(Ore13Items.ORE_13, Models.GENERATED);
        itemModelGenerator.register(TransformiumItems.TRANSFORMIUM, Models.GENERATED);
        itemModelGenerator.register(TransformiumAlloyItems.TRANSFORMIUM_ALLOY, Models.GENERATED);
        itemModelGenerator.register(TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModFluids.OIL_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModFluids.RAW_ENERGON_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModFluids.RAW_DARK_ENERGON_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ThunderCracker.HELMET, Models.GENERATED);
    }
}
