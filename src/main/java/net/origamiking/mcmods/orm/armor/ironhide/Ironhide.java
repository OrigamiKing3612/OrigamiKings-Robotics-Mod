package net.origamiking.mcmods.orm.armor.ironhide;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Ironhide extends ArmorUtils {
    public static final IronhideArmorItem HELMET = registerItem("ironhide_helmet", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final IronhideArmorItem CHESTPLATE = registerItem("ironhide_chestplate", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final IronhideArmorItem LEGGINGS = registerItem("ironhide_leggings", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final IronhideArmorItem BOOTS = registerItem("ironhide_boots", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final IronhideCarArmorItem CAR = registerItem("ironhide_car", new IronhideCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
