package net.origamiking.mcmods.orm.compact.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.fabricmc.loader.api.FabricLoader;
import net.origamiking.mcmods.orm.config.OrmConfigScreen;

public class OrmModMenuCompact implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        if (FabricLoader.getInstance().isModLoaded("cloth-config")) {
            return OrmConfigScreen::getScreen;
        } else {
            return null;
        }
    }
}
