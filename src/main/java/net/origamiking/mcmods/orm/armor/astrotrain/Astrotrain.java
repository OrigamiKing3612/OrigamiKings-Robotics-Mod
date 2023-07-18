package net.origamiking.mcmods.orm.armor.astrotrain;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Astrotrain extends ArmorUtils {
    public static final AstrotrainTrainArmorItem TRAIN = registerArmor(OrmMain.MOD_ID, "astrotrain_train", new AstrotrainTrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final AstrotrainShuttleArmorItem SHUTTLE = registerArmor(OrmMain.MOD_ID, "astrotrain_shuttle", new AstrotrainShuttleArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final AstrotrainArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "astrotrain_helmet", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final AstrotrainArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "astrotrain_chestplate", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final AstrotrainArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "astrotrain_leggings", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final AstrotrainArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "astrotrain_boots", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));

    public static void get() {
    }
}
