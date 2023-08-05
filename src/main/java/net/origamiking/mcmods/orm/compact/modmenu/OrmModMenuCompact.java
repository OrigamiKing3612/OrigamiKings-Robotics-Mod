package net.origamiking.mcmods.orm.compact.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.origamiking.mcmods.orm.config.OrmConfigScreen;

public class OrmModMenuCompact implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return OrmConfigScreen::getScreen;
    }
}
