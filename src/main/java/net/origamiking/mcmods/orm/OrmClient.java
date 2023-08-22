package net.origamiking.mcmods.orm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.origamiking.mcmods.orm.addon.OrmAddon;
import net.origamiking.mcmods.orm.block_entities.ModBlockEntities;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.custom.compacter.renderer.CompacterBlockRenderer;
import net.origamiking.mcmods.orm.blocks.custom.refinery.renderer.RefineryBlockRenderer;
import net.origamiking.mcmods.orm.client.EnergyCellsHudOverlay;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.entity.photon.renderer.PhotonEntityRenderer;
import net.origamiking.mcmods.orm.entity.vector_guard.renderer.VectorGuardEntityRenderer;
import net.origamiking.mcmods.orm.event.ClientPlayerTickHandler;
import net.origamiking.mcmods.orm.fluid.ModFluids;
import net.origamiking.mcmods.orm.keybind.ModKeybindings;
import net.origamiking.mcmods.orm.networking.ModMessages;
import net.origamiking.mcmods.orm.screen.ModScreenHandlers;
import net.origamiking.mcmods.orm.screen.chip_refinery.ChipRefineryScreen;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreen;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreen;

import static net.origamiking.mcmods.oapi.client.ClientUtils.*;

public class OrmClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModKeybindings.register();
        ModMessages.registerS2CPackets();
        HudRenderCallback.EVENT.register(new EnergyCellsHudOverlay());
        ClientTickEvents.START_CLIENT_TICK.register(new ClientPlayerTickHandler());

        registerHandledScreen(ModScreenHandlers.REFINERY_BLOCK_SCREEN_HANDLER, RefineryBlockScreen::new);
        registerHandledScreen(ModScreenHandlers.COMPACTER_BLOCK_SCREEN_HANDLER, CompacterBlockScreen::new);
        registerHandledScreen(ModScreenHandlers.CHIP_REFINERY_SCREEN_HANDLER, ChipRefineryScreen::new);

        registerBlockEntityRenderer(ModBlockEntities.REFINERY_BLOCK, context -> new RefineryBlockRenderer());
        registerBlockEntityRenderer(ModBlockEntities.COMPACTER_BLOCK, context -> new CompacterBlockRenderer());

        registerEntityRenderer(ModEntities.VECTOR_GUARD, VectorGuardEntityRenderer::new);
        registerEntityRenderer(ModEntities.PhotonEntityType, PhotonEntityRenderer::new);

        getCutout(BlockRegistry.CHIP_REFINERY_BLOCK);

        getTranslucent(BlockRegistry.FORCE_FIELD_BLOCK);

        fluidTextureRegistry(ModFluids.STILL_RAW_ENERGON, ModFluids.FLOWING_RAW_ENERGON, 0x37bbef);
        fluidTextureRegistry(ModFluids.STILL_RAW_DARK_ENERGON, ModFluids.FLOWING_RAW_DARK_ENERGON, 0x8c14d4);
        fluidTextureRegistry(ModFluids.STILL_OIL, ModFluids.FLOWING_OIL, 0x2e2301);

        OrmAddon.loadClientAddons();
    }
}
