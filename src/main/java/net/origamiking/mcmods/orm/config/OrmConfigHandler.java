package net.origamiking.mcmods.orm.config;

import net.minecraft.util.Identifier;

import static net.origamiking.mcmods.orm.config.ConfigDefaultValues.*;

public class OrmConfigHandler {
    public int configVersion = defaultConfigVersion;
    public Identifier ormPortalBlock = defaultOrmPortalBlock;
    public boolean enableDownloadAddonsCommands = defaultEnableDownloadAddonsCommands;
    public TransformerArmorConfig transformerArmorConfig = new TransformerArmorConfig();
    public boolean enableTransforming = defaultEnableTransforming;
    public boolean disableEnergyCells = defaultEnergyCells;
    public float chanceToRemoveEnergyCell = defaultChanceToRemoveEnergyCell;
}

