package net.origamiking.orm.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;

public class ArmorRegistry {
    public static final CarArmorItem CAR_ARMOR_CHESTPLATE = registerItem("car_armor_chestplate", new CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robot_4_CarArmorItem ROBOT_4_CAR_CHESTPLATE = registerItem("robot_4_car_chestplate", new Robot_4_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robot_3_CarArmorItem ROBOT_3_CAR_CHESTPLATE = registerItem("robot_3_car_chestplate", new Robot_3_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1_CarArmorItem ROBO_1_CAR_CHESTPLATE = registerItem("robo_1_car_chestplate", new Robo_1_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_HELMET = registerItem("robo_1_armor_helmet", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_CHESTPLATE = registerItem("robo_1_armor_chestplate", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_LEGGINGS = registerItem("robo_1_armor_leggings", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_BOOTS = registerItem("robo_1_armor_boots", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Robot_3ArmorItem ROBOT_3_ARMOR_HELMET = registerItem("robot_3_armor_helmet", new Robot_3ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Robot_3ArmorItem ROBOT_3_ARMOR_CHESTPLATE = registerItem("robot_3_armor_chestplate", new Robot_3ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robot_3ArmorItem ROBOT_3_ARMOR_LEGGINGS = registerItem("robot_3_armor_leggings", new Robot_3ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Robot_3ArmorItem ROBOT_3_ARMOR_BOOTS = registerItem("robot_3_armor_boots", new Robot_3ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Robot_4ArmorItem ROBOT_4_ARMOR_HELMET = registerItem("robot_4_armor_helmet", new Robot_4ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Robot_4ArmorItem ROBOT_4_ARMOR_CHESTPLATE = registerItem("robot_4_armor_chestplate", new Robot_4ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robot_4ArmorItem ROBOT_4_ARMOR_LEGGINGS = registerItem("robot_4_armor_leggings", new Robot_4ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Robot_4ArmorItem ROBOT_4_ARMOR_BOOTS = registerItem("robot_4_armor_boots", new Robot_4ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_HELMET = registerItem("robot_starscream_armor_helmet", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_CHESTPLATE = registerItem("robot_starscream_armor_chestplate", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_LEGGINGS = registerItem("robot_starscream_armor_leggings", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_BOOTS = registerItem("robot_starscream_armor_boots", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RobotStarscreamJetArmorItem ROBOT_STARSCREAM_JET_ARMOR = registerItem("robot_starscream_jet", new RobotStarscreamJetArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OrmMain.MOD_ID, name), item);
    }
    public static void getArmor() {

    }
}
