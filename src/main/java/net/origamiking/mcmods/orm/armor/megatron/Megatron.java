package net.origamiking.mcmods.orm.armor.megatron;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Megatron extends ArmorUtils {
    public static final MegatronArmorItem HELMET = registerItem("megatron_helmet", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final MegatronArmorItem CHESTPLATE = registerItem("megatron_chestplate", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final MegatronArmorItem LEGGINGS = registerItem("megatron_leggings", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final MegatronArmorItem BOOTS = registerItem("megatron_boots", new MegatronArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
