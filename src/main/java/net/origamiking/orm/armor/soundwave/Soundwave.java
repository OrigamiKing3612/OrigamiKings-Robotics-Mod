package net.origamiking.orm.armor.soundwave;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.origamiking.orm.utils.ArmorUtils;

public class Soundwave extends ArmorUtils {
    public static final SoundwaveArmorItem SOUNDWAVE_HELMET = registerItem("soundwave_helmet", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final SoundwaveArmorItem SOUNDWAVE_CHESTPLATE = registerItem("soundwave_chestplate", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SoundwaveArmorItem SOUNDWAVE_LEGGINGS = registerItem("soundwave_leggings", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final SoundwaveArmorItem SOUNDWAVE_BOOTS = registerItem("soundwave_boots", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final SoundwaveRecorderArmorItem SOUNDWAVE_RECORDER = registerItem("soundwave_recorder", new SoundwaveRecorderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
