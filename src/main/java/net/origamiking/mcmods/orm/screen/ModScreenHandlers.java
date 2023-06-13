package net.origamiking.mcmods.orm.screen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreenHandler;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreenHandler;

public class ModScreenHandlers {
    public static ScreenHandlerType<RefineryBlockScreenHandler> REFINERY_BLOCK_SCREEN_HANDLER;
    public static ScreenHandlerType<CompacterBlockScreenHandler> COMPACTER_BLOCK_SCREEN_HANDLER;


    public static void register() {
        REFINERY_BLOCK_SCREEN_HANDLER = new ScreenHandlerType<>(RefineryBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
        COMPACTER_BLOCK_SCREEN_HANDLER = new ScreenHandlerType<>(CompacterBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
    }
    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
        return Registry.register(Registries.SCREEN_HANDLER, OrmMain.MOD_ID + ":" + id, new ScreenHandlerType<T>(factory, FeatureFlags.VANILLA_FEATURES));
    }
}
