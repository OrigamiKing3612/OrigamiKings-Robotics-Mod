package net.origamiking.mcmods.orm.datagen.advancements;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.ChangedDimensionCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

import java.util.function.Consumer;

public class OrmAdvancements implements Consumer<Consumer<AdvancementEntry>> {
    @Override
    public void accept(Consumer<AdvancementEntry> advancementConsumer) {
        AdvancementEntry welcome = Advancement.Builder.create().display(EnergonBlocks.ENERGON_BLOCK, Text.translatable(translatableTitle("welcome")), Text.translatable(translatableDescription("welcome")), new Identifier(OrmMain.MOD_ID, "textures/block/energon_block.png"), AdvancementFrame.TASK, true, true, false).criterion("welcome", ChangedDimensionCriterion.Conditions.to(World.OVERWORLD)).build(advancementConsumer, OrmMain.MOD_ID + ":welcome");

        AdvancementEntry energon = Advancement.Builder.create().parent(welcome).display(EnergonItems.ENERGON, Text.translatable(translatableTitle("energon")), Text.translatable(translatableDescription("energon")), null, AdvancementFrame.TASK, true, true, false).criterion("get_energon", InventoryChangedCriterion.Conditions.items(EnergonItems.ENERGON)).build(advancementConsumer, OrmMain.MOD_ID + ":energon");
        AdvancementEntry spark = Advancement.Builder.create().parent(energon).display(RandomItems.SPARK, Text.translatable(translatableTitle("spark")), Text.translatable(translatableDescription("spark")), null, AdvancementFrame.TASK, true, true, false).criterion("get_spark", InventoryChangedCriterion.Conditions.items(RandomItems.SPARK)).build(advancementConsumer, OrmMain.MOD_ID + ":spark");

        AdvancementEntry ore_13 = Advancement.Builder.create().parent(energon).display(Ore13Items.ORE_13, Text.translatable(translatableTitle("ore_13")), Text.translatable(translatableDescription("ore_13")), null, AdvancementFrame.TASK, true, true, false).criterion("get_ore_13", InventoryChangedCriterion.Conditions.items(Ore13Items.ORE_13)).build(advancementConsumer, OrmMain.MOD_ID + ":ore_13");

        AdvancementEntry transformium = Advancement.Builder.create().parent(ore_13).display(TransformiumItems.TRANSFORMIUM, Text.translatable(translatableTitle("transformium")), Text.translatable(translatableDescription("transformium")), null, AdvancementFrame.TASK, true, true, false).criterion("get_transformium", InventoryChangedCriterion.Conditions.items(TransformiumItems.TRANSFORMIUM)).build(advancementConsumer, OrmMain.MOD_ID + ":transformium");

        AdvancementEntry dark_energon = Advancement.Builder.create().parent(energon).display(EnergonItems.DARK_ENERGON, Text.translatable(translatableTitle("dark_energon")), Text.translatable(translatableDescription("dark_energon")), null, AdvancementFrame.TASK, true, true, false).criterion("get_dark_energon", InventoryChangedCriterion.Conditions.items(EnergonItems.DARK_ENERGON)).build(advancementConsumer, OrmMain.MOD_ID + ":dark_energon");

        AutobotAdvancements.get(advancementConsumer, spark);
        DecepticonsAdvancements.get(advancementConsumer, spark);
        InsecticonAdvancements.get(advancementConsumer, spark);
    }

    public static String translatableTitle(String advancementName) {
        return "advancement." + OrmMain.MOD_ID + "." + advancementName.toLowerCase() + ".title";
    }

    public static String translatableDescription(String advancementName) {
        return "advancement." + OrmMain.MOD_ID + "." + advancementName.toLowerCase() + ".description";
    }

    public static String isAutobot(boolean isAutobot) {
        return isAutobot ? "autobots" : "decepticons";
    }

    public static String getAdvancementPath(boolean isAutobot, String id) {
        return OrmMain.MOD_ID + ":" + isAutobot(isAutobot) + "/" + id;
    }
}
