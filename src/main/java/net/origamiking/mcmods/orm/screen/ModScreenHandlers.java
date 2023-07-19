package net.origamiking.mcmods.orm.screen;

import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.origamiking.mcmods.oapi.screen.ScreenUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.screen.chip_refinery.ChipRefineryScreenHandler;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreenHandler;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreenHandler;

public class ModScreenHandlers {
    public static ScreenHandlerType<RefineryBlockScreenHandler> REFINERY_BLOCK_SCREEN_HANDLER = ScreenUtils.registerScreenHandler(OrmMain.MOD_ID, "refinery", new ScreenHandlerType<>(RefineryBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES));
    public static ScreenHandlerType<CompacterBlockScreenHandler> COMPACTER_BLOCK_SCREEN_HANDLER = ScreenUtils.registerScreenHandler(OrmMain.MOD_ID, "compacter", new ScreenHandlerType<>(CompacterBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES));
    public static ScreenHandlerType<ChipRefineryScreenHandler> CHIP_REFINERY_SCREEN_HANDLER = ScreenUtils.registerScreenHandler(OrmMain.MOD_ID, "chip_refinery", new ScreenHandlerType<>(ChipRefineryScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    public static void register() {

    }
}
