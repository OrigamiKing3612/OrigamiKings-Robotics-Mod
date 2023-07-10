package net.origamiking.mcmods.orm.armor.optimus_prime;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class OptimusPrime extends ArmorUtils {
    public static final OptimusPrimeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_helmet", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final OptimusPrimeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_chestplate", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final OptimusPrimeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_leggings", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final OptimusPrimeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_boots", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final OptimusPrimeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "optimus_prime_car", new OptimusPrimeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
