package net.origamiking.mcmods.orm.armor.rodimus_prime;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class RodimusPrime extends ArmorUtils {
    public static final RodimusPrimeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "rodimus_prime_helmet", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final RodimusPrimeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "rodimus_prime_chestplate", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final RodimusPrimeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "rodimus_prime_leggings", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final RodimusPrimeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "rodimus_prime_boots", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final RodimusPrimeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "rodimus_prime_car", new RodimusPrimeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
