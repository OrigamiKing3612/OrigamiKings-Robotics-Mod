package net.origamiking.mcmods.orm.config;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

public class OrmConfigHandler {
    public int configVersion = OrmMain.CONFIG_VERSION;
    public Identifier ormPortalBlock = new Identifier(OrmMain.MOD_ID, "compact_energon_block");
    public boolean enableDownloadAddonsCommands = true;
    public int transformerHelmetBaseDurability = 3;
    public int transformerChestplateBaseDurability = 6;
    public int transformerLeggingsBaseDurability = 8;
    public int transformerBootsBaseDurability = 3;
    public int transformerHelmetProtectionValue = 3;
    public int transformerChestplateProtectionValue = 6;
    public int transformerLeggingsProtectionValue = 8;
    public int transformerBootsProtectionValue = 3;
    public int transformerArmorEnchantability = 20;
}
