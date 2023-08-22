package net.origamiking.mcmods.orm.armor.bumblebee;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Bumblebee extends ArmorUtils {
    public static final BumblebeeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "bumblebee_helmet", new BumblebeeArmorItem(ArmorItem.Type.HELMET));
    public static final BumblebeeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "bumblebee_chestplate", new BumblebeeArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final BumblebeeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "bumblebee_leggings", new BumblebeeArmorItem(ArmorItem.Type.LEGGINGS));
    public static final BumblebeeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "bumblebee_boots", new BumblebeeArmorItem(ArmorItem.Type.BOOTS));
    public static final BumblebeeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "bumblebee_car", new BumblebeeCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
