package net.origamiking.mcmods.orm.stats;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

import static net.minecraft.stat.Stats.CUSTOM;

public class ModStats {
    public static final Identifier INTERACT_WITH_CHIP_REFINERY = register(OrmMain.MOD_ID, "interact_with_chip_refinery", StatFormatter.DEFAULT);
    public static final Identifier INTERACT_WITH_REFINERY = register(OrmMain.MOD_ID, "interact_with_refinery", StatFormatter.DEFAULT);
    public static final Identifier INTERACT_WITH_COMPACTER = register(OrmMain.MOD_ID, "interact_with_compacter", StatFormatter.DEFAULT);
    public static void register() {

    }
    //TODO get from oapi
    private static Identifier register(String modid, String id, StatFormatter formatter) {
        Identifier identifier = new Identifier(modid + ":" + id);
        Registry.register(Registries.CUSTOM_STAT, id, identifier);
        CUSTOM.getOrCreateStat(identifier, formatter);
        return identifier;
    }

}
