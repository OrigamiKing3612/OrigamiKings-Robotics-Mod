package net.origamiking.mcmods.orm.armor.ironhide;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Ironhide extends ArmorUtils {
    public static final IronhideArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "ironhide_helmet", new IronhideArmorItem(ArmorItem.Type.HELMET));
    public static final IronhideArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "ironhide_chestplate", new IronhideArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final IronhideArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "ironhide_leggings", new IronhideArmorItem(ArmorItem.Type.LEGGINGS));
    public static final IronhideArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "ironhide_boots", new IronhideArmorItem(ArmorItem.Type.BOOTS));
    public static final IronhideCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "ironhide_car", new IronhideCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
