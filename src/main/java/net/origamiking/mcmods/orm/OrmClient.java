package net.origamiking.mcmods.orm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.block_entities.ModBlockEntities;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.custom.compacter.renderer.CompacterBlockRenderer;
import net.origamiking.mcmods.orm.blocks.custom.refinery.renderer.RefineryBlockRenderer;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.entity.photon.renderer.PhotonEntityRenderer;
import net.origamiking.mcmods.orm.entity.vector_guard.renderer.VectorGuardEntityRenderer;
import net.origamiking.mcmods.orm.fluid.ModFluids;
import net.origamiking.mcmods.orm.screen.ModScreenHandlers;
import net.origamiking.mcmods.orm.screen.chip_refinery.ChipRefineryScreen;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreen;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreen;

import static net.origamiking.mcmods.oapi.client.ClientUtils.getCutout;
import static net.origamiking.mcmods.oapi.client.ClientUtils.getTranslucent;

public class OrmClient implements ClientModInitializer {

    @Override
    @SuppressWarnings("deprecation")
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.REFINERY_BLOCK_SCREEN_HANDLER, RefineryBlockScreen::new);
        HandledScreens.register(ModScreenHandlers.COMPACTER_BLOCK_SCREEN_HANDLER, CompacterBlockScreen::new);
        HandledScreens.register(ModScreenHandlers.CHIP_REFINERY_SCREEN_HANDLER, ChipRefineryScreen::new);

        BlockEntityRendererRegistry.register(ModBlockEntities.REFINERY_BLOCK, context -> new RefineryBlockRenderer());
        BlockEntityRendererRegistry.register(ModBlockEntities.COMPACTER_BLOCK, context -> new CompacterBlockRenderer());

        EntityRendererRegistry.register(ModEntities.VECTOR_GUARD, VectorGuardEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.PhotonEntityType, PhotonEntityRenderer::new);

        getCutout(BlockRegistry.CHIP_REFINERY_BLOCK);

        getTranslucent(BlockRegistry.FORCE_FIELD_BLOCK);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_RAW_ENERGON, ModFluids.FLOWING_RAW_ENERGON, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x149ed4
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_RAW_ENERGON, ModFluids.FLOWING_RAW_ENERGON);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_RAW_DARK_ENERGON, ModFluids.FLOWING_RAW_DARK_ENERGON, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x8c14d4
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_RAW_DARK_ENERGON, ModFluids.FLOWING_RAW_DARK_ENERGON);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_OIL, ModFluids.FLOWING_OIL, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x2e2301
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_OIL, ModFluids.FLOWING_OIL);
    }
}
