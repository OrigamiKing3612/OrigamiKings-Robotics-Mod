package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.fluid.ModFluids;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

public class ShapedRecipes {
    public static void get(RecipeExporter exporter) {
        //energon_axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ENERGON_AXE, 1)
                .pattern(" GG").pattern(" EG").pattern("E  ")
                .input('E', RandomItems.ENERGY_CONDUCTOR)
                .input('G', EnergonItems.ENERGON)
                .criterion(RecipeProvider.hasItem(RandomItems.ENERGY_CONDUCTOR), RecipeProvider.conditionsFromItem(RandomItems.ENERGY_CONDUCTOR))
                .criterion(RecipeProvider.hasItem(EnergonItems.ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.ENERGON))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.ENERGON_AXE)));
        //spark
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, RandomItems.SPARK, 1)
                .pattern("OCO").pattern("CDC").pattern("OCO")
                .input('C', EnergonBlocks.COMPACT_ENERGON_BLOCK).input('O', Ore13Items.ORE_13).input('D', Blocks.DIAMOND_BLOCK)
                .criterion(RecipeProvider.hasItem(EnergonBlocks.COMPACT_ENERGON_BLOCK), RecipeProvider.conditionsFromItem(EnergonBlocks.COMPACT_ENERGON_BLOCK))
                .criterion(RecipeProvider.hasItem(Ore13Items.ORE_13), RecipeProvider.conditionsFromItem(Ore13Items.ORE_13))
                .criterion(RecipeProvider.hasItem(Blocks.DIAMOND_BLOCK), RecipeProvider.conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(RandomItems.SPARK)));
        //photon
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PHOTON_ITEM, 6)
                .pattern("O").pattern("O").pattern("O")
                .input('O', Ore13Items.ORE_13)
                .criterion(RecipeProvider.hasItem(Ore13Items.ORE_13), RecipeProvider.conditionsFromItem(Ore13Items.ORE_13))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.PHOTON_ITEM)));
        //compacter
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COMPACTER_BLOCK, 1)
                .pattern("TRT").pattern("TIT").pattern("SES")
                .input('I', Blocks.IRON_BLOCK)
                .input('S', Blocks.SMOOTH_STONE)
                .input('E', EnergonItems.ENERGON)
                .input('R', Items.REDSTONE)
                .input('T', TransformiumItems.TRANSFORMIUM)
                .criterion(RecipeProvider.hasItem(Blocks.IRON_BLOCK), RecipeProvider.conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(RecipeProvider.hasItem(Blocks.SMOOTH_STONE), RecipeProvider.conditionsFromItem(Blocks.SMOOTH_STONE)).offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.COMPACTER_BLOCK)));
        //refinery
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REFINERY_BLOCK, 1)
                .pattern("OIO").pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('I', Items.IRON_INGOT)
                .input('O', Ore13Items.ORE_13)
                .criterion(RecipeProvider.hasItem(Blocks.SMOOTH_STONE), RecipeProvider.conditionsFromItem(Blocks.SMOOTH_STONE))
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.REFINERY_BLOCK)));
        //chip refinery
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CHIP_REFINERY_BLOCK, 1)
                .pattern(" I ").pattern("TTT")
                .input('T', TransformiumBlocks.TRANSFORMIUM_BLOCK)
                .input('I', Items.IRON_INGOT)
                .criterion(RecipeProvider.hasItem(TransformiumBlocks.TRANSFORMIUM_BLOCK), RecipeProvider.conditionsFromItem(TransformiumBlocks.TRANSFORMIUM_BLOCK))
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.CHIP_REFINERY_BLOCK)));
        //optimus primes ion cannon
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.OPTIMUS_PRIMES_ION_CANNON, 1)
                .pattern("TT ").pattern("IEO").pattern("TTT")
                .input('T', TransformiumItems.TRANSFORMIUM)
                .input('I', Items.IRON_INGOT).input('E', EnergonItems.ENERGON)
                .input('O', Ore13Items.ORE_13)
                .criterion(RecipeProvider.hasItem(TransformiumItems.TRANSFORMIUM), RecipeProvider.conditionsFromItem(TransformiumItems.TRANSFORMIUM))
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(EnergonItems.ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.ENERGON))
                .criterion(RecipeProvider.hasItem(Ore13Items.ORE_13), RecipeProvider.conditionsFromItem(Ore13Items.ORE_13))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.OPTIMUS_PRIMES_ION_CANNON)));
        //blaster
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.BLASTER, 1)
                .pattern("TTT").pattern("TOO").pattern("T T")
                .input('T', TransformiumItems.TRANSFORMIUM)
                .input('O', Ore13Items.ORE_13)
                .criterion(RecipeProvider.hasItem(TransformiumItems.TRANSFORMIUM), RecipeProvider.conditionsFromItem(TransformiumItems.TRANSFORMIUM))
                .criterion(RecipeProvider.hasItem(Ore13Items.ORE_13), RecipeProvider.conditionsFromItem(Ore13Items.ORE_13))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.BLASTER)));
        //pulse rifle
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PULSE_RIFLE, 1)
                .pattern("III").pattern("TE ").pattern("II ")
                .input('I', Items.IRON_INGOT).input('E', EnergonItems.ENERGON).input('T', TransformiumItems.TRANSFORMIUM)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(EnergonItems.ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.ENERGON))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.PULSE_RIFLE)));
        //soundwave shoulder gun
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SOUNDWAVE_SHOULDER_GUN, 1)
                .pattern("BBB").pattern("BOT").pattern("BBB")
                .input('B', Blocks.BLUE_CONCRETE).input('O', Ore13Items.ORE_13).input('T', TransformiumItems.TRANSFORMIUM)
                .criterion(RecipeProvider.hasItem(Blocks.BLUE_CONCRETE), RecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .criterion(RecipeProvider.hasItem(Ore13Items.ORE_13), RecipeProvider.conditionsFromItem(Ore13Items.ORE_13))
                .criterion(RecipeProvider.hasItem(TransformiumItems.TRANSFORMIUM), RecipeProvider.conditionsFromItem(TransformiumItems.TRANSFORMIUM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.SOUNDWAVE_SHOULDER_GUN)));
        //soundwave ray gun
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SOUNDWAVE_RAY_GUN, 1)
                .pattern("BBB").pattern("BDI").pattern("BBB")
                .input('B', Blocks.BLUE_CONCRETE).input('D', EnergonItems.DARK_ENERGON).input('I', Items.IRON_INGOT)
                .criterion(RecipeProvider.hasItem(Blocks.BLUE_CONCRETE), RecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .criterion(RecipeProvider.hasItem(EnergonItems.DARK_ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.DARK_ENERGON))
                .criterion(RecipeProvider.hasItem(EnergonItems.ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.ENERGON))
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.SOUNDWAVE_RAY_GUN)));
        //force field
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.FORCE_FIELD_BLOCK, 1)
                .pattern("EEE")
                .pattern("EGE")
                .pattern("EEE")
                .input('G', Blocks.GLASS)
                .input('E', EnergonItems.ENERGON)
                .criterion(RecipeProvider.hasItem(Blocks.GLASS), RecipeProvider.conditionsFromItem(Blocks.GLASS))
                .criterion(RecipeProvider.hasItem(EnergonItems.ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.ENERGON))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(BlockRegistry.FORCE_FIELD_BLOCK)));
        //energy cell
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ENERGY_CELL, 1)
                .pattern("TET")
                .pattern("ERE")
                .pattern("TET")
                .input('R', ModFluids.RAW_ENERGON_BUCKET)
                .input('E', EnergonItems.ENERGON)
                .input('T', TransformiumItems.TRANSFORMIUM)
                .criterion(RecipeProvider.hasItem(ModFluids.RAW_ENERGON_BUCKET), RecipeProvider.conditionsFromItem(ModFluids.RAW_ENERGON_BUCKET))
                .criterion(RecipeProvider.hasItem(EnergonItems.ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.ENERGON))
                .criterion(RecipeProvider.hasItem(TransformiumItems.TRANSFORMIUM), RecipeProvider.conditionsFromItem(TransformiumItems.TRANSFORMIUM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.ENERGY_CELL)));
    }
}
