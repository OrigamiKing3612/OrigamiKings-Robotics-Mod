package net.origamiking.mcmods.orm.screen;

import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<RefineryBlockScreenHandler> GEM_INFUSING_SCREEN_HANDLER;

    public static void register() {
        GEM_INFUSING_SCREEN_HANDLER = new ScreenHandlerType<>(RefineryBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
    }
}
