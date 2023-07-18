package net.origamiking.mcmods.orm.armor.ratchet;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Ratchet extends ArmorUtils {
    public static final RatchetArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "ratchet_helmet", new RatchetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final RatchetArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "ratchet_chestplate", new RatchetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final RatchetArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "ratchet_leggings", new RatchetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final RatchetArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "ratchet_boots", new RatchetArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final RatchetCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "ratchet_car", new RatchetCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
