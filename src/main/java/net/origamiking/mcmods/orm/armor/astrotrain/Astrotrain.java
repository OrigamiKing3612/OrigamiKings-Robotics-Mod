package net.origamiking.mcmods.orm.armor.astrotrain;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Astrotrain extends ArmorUtils {
    public static final AstrotrainTrainArmorItem TRAIN = registerItem("astrotrain_train", new AstrotrainTrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainShuttleArmorItem SHUTTLE = registerItem("astrotrain_shuttle", new AstrotrainShuttleArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem HELMET = registerItem("astrotrain_helmet", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final AstrotrainArmorItem CHESTPLATE = registerItem("astrotrain_chestplate", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem LEGGINGS = registerItem("astrotrain_leggings", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final AstrotrainArmorItem BOOTS = registerItem("astrotrain_boots", new AstrotrainArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
