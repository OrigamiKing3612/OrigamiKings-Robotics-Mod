package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.polished_transformium.PolishedTransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium_alloy.TransformiumAlloyBlocks;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;
import net.origamiking.mcmods.orm.items.transformium_alloy.TransformiumAlloyItems;

import java.util.List;

import static net.origamiking.mcmods.oapi.recipes.ModRecipeProvider.offer2x2Compress;
import static net.origamiking.mcmods.oapi.recipes.ModRecipeProviders.offerBlockSet;

public class BlockRecipes {
    public static void get(RecipeExporter exporter) {
        RecipeProvider.offerSmelting(exporter, List.of(TransformiumAlloyItems.TRANSFORMIUM_ALLOY), RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, 1.0f, 200, "transformium_alloy_smelting");
        RecipeProvider.offerBlasting(exporter, List.of(TransformiumAlloyItems.TRANSFORMIUM_ALLOY), RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, 1.0f, 100, "transformium_alloy_blasting");

        RecipeProvider.offerBlasting(exporter, List.of(EnergonBlocks.RAW_ENERGON_BLOCK), RecipeCategory.BUILDING_BLOCKS, EnergonItems.ENERGON, 5.0f, 180, "raw_energon_blasting");
        RecipeProvider.offerBlasting(exporter, List.of(EnergonBlocks.RAW_DARK_ENERGON_BLOCK), RecipeCategory.BUILDING_BLOCKS, EnergonItems.DARK_ENERGON, 5.0f, 180, "raw_dark_energon_blasting");

        offerBlockSet(exporter, EnergonBlocks.ENERGON_BLOCK, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_STAIRS, EnergonItems.ENERGON, false);
        offerBlockSet(exporter, EnergonBlocks.DARK_ENERGON_BLOCK, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonItems.DARK_ENERGON, false);
        offerBlockSet(exporter, Ore13Blocks.ORE_13_BLOCK, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_STAIRS, Ore13Items.ORE_13, false);

        offerBlockSet(exporter, TransformiumBlocks.TRANSFORMIUM_BLOCK, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_WALL, TransformiumItems.TRANSFORMIUM, false);
        offerBlockSet(exporter, PolishedTransformiumBlocks.POLISHED_TRANSFORMIUM_BLOCK, PolishedTransformiumBlocks.POLISHED_TRANSFORMIUM_SLAB, PolishedTransformiumBlocks.POLISHED_TRANSFORMIUM_STAIRS, PolishedTransformiumBlocks.POLISHED_TRANSFORMIUM_WALL);
        offerBlockSet(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL, TransformiumAlloyItems.TRANSFORMIUM_ALLOY, false);
        offerBlockSet(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, true);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PolishedTransformiumBlocks.POLISHED_TRANSFORMIUM_BLOCK, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        offer2x2Compress(exporter, PolishedTransformiumBlocks.POLISHED_TRANSFORMIUM_BLOCK, TransformiumBlocks.TRANSFORMIUM_BLOCK);
    }
}
