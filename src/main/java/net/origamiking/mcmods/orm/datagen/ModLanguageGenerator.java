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
//        translationBuilder.add("advancement.orm.ratchet.description", "Get the Ratchet Armor set");
//        translationBuilder.add("advancement.orm.ratchet.title", "Ratchet");
//        translationBuilder.add(Ratchet.HELMET, "Ratchet Helmet");
//        translationBuilder.add(Ratchet.CHESTPLATE, "Ratchet Chestplate");
//        translationBuilder.add(Ratchet.LEGGINGS, "Ratchet Leggings");
//        translationBuilder.add(Ratchet.BOOTS, "Ratchet Boots");
//        translationBuilder.add(Ratchet.CAR, "Ratchet Transformed");
//        translationBuilder.add(RatchetChip.CHIP, "Ratchet Chip");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/orm/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
