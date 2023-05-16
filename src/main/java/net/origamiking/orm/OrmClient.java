package net.origamiking.orm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.orm.blocks.refinery.ModRefineryBlock;
import net.origamiking.orm.blocks.refinery.RefineryBlockRenderer;
import net.origamiking.orm.blocks.refinery.RefineryScreen;

public class OrmClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.register(ModRefineryBlock.REFINERY_BLOCK_ENTITY,
                context -> new RefineryBlockRenderer());
        BlockRenderLayerMapImpl.INSTANCE.putBlock(ModRefineryBlock.REFINERY_BLOCK, RenderLayer.getTranslucent());
        HandledScreens.register(ModRefineryBlock.REFINERY_BLOCK_SCREEN_HANDLER, RefineryScreen::new);
    }
}
