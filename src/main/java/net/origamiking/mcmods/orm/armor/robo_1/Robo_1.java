package net.origamiking.mcmods.orm.armor.robo_1;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Robo_1 extends ArmorUtils {
    public static final Robo_1_CarArmorItem ROBO_1_CAR = registerItem("robo_1_car", new Robo_1_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_HELMET = registerItem("robo_1_armor_helmet", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_CHESTPLATE = registerItem("robo_1_armor_chestplate", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_LEGGINGS = registerItem("robo_1_armor_leggings", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_BOOTS = registerItem("robo_1_armor_boots", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
