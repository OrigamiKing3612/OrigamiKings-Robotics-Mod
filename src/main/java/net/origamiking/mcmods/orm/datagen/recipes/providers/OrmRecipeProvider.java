package net.origamiking.mcmods.orm.datagen.recipes.providers;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;
import net.origamiking.mcmods.orm.recipe.ChipRefineryRecipe;

import java.util.function.Consumer;

public class OrmRecipeProvider {
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
    private static CraftingRecipeJsonBuilder createCommpress2x2(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).input('#', input).pattern("##").pattern("##");
    }
    public static void offer2x2Commpress(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createCommpress2x2(output, Ingredient.ofItems(new ItemConvertible[]{input})).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
}
