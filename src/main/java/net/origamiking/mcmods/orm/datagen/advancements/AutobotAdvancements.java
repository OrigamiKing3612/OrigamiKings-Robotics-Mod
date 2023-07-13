package net.origamiking.mcmods.orm.datagen.advancements;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrime;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableDescription;
import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableTitle;

public class AutobotAdvancements {
    public static void get(Consumer<Advancement> advancementConsumer, Advancement mainParent) {
        Advancement optimus_prime = Advancement.Builder.create().parent(mainParent)
                .display(
                        OptimusPrime.HELMET, // icon
                        Text.translatable(translatableTitle("optimus_prime")), // title
                        Text.translatable(translatableDescription("optimus_prime")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(OptimusPrime.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(OptimusPrime.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(OptimusPrime.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(OptimusPrime.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/autobots/optimus_prime");

        Advancement bumblebee = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Bumblebee.HELMET, // icon
                        Text.translatable(translatableTitle("bumblebee")), // title
                        Text.translatable(translatableDescription("bumblebee")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Bumblebee.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Bumblebee.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Bumblebee.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Bumblebee.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/autobots/bumblebee");

        Advancement ironhide = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Ironhide.HELMET, // icon
                        Text.translatable(translatableTitle("ironhide")), // title
                        Text.translatable(translatableDescription("ironhide")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Ironhide.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Ironhide.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Ironhide.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Ironhide.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/autobots/ironhide");

        Advancement rodimus_prime = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        RodimusPrime.HELMET, // icon
                        Text.translatable(translatableTitle("rodimus_prime")), // title
                        Text.translatable(translatableDescription("rodimus_prime")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(RodimusPrime.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(RodimusPrime.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(RodimusPrime.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(RodimusPrime.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/autobots/rodimus_prime");

        Advancement skystrike = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Skystrike.HELMET, // icon
                        Text.translatable(translatableTitle("skystrike")), // title
                        Text.translatable(translatableDescription("skystrike")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Skystrike.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Skystrike.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Skystrike.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Skystrike.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/autobots/skystrike");
    }
}
