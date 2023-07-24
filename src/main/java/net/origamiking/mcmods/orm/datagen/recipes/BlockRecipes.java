package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oapi.recipes.ModRecipeProvider;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium_alloy.TransformiumAlloyBlocks;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;
import net.origamiking.mcmods.orm.items.transformium_alloy.TransformiumAlloyItems;

import java.util.List;
import java.util.function.Consumer;

import static net.origamiking.mcmods.oapi.recipes.ModRecipeProvider.*;

public class BlockRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
        ModRecipeProvider.offer3x3CompressAndUncompress(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK, TransformiumAlloyItems.TRANSFORMIUM_ALLOY);
        offer2x2Compress(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK);
        RecipeProvider.offerSmelting(exporter, List.of(TransformiumAlloyItems.TRANSFORMIUM_ALLOY), RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, 1.0f, 200, "transformium_alloy_smelting");
        RecipeProvider.offerBlasting(exporter, List.of(TransformiumAlloyItems.TRANSFORMIUM_ALLOY), RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, 1.0f, 100, "transformium_alloy_blasting");
        offerStair(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK);
        offerStair(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK);
        offerSlab(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK);
        offerSlab(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK, 2);
        ModRecipeProvider.offer3x3CompressAndUncompress(exporter, EnergonBlocks.ENERGON_BLOCK, EnergonItems.ENERGON);
        ModRecipeProvider.offer3x3CompressAndUncompress(exporter, EnergonBlocks.DARK_ENERGON_BLOCK, EnergonItems.DARK_ENERGON);
        ModRecipeProvider.offer3x3CompressAndUncompress(exporter, Ore13Blocks.ORE_13_BLOCK, Ore13Items.ORE_13);
        ModRecipeProvider.offer3x3CompressAndUncompress(exporter, TransformiumBlocks.TRANSFORMIUM_BLOCK, TransformiumItems.TRANSFORMIUM);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_STAIRS, EnergonBlocks.ENERGON_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_BLOCK, 2);
        offerSlab(exporter, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_BLOCK);
        offerStair(exporter, EnergonBlocks.ENERGON_STAIRS, EnergonBlocks.ENERGON_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonBlocks.DARK_ENERGON_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_BLOCK, 2);
        offerSlab(exporter, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_BLOCK);
        offerStair(exporter, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonBlocks.DARK_ENERGON_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_STAIRS, Ore13Blocks.ORE_13_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_BLOCK, 2);
        offerSlab(exporter, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_BLOCK);
        offerStair(exporter, Ore13Blocks.ORE_13_STAIRS, Ore13Blocks.ORE_13_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_BLOCK, 2);
        offerSlab(exporter, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        offerStair(exporter, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_BLOCK);

        RecipeProvider.offerBlasting(exporter, List.of(EnergonBlocks.RAW_ENERGON_BLOCK), RecipeCategory.BUILDING_BLOCKS, EnergonItems.ENERGON, 5.0f, 180, "raw_energon_blasting");
        RecipeProvider.offerBlasting(exporter, List.of(EnergonBlocks.RAW_DARK_ENERGON_BLOCK), RecipeCategory.BUILDING_BLOCKS, EnergonItems.DARK_ENERGON, 5.0f, 180, "raw_dark_energon_blasting");

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_WALL, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_WALL, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL);
    }
}
