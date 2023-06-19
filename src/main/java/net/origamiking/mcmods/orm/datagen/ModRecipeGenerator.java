package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.recipes.ModRecipeProvider;
import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrime;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;
import net.origamiking.mcmods.orm.armor.soundwave.Soundwave;
import net.origamiking.mcmods.orm.armor.starscream.Starscream;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.items.chips.astrotrain.AstrotrainChip;
import net.origamiking.mcmods.orm.items.chips.bumblebee.BumblebeeChip;
import net.origamiking.mcmods.orm.items.chips.galvatron.GalvatronChip;
import net.origamiking.mcmods.orm.items.chips.ironhide.IronhideChip;
import net.origamiking.mcmods.orm.items.chips.megatron.MegatronChip;
import net.origamiking.mcmods.orm.items.chips.optimus_prime.OptimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.starscream.StarscreamChip;
import net.origamiking.mcmods.orm.items.chips.rodimus_prime.RodimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.scorpinok.ScorpinokChip;
import net.origamiking.mcmods.orm.items.chips.skystrike.SkystrikeChip;
import net.origamiking.mcmods.orm.items.chips.soundwave.SoundwaveChip;
import net.origamiking.mcmods.orm.items.chips.thunder_cracker.ThunderCrackerChip;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;
import net.origamiking.mcmods.orm.recipe.ChipRefineryRecipe;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ENERGON_AXE, 1)
                .pattern(" GG").pattern(" EG").pattern("E  ")
                .input('E', RandomItems.ENERGY_CONDUCTOR).input('G', EnergonItems.ENERGON)
                .criterion(RecipeProvider.hasItem(RandomItems.ENERGY_CONDUCTOR), RecipeProvider.conditionsFromItem(RandomItems.ENERGY_CONDUCTOR)).criterion(RecipeProvider.hasItem(EnergonItems.ENERGON), RecipeProvider.conditionsFromItem(EnergonItems.ENERGON))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.ENERGON_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, RandomItems.SPARK, 1)
                .pattern("OCO").pattern("CDC").pattern("OCO")
                .input('C', EnergonBlocks.COMPACT_ENERGON_BLOCK).input('O', Ore13Items.ORE_13).input('D', Blocks.DIAMOND_BLOCK)
                .criterion(RecipeProvider.hasItem(EnergonBlocks.COMPACT_ENERGON_BLOCK), RecipeProvider.conditionsFromItem(EnergonBlocks.COMPACT_ENERGON_BLOCK)).criterion(RecipeProvider.hasItem(Ore13Items.ORE_13), RecipeProvider.conditionsFromItem(Ore13Items.ORE_13)).criterion(RecipeProvider.hasItem(Blocks.DIAMOND_BLOCK), RecipeProvider.conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(RandomItems.SPARK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PHOTON_ITEM, 6)
                .pattern("O").pattern("O").pattern("O")
                .input('O', Ore13Items.ORE_13)
                .criterion(RecipeProvider.hasItem(Ore13Items.ORE_13), RecipeProvider.conditionsFromItem(Ore13Items.ORE_13))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemRegistry.PHOTON_ITEM)));


        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_BLOCK, EnergonItems.ENERGON, 9);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_BLOCK, EnergonItems.DARK_ENERGON, 9);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_BLOCK, Ore13Items.ORE_13, 9);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_BLOCK, TransformiumItems.TRANSFORMIUM, 9);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_STAIRS, EnergonBlocks.ENERGON_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_BLOCK);
        offerSlab(exporter, EnergonBlocks.ENERGON_SLAB, EnergonBlocks.ENERGON_BLOCK);
        offerStair(exporter, EnergonBlocks.ENERGON_STAIRS, EnergonBlocks.ENERGON_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonBlocks.DARK_ENERGON_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_BLOCK);
        offerSlab(exporter, EnergonBlocks.DARK_ENERGON_SLAB, EnergonBlocks.DARK_ENERGON_BLOCK);
        offerStair(exporter, EnergonBlocks.DARK_ENERGON_STAIRS, EnergonBlocks.DARK_ENERGON_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_STAIR, Ore13Blocks.ORE_13_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_BLOCK);
        offerSlab(exporter, Ore13Blocks.ORE_13_SLAB, Ore13Blocks.ORE_13_BLOCK);
        offerStair(exporter, Ore13Blocks.ORE_13_STAIR, Ore13Blocks.ORE_13_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        offerSlab(exporter, TransformiumBlocks.TRANSFORMIUM_SLAB, TransformiumBlocks.TRANSFORMIUM_BLOCK);
        offerStair(exporter, TransformiumBlocks.TRANSFORMIUM_STAIRS, TransformiumBlocks.TRANSFORMIUM_BLOCK);

        offerTransformerHelmet(exporter, Astrotrain.HELMET, AstrotrainChip.CHIP);
        offerTransformerChestplate(exporter, Astrotrain.CHESTPLATE, AstrotrainChip.CHIP);
        offerTransformerLeggings(exporter, Astrotrain.LEGGINGS, AstrotrainChip.CHIP);
        offerTransformerBoots(exporter, Astrotrain.BOOTS, AstrotrainChip.CHIP);
        offerTransformerCar(exporter, Astrotrain.SHUTTLE, Astrotrain.HELMET, Astrotrain.CHESTPLATE, Astrotrain.LEGGINGS, Astrotrain.BOOTS);
        offerTransformerCar(exporter, Astrotrain.TRAIN, Astrotrain.HELMET, Astrotrain.CHESTPLATE, Astrotrain.LEGGINGS, Astrotrain.BOOTS);

        offerTransformerHelmet(exporter, Bumblebee.HELMET, BumblebeeChip.CHIP);
        offerTransformerChestplate(exporter, Bumblebee.CHESTPLATE, BumblebeeChip.CHIP);
        offerTransformerLeggings(exporter, Bumblebee.LEGGINGS, BumblebeeChip.CHIP);
        offerTransformerBoots(exporter, Bumblebee.BOOTS, BumblebeeChip.CHIP);
        offerTransformerCar(exporter, Bumblebee.CAR, Bumblebee.HELMET, Bumblebee.CHESTPLATE, Bumblebee.LEGGINGS, Bumblebee.BOOTS);


        offerTransformerHelmet(exporter, Galvatron.HELMET, GalvatronChip.CHIP);
        offerTransformerChestplate(exporter, Galvatron.CHESTPLATE, GalvatronChip.CHIP);
        offerTransformerLeggings(exporter, Galvatron.LEGGINGS, GalvatronChip.CHIP);
        offerTransformerBoots(exporter, Galvatron.BOOTS, GalvatronChip.CHIP);
        offerTransformerCar(exporter, Galvatron.GALVATRON_GUN, Galvatron.HELMET, Galvatron.CHESTPLATE, Galvatron.LEGGINGS, Galvatron.BOOTS);


        offerTransformerHelmet(exporter, Ironhide.HELMET, IronhideChip.CHIP);
        offerTransformerChestplate(exporter, Ironhide.CHESTPLATE, IronhideChip.CHIP);
        offerTransformerLeggings(exporter, Ironhide.LEGGINGS, IronhideChip.CHIP);
        offerTransformerBoots(exporter, Ironhide.BOOTS, IronhideChip.CHIP);
        offerTransformerCar(exporter, Ironhide.CAR, Ironhide.HELMET, Ironhide.CHESTPLATE, Ironhide.LEGGINGS, Ironhide.BOOTS);


        offerTransformerHelmet(exporter, Megatron.HELMET, MegatronChip.CHIP);
        offerTransformerChestplate(exporter, Megatron.CHESTPLATE, MegatronChip.CHIP);
        offerTransformerLeggings(exporter, Megatron.LEGGINGS, MegatronChip.CHIP);
        offerTransformerBoots(exporter, Megatron.BOOTS, MegatronChip.CHIP);
        offerTransformerCar(exporter, ItemRegistry.MEGATRON_TRANSFORMED, Megatron.HELMET, Megatron.CHESTPLATE, Megatron.LEGGINGS, Megatron.BOOTS);


        offerTransformerHelmet(exporter, OptimusPrime.HELMET, OptimusPrimeChip.CHIP);
        offerTransformerChestplate(exporter, OptimusPrime.CHESTPLATE, OptimusPrimeChip.CHIP);
        offerTransformerLeggings(exporter, OptimusPrime.LEGGINGS, OptimusPrimeChip.CHIP);
        offerTransformerBoots(exporter, OptimusPrime.BOOTS, OptimusPrimeChip.CHIP);
        offerTransformerCar(exporter, OptimusPrime.CAR, OptimusPrime.HELMET, OptimusPrime.CHESTPLATE, OptimusPrime.LEGGINGS, OptimusPrime.BOOTS);


        offerTransformerHelmet(exporter, Scorpinok.HELMET, ScorpinokChip.CHIP);
        offerTransformerChestplate(exporter, Scorpinok.CHESTPLATE, ScorpinokChip.CHIP);
        offerTransformerLeggings(exporter, Scorpinok.LEGGINGS, ScorpinokChip.CHIP);
        offerTransformerBoots(exporter, Scorpinok.BOOTS, ScorpinokChip.CHIP);
        offerTransformerCar(exporter, Scorpinok.CAR, Scorpinok.HELMET, Scorpinok.CHESTPLATE, Scorpinok.LEGGINGS, Scorpinok.BOOTS);


        offerTransformerHelmet(exporter, Skystrike.HELMET, SkystrikeChip.CHIP);
        offerTransformerChestplate(exporter, Skystrike.CHESTPLATE, SkystrikeChip.CHIP);
        offerTransformerLeggings(exporter, Skystrike.LEGGINGS, SkystrikeChip.CHIP);
        offerTransformerBoots(exporter, Skystrike.BOOTS, SkystrikeChip.CHIP);
        offerTransformerCar(exporter, Skystrike.JET, Skystrike.HELMET, Skystrike.CHESTPLATE, Skystrike.LEGGINGS, Skystrike.BOOTS);


        offerTransformerHelmet(exporter, Soundwave.HELMET, SoundwaveChip.CHIP);
        offerTransformerChestplate(exporter, Soundwave.CHESTPLATE, SoundwaveChip.CHIP);
        offerTransformerLeggings(exporter, Soundwave.LEGGINGS, SoundwaveChip.CHIP);
        offerTransformerBoots(exporter, Soundwave.BOOTS, SoundwaveChip.CHIP);
        offerTransformerCar(exporter, Soundwave.RECORDER, Soundwave.HELMET, Soundwave.CHESTPLATE, Soundwave.LEGGINGS, Soundwave.BOOTS);


        offerTransformerHelmet(exporter, Starscream.HELMET, StarscreamChip.CHIP);
        offerTransformerChestplate(exporter, Starscream.CHESTPLATE, StarscreamChip.CHIP);
        offerTransformerLeggings(exporter, Starscream.LEGGINGS, StarscreamChip.CHIP);
        offerTransformerBoots(exporter, Starscream.BOOTS, StarscreamChip.CHIP);
        offerTransformerCar(exporter, Starscream.JET, Starscream.HELMET, Starscream.CHESTPLATE, Starscream.LEGGINGS, Starscream.BOOTS);


        offerTransformerHelmet(exporter, ThunderCracker.HELMET, ThunderCrackerChip.CHIP);
        offerTransformerChestplate(exporter, ThunderCracker.CHESTPLATE, ThunderCrackerChip.CHIP);
        offerTransformerLeggings(exporter, ThunderCracker.LEGGINGS, ThunderCrackerChip.CHIP);
        offerTransformerBoots(exporter, ThunderCracker.BOOTS, ThunderCrackerChip.CHIP);
        offerTransformerCar(exporter, ThunderCracker.JET, ThunderCracker.HELMET, ThunderCracker.CHESTPLATE, ThunderCracker.LEGGINGS, ThunderCracker.BOOTS);


        offerTransformerHelmet(exporter, RodimusPrime.HELMET, RodimusPrimeChip.CHIP);
        offerTransformerChestplate(exporter, RodimusPrime.CHESTPLATE, RodimusPrimeChip.CHIP);
        offerTransformerLeggings(exporter, RodimusPrime.LEGGINGS, RodimusPrimeChip.CHIP);
        offerTransformerBoots(exporter, RodimusPrime.BOOTS, RodimusPrimeChip.CHIP);
        offerTransformerCar(exporter, RodimusPrime.CAR, RodimusPrime.HELMET, RodimusPrime.CHESTPLATE, RodimusPrime.LEGGINGS, RodimusPrime.BOOTS);


        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, AstrotrainChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, BumblebeeChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, GalvatronChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, IronhideChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, MegatronChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, OptimusPrimeChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, StarscreamChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, RodimusPrimeChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, ScorpinokChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, SkystrikeChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, SoundwaveChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, ThunderCrackerChip.CHIP);
    }


    public static void offerTransformerHelmet(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible chip) {
        createTransformerHelmet(output, Ingredient.ofItems(new ItemConvertible[]{chip})).criterion(RecipeProvider.hasItem(chip), RecipeProvider.conditionsFromItem(chip)).offerTo(exporter);
    }


    public static void offerTransformerChestplate(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible chip) {
        createTransformerChestplate(output, Ingredient.ofItems(new ItemConvertible[]{chip})).criterion(RecipeProvider.hasItem(chip), RecipeProvider.conditionsFromItem(chip)).offerTo(exporter);
    }


    public static void offerTransformerLeggings(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible chip) {
        createTransformerLeggings(output, Ingredient.ofItems(new ItemConvertible[]{chip})).criterion(RecipeProvider.hasItem(chip), RecipeProvider.conditionsFromItem(chip)).offerTo(exporter);
    }


    public static void offerTransformerBoots(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible chip) {
        createTransformerBoots(output, Ingredient.ofItems(new ItemConvertible[]{chip})).criterion(RecipeProvider.hasItem(chip), RecipeProvider.conditionsFromItem(chip)).offerTo(exporter);
    }
    public static void offerTransformerCar(Consumer<RecipeJsonProvider> exporter, ItemConvertible car, ItemConvertible helmet, ItemConvertible chestplate, ItemConvertible leggings, ItemConvertible boots) {
        createTransformerCar(car, Ingredient.ofItems(new ItemConvertible[]{helmet}), Ingredient.ofItems(new ItemConvertible[]{chestplate}), Ingredient.ofItems(new ItemConvertible[]{leggings}), Ingredient.ofItems(new ItemConvertible[]{boots})).criterion(RecipeProvider.hasItem(helmet), RecipeProvider.conditionsFromItem(helmet)).criterion(RecipeProvider.hasItem(chestplate), RecipeProvider.conditionsFromItem(chestplate)).criterion(RecipeProvider.hasItem(leggings), RecipeProvider.conditionsFromItem(leggings)).criterion(RecipeProvider.hasItem(boots), RecipeProvider.conditionsFromItem(boots)).offerTo(exporter);
    }
    public static void offerStair(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createStair(output, Ingredient.ofItems(new ItemConvertible[]{input}))
                .criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerSlab(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createSlab(output, Ingredient.ofItems(new ItemConvertible[]{input}))
                .criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }
    private static CraftingRecipeJsonBuilder createStair(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('I', input)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III");
    }
    private static CraftingRecipeJsonBuilder createSlab(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('I', input)
                .pattern("III");
    }
    private static CraftingRecipeJsonBuilder createTransformerHelmet(ItemConvertible output, Ingredient chip) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output).input('T', TransformiumItems.TRANSFORMIUM).input('E', EnergonItems.ENERGON).input('C', chip).input('S', RandomItems.SPARK).input('D', Items.DIAMOND_HELMET).pattern("TCT").pattern("ESE").pattern("TDT");
    }
    private static CraftingRecipeJsonBuilder createTransformerChestplate(ItemConvertible output, Ingredient chip) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output).input('T', TransformiumItems.TRANSFORMIUM).input('E', EnergonItems.ENERGON).input('C', chip).input('S', RandomItems.SPARK).input('D', Items.DIAMOND_CHESTPLATE).pattern("TCT").pattern("ESE").pattern("TDT");
    }
    private static CraftingRecipeJsonBuilder createTransformerLeggings(ItemConvertible output, Ingredient chip) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output).input('T', TransformiumItems.TRANSFORMIUM).input('E', EnergonItems.ENERGON).input('C', chip).input('S', RandomItems.SPARK).input('D', Items.DIAMOND_LEGGINGS).pattern("TCT").pattern("ESE").pattern("TDT");
    }
    private static CraftingRecipeJsonBuilder createTransformerBoots(ItemConvertible output, Ingredient chip) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output).input('T', TransformiumItems.TRANSFORMIUM).input('E', EnergonItems.ENERGON).input('C', chip).input('S', RandomItems.SPARK).input('D', Items.DIAMOND_BOOTS).pattern("TCT").pattern("ESE").pattern("TDT");
    }
    private static CraftingRecipeJsonBuilder createTransformerCar(ItemConvertible car, Ingredient helmet, Ingredient chestplate, Ingredient leggings, Ingredient boots) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, car).input('H', helmet).input('C', chestplate).input('L', leggings).input('B', boots).input('T', TransformiumItems.TRANSFORMIUM).input('O', Ore13Items.ORE_13).pattern("HTC").pattern("TOT").pattern("LTB");
    }
    private static SingleItemRecipeJsonBuilder createChipRefining(Ingredient input, RecipeCategory category, ItemConvertible output, int count) {
        return new SingleItemRecipeJsonBuilder(category, ChipRefineryRecipe.Serializer.INSTANCE, input, output, count);
    }
    public static void offerChipRefiningRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output) {
        offerChipRefiningRecipe(exporter, category, output, 1);
    }
    public static void offerChipRefiningRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, int count) {
        createChipRefining(Ingredient.ofItems(Blocks.DIAMOND_BLOCK), category, output, count).criterion(RecipeProvider.hasItem(Blocks.DIAMOND_BLOCK), RecipeProvider.conditionsFromItem(Blocks.DIAMOND_BLOCK)).offerTo(exporter, RecipeProvider.convertBetween(output, Blocks.DIAMOND_BLOCK) + "_chip_refining");
    }
}
