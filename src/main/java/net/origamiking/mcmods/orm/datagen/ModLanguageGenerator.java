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
//        translationBuilder.add("biome.orm.cybertron", "Cybertron");
//        translationBuilder.add(RandomBlocks.FORCE_FIELD_BLOCK, "Force Field Block");
        translationBuilder.add("key.category.orm.main", "OrigamiKings Robotics Mod");
        translationBuilder.add("key.orm.transform", "Transform");



        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/orm/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
