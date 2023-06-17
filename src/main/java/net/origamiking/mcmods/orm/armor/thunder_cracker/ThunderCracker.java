package net.origamiking.mcmods.orm.armor.thunder_cracker;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class ThunderCracker extends ArmorUtils {
    public static final ThunderCrackerArmorItem HELMET = registerItem("thunder_cracker_helmet", new ThunderCrackerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final ThunderCrackerArmorItem CHESTPLATE = registerItem("thunder_cracker_chestplate", new ThunderCrackerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final ThunderCrackerArmorItem LEGGINGS = registerItem("thunder_cracker_leggings", new ThunderCrackerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final ThunderCrackerArmorItem BOOTS = registerItem("thunder_cracker_boots", new ThunderCrackerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final ThunderCrackerJetArmorItem JET = registerItem("thunder_cracker_jet", new ThunderCrackerJetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static void get() {}
}
