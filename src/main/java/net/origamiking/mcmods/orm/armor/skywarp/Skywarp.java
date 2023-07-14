package net.origamiking.mcmods.orm.armor.skywarp;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Skywarp extends ArmorUtils {
    public static final SkywarpArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "skywarp_helmet", new SkywarpArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final SkywarpArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "skywarp_chestplate", new SkywarpArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final SkywarpArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "skywarp_leggings", new SkywarpArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final SkywarpArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "skywarp_boots", new SkywarpArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final SkywarpJetArmorItem JET = registerArmor(OrmMain.MOD_ID, "skywarp_jet", new SkywarpJetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
