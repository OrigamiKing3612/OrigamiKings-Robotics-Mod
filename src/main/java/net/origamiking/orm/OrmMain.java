package net.origamiking.orm;

import net.fabricmc.api.ModInitializer;

import net.origamiking.orm.group.ModGroups;
import net.origamiking.orm.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrmMain implements ModInitializer {
	public static final String MOD_ID = "orm";
	public static final Logger LOGGER = LoggerFactory.getLogger("orm");



	@Override
	public void onInitialize() {
		OrmMain.LOGGER.info("Starting ORM");
		ModItems.register();
		ModGroups.register();
	}
}