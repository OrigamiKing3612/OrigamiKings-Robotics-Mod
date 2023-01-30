package net.origamiking.orm.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;

public class ArmorRegistry {
    public static final Robot1ArmorItem ROBOT_1_ARMOR_HELMET = registerItem("robot_1_armor_helmet", new Robot1ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Robot1ArmorItem ROBOT_1_ARMOR_CHESTPLATE = registerItem("robot_1_armor_chestplate", new Robot1ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Robot1ArmorItem ROBOT_1_ARMOR_LEGGINGS = registerItem("robot_1_armor_leggings", new Robot1ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Robot1ArmorItem ROBOT_1_ARMOR_BOOTS = registerItem("robot_1_armor_boots", new Robot1ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Settings()));


    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OrmMain.MOD_ID, name), item);
    }
    public static void getArmor() {

    }
}
