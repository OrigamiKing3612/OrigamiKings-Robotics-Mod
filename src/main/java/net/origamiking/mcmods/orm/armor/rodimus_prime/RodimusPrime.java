package net.origamiking.mcmods.orm.armor.rodimus_prime;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class RodimusPrime extends ArmorUtils {
    public static final RodimusPrimeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "rodimus_prime_helmet", new RodimusPrimeArmorItem(ArmorItem.Type.HELMET));
    public static final RodimusPrimeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "rodimus_prime_chestplate", new RodimusPrimeArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RodimusPrimeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "rodimus_prime_leggings", new RodimusPrimeArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RodimusPrimeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "rodimus_prime_boots", new RodimusPrimeArmorItem(ArmorItem.Type.BOOTS));
    public static final RodimusPrimeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "rodimus_prime_car", new RodimusPrimeCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
