package net.origamiking.orm.armor.thunder_cracker;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.orm.armor.ArmorRegistry;

public class ThunderCracker extends ArmorRegistry {
    public static final ThunderCrackerArmorItem THUNDER_CRACKER_HELMET = registerItem("thunder_cracker_helmet", new ThunderCrackerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final ThunderCrackerArmorItem THUNDER_CRACKER_CHESTPLATE = registerItem("thunder_cracker_chestplate", new ThunderCrackerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final ThunderCrackerArmorItem THUNDER_CRACKER_LEGGINGS = registerItem("thunder_cracker_leggings", new ThunderCrackerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final ThunderCrackerArmorItem THUNDER_CRACKER_BOOTS = registerItem("thunder_cracker_boots", new ThunderCrackerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final ThunderCrackerJetArmorItem THUNDER_CRACKER_JET = registerItem("thunder_cracker_jet", new ThunderCrackerJetArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static void get() {}
}
