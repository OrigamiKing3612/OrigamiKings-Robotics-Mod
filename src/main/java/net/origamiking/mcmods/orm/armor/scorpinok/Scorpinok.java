package net.origamiking.mcmods.orm.armor.scorpinok;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Scorpinok extends ArmorUtils {
    public static final ScorpinokArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "scorpinok_helmet", new ScorpinokArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final ScorpinokArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "scorpinok_chestplate", new ScorpinokArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final ScorpinokArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "scorpinok_leggings", new ScorpinokArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final ScorpinokArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "scorpinok_boots", new ScorpinokArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final ScorpinokCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "scorpinok_car", new ScorpinokCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
