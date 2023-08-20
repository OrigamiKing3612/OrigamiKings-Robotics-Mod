package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.armor.kickback.Kickback;
import net.origamiking.mcmods.orm.items.chips.kickback.KickbackChip;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //todo update with OrigamiLanguageProvider
        translationBuilder.add("advancement.orm.kickback.description", "Get the Kickback Armor set");
        translationBuilder.add("advancement.orm.kickback.title", "Kickback");
        translationBuilder.add(Kickback.HELMET, "Kickback Helmet");
        translationBuilder.add(Kickback.CHESTPLATE, "Kickback Chestplate");
        translationBuilder.add(Kickback.LEGGINGS, "Kickback Leggings");
        translationBuilder.add(Kickback.BOOTS, "Kickback Boots");
        translationBuilder.add(Kickback.BUG, "Kickback Car");
        translationBuilder.add(KickbackChip.CHIP, "Kickback Chip");


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
