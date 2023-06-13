package net.origamiking.mcmods.orm.armor.skystrike;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Skystrike extends ArmorUtils {
    public static final SkystrikeArmorItem HELMET = registerItem("skystrike_armor_helmet", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final SkystrikeArmorItem CHESTPLATE = registerItem("skystrike_armor_chestplate", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SkystrikeArmorItem LEGGINGS = registerItem("skystrike_armor_leggings", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final SkystrikeArmorItem BOOTS = registerItem("skystrike_armor_boots", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Skystrike_CarArmorItem JET = registerItem("skystrike_jet", new Skystrike_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static void get() {}
}
