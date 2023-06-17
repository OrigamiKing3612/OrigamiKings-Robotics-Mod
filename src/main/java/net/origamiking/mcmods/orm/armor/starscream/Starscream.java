package net.origamiking.mcmods.orm.armor.starscream;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Starscream extends ArmorUtils {
    public static final StarscreamArmorItem HELMET = registerItem("starscream_helmet", new StarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final StarscreamArmorItem CHESTPLATE = registerItem("starscream_chestplate", new StarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final StarscreamArmorItem LEGGINGS = registerItem("starscream_leggings", new StarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final StarscreamArmorItem BOOTS = registerItem("starscream_boots", new StarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final StarscreamJetArmorItem JET = registerItem("starscream_jet", new StarscreamJetArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
