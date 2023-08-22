package net.origamiking.mcmods.orm.armor.thunder_cracker;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class ThunderCracker extends ArmorUtils {
    public static final ThunderCrackerArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "thunder_cracker_helmet", new ThunderCrackerArmorItem(ArmorItem.Type.HELMET));
    public static final ThunderCrackerArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "thunder_cracker_chestplate", new ThunderCrackerArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final ThunderCrackerArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "thunder_cracker_leggings", new ThunderCrackerArmorItem(ArmorItem.Type.LEGGINGS));
    public static final ThunderCrackerArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "thunder_cracker_boots", new ThunderCrackerArmorItem(ArmorItem.Type.BOOTS));
    public static final ThunderCrackerJetArmorItem JET = registerArmor(OrmMain.MOD_ID, "thunder_cracker_jet", new ThunderCrackerJetArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
