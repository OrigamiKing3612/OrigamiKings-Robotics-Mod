package net.origamiking.mcmods.orm.armor.ironhide;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Ironhide extends ArmorUtils {
    public static final IronhideArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "ironhide_helmet", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final IronhideArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "ironhide_chestplate", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final IronhideArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "ironhide_leggings", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final IronhideArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "ironhide_boots", new IronhideArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final IronhideCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "ironhide_car", new IronhideCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
