package net.origamiking.mcmods.orm.armor.scorpinok;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Scorpinok extends ArmorUtils {
    public static final ScorpinokArmorItem HELMET = registerItem("scorpinok_helmet", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final ScorpinokArmorItem CHESTPLATE = registerItem("scorpinok_chestplate", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final ScorpinokArmorItem LEGGINGS = registerItem("scorpinok_leggings", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final ScorpinokArmorItem BOOTS = registerItem("scorpinok_boots", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final ScorpinokCarArmorItem CAR = registerItem("scorpinok_car", new ScorpinokCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static void get() {}
}
