package net.origamiking.mcmods.orm.armor.scorpinok;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Scorpinok extends ArmorUtils {
    public static final ScorpinokArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "scorpinok_helmet", new ScorpinokArmorItem(ArmorItem.Type.HELMET));
    public static final ScorpinokArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "scorpinok_chestplate", new ScorpinokArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final ScorpinokArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "scorpinok_leggings", new ScorpinokArmorItem(ArmorItem.Type.LEGGINGS));
    public static final ScorpinokArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "scorpinok_boots", new ScorpinokArmorItem(ArmorItem.Type.BOOTS));
    public static final ScorpinokCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "scorpinok_car", new ScorpinokCarArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
