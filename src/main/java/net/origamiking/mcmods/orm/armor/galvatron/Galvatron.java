package net.origamiking.mcmods.orm.armor.galvatron;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Galvatron extends ArmorUtils {
    public static final GalvatronArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "galvatron_helmet", new GalvatronArmorItem(ArmorItem.Type.HELMET));
    public static final GalvatronArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "galvatron_chestplate", new GalvatronArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final GalvatronArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "galvatron_leggings", new GalvatronArmorItem(ArmorItem.Type.LEGGINGS));
    public static final GalvatronArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "galvatron_boots", new GalvatronArmorItem(ArmorItem.Type.BOOTS));
    public static final GalvatronGunArmorItem GALVATRON_GUN = registerArmor(OrmMain.MOD_ID, "galvatron_gun", new GalvatronGunArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
