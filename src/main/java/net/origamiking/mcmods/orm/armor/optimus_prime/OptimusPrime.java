package net.origamiking.mcmods.orm.armor.optimus_prime;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class OptimusPrime extends ArmorUtils {
    public static final OptimusPrimeArmorItem HELMET = registerItem("optimus_prime_armor_helmet", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final OptimusPrimeArmorItem CHESTPLATE = registerItem("optimus_prime_armor_chestplate", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final OptimusPrimeArmorItem LEGGINGS = registerItem("optimus_prime_armor_leggings", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final OptimusPrimeArmorItem BOOTS = registerItem("optimus_prime_armor_boots", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final OptimusPrimeCarArmorItem CAR = registerItem("optimus_prime_car", new OptimusPrimeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
