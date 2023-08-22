package net.origamiking.mcmods.orm.armor.sideswipe;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Sideswipe extends ArmorUtils {
    public static final SideswipeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "sideswipe_helmet", new SideswipeArmorItem(ArmorItem.Type.HELMET));
    public static final SideswipeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "sideswipe_chestplate", new SideswipeArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final SideswipeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "sideswipe_leggings", new SideswipeArmorItem(ArmorItem.Type.LEGGINGS));
    public static final SideswipeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "sideswipe_boots", new SideswipeArmorItem(ArmorItem.Type.BOOTS));
    public static final SideswipeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "sideswipe_car", new SideswipeCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
