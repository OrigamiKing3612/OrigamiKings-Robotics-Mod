package net.origamiking.mcmods.orm.world;

import net.origamiking.mcmods.orm.world.dimension.ModDimension;
import net.origamiking.mcmods.orm.world.generation.ModOreGen;

public class ModWorld {
    public static void register() {
        ModDimension.get();
        ModOreGen.get();
    }
}
