package net.origamiking.mcmods.orm.armor.rodimus_prime;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class RodimusPrime extends ArmorUtils {
    public static final RodimusPrimeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "rodimus_prime_helmet", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final RodimusPrimeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "rodimus_prime_chestplate", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final RodimusPrimeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "rodimus_prime_leggings", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final RodimusPrimeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "rodimus_prime_boots", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RodimusPrimeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "rodimus_prime_car", new RodimusPrimeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static void get() {
    }
}
