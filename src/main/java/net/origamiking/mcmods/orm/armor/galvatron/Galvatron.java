package net.origamiking.mcmods.orm.armor.galvatron;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Galvatron extends ArmorUtils {
    public static final GalvatronArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "galvatron_helmet", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final GalvatronArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "galvatron_chestplate", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final GalvatronArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "galvatron_leggings", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final GalvatronArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "galvatron_boots", new GalvatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final GalvatronGunArmorItem GALVATRON_GUN = registerArmor(OrmMain.MOD_ID, "galvatron_gun", new GalvatronGunArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
