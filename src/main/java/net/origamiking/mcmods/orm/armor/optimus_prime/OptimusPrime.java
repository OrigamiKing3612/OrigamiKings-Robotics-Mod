package net.origamiking.mcmods.orm.armor.optimus_prime;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class OptimusPrime extends ArmorUtils {
    public static final OptimusPrimeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_helmet", new OptimusPrimeArmorItem(ArmorItem.Type.HELMET));
    public static final OptimusPrimeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_chestplate", new OptimusPrimeArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final OptimusPrimeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_leggings", new OptimusPrimeArmorItem(ArmorItem.Type.LEGGINGS));
    public static final OptimusPrimeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_boots", new OptimusPrimeArmorItem(ArmorItem.Type.BOOTS));
    public static final OptimusPrimeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "optimus_prime_car", new OptimusPrimeCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
