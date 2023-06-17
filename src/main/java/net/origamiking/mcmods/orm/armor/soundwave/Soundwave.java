package net.origamiking.mcmods.orm.armor.soundwave;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class Soundwave extends ArmorUtils {
    public static final SoundwaveArmorItem HELMET = registerItem("soundwave_helmet", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final SoundwaveArmorItem CHESTPLATE = registerItem("soundwave_chestplate", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SoundwaveArmorItem LEGGINGS = registerItem("soundwave_leggings", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final SoundwaveArmorItem BOOTS = registerItem("soundwave_boots", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final SoundwaveRecorderArmorItem RECORDER = registerItem("soundwave_recorder", new SoundwaveRecorderArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
