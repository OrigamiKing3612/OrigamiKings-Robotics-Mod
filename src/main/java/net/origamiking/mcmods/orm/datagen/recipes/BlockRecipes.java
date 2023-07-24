package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;
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

import static net.origamiking.mcmods.oapi.recipes.ModRecipeHelpers.*;

public class BlockRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
        RecipeProvider.offerSmelting(exporter, List.of(TransformiumAlloyItems.TRANSFORMIUM_ALLOY), RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, 1.0f, 200, "transformium_alloy_smelting");
        RecipeProvider.offerBlasting(exporter, List.of(TransformiumAlloyItems.TRANSFORMIUM_ALLOY), RecipeCategory.BUILDING_BLOCKS, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, 1.0f, 100, "transformium_alloy_blasting");

        RecipeProvider.offerBlasting(exporter, List.of(EnergonBlocks.RAW_ENERGON_BLOCK), RecipeCategory.BUILDING_BLOCKS, EnergonItems.ENERGON, 5.0f, 180, "raw_energon_blasting");
        RecipeProvider.offerBlasting(exporter, List.of(EnergonBlocks.RAW_DARK_ENERGON_BLOCK), RecipeCategory.BUILDING_BLOCKS, EnergonItems.DARK_ENERGON, 5.0f, 180, "raw_dark_energon_blasting");

        offerBlockSet(exporter, EnergonBlocks.ENERGON_BLOCK, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_STAIRS, EnergonItems.ENERGON, false);
        offerBlockSet(exporter, EnergonBlocks.DARK_ENERGON_BLOCK, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonItems.DARK_ENERGON, false);
        offerBlockSet(exporter, Ore13Blocks.ORE_13_BLOCK, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_STAIRS, Ore13Items.ORE_13, false);

        offerBlockSet(exporter, TransformiumBlocks.TRANSFORMIUM_BLOCK, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_WALL, TransformiumItems.TRANSFORMIUM, false);
        offerBlockSet(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL, TransformiumAlloyItems.TRANSFORMIUM_ALLOY, false);
        offerBlockSet(exporter, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS, TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL, TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK, true);
    }
    //TODO move to oapi
    public static void offerBlockSet(Consumer<RecipeJsonProvider> exporter, Block block, Block slab, Block stair, Block wall, Item item, boolean is2x2) {
        offerSlabs(exporter, slab, block);
        offerStairs(exporter, stair, block);
        offerWalls(exporter, wall, block);
        offerBlocks(exporter, block, item, !is2x2, true);
    }
    //TODO move to oapi
    public static void offerBlockSet(Consumer<RecipeJsonProvider> exporter, Block block, Block slab, Block stair, Item item, boolean is2x2) {
        offerSlabs(exporter, slab, block);
        offerStairs(exporter, stair, block);
        offerBlocks(exporter, block, item, !is2x2, true);
    }
}
