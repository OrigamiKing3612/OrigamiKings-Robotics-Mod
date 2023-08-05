package net.origamiking.mcmods.orm.utils;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

public class TransformerArmorMaterial implements ArmorMaterial {
    public static final TransformerArmorMaterial TRANSFORMER = new TransformerArmorMaterial();
    private static final int[] BASE_DURABILITY = new int[]{OrmMain.getOrmConfig().transformerHelmetBaseDurability, OrmMain.getOrmConfig().transformerChestplateBaseDurability, OrmMain.getOrmConfig().transformerLeggingsBaseDurability, OrmMain.getOrmConfig().transformerBootsBaseDurability};
    private static final int[] PROTECTION_VALUES = new int[]{OrmMain.getOrmConfig().transformerHelmetProtectionValue, OrmMain.getOrmConfig().transformerChestplateProtectionValue, OrmMain.getOrmConfig().transformerLeggingsProtectionValue, OrmMain.getOrmConfig().transformerBootsProtectionValue};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * 35;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return OrmMain.getOrmConfig().transformerArmorEnchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TransformiumItems.TRANSFORMIUM);
    }

    @Override
    public String getName() {
        return "transformer";
    }

    @Override
    public float getToughness() {
        return 2.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}