package net.origamiking.mcmods.orm.armor.megatron;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Megatron extends ArmorUtils {
    public static final MegatronArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "megatron_helmet", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final MegatronArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "megatron_chestplate", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final MegatronArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "megatron_leggings", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final MegatronArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "megatron_boots", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static void get() {
    }
}
