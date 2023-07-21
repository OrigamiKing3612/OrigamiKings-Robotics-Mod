package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add("advancement.orm.sideswipe.description", "Get the Sideswipe Armor set");
//        translationBuilder.add("advancement.orm.sideswipe.title", "Sideswipe");
//        translationBuilder.add(Sideswipe.HELMET, "Sideswipe Helmet");
//        translationBuilder.add(Sideswipe.CHESTPLATE, "Sideswipe Chestplate");
//        translationBuilder.add(Sideswipe.LEGGINGS, "Sideswipe Leggings");
//        translationBuilder.add(Sideswipe.BOOTS, "Sideswipe Boots");
//        translationBuilder.add(Sideswipe.CAR, "Sideswipe Car");
//        translationBuilder.add(SideswipeChip.CHIP, "Sideswipe Chip");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/orm/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
