package net.origamiking.mcmods.orm.armor.rodimus_prime;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.armor.TransformerArmorMaterial;
import net.origamiking.mcmods.orm.utils.ArmorUtils;

public class RodimusPrime extends ArmorUtils {
    public static final RodimusPrimeArmorItem HELMET = registerItem("rodimus_prime_helmet", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final RodimusPrimeArmorItem CHESTPLATE = registerItem("rodimus_prime_chestplate", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final RodimusPrimeArmorItem LEGGINGS = registerItem("rodimus_prime_leggings", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final RodimusPrimeArmorItem BOOTS = registerItem("rodimus_prime_boots", new RodimusPrimeArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RodimusPrimeCarArmorItem CAR = registerItem("rodimus_prime_car", new RodimusPrimeCarArmorItem(TransformerArmorMaterial.TRANSFORMER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static void get() {}
}
