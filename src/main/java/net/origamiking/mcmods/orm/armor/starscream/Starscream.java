package net.origamiking.mcmods.orm.armor.starscream;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Starscream extends ArmorUtils {
    public static final StarscreamArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "starscream_helmet", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final StarscreamArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "starscream_chestplate", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final StarscreamArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "starscream_leggings", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final StarscreamArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "starscream_boots", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final StarscreamJetArmorItem JET = registerArmor(OrmMain.MOD_ID, "starscream_jet", new StarscreamJetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
