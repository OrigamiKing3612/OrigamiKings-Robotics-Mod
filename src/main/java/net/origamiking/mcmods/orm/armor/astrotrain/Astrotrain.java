package net.origamiking.mcmods.orm.armor.astrotrain;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class  Astrotrain extends ArmorUtils {
    public static final AstrotrainTrainArmorItem TRAIN = registerArmor(OrmMain.MOD_ID, "astrotrain_train", new AstrotrainTrainArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final AstrotrainShuttleArmorItem SHUTTLE = registerArmor(OrmMain.MOD_ID, "astrotrain_shuttle", new AstrotrainShuttleArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final AstrotrainArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "astrotrain_helmet", new AstrotrainArmorItem(ArmorItem.Type.HELMET));
    public static final AstrotrainArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "astrotrain_chestplate", new AstrotrainArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final AstrotrainArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "astrotrain_leggings", new AstrotrainArmorItem(ArmorItem.Type.LEGGINGS));
    public static final AstrotrainArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "astrotrain_boots", new AstrotrainArmorItem(ArmorItem.Type.BOOTS));

    public static void get() {
    }
}
