package net.origamiking.mcmods.orm.world.generation;

import net.origamiking.mcmods.oapi.biome.OrigamiBiomeModifications;
import net.origamiking.mcmods.orm.world.ModPlacedFeatures;

public class ModOreGen {
    public static void get() {
        OrigamiBiomeModifications.addOverworldUndergroundOre(ModPlacedFeatures.ENERGON_ORE_PLACED_KEY);
        OrigamiBiomeModifications.addOverworldUndergroundOre(ModPlacedFeatures.DARK_ENERGON_ORE_PLACED_KEY);
        OrigamiBiomeModifications.addOverworldUndergroundOre(ModPlacedFeatures.ORE_13_ORE_PLACED_KEY);
    }
}
