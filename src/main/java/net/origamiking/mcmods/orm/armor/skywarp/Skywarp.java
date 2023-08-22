package net.origamiking.mcmods.orm.armor.skywarp;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Skywarp extends ArmorUtils {
    public static final SkywarpArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "skywarp_helmet", new SkywarpArmorItem(ArmorItem.Type.HELMET));
    public static final SkywarpArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "skywarp_chestplate", new SkywarpArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final SkywarpArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "skywarp_leggings", new SkywarpArmorItem(ArmorItem.Type.LEGGINGS));
    public static final SkywarpArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "skywarp_boots", new SkywarpArmorItem(ArmorItem.Type.BOOTS));
    public static final SkywarpJetArmorItem JET = registerArmor(OrmMain.MOD_ID, "skywarp_jet", new SkywarpJetArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
