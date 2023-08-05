package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.orm.OrmMain;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add("advancement.orm.sunstreaker.description", "Get the Sunstreaker Armor set");
//        translationBuilder.add("advancement.orm.sunstreaker.title", "Sunstreaker");
//        translationBuilder.add(Sunstreaker.HELMET, "Sunstreaker Helmet");
//        translationBuilder.add(Sunstreaker.CHESTPLATE, "Sunstreaker Chestplate");
//        translationBuilder.add(Sunstreaker.LEGGINGS, "Sunstreaker Leggings");
//        translationBuilder.add(Sunstreaker.BOOTS, "Sunstreaker Boots");
//        translationBuilder.add(Sunstreaker.CAR, "Sunstreaker Car");
//        translationBuilder.add(SunstreakerChip.CHIP, "Sunstreaker Chip");
        translationBuilder.add("title." + OrmMain.MOD_ID + ".config", "Orm Config");
        translationBuilder.add("category." + OrmMain.MOD_ID + ".general", "Orm general");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".enableDownloadAddonsCommands", "Enable Download Addon Commands");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerHelmetBaseDurability", "Durability of the Transformer Helmets");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerChestplateBaseDurability", "Durability of the Transformer Chestplates");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerLeggingsBaseDurability", "Durability of the Transformer Leggings");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerBootsBaseDurability", "Durability of the Transformer Boots");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerHelmetProtectionValue", "Protection Value of the Transformer Helmets");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerChestplateProtectionValue", "Protection Value of the Transformer Chestplates");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerLeggingsProtectionValue", "Protection Value of the Transformer Leggings");
        translationBuilder.add("option." + OrmMain.MOD_ID + ".transformerBootsProtectionValue", "Protection Value of the Transformer Boots");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/orm/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
