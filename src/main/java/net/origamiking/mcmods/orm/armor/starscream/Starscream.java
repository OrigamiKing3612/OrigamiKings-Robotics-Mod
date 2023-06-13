package net.origamiking.mcmods.orm.armor.starscream;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Starscream extends ArmorUtils {
    public static final RobotStarscreamArmorItem HELMET = registerItem("robot_starscream_armor_helmet", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final RobotStarscreamArmorItem CHESTPLATE = registerItem("robot_starscream_armor_chestplate", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final RobotStarscreamArmorItem LEGGINGS = registerItem("robot_starscream_armor_leggings", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final RobotStarscreamArmorItem BOOTS = registerItem("robot_starscream_armor_boots", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RobotStarscreamJetArmorItem ROBOT_STARSCREAM_JET_ARMOR = registerItem("robot_starscream_jet", new RobotStarscreamJetArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static void get() {}
}
