package net.origamiking.mcmods.orm.armor.starscream;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Starscream extends ArmorUtils {
    public static final StarscreamArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "starscream_helmet", new StarscreamArmorItem(ArmorItem.Type.HELMET));
    public static final StarscreamArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "starscream_chestplate", new StarscreamArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final StarscreamArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "starscream_leggings", new StarscreamArmorItem(ArmorItem.Type.LEGGINGS));
    public static final StarscreamArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "starscream_boots", new StarscreamArmorItem(ArmorItem.Type.BOOTS));
    public static final StarscreamJetArmorItem JET = registerArmor(OrmMain.MOD_ID, "starscream_jet", new StarscreamJetArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
