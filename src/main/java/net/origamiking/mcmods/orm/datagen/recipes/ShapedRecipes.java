package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.recipes.OrigamiShapedRecipeJsonBuilder;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

import java.util.function.Consumer;

public class ShapedRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
        //energon_axe
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ENERGON_AXE, 1)
                .pattern(" GG").pattern(" EG").pattern("E  ")
                .inputWithCriterion('E', RandomItems.ENERGY_CONDUCTOR).inputWithCriterion('G', EnergonItems.ENERGON)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.ENERGON_AXE)));
        //spark
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, RandomItems.SPARK, 1)
                .pattern("OCO").pattern("CDC").pattern("OCO")
                .inputWithCriterion('C', EnergonBlocks.COMPACT_ENERGON_BLOCK).inputWithCriterion('O', Ore13Items.ORE_13).inputWithCriterion('D', Blocks.DIAMOND_BLOCK)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(RandomItems.SPARK)));
        //photon
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PHOTON_ITEM, 6)
                .pattern("O").pattern("O").pattern("O")
                .inputWithCriterion('O', Ore13Items.ORE_13)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.PHOTON_ITEM)));
        //compacter
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COMPACTER_BLOCK, 1)
                .pattern("TRT").pattern("TIT").pattern("SES")
                .inputWithCriterion('I', Blocks.IRON_BLOCK).inputWithCriterion('S', Blocks.SMOOTH_STONE).inputWithCriterion('E', EnergonItems.ENERGON).inputWithCriterion('R', Items.REDSTONE).inputWithCriterion('T', TransformiumItems.TRANSFORMIUM)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.COMPACTER_BLOCK)));
        //refinery
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REFINERY_BLOCK, 1)
                .pattern("OIO").pattern("SSS")
                .inputWithCriterion('S', Blocks.SMOOTH_STONE).inputWithCriterion('I', Items.IRON_INGOT).inputWithCriterion('O', Ore13Items.ORE_13)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.REFINERY_BLOCK)));
        //chip refinery
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CHIP_REFINERY_BLOCK, 1)
                .pattern(" I ").pattern("TTT")
                .inputWithCriterion('T', TransformiumBlocks.TRANSFORMIUM_BLOCK).inputWithCriterion('I', Items.IRON_INGOT)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.CHIP_REFINERY_BLOCK)));
        //optimus primes ion cannon
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.OPTIMUS_PRIMES_ION_CANNON, 1)
                .pattern("TT ").pattern("IEO").pattern("TTT")
                .inputWithCriterion('T', TransformiumItems.TRANSFORMIUM).inputWithCriterion('I', Items.IRON_INGOT).inputWithCriterion('E', EnergonItems.ENERGON).inputWithCriterion('O', Ore13Items.ORE_13)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.OPTIMUS_PRIMES_ION_CANNON)));
        //blaster
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.BLASTER, 1)
                .pattern("TTT")
                .pattern("TOO")
                .pattern("T T")
                .inputWithCriterion('T', TransformiumItems.TRANSFORMIUM)
                .inputWithCriterion('O', Ore13Items.ORE_13)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.BLASTER)));
        //pulse rifle
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PULSE_RIFLE, 1)
                .pattern("III").pattern("TE ").pattern("II ")
                .inputWithCriterion('I', Items.IRON_INGOT).inputWithCriterion('E', EnergonItems.ENERGON).inputWithCriterion('T', TransformiumItems.TRANSFORMIUM)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.PULSE_RIFLE)));
        //soundwave shoulder gun
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SOUNDWAVE_SHOULDER_GUN, 1)
                .pattern("BBB").pattern("BOT").pattern("BBB")
                .inputWithCriterion('B', Blocks.BLUE_CONCRETE).inputWithCriterion('O', Ore13Items.ORE_13).inputWithCriterion('T', TransformiumItems.TRANSFORMIUM)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.SOUNDWAVE_SHOULDER_GUN)));
        //soundwave ray gun
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SOUNDWAVE_RAY_GUN, 1)
                .pattern("BBB").pattern("BDI").pattern("BBB")
                .inputWithCriterion('B', Blocks.BLUE_CONCRETE).inputWithCriterion('D', EnergonItems.DARK_ENERGON).inputWithCriterion('I', Items.IRON_INGOT)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.SOUNDWAVE_RAY_GUN)));
        //force field
        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.FORCE_FIELD_BLOCK, 1)
                .pattern("EEE")
                .pattern("EGE")
                .pattern("EEE")
                .inputWithCriterion('G', Blocks.GLASS)
                .inputWithCriterion('E', EnergonItems.ENERGON)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.FORCE_FIELD_BLOCK)));
    }
}
