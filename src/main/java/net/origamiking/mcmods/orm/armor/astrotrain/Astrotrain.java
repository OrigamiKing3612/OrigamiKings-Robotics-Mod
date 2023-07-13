package net.origamiking.mcmods.orm.armor.astrotrain;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Astrotrain extends ArmorUtils {
    public static final AstrotrainTrainArmorItem TRAIN = registerArmor(OrmMain.MOD_ID, "astrotrain_train", new AstrotrainTrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainShuttleArmorItem SHUTTLE = registerArmor(OrmMain.MOD_ID, "astrotrain_shuttle", new AstrotrainShuttleArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "astrotrain_helmet", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final AstrotrainArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "astrotrain_chestplate", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "astrotrain_leggings", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final AstrotrainArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "astrotrain_boots", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static void get() {
    }
}
