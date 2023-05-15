package net.origamiking.orm.armor.robot_starscream;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.orm.utils.ArmorUtils;

public class RobotStarscream extends ArmorUtils {
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_HELMET = registerItem("robot_starscream_armor_helmet", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_CHESTPLATE = registerItem("robot_starscream_armor_chestplate", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_LEGGINGS = registerItem("robot_starscream_armor_leggings", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_BOOTS = registerItem("robot_starscream_armor_boots", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RobotStarscreamJetArmorItem ROBOT_STARSCREAM_JET_ARMOR = registerItem("robot_starscream_jet", new RobotStarscreamJetArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
