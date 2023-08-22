package net.origamiking.mcmods.orm.armor.ratchet;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Ratchet extends ArmorUtils {
    public static final RatchetArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "ratchet_helmet", new RatchetArmorItem(ArmorItem.Type.HELMET));
    public static final RatchetArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "ratchet_chestplate", new RatchetArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RatchetArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "ratchet_leggings", new RatchetArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RatchetArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "ratchet_boots", new RatchetArmorItem(ArmorItem.Type.BOOTS));
    public static final RatchetCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "ratchet_car", new RatchetCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
