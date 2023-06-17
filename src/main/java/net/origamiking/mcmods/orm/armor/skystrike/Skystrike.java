package net.origamiking.mcmods.orm.armor.skystrike;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Skystrike extends ArmorUtils {
    public static final SkystrikeArmorItem HELMET = registerItem("skystrike_armor_helmet", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final SkystrikeArmorItem CHESTPLATE = registerItem("skystrike_armor_chestplate", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SkystrikeArmorItem LEGGINGS = registerItem("skystrike_armor_leggings", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final SkystrikeArmorItem BOOTS = registerItem("skystrike_armor_boots", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final SkystrikeCarArmorItem JET = registerItem("skystrike_jet", new SkystrikeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static void get() {}
}
