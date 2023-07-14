package net.origamiking.mcmods.orm.armor.shockwave;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Shockwave extends ArmorUtils {
    public static final ShockwaveArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "shockwave_helmet", new ShockwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final ShockwaveArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "shockwave_chestplate", new ShockwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final ShockwaveArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "shockwave_leggings", new ShockwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final ShockwaveArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "shockwave_boots", new ShockwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));

    public static void get() {
    }
}
