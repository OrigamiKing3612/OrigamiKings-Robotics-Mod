package net.origamiking.orm.armor.bumblebee;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.orm.utils.ArmorUtils;

public class Bumblebee extends ArmorUtils {
    public static final BumblebeeArmorItem BUMBLEBEE_HELMET = registerItem("bumblebee_helmet", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final BumblebeeArmorItem BUMBLEBEE_CHESTPLATE = registerItem("bumblebee_chestplate", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final BumblebeeArmorItem BUMBLEBEE_LEGGINGS = registerItem("bumblebee_leggings", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final BumblebeeArmorItem BUMBLEBEE_BOOTS = registerItem("bumblebee_boots", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final BumblebeeCarArmorItem BUMBLEBEE_CAR = registerItem("bumblebee_car", new BumblebeeCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
