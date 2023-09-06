package net.origamiking.mcmods.orm.datagen.advancements;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.bumblebee.BumblebeeArmorItem;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.ironhide.IronhideArmorItem;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrimeArmorItem;
import net.origamiking.mcmods.orm.armor.ratchet.Ratchet;
import net.origamiking.mcmods.orm.armor.ratchet.RatchetArmorItem;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrime;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrimeArmorItem;
import net.origamiking.mcmods.orm.armor.sideswipe.Sideswipe;
import net.origamiking.mcmods.orm.armor.sideswipe.SideswipeArmorItem;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeArmorItem;
import net.origamiking.mcmods.orm.armor.sunstreaker.Sunstreaker;
import net.origamiking.mcmods.orm.armor.sunstreaker.SunstreakerArmorItem;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableDescription;
import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableTitle;

public class AutobotAdvancements {
    public static void get(Consumer<AdvancementEntry> advancementConsumer, AdvancementEntry mainParent) {
        AdvancementEntry optimus_prime = Advancement.Builder.create().parent(mainParent)
                .display(
                        OptimusPrime.HELMET, // icon
                        Text.translatable(translatableTitle(OptimusPrimeArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(OptimusPrimeArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, OptimusPrimeArmorItem.armorItemId()));

        AdvancementEntry bumblebee = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Bumblebee.HELMET, // icon
                        Text.translatable(translatableTitle(BumblebeeArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(BumblebeeArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, BumblebeeArmorItem.armorItemId()));

        AdvancementEntry ironhide = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Ironhide.HELMET, // icon
                        Text.translatable(translatableTitle(IronhideArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(IronhideArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, IronhideArmorItem.armorItemId()));

        AdvancementEntry rodimus_prime = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        RodimusPrime.HELMET, // icon
                        Text.translatable(translatableTitle(RodimusPrimeArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(RodimusPrimeArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, RodimusPrimeArmorItem.armorItemId()));

        AdvancementEntry skystrike = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Skystrike.HELMET, // icon
                        Text.translatable(translatableTitle(SkystrikeArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(SkystrikeArmorItem.armorItemId())), // description
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
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, SkystrikeArmorItem.armorItemId()));

        AdvancementEntry ratchet = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Ratchet.HELMET, // icon
                        Text.translatable(translatableTitle("ratchet")), // title
                        Text.translatable(translatableDescription("ratchet")), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Ratchet.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Ratchet.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Ratchet.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Ratchet.BOOTS))
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, RatchetArmorItem.armorItemId()));

        AdvancementEntry sideswipe = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Sideswipe.HELMET, // icon
                        Text.translatable(translatableTitle(SideswipeArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(SideswipeArmorItem.armorItemId())), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Sideswipe.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Sideswipe.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Sideswipe.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Sideswipe.BOOTS))
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, SideswipeArmorItem.armorItemId()));

        AdvancementEntry sunstreaker = Advancement.Builder.create().parent(optimus_prime)
                .display(
                        Sunstreaker.HELMET, // icon
                        Text.translatable(translatableTitle(SunstreakerArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(SunstreakerArmorItem.armorItemId())), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Sunstreaker.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Sunstreaker.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Sunstreaker.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Sunstreaker.BOOTS))
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(true, SunstreakerArmorItem.armorItemId()));
    }
}
