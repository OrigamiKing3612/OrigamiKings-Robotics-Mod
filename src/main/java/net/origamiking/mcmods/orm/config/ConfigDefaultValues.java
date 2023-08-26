package net.origamiking.mcmods.orm.config;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

public class ConfigDefaultValues {
    protected static int defaultConfigVersion = OrmMain.CONFIG_VERSION;
    protected static Identifier defaultOrmPortalBlock = new Identifier(OrmMain.MOD_ID, "compact_energon_block");
    protected static boolean defaultEnableDownloadAddonsCommands = true;
    public static int defaultTransformerDurabilityMultiplier = 40;
    protected static int defaultTransformerHelmetProtectionValue = 3;
    protected static int defaultTransformerChestplateProtectionValue = 6;
    protected static int defaultTransformerLeggingsProtectionValue = 8;
    protected static int defaultTransformerBootsProtectionValue = 3;
    protected static int defaultTransformerArmorEnchantability = 20;
    protected static boolean defaultEnableTransforming = true;
    protected static boolean defaultEnergyCells = false;
    public static float defaultChanceToRemoveEnergyCell = 0.0005f;
}
