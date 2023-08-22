package net.origamiking.mcmods.orm.armor.sunstreaker;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Sunstreaker extends ArmorUtils {
    public static final SunstreakerArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "sunstreaker_helmet", new SunstreakerArmorItem(ArmorItem.Type.HELMET));
    public static final SunstreakerArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "sunstreaker_chestplate", new SunstreakerArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final SunstreakerArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "sunstreaker_leggings", new SunstreakerArmorItem(ArmorItem.Type.LEGGINGS));
    public static final SunstreakerArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "sunstreaker_boots", new SunstreakerArmorItem(ArmorItem.Type.BOOTS));
    public static final SunstreakerCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "sunstreaker_car", new SunstreakerCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
