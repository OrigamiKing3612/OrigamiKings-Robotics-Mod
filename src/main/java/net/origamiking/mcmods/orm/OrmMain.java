package net.origamiking.mcmods.orm;

import net.fabricmc.api.ModInitializer;
import net.origamiking.mcmods.orm.armor.ModArmor;
import net.origamiking.mcmods.orm.block_entities.ModBlockEntities;
import net.origamiking.mcmods.orm.blocks.ModBlocks;
import net.origamiking.mcmods.orm.commands.ModCommands;
import net.origamiking.mcmods.orm.config.OrmConfig;
import net.origamiking.mcmods.orm.config.OrmConfigHandler;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.fluid.ModFluids;
import net.origamiking.mcmods.orm.group.ModGroups;
import net.origamiking.mcmods.orm.items.ModItems;
import net.origamiking.mcmods.orm.recipe.ModRecipeType;
import net.origamiking.mcmods.orm.screen.ModScreenHandlers;
import net.origamiking.mcmods.orm.stats.ModStats;
import net.origamiking.mcmods.orm.tag.ModTags;
import net.origamiking.mcmods.orm.world.ModWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrmMain implements ModInitializer {
    public static final String MOD_ID = "orm";
    public static final String VERSION = "1.3.0-1.20.1";
    public static final int CONFIG_VERSION = 1;
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static OrmConfigHandler ORM_CONFIG;
    //TODO cybertron characters (look in BumblebeeCarArmorItem line: 50) Update 1.3.0

    @Override
    public void onInitialize() {
        OrmMain.LOGGER.info("Starting ORM " + OrmMain.VERSION);

        OrmConfig.load();
        ModArmor.register();
        ModItems.register();
        ModBlocks.register();
        ModBlockEntities.register();
        ModScreenHandlers.register();
        ModGroups.register();
        ModCommands.register();
        ModWorld.register();
        ModRecipeType.register();
        ModEntities.register();
        ModTags.register();
        ModStats.register();
        ModFluids.register();
    }

    public static OrmConfigHandler getOrmConfig() {
        return ORM_CONFIG;
    }
}