package net.origamiking.mcmods.orm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
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

import static net.origamiking.mcmods.oapi.client.ClientUtils.*;

public class OrmClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //todo oapi
        HandledScreens.register(ModScreenHandlers.REFINERY_BLOCK_SCREEN_HANDLER, RefineryBlockScreen::new);
        HandledScreens.register(ModScreenHandlers.COMPACTER_BLOCK_SCREEN_HANDLER, CompacterBlockScreen::new);
        HandledScreens.register(ModScreenHandlers.CHIP_REFINERY_SCREEN_HANDLER, ChipRefineryScreen::new);
        //todo oapi
        BlockEntityRendererFactories.register(ModBlockEntities.REFINERY_BLOCK, context -> new RefineryBlockRenderer());
        BlockEntityRendererFactories.register(ModBlockEntities.COMPACTER_BLOCK, context -> new CompacterBlockRenderer());
        //todo oapi
        EntityRendererRegistry.register(ModEntities.VECTOR_GUARD, VectorGuardEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.PhotonEntityType, PhotonEntityRenderer::new);

        getCutout(BlockRegistry.CHIP_REFINERY_BLOCK);

        getTranslucent(BlockRegistry.FORCE_FIELD_BLOCK);

        fluidTextureRegistry(ModFluids.STILL_RAW_ENERGON, ModFluids.FLOWING_RAW_ENERGON, 0x37bbef);
        fluidTextureRegistry(ModFluids.STILL_RAW_DARK_ENERGON, ModFluids.FLOWING_RAW_DARK_ENERGON, 0x8c14d4);
        fluidTextureRegistry(ModFluids.STILL_OIL, ModFluids.FLOWING_OIL, 0x2e2301);
    }
}
