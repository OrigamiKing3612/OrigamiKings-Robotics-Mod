package net.origamiking.mcmods.orm.utils;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.config.TransformerArmorConfig;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

import java.util.function.Supplier;

import static net.origamiking.mcmods.orm.OrmMain.getOrmConfig;

public enum ModArmorMaterials implements ArmorMaterial {
    TRANSFORMER("transformer", getOrmConfig().transformerArmorConfig.transformerDurabilityMultiplier, new int[]{getTransformerConfig().transformerBootsProtectionValue, getTransformerConfig().transformerLeggingsProtectionValue, getTransformerConfig().transformerChestplateProtectionValue, getTransformerConfig().transformerHelmetProtectionValue},
            getTransformerConfig().transformerArmorEnchantability, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0f, 0.2f, () -> Ingredient.ofItems(TransformiumItems.TRANSFORMIUM));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredientSupplier;
    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return OrmMain.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public static TransformerArmorConfig getTransformerConfig() {
        return getOrmConfig().transformerArmorConfig;
    }
}