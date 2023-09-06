package net.origamiking.mcmods.orm.datagen.advancements;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.astrotrain.AstrotrainArmorItem;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.galvatron.GalvatronArmorItem;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.megatron.MegatronArmorItem;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.scorpinok.ScorpinokArmorItem;
import net.origamiking.mcmods.orm.armor.shockwave.Shockwave;
import net.origamiking.mcmods.orm.armor.shockwave.ShockwaveArmorItem;
import net.origamiking.mcmods.orm.armor.skywarp.Skywarp;
import net.origamiking.mcmods.orm.armor.skywarp.SkywarpArmorItem;
import net.origamiking.mcmods.orm.armor.soundwave.Soundwave;
import net.origamiking.mcmods.orm.armor.soundwave.SoundwaveArmorItem;
import net.origamiking.mcmods.orm.armor.starscream.Starscream;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamArmorItem;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCrackerArmorItem;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableDescription;
import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableTitle;

public class DecepticonsAdvancements {
    public static void get(Consumer<AdvancementEntry> advancementConsumer, AdvancementEntry mainParent) {
        AdvancementEntry megatron = Advancement.Builder.create().parent(mainParent)
                .display(
                        Megatron.HELMET, // icon
                        Text.translatable(translatableTitle(MegatronArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(MegatronArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, MegatronArmorItem.armorItemId()));

        AdvancementEntry astrotrain = Advancement.Builder.create().parent(megatron)
                .display(
                        Astrotrain.HELMET, // icon
                        Text.translatable(translatableTitle(AstrotrainArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(AstrotrainArmorItem.armorItemId())), // description
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
                .build(advancementConsumer,  OrmAdvancements.getAdvancementPath(false, AstrotrainArmorItem.armorItemId()));

        AdvancementEntry galvatron = Advancement.Builder.create().parent(megatron)
                .display(
                        Galvatron.HELMET, // icon
                        Text.translatable(translatableTitle(GalvatronArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(GalvatronArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, GalvatronArmorItem.armorItemId()));

        AdvancementEntry scorpinok = Advancement.Builder.create().parent(megatron)
                .display(
                        Scorpinok.HELMET, // icon
                        Text.translatable(translatableTitle(ScorpinokArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(ScorpinokArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, ScorpinokArmorItem.armorItemId()));

        AdvancementEntry soundwave = Advancement.Builder.create().parent(megatron)
                .display(
                        Soundwave.HELMET, // icon
                        Text.translatable(translatableTitle(SoundwaveArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(SoundwaveArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, SoundwaveArmorItem.armorItemId()));

        AdvancementEntry starscream = Advancement.Builder.create().parent(megatron)
                .display(
                        Starscream.HELMET, // icon
                        Text.translatable(translatableTitle(StarscreamArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(StarscreamArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, StarscreamArmorItem.armorItemId()));

        AdvancementEntry thunder_cracker = Advancement.Builder.create().parent(megatron)
                .display(
                        ThunderCracker.HELMET, // icon
                        Text.translatable(translatableTitle(ThunderCrackerArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(ThunderCrackerArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, ThunderCrackerArmorItem.armorItemId()));

        AdvancementEntry skywarp = Advancement.Builder.create().parent(megatron)
                .display(
                        Skywarp.HELMET, // icon
                        Text.translatable(translatableTitle(SkywarpArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(SkywarpArmorItem.armorItemId())), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Skywarp.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Skywarp.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Skywarp.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Skywarp.BOOTS))
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, SkywarpArmorItem.armorItemId()));

        AdvancementEntry shockwave = Advancement.Builder.create().parent(megatron)
                .display(
                        Shockwave.HELMET, // icon
                        Text.translatable(translatableTitle(ShockwaveArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(ShockwaveArmorItem.armorItemId())), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Shockwave.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Shockwave.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Shockwave.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Shockwave.BOOTS))
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, ShockwaveArmorItem.armorItemId()));

    }
}
