package net.origamiking.mcmods.orm.armor.soundwave;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Soundwave extends ArmorUtils {
    public static final SoundwaveArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "soundwave_helmet", new SoundwaveArmorItem(ArmorItem.Type.HELMET));
    public static final SoundwaveArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "soundwave_chestplate", new SoundwaveArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final SoundwaveArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "soundwave_leggings", new SoundwaveArmorItem(ArmorItem.Type.LEGGINGS));
    public static final SoundwaveArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "soundwave_boots", new SoundwaveArmorItem(ArmorItem.Type.BOOTS));
    public static final SoundwaveRecorderArmorItem RECORDER = registerArmor(OrmMain.MOD_ID, "soundwave_recorder", new SoundwaveRecorderArmorItem(ArmorItem.Type.CHESTPLATE));

    public static void get() {
    }
}
