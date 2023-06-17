package net.origamiking.mcmods.orm.armor.galvatron;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Galvatron extends ArmorUtils {
    public static final GalvatronArmorItem HELMET = registerItem("galvatron_helmet", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final GalvatronArmorItem CHESTPLATE = registerItem("galvatron_chestplate", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final GalvatronArmorItem LEGGINGS = registerItem("galvatron_leggings", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final GalvatronArmorItem BOOTS = registerItem("galvatron_boots", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final GalvatronGunArmorItem GALVATRON_GUN = registerItem("galvatron_gun", new GalvatronGunArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
