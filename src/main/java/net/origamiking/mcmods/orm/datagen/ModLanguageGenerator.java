package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.orm.armor.shockwave.Shockwave;
import net.origamiking.mcmods.orm.items.chips.shockwave.ShockwaveChip;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("advancement.orm.shockwave.description", "Get the Shockwave Armor set");
        translationBuilder.add("advancement.orm.shockwave.title", "Shockwave");
        translationBuilder.add(Shockwave.HELMET, "Shockwave Helmet");
        translationBuilder.add(Shockwave.CHESTPLATE, "Shockwave Chestplate");
        translationBuilder.add(Shockwave.LEGGINGS, "Shockwave Leggings");
        translationBuilder.add(Shockwave.BOOTS, "Shockwave Boots");
        translationBuilder.add(ItemRegistry.SHOCKWAVE_TRANSFORMED, "Shockwave Transformed");
        translationBuilder.add(ShockwaveChip.CHIP, "Shockwave Chip");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/orm/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
