package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
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
import net.origamiking.mcmods.orm.items.chips.astrotrain.AstrotrainChip;
import net.origamiking.mcmods.orm.items.chips.bumblebee.BumblebeeChip;
import net.origamiking.mcmods.orm.items.chips.galvatron.GalvatronChip;
import net.origamiking.mcmods.orm.items.chips.ironhide.IronhideChip;
import net.origamiking.mcmods.orm.items.chips.megatron.MegatronChip;
import net.origamiking.mcmods.orm.items.chips.optimus_prime.OptimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.rodimus_prime.RodimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.scorpinok.ScorpinokChip;
import net.origamiking.mcmods.orm.items.chips.skystrike.SkystrikeChip;
import net.origamiking.mcmods.orm.items.chips.soundwave.SoundwaveChip;
import net.origamiking.mcmods.orm.items.chips.starscream.StarscreamChip;
import net.origamiking.mcmods.orm.items.chips.thunder_cracker.ThunderCrackerChip;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.recipes.providers.OrmRecipeProvider.*;

public class ArmorRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
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

        transformerRecipes(exporter, RodimusPrime.HELMET, RodimusPrime.CHESTPLATE, RodimusPrime.LEGGINGS, RodimusPrime.BOOTS, RodimusPrime.CAR, RodimusPrimeChip.CHIP);

        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, AstrotrainChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, BumblebeeChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, GalvatronChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, IronhideChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, MegatronChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, OptimusPrimeChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, StarscreamChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, ScorpinokChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, SkystrikeChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, SoundwaveChip.CHIP);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, ThunderCrackerChip.CHIP);
    }
    public static void transformerRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible helmet, ItemConvertible chestplate, ItemConvertible leggings, ItemConvertible boots, ItemConvertible car, ItemConvertible chip) {
        offerTransformerHelmet(exporter, helmet, chip);
        offerTransformerChestplate(exporter, chestplate, chip);
        offerTransformerLeggings(exporter, leggings, chip);
        offerTransformerBoots(exporter, boots, chip);
        offerTransformerCar(exporter, car, helmet, chestplate, leggings, boots);
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, chip);
    }
}
