package net.origamiking.mcmods.orm.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

import static net.origamiking.mcmods.orm.OrmMain.getOrmConfig;

public class OrmConfigScreen {
    public static Screen getScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.translatable("title." + OrmMain.MOD_ID + ".config"));
        ConfigCategory general = builder.getOrCreateCategory(Text.translatable("category." + OrmMain.MOD_ID + ".general"));

        builder.setSavingRunnable(OrmConfig::save);
        builder.setDefaultBackgroundTexture(new Identifier(OrmMain.MOD_ID, "textures/block/energon_block.png"));
        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("option." + OrmMain.MOD_ID + ".enableDownloadAddonsCommands"), getOrmConfig().enableDownloadAddonsCommands)
                .setDefaultValue(ConfigDefaultValues.defaultEnableDownloadAddonsCommands)
                .setSaveConsumer(newValue -> getOrmConfig().enableDownloadAddonsCommands = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerDurabilityMultiplier"), getOrmConfig().transformerArmorConfig.transformerDurabilityMultiplier)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerDurabilityMultiplier)
                .setSaveConsumer(newValue -> getOrmConfig().transformerArmorConfig.transformerDurabilityMultiplier = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerHelmetProtectionValue"), getOrmConfig().transformerArmorConfig.transformerHelmetProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerHelmetProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerArmorConfig.transformerHelmetProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerChestplateProtectionValue"), getOrmConfig().transformerArmorConfig.transformerChestplateProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerChestplateProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerArmorConfig.transformerChestplateProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerLeggingsProtectionValue"), getOrmConfig().transformerArmorConfig.transformerLeggingsProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerLeggingsProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerArmorConfig.transformerLeggingsProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerBootsProtectionValue"), getOrmConfig().transformerArmorConfig.transformerBootsProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerBootsProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerArmorConfig.transformerBootsProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerArmorEnchantability"), getOrmConfig().transformerArmorConfig.transformerArmorEnchantability)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerArmorEnchantability)
                .setSaveConsumer(newValue -> getOrmConfig().transformerArmorConfig.transformerArmorEnchantability = newValue)
                .build());

        general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("option." + OrmMain.MOD_ID + ".enableTransforming"), getOrmConfig().enableTransforming)
                .setDefaultValue(ConfigDefaultValues.defaultEnableTransforming)
                .setSaveConsumer(newValue -> getOrmConfig().enableTransforming = newValue)
                .build());

        general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("option." + OrmMain.MOD_ID + ".disableEnergyCells"), getOrmConfig().disableEnergyCells)
                .setDefaultValue(ConfigDefaultValues.defaultEnergyCells)
                .setSaveConsumer(newValue -> getOrmConfig().disableEnergyCells = newValue)
                .build());

        general.addEntry(entryBuilder.startFloatField(Text.translatable("option." + OrmMain.MOD_ID + ".chanceToRemoveEnergyCell"), getOrmConfig().chanceToRemoveEnergyCell)
                .setDefaultValue(ConfigDefaultValues.defaultChanceToRemoveEnergyCell)
                .setSaveConsumer(newValue -> getOrmConfig().chanceToRemoveEnergyCell = newValue)
                .build());

        return builder.build();
    }
}
