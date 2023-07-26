package net.origamiking.mcmods.orm.armor.sunstreaker;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Sunstreaker extends ArmorUtils {
    public static final SunstreakerArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "sunstreaker_helmet", new SunstreakerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final SunstreakerArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "sunstreaker_chestplate", new SunstreakerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final SunstreakerArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "sunstreaker_leggings", new SunstreakerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final SunstreakerArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "sunstreaker_boots", new SunstreakerArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final SunstreakerCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "sunstreaker_car", new SunstreakerCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
