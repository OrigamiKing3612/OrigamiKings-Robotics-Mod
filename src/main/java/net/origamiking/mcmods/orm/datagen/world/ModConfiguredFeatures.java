package net.origamiking.mcmods.orm.datagen.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENERGON_ORE_KEY = registerKey("energon_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_ENERGON_ORE_KEY = registerKey("dark_energon_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_13_ORE_KEY = registerKey("ore_13_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldEnergonOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, EnergonBlocks.ENERGON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, EnergonBlocks.DEEPSLATE_ENERGON_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldDarkEnergonOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, EnergonBlocks.DARK_ENERGON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, EnergonBlocks.DEEPSLATE_DARK_ENERGON_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldOre13Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Ore13Blocks.ORE_13_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Ore13Blocks.DEEPSLATE_ORE_13_ORE.getDefaultState()));

        register(context, ENERGON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldEnergonOres, 7));
        register(context, DARK_ENERGON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDarkEnergonOres, 7));
        register(context, ORE_13_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOre13Ores, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(OrmMain.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
