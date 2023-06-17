package net.origamiking.mcmods.orm.armor.bumblebee;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Bumblebee extends ArmorUtils {
    public static final BumblebeeArmorItem HELMET = registerItem("bumblebee_helmet", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final BumblebeeArmorItem CHESTPLATE = registerItem("bumblebee_chestplate", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final BumblebeeArmorItem LEGGINGS = registerItem("bumblebee_leggings", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final BumblebeeArmorItem BOOTS = registerItem("bumblebee_boots", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final BumblebeeCarArmorItem CAR = registerItem("bumblebee_car", new BumblebeeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
