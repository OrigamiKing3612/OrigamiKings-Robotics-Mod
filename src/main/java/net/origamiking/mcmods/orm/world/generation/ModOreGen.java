package net.origamiking.mcmods.orm.world.generation;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.origamiking.mcmods.oapi.biome.OrigamiBiomeModifications;
import net.origamiking.mcmods.orm.OrmMain;

public class ModOreGen {
    public static final RegistryKey<PlacedFeature> ENERGON_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(OrmMain.MOD_ID, "ore_energon"));
    public static final RegistryKey<PlacedFeature> ORE_13_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(OrmMain.MOD_ID, "ore_13"));

    public static void get() {
        OrigamiBiomeModifications.addOverworldUndergroundOre(ENERGON_ORE_PLACED_KEY);
        OrigamiBiomeModifications.addOverworldUndergroundOre(ORE_13_ORE_PLACED_KEY);
    }
}
