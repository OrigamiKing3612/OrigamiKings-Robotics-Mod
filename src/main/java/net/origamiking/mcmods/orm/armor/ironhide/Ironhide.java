package net.origamiking.mcmods.orm.armor.ironhide;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Ironhide extends ArmorUtils {
    public static final IronhideArmorItem HELMET = registerItem("ironhide_helmet", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final IronhideArmorItem CHESTPLATE = registerItem("ironhide_chestplate", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final IronhideArmorItem LEGGINGS = registerItem("ironhide_leggings", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final IronhideArmorItem BOOTS = registerItem("ironhide_boots", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final IronhideCarArmorItem CAR = registerItem("ironhide_car", new IronhideCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
