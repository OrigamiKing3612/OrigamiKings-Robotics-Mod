package net.origamiking.mcmods.orm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.mcmods.orm.block_entities.ModBlockEntities;
import net.origamiking.mcmods.orm.blocks.chip_refinery.RegisterChipRefineryBlock;
import net.origamiking.mcmods.orm.client.blocks.model.entity.VectorGuardEntityRenderer;
import net.origamiking.mcmods.orm.client.blocks.renderer.block.CompacterBlockRenderer;
import net.origamiking.mcmods.orm.client.blocks.renderer.block.RefineryBlockRenderer;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.screen.ModScreenHandlers;
import net.origamiking.mcmods.orm.screen.chip_refinery.ChipRefineryScreen;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreen;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreen;

public class OrmClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.REFINERY_BLOCK_SCREEN_HANDLER, RefineryBlockScreen::new);

        BlockEntityRendererRegistry.register(ModBlockEntities.REFINERY_BLOCK,
                context -> new RefineryBlockRenderer());

        HandledScreens.register(ModScreenHandlers.COMPACTER_BLOCK_SCREEN_HANDLER, CompacterBlockScreen::new);

        BlockEntityRendererRegistry.register(ModBlockEntities.COMPACTER_BLOCK,
                context -> new CompacterBlockRenderer());

        HandledScreens.register(ModScreenHandlers.CHIP_REFINERY_SCREEN_HANDLER, ChipRefineryScreen::new);
        BlockRenderLayerMap.INSTANCE.putBlock(RegisterChipRefineryBlock.CHIP_REFINERY_BLOCK, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.VECTOR_GUARD, VectorGuardEntityRenderer::new);

    }
}
