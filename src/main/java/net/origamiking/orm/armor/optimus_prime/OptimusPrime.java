package net.origamiking.orm.armor.optimus_prime;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.orm.utils.ArmorUtils;

public class OptimusPrime extends ArmorUtils {
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_HELMET = registerItem("optimus_prime_armor_helmet", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_CHESTPLATE = registerItem("optimus_prime_armor_chestplate", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_LEGGINGS = registerItem("optimus_prime_armor_leggings", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_BOOTS = registerItem("optimus_prime_armor_boots", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final OptimusPrimeCarArmorItem OPTIMUS_PRIME_CAR = registerItem("optimus_prime_car", new OptimusPrimeCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
