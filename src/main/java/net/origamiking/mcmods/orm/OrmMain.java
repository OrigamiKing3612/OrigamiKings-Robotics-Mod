package net.origamiking.mcmods.orm;

import net.fabricmc.api.ModInitializer;
import net.origamiking.mcmods.orm.advancements.ModAdvancements;
import net.origamiking.mcmods.orm.armor.ModArmor;
import net.origamiking.mcmods.orm.block_entities.ModBlockEntities;
import net.origamiking.mcmods.orm.blocks.ModBlocks;
import net.origamiking.mcmods.orm.commands.ModCommands;
import net.origamiking.mcmods.orm.entities.ModEntityTypes;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.group.ModGroups;
import net.origamiking.mcmods.orm.items.ModItems;
import net.origamiking.mcmods.orm.recipe.ModRecipeType;
import net.origamiking.mcmods.orm.screen.ModScreenHandlers;
import net.origamiking.mcmods.orm.tag.ModTags;
import net.origamiking.mcmods.orm.world.ModWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrmMain implements ModInitializer {
    public static final String MOD_ID = "orm";
    public static final String VERSION = "1.2.0-1.20.1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    //TODO cybertron characters (look in BumblebeeCarArmorItem line: 50)

    @Override
    public void onInitialize() {
        OrmMain.LOGGER.info("Starting ORM " + OrmMain.VERSION);

        ModAdvancements.register();
        ModArmor.register();
        ModItems.register();
        ModBlocks.register();
        ModBlockEntities.register();
        ModScreenHandlers.register();
        ModGroups.register();
        ModEntityTypes.register();
        ModCommands.register();
        ModWorld.register();
        ModRecipeType.register();
        ModEntities.register();
        ModTags.register();
    }
}