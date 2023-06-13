package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oapi.recipes.ModRecipeProvider;
import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
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
import net.origamiking.mcmods.orm.items.chips.robot_starscream.StarsceamChip;
import net.origamiking.mcmods.orm.items.chips.scorpinok.ScorpinokChip;
import net.origamiking.mcmods.orm.items.chips.skystrike.SkystrikeChip;
import net.origamiking.mcmods.orm.items.chips.soundwave.SoundwaveChip;
import net.origamiking.mcmods.orm.items.chips.thunder_cracker.ThunderCrackerChip;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_BLOCK, EnergonItems.ENERGON);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_BLOCK, Ore13Items.ORE_13);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_BLOCK, TransformiumItems.TRANSFORMIUM);
        offerTransformerHelmet(exporter, Astrotrain.HELMET, AstrotrainChip.CHIP);
        offerTransformerChestplate(exporter, Astrotrain.CHESTPLATE, AstrotrainChip.CHIP);
        offerTransformerLeggings(exporter, Astrotrain.LEGGINGS, AstrotrainChip.CHIP);
        offerTransformerBoots(exporter, Astrotrain.BOOTS, AstrotrainChip.CHIP);

        offerTransformerHelmet(exporter, Bumblebee.HELMET, BumblebeeChip.CHIP);
        offerTransformerChestplate(exporter, Bumblebee.CHESTPLATE, BumblebeeChip.CHIP);
        offerTransformerLeggings(exporter, Bumblebee.LEGGINGS, BumblebeeChip.CHIP);
        offerTransformerBoots(exporter, Bumblebee.BOOTS, BumblebeeChip.CHIP);

        offerTransformerHelmet(exporter, Galvatron.HELMET, GalvatronChip.CHIP);
        offerTransformerChestplate(exporter, Galvatron.CHESTPLATE, GalvatronChip.CHIP);
        offerTransformerLeggings(exporter, Galvatron.LEGGINGS, GalvatronChip.CHIP);
        offerTransformerBoots(exporter, Galvatron.BOOTS, GalvatronChip.CHIP);

        offerTransformerHelmet(exporter, Ironhide.HELMET, IronhideChip.CHIP);
        offerTransformerChestplate(exporter, Ironhide.CHESTPLATE, IronhideChip.CHIP);
        offerTransformerLeggings(exporter, Ironhide.LEGGINGS, IronhideChip.CHIP);
        offerTransformerBoots(exporter, Ironhide.BOOTS, IronhideChip.CHIP);

        offerTransformerHelmet(exporter, Megatron.HELMET, MegatronChip.CHIP);
        offerTransformerChestplate(exporter, Megatron.CHESTPLATE, MegatronChip.CHIP);
        offerTransformerLeggings(exporter, Megatron.LEGGINGS, MegatronChip.CHIP);
        offerTransformerBoots(exporter, Megatron.BOOTS, MegatronChip.CHIP);

        offerTransformerHelmet(exporter, OptimusPrime.HELMET, OptimusPrimeChip.CHIP);
        offerTransformerChestplate(exporter, OptimusPrime.CHESTPLATE, OptimusPrimeChip.CHIP);
        offerTransformerLeggings(exporter, OptimusPrime.LEGGINGS, OptimusPrimeChip.CHIP);
        offerTransformerBoots(exporter, OptimusPrime.BOOTS, OptimusPrimeChip.CHIP);

        offerTransformerHelmet(exporter, Scorpinok.HELMET, ScorpinokChip.CHIP);
        offerTransformerChestplate(exporter, Scorpinok.CHESTPLATE, ScorpinokChip.CHIP);
        offerTransformerLeggings(exporter, Scorpinok.LEGGINGS, ScorpinokChip.CHIP);
        offerTransformerBoots(exporter, Scorpinok.BOOTS, ScorpinokChip.CHIP);

        offerTransformerHelmet(exporter, Skystrike.HELMET, SkystrikeChip.CHIP);
        offerTransformerChestplate(exporter, Skystrike.CHESTPLATE, SkystrikeChip.CHIP);
        offerTransformerLeggings(exporter, Skystrike.LEGGINGS, SkystrikeChip.CHIP);
        offerTransformerBoots(exporter, Skystrike.BOOTS, SkystrikeChip.CHIP);

        offerTransformerHelmet(exporter, Soundwave.HELMET, SoundwaveChip.CHIP);
        offerTransformerChestplate(exporter, Soundwave.CHESTPLATE, SoundwaveChip.CHIP);
        offerTransformerLeggings(exporter, Soundwave.LEGGINGS, SoundwaveChip.CHIP);
        offerTransformerBoots(exporter, Soundwave.BOOTS, SoundwaveChip.CHIP);

        offerTransformerHelmet(exporter, Starscream.HELMET, StarsceamChip.CHIP);
        offerTransformerChestplate(exporter, Starscream.CHESTPLATE, StarsceamChip.CHIP);
        offerTransformerLeggings(exporter, Starscream.LEGGINGS, StarsceamChip.CHIP);
        offerTransformerBoots(exporter, Starscream.BOOTS, StarsceamChip.CHIP);

        offerTransformerHelmet(exporter, ThunderCracker.HELMET, ThunderCrackerChip.CHIP);
        offerTransformerChestplate(exporter, ThunderCracker.CHESTPLATE, ThunderCrackerChip.CHIP);
        offerTransformerLeggings(exporter, ThunderCracker.LEGGINGS, ThunderCrackerChip.CHIP);
        offerTransformerBoots(exporter, ThunderCracker.BOOTS, ThunderCrackerChip.CHIP);
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
}
