package net.origamiking.mcmods.orm.datagen.advancements;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.soundwave.Soundwave;
import net.origamiking.mcmods.orm.armor.starscream.Starscream;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.*;

public class DecepticonsAdvancements {
    public static void get(Consumer<Advancement> advancementConsumer, Advancement mainParent) {
        Advancement megatron = Advancement.Builder.create().parent(mainParent)
                .display(
                        Megatron.HELMET, // icon
                        Text.translatable(translatableTitle("megatron")), // title
                        Text.translatable(translatableDescription("megatron")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Megatron.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Megatron.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Megatron.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Megatron.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/decepticons/megatron");
        Advancement parent = megatron;

        Advancement astrotrain = Advancement.Builder.create().parent(parent)
                .display(
                        Astrotrain.HELMET, // icon
                        Text.translatable(translatableTitle("astrotrain")), // title
                        Text.translatable(translatableDescription("astrotrain")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Astrotrain.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Astrotrain.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Astrotrain.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Astrotrain.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/autobots/astrotrain");

        Advancement galvatron = Advancement.Builder.create().parent(parent)
                .display(
                        Galvatron.HELMET, // icon
                        Text.translatable(translatableTitle("galvatron")), // title
                        Text.translatable(translatableDescription("galvatron")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Galvatron.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Galvatron.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Galvatron.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Galvatron.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/decepticons/galvatron");

        Advancement scorpinok = Advancement.Builder.create().parent(parent)
                .display(
                        Scorpinok.HELMET, // icon
                        Text.translatable(translatableTitle("scorpinok")), // title
                        Text.translatable(translatableDescription("scorpinok")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Scorpinok.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Scorpinok.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Scorpinok.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Scorpinok.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/decepticons/scorpinok");

        Advancement soundwave = Advancement.Builder.create().parent(parent)
                .display(
                        Soundwave.HELMET, // icon
                        Text.translatable(translatableTitle("soundwave")), // title
                        Text.translatable(translatableDescription("soundwave")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Soundwave.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Soundwave.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Soundwave.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Soundwave.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/decepticons/soundwave");

        Advancement starscream = Advancement.Builder.create().parent(parent)
                .display(
                        Starscream.HELMET, // icon
                        Text.translatable(translatableTitle("starscream")), // title
                        Text.translatable(translatableDescription("starscream")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Starscream.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Starscream.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Starscream.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Starscream.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/decepticons/starscream");

        Advancement thunder_cracker = Advancement.Builder.create().parent(parent)
                .display(
                        ThunderCracker.HELMET, // icon
                        Text.translatable(translatableTitle("thunder_cracker")), // title
                        Text.translatable(translatableDescription("thunder_cracker")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(ThunderCracker.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(ThunderCracker.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(ThunderCracker.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(ThunderCracker.BOOTS))
                .build(advancementConsumer, OrmMain.MOD_ID + "/decepticons/thunder_cracker");

    }
}
