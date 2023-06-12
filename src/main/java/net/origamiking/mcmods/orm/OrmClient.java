package net.origamiking.mcmods.orm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.origamiking.mcmods.orm.block_entities.ModBlockEntities;
import net.origamiking.mcmods.orm.client.renderer.block.RefineryBlockRenderer;
import net.origamiking.mcmods.orm.screen.ModScreenHandlers;
import net.origamiking.mcmods.orm.screen.RefineryBlockScreen;

public class OrmClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.REFINERY_BLOCK_SCREEN_HANDLER, RefineryBlockScreen::new);

        BlockEntityRendererRegistry.register(ModBlockEntities.REFINERY_BLOCK,
                context -> new RefineryBlockRenderer());
    }
}
