package net.origamiking.mcmods.orm.addon;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.origamiking.mcmods.orm.OrmMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrmAddon {
    public static final Logger LOGGER = LoggerFactory.getLogger(OrmMain.MOD_ID + "-addon-loader");

    public static void loadAddons() {
        FabricLoader.getInstance().getEntrypointContainers("orm-addon", OrmAddonEntrypoint.class).forEach(entrypoint -> {
            ModMetadata metadata = entrypoint.getProvider().getMetadata();
            String modId = metadata.getId();
            try {
                OrmAddonEntrypoint addon = entrypoint.getEntrypoint();
                LOGGER.info("Registering {}", metadata.getName());
                addon.onInitializeOrmAddon(new OrmAddonHelper());
            } catch (Throwable e) {
                LOGGER.error("Mod {} provides a broken implementation of OrmAddonEntrypoint", modId, e);
            }
        });
    }

    public static void loadClientAddons() {
        FabricLoader.getInstance().getEntrypointContainers("orm-client-addon", OrmClientAddonEntrypoint.class).forEach(entrypoint -> {
            ModMetadata metadata = entrypoint.getProvider().getMetadata();
            String modId = metadata.getId();
            try {
                OrmClientAddonEntrypoint addon = entrypoint.getEntrypoint();
                LOGGER.info("Registering Client {}", metadata.getName());
                addon.onClientInitializeOrmAddon();
            } catch (Throwable e) {
                LOGGER.error("Mod {} provides a broken implementation of OrmClientAddonEntrypoint", modId, e);
            }
        });
    }
}
