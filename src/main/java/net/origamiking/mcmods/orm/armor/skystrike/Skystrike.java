package net.origamiking.mcmods.orm.armor.skystrike;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Skystrike extends ArmorUtils {
    public static final SkystrikeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "skystrike_armor_helmet", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final SkystrikeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "skystrike_armor_chestplate", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final SkystrikeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "skystrike_armor_leggings", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final SkystrikeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "skystrike_armor_boots", new SkystrikeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final SkystrikeCarArmorItem JET = registerArmor(OrmMain.MOD_ID, "skystrike_jet", new SkystrikeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
