package net.origamiking.mcmods.orm.armor.optimus_prime;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class OptimusPrime extends ArmorUtils {
    public static final OptimusPrimeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_helmet", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final OptimusPrimeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_chestplate", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final OptimusPrimeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_leggings", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final OptimusPrimeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "optimus_prime_armor_boots", new OptimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final OptimusPrimeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "optimus_prime_car", new OptimusPrimeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
