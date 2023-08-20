package net.origamiking.mcmods.orm.armor.kickback;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Kickback extends ArmorUtils {
    public static final KickbackArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "kickback_helmet", new KickbackArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final KickbackArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "kickback_chestplate", new KickbackArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final KickbackArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "kickback_leggings", new KickbackArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final KickbackArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "kickback_boots", new KickbackArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final KickbackBugArmorItem BUG = registerArmor(OrmMain.MOD_ID, "kickback_car", new KickbackBugArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
