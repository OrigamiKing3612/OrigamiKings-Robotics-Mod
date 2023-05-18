package net.origamiking.mcmods.orm.armor.scorpinok;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Scorpinok extends ArmorUtils {
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_HELMET = registerItem("scorpinok_helmet", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_CHESTPLATE = registerItem("scorpinok_chestplate", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_LEGGINGS = registerItem("scorpinok_leggings", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_BOOTS = registerItem("scorpinok_boots", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Scorpinok_CarArmorItem SCORPINOK_CAR = registerItem("scorpinok_car", new Scorpinok_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static void get() {}
}
