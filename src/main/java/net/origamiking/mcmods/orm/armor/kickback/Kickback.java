package net.origamiking.mcmods.orm.armor.kickback;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Kickback extends ArmorUtils {
    public static final KickbackArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "kickback_helmet", new KickbackArmorItem(ArmorItem.Type.HELMET));
    public static final KickbackArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "kickback_chestplate", new KickbackArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final KickbackArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "kickback_leggings", new KickbackArmorItem(ArmorItem.Type.LEGGINGS));
    public static final KickbackArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "kickback_boots", new KickbackArmorItem(ArmorItem.Type.BOOTS));
    public static final KickbackBugArmorItem BUG = registerArmor(OrmMain.MOD_ID, "kickback_car", new KickbackBugArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
