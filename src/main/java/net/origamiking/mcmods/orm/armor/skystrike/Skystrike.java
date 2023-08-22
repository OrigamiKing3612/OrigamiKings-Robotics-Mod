package net.origamiking.mcmods.orm.armor.skystrike;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Skystrike extends ArmorUtils {
    public static final SkystrikeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "skystrike_armor_helmet", new SkystrikeArmorItem(ArmorItem.Type.HELMET));
    public static final SkystrikeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "skystrike_armor_chestplate", new SkystrikeArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final SkystrikeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "skystrike_armor_leggings", new SkystrikeArmorItem(ArmorItem.Type.LEGGINGS));
    public static final SkystrikeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "skystrike_armor_boots", new SkystrikeArmorItem(ArmorItem.Type.BOOTS));
    public static final SkystrikeCarArmorItem JET = registerArmor(OrmMain.MOD_ID, "skystrike_jet", new SkystrikeCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
