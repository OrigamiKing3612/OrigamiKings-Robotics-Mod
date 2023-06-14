package net.origamiking.mcmods.orm.screen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.screen.chip_refinery.ChipRefineryScreenHandler;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreenHandler;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreenHandler;

public class ModScreenHandlers {
    public static ScreenHandlerType<RefineryBlockScreenHandler> REFINERY_BLOCK_SCREEN_HANDLER;
    public static ScreenHandlerType<CompacterBlockScreenHandler> COMPACTER_BLOCK_SCREEN_HANDLER;
    public static ScreenHandlerType<ChipRefineryScreenHandler> CHIP_REFINERY_SCREEN_HANDLER = new ScreenHandlerType<>(ChipRefineryScreenHandler::new, FeatureFlags.VANILLA_FEATURES);



    public static void register() {
        REFINERY_BLOCK_SCREEN_HANDLER = new ScreenHandlerType<>(RefineryBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
        COMPACTER_BLOCK_SCREEN_HANDLER = new ScreenHandlerType<>(CompacterBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(OrmMain.MOD_ID, "chip_refinery"), CHIP_REFINERY_SCREEN_HANDLER);

    }
}
