package net.origamiking.mcmods.orm.armor.starscream;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Starscream extends ArmorUtils {
    public static final StarscreamArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "starscream_helmet", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final StarscreamArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "starscream_chestplate", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final StarscreamArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "starscream_leggings", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final StarscreamArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "starscream_boots", new StarscreamArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final StarscreamJetArmorItem JET = registerArmor(OrmMain.MOD_ID, "starscream_jet", new StarscreamJetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
