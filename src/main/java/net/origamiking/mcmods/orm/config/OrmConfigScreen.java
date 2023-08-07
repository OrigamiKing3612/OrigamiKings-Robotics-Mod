package net.origamiking.mcmods.orm.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;

import static net.origamiking.mcmods.orm.OrmMain.getOrmConfig;

public class OrmConfigScreen {
    public static Screen getScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.translatable("title." + OrmMain.MOD_ID + ".config"));
        ConfigCategory general = builder.getOrCreateCategory(Text.translatable("category." + OrmMain.MOD_ID + ".general"));

        builder.setSavingRunnable(OrmConfig::save);

        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("option." + OrmMain.MOD_ID + ".enableDownloadAddonsCommands"), getOrmConfig().enableDownloadAddonsCommands)
                .setDefaultValue(ConfigDefaultValues.defaultEnableDownloadAddonsCommands)
                .setSaveConsumer(newValue -> getOrmConfig().enableDownloadAddonsCommands = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerHelmetBaseDurability"), getOrmConfig().transformerHelmetBaseDurability)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerHelmetBaseDurability)
                .setSaveConsumer(newValue -> getOrmConfig().transformerHelmetBaseDurability = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerChestplateBaseDurability"), getOrmConfig().transformerChestplateBaseDurability)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerChestplateBaseDurability)
                .setSaveConsumer(newValue -> getOrmConfig().transformerChestplateBaseDurability = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerLeggingsBaseDurability"), getOrmConfig().transformerLeggingsBaseDurability)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerLeggingsBaseDurability)
                .setSaveConsumer(newValue -> getOrmConfig().transformerLeggingsBaseDurability = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerBootsBaseDurability"), getOrmConfig().transformerBootsBaseDurability)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerBootsBaseDurability)
                .setSaveConsumer(newValue -> getOrmConfig().transformerBootsBaseDurability = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerHelmetProtectionValue"), getOrmConfig().transformerHelmetProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerHelmetProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerHelmetProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerChestplateProtectionValue"), getOrmConfig().transformerChestplateProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerChestplateProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerChestplateProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerLeggingsProtectionValue"), getOrmConfig().transformerLeggingsProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerLeggingsProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerLeggingsProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerBootsProtectionValue"), getOrmConfig().transformerBootsProtectionValue)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerBootsProtectionValue)
                .setSaveConsumer(newValue -> getOrmConfig().transformerBootsProtectionValue = newValue)
                .build());

        general.addEntry(entryBuilder.startIntField(Text.translatable("option." + OrmMain.MOD_ID + ".transformerArmorEnchantability"), getOrmConfig().transformerArmorEnchantability)
                .setDefaultValue(ConfigDefaultValues.defaultTransformerArmorEnchantability)
                .setSaveConsumer(newValue -> getOrmConfig().transformerArmorEnchantability = newValue)
                .build());

        return builder.build();
    }
}
