package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oapi.recipes.ModRecipeProvider;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.recipes.providers.OrmRecipeProvider.offerSlab;
import static net.origamiking.mcmods.orm.datagen.recipes.providers.OrmRecipeProvider.offerStair;

public class BlockRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_BLOCK, EnergonItems.ENERGON);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_BLOCK, EnergonItems.DARK_ENERGON);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_BLOCK, Ore13Items.ORE_13);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_BLOCK, TransformiumItems.TRANSFORMIUM);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_STAIRS, EnergonBlocks.ENERGON_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_BLOCK, 2);
        offerSlab(exporter, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_BLOCK);
        offerStair(exporter, EnergonBlocks.ENERGON_STAIRS, EnergonBlocks.ENERGON_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonBlocks.DARK_ENERGON_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_BLOCK,2 );
        offerSlab(exporter, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_BLOCK);
        offerStair(exporter, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonBlocks.DARK_ENERGON_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_STAIR, Ore13Blocks.ORE_13_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_BLOCK,2);
        offerSlab(exporter, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_BLOCK);
        offerStair(exporter, Ore13Blocks.ORE_13_STAIR, Ore13Blocks.ORE_13_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_BLOCK, 2);
        offerSlab(exporter, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        offerStair(exporter, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_BLOCK);
    }
}
