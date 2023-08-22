package net.origamiking.mcmods.orm.armor.shockwave;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Shockwave extends ArmorUtils {
    public static final ShockwaveArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "shockwave_helmet", new ShockwaveArmorItem(ArmorItem.Type.HELMET));
    public static final ShockwaveArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "shockwave_chestplate", new ShockwaveArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final ShockwaveArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "shockwave_leggings", new ShockwaveArmorItem(ArmorItem.Type.LEGGINGS));
    public static final ShockwaveArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "shockwave_boots", new ShockwaveArmorItem(ArmorItem.Type.BOOTS));

    public static void get() {
    }
}
