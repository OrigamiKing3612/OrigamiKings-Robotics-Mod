package net.origamiking.orm.screens;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;

public class ModScreenHandlers {
    public static final ScreenHandlerType<RefineryScreenHandler> REFINERY_BLOCK_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(OrmMain.MOD_ID, "refinery_block"), RefineryScreenHandler::new);
    public static void register() {}
}
