package net.origamiking.mcmods.orm.armor.megatron;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Megatron extends ArmorUtils {
    public static final MegatronArmorItem MEGATRON_HELMET = registerItem("megatron_helmet", new MegatronArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final MegatronArmorItem MEGATRON_CHESTPLATE = registerItem("megatron_chestplate", new MegatronArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final MegatronArmorItem MEGATRON_LEGGINGS = registerItem("megatron_leggings", new MegatronArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final MegatronArmorItem MEGATRON_BOOTS = registerItem("megatron_boots", new MegatronArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
