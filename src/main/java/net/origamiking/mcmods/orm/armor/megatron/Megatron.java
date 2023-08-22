package net.origamiking.mcmods.orm.armor.megatron;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class Megatron extends ArmorUtils {
    public static final MegatronArmorItem HELMET = registerArmor(OrmMain.MOD_ID, "megatron_helmet", new MegatronArmorItem(ArmorItem.Type.HELMET));
    public static final MegatronArmorItem CHESTPLATE = registerArmor(OrmMain.MOD_ID, "megatron_chestplate", new MegatronArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final MegatronArmorItem LEGGINGS = registerArmor(OrmMain.MOD_ID, "megatron_leggings", new MegatronArmorItem(ArmorItem.Type.LEGGINGS));
    public static final MegatronArmorItem BOOTS = registerArmor(OrmMain.MOD_ID, "megatron_boots", new MegatronArmorItem(ArmorItem.Type.BOOTS));

    public static void get() {
    }
}
