package net.origamiking.mcmods.orm.config;

import net.minecraft.util.Identifier;

import static net.origamiking.mcmods.orm.config.ConfigDefaultValues.*;

public class OrmConfigHandler {
    public int configVersion = defaultConfigVersion;
    public Identifier ormPortalBlock = defaultOrmPortalBlock;
    public boolean enableDownloadAddonsCommands = defaultEnableDownloadAddonsCommands;
    public int transformerHelmetBaseDurability = defaultTransformerHelmetBaseDurability;
    public int transformerChestplateBaseDurability = defaultTransformerChestplateBaseDurability;
    public int transformerLeggingsBaseDurability = defaultTransformerLeggingsBaseDurability;
    public int transformerBootsBaseDurability = defaultTransformerBootsBaseDurability;
    public int transformerHelmetProtectionValue = defaultTransformerHelmetProtectionValue;
    public int transformerChestplateProtectionValue = defaultTransformerChestplateProtectionValue;
    public int transformerLeggingsProtectionValue = defaultTransformerLeggingsProtectionValue;
    public int transformerBootsProtectionValue = defaultTransformerBootsProtectionValue;
    public int transformerArmorEnchantability = defaultTransformerArmorEnchantability;
}
