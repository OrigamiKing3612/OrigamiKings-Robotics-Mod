package net.origamiking.mcmods.orm.armor.sideswipe;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Sideswipe extends ArmorUtils {
    public static final SideswipeArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "sideswipe_helmet", new SideswipeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final SideswipeArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "sideswipe_chestplate", new SideswipeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final SideswipeArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "sideswipe_leggings", new SideswipeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final SideswipeArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "sideswipe_boots", new SideswipeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final SideswipeCarArmorItem CAR = registerArmor(OrmMain.MOD_ID, "sideswipe_car", new SideswipeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
