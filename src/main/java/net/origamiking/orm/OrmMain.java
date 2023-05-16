package net.origamiking.orm;

import net.fabricmc.api.ModInitializer;

import net.origamiking.orm.armor.ModArmor;
import net.origamiking.orm.blocks.ModBlocks;
import net.origamiking.orm.commands.ModCommands;
import net.origamiking.orm.entities.ModEntityTypes;
import net.origamiking.orm.group.ModGroups;
import net.origamiking.orm.items.ModItems;
import net.origamiking.orm.recipe.ModRecipes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrmMain implements ModInitializer {
	public static final String MOD_ID = "orm";
	public static final String VERSION = "0.1.0-1.19.3";
	public static final Logger LOGGER = LoggerFactory.getLogger("orm");
	@Override
	public void onInitialize() {
		OrmMain.LOGGER.info("Starting ORM " + OrmMain.VERSION);
		ModArmor.register();
		ModItems.register();
		ModBlocks.register();
		ModGroups.register();
		ModEntityTypes.register();
		ModCommands.register();
		ModRecipes.register();
	}
}