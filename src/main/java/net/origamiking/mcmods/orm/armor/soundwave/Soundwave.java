package net.origamiking.mcmods.orm.armor.soundwave;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorMaterial;

public class Soundwave extends ArmorUtils {
    public static final SoundwaveArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "soundwave_helmet", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final SoundwaveArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "soundwave_chestplate", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final SoundwaveArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "soundwave_leggings", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final SoundwaveArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "soundwave_boots", new SoundwaveArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static final SoundwaveRecorderArmorItem RECORDER = registerArmor(OrmMain.MOD_ID, "soundwave_recorder", new SoundwaveRecorderArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));

    public static void get() {
    }
}
