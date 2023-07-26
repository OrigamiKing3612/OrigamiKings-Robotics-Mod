package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.orm.armor.sunstreaker.Sunstreaker;
import net.origamiking.mcmods.orm.items.chips.sunstreaker.SunstreakerChip;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("advancement.orm.sunstreaker.description", "Get the Sunstreaker Armor set");
        translationBuilder.add("advancement.orm.sunstreaker.title", "Sunstreaker");
        translationBuilder.add(Sunstreaker.HELMET, "Sunstreaker Helmet");
        translationBuilder.add(Sunstreaker.CHESTPLATE, "Sunstreaker Chestplate");
        translationBuilder.add(Sunstreaker.LEGGINGS, "Sunstreaker Leggings");
        translationBuilder.add(Sunstreaker.BOOTS, "Sunstreaker Boots");
        translationBuilder.add(Sunstreaker.CAR, "Sunstreaker Car");
        translationBuilder.add(SunstreakerChip.CHIP, "Sunstreaker Chip");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/orm/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
