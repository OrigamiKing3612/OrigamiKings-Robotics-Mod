package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //todo update with OrigamiLanguageProvider
//        translationBuilder.add("advancement.orm.sunstreaker.description", "Get the Sunstreaker Armor set");
//        translationBuilder.add("advancement.orm.sunstreaker.title", "Sunstreaker");
//        translationBuilder.add(Sunstreaker.HELMET, "Sunstreaker Helmet");
//        translationBuilder.add(Sunstreaker.CHESTPLATE, "Sunstreaker Chestplate");
//        translationBuilder.add(Sunstreaker.LEGGINGS, "Sunstreaker Leggings");
//        translationBuilder.add(Sunstreaker.BOOTS, "Sunstreaker Boots");
//        translationBuilder.add(Sunstreaker.CAR, "Sunstreaker Car");
//        translationBuilder.add(SunstreakerChip.CHIP, "Sunstreaker Chip");
//        translationBuilder.add(SunstreakerChip.CHIP, getName(SunstreakerChip.CHIP));


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/orm/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
    //todo oapi
    public static String getName(Identifier id) {
        return capitalize(id.getPath().replace("_", " "));
    }
    public static String getName(Item item) {
        return capitalize(Registries.ITEM.getId(item).getPath().replace("_", " "));
    }
    public static String capitalize(String s) {
        if (s.isEmpty()) return s;

        String[] words = s.split(" ");
        StringBuilder ret = new StringBuilder(s.length());

        for (String word : words) {
            if (!word.isEmpty()) {
                int cp = word.codePointAt(0);
                int cpUpper = Character.toUpperCase(cp);
                if (cpUpper != cp) {
                    ret.appendCodePoint(cpUpper);
                    ret.append(word, Character.charCount(cp), word.length());
                } else {
                    ret.append(word);
                }
                ret.append(" ");
            }
        }

        return ret.toString().trim();
    }
    public static String getName(String id) {
        return capitalize(id.replace("_", " "));
    }
}
