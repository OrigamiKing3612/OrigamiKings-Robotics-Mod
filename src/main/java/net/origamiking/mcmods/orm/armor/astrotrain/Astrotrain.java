package net.origamiking.mcmods.orm.armor.astrotrain;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Astrotrain extends ArmorUtils {
    public static final AstrotrainTrainArmorItem TRAIN = registerItem("astrotrain_train", new AstrotrainTrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainShuttleArmorItem SHUTTLE = registerItem("astrotrain_shuttle", new AstrotrainShuttleArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem HELMET = registerItem("astrotrain_helmet", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final AstrotrainArmorItem CHESTPLATE = registerItem("astrotrain_chestplate", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem LEGGINGS = registerItem("astrotrain_leggings", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final AstrotrainArmorItem BOOTS = registerItem("astrotrain_boots", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
