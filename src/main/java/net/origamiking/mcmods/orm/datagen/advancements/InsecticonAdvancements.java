package net.origamiking.mcmods.orm.datagen.advancements;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.armor.kickback.Kickback;
import net.origamiking.mcmods.orm.armor.kickback.KickbackArmorItem;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableDescription;
import static net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements.translatableTitle;

public class InsecticonAdvancements {
    public static void get(Consumer<Advancement> advancementConsumer, Advancement mainParent) {

        Advancement kickback = Advancement.Builder.create().parent(mainParent)
                .display(
                        Kickback.HELMET, // icon
                        Text.translatable(translatableTitle(KickbackArmorItem.armorItemId())), // title
                        Text.translatable(translatableDescription(KickbackArmorItem.armorItemId())), // description
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("get_helmet", InventoryChangedCriterion.Conditions.items(Kickback.HELMET))
                .criterion("get_chestplate", InventoryChangedCriterion.Conditions.items(Kickback.CHESTPLATE))
                .criterion("get_leggings", InventoryChangedCriterion.Conditions.items(Kickback.LEGGINGS))
                .criterion("get_boots", InventoryChangedCriterion.Conditions.items(Kickback.BOOTS))
                .build(advancementConsumer, OrmAdvancements.getAdvancementPath(false, KickbackArmorItem.armorItemId()));
    }
}
