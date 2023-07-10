package net.origamiking.mcmods.orm.armor.bumblebee;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Bumblebee extends ArmorUtils {
    public static final BumblebeeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "bumblebee_helmet", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final BumblebeeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "bumblebee_chestplate", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final BumblebeeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "bumblebee_leggings", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final BumblebeeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "bumblebee_boots", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final BumblebeeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "bumblebee_car", new BumblebeeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
