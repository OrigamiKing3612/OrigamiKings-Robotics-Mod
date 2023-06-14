package net.origamiking.mcmods.orm.world;

import net.origamiking.mcmods.orm.world.generation.ModOreGen;

public class ModWorld {
    public static void register() {
        ModOreGen.get();
    }
}
