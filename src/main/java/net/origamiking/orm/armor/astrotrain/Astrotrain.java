package net.origamiking.orm.armor.astrotrain;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.orm.armor.ArmorRegistry;

public class Astrotrain extends ArmorRegistry {
    public static final AstrotrainTrainArmorItem ASTROTRAIN_TRAIN = registerItem("astrotrain_train", new AstrotrainTrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainShuttleArmorItem ASTROTRAIN_SHUTTLE = registerItem("astrotrain_shuttle", new AstrotrainShuttleArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_HELMET = registerItem("astrotrain_helmet", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_CHESTPLATE = registerItem("astrotrain_chestplate", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_LEGGINGS = registerItem("astrotrain_leggings", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_BOOTS = registerItem("astrotrain_boots", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
