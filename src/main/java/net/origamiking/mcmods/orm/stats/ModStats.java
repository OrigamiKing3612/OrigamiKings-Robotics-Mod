package net.origamiking.mcmods.orm.stats;

import net.minecraft.stat.StatFormatter;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

import static net.origamiking.mcmods.oapi.stats.StatUtils.registerStat;

public class ModStats {
    public static final Identifier INTERACT_WITH_CHIP_REFINERY = registerStat(OrmMain.MOD_ID, "interact_with_chip_refinery", StatFormatter.DEFAULT);
    public static final Identifier INTERACT_WITH_REFINERY = registerStat(OrmMain.MOD_ID, "interact_with_refinery", StatFormatter.DEFAULT);
    public static final Identifier INTERACT_WITH_COMPACTER = registerStat(OrmMain.MOD_ID, "interact_with_compacter", StatFormatter.DEFAULT);
    public static void register() {

    }
}
