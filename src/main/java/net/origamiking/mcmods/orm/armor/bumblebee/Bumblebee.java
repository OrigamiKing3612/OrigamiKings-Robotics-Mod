package net.origamiking.mcmods.orm.armor.bumblebee;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Bumblebee extends ArmorUtils {
    public static final BumblebeeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "bumblebee_helmet", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final BumblebeeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "bumblebee_chestplate", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final BumblebeeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "bumblebee_leggings", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final BumblebeeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "bumblebee_boots", new BumblebeeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final BumblebeeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "bumblebee_car", new BumblebeeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
