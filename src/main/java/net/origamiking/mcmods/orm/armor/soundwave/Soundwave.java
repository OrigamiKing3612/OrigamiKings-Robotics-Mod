package net.origamiking.mcmods.orm.armor.soundwave;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;

public class Soundwave extends ArmorUtils {
    public static final SoundwaveArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "soundwave_helmet", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final SoundwaveArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "soundwave_chestplate", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SoundwaveArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "soundwave_leggings", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final SoundwaveArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "soundwave_boots", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final SoundwaveRecorderArmorItem RECORDER = registerArmor(OrmMain.MOD_ID, "soundwave_recorder", new SoundwaveRecorderArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
