package net.origamiking.mcmods.orm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.block_entities.ModBlockEntities;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.blocks.custom.compacter.renderer.CompacterBlockRenderer;
import net.origamiking.mcmods.orm.blocks.custom.refinery.renderer.RefineryBlockRenderer;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.entity.photon.renderer.PhotonEntityRenderer;
import net.origamiking.mcmods.orm.entity.vector_guard.renderer.VectorGuardEntityRenderer;
import net.origamiking.mcmods.orm.fluid.ModFluids;
import net.origamiking.mcmods.orm.keybind.ModKeybindings;
import net.origamiking.mcmods.orm.screen.ModScreenHandlers;
import net.origamiking.mcmods.orm.screen.chip_refinery.ChipRefineryScreen;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreen;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreen;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

import static net.origamiking.mcmods.oapi.client.ClientUtils.*;

public class OrmClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModKeybindings.register();
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

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player != null) {
                boolean hasCompleteSet = getHelmetItem(client.player) instanceof TransformerArmorItem &&
                        getChestplateItem(client.player) instanceof TransformerArmorItem &&
                        getLeggingsItem(client.player) instanceof TransformerArmorItem &&
                        getBootsItem(client.player) instanceof TransformerArmorItem;

                if (ModKeybindings.TRANSFORM_KEYBIND.wasPressed() && hasCompleteSet) {
                    TransformerArmorItem.transform();
                }

                if (!hasCompleteSet) {
                    TransformerArmorItem.useTransformedRenderer = false;
                }
            }
        });
    }

    //todo oapi
    public static Item getHelmetItem(ClientPlayerEntity player) {
        return player.getEquippedStack(EquipmentSlot.HEAD).getItem();
    }

    public static Item getChestplateItem(ClientPlayerEntity player) {
        return player.getEquippedStack(EquipmentSlot.CHEST).getItem();
    }

    public static Item getLeggingsItem(ClientPlayerEntity player) {
        return player.getEquippedStack(EquipmentSlot.LEGS).getItem();
    }

    public static Item getBootsItem(ClientPlayerEntity player) {
        return player.getEquippedStack(EquipmentSlot.FEET).getItem();
    }
}
