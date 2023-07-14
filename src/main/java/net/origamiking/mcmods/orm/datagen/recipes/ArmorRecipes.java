package net.origamiking.mcmods.orm.datagen.recipes;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrime;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.shockwave.Shockwave;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;
import net.origamiking.mcmods.orm.armor.skywarp.Skywarp;
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
import net.origamiking.mcmods.orm.items.chips.shockwave.ShockwaveChip;
import net.origamiking.mcmods.orm.items.chips.skystrike.SkystrikeChip;
import net.origamiking.mcmods.orm.items.chips.skywarp.SkywarpChip;
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
        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, AstrotrainChip.CHIP);

        transformerRecipes(exporter, Bumblebee.HELMET, Bumblebee.CHESTPLATE, Bumblebee.LEGGINGS, Bumblebee.BOOTS, Bumblebee.CAR, BumblebeeChip.CHIP);
        transformerRecipes(exporter, Galvatron.HELMET, Galvatron.CHESTPLATE, Galvatron.LEGGINGS, Galvatron.BOOTS, Galvatron.GALVATRON_GUN, GalvatronChip.CHIP);
        transformerRecipes(exporter, Ironhide.HELMET, Ironhide.CHESTPLATE, Ironhide.LEGGINGS, Ironhide.BOOTS, Ironhide.CAR, IronhideChip.CHIP);
        transformerRecipes(exporter, Megatron.HELMET, Megatron.CHESTPLATE, Megatron.LEGGINGS, Megatron.BOOTS, ItemRegistry.MEGATRON_TRANSFORMED, MegatronChip.CHIP);
        transformerRecipes(exporter, OptimusPrime.HELMET, OptimusPrime.CHESTPLATE, OptimusPrime.LEGGINGS, OptimusPrime.BOOTS, OptimusPrime.CAR, OptimusPrimeChip.CHIP);
        transformerRecipes(exporter, Scorpinok.HELMET, Scorpinok.CHESTPLATE, Scorpinok.LEGGINGS, Scorpinok.BOOTS, Scorpinok.CAR, ScorpinokChip.CHIP);
        transformerRecipes(exporter, Skystrike.HELMET, Skystrike.CHESTPLATE, Skystrike.LEGGINGS, Skystrike.BOOTS, Skystrike.JET, SkystrikeChip.CHIP);
        transformerRecipes(exporter, Soundwave.HELMET, Soundwave.CHESTPLATE, Soundwave.LEGGINGS, Soundwave.BOOTS, Soundwave.RECORDER, SoundwaveChip.CHIP);
        transformerRecipes(exporter, Starscream.HELMET, Starscream.CHESTPLATE, Starscream.LEGGINGS, Starscream.BOOTS, Starscream.JET, StarscreamChip.CHIP);
        transformerRecipes(exporter, ThunderCracker.HELMET, ThunderCracker.CHESTPLATE, ThunderCracker.LEGGINGS, ThunderCracker.BOOTS, ThunderCracker.JET, ThunderCrackerChip.CHIP);
        transformerRecipes(exporter, RodimusPrime.HELMET, RodimusPrime.CHESTPLATE, RodimusPrime.LEGGINGS, RodimusPrime.BOOTS, RodimusPrime.CAR, RodimusPrimeChip.CHIP);
        transformerRecipes(exporter, Skywarp.HELMET, Skywarp.CHESTPLATE, Skywarp.LEGGINGS, Skywarp.BOOTS, Skywarp.JET, SkywarpChip.CHIP);
        transformerRecipes(exporter, Shockwave.HELMET, Shockwave.CHESTPLATE, Shockwave.LEGGINGS, Shockwave.BOOTS, ItemRegistry.SHOCKWAVE_TRANSFORMED, ShockwaveChip.CHIP);

    }
}
