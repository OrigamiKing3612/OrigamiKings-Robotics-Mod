package net.origamiking.mcmods.orm.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.keybind.ModKeybindings;
import net.origamiking.mcmods.orm.networking.ModMessages;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

public class ClientPlayerTickHandler implements ClientTickEvents.StartTick {

    @Override
    public void onStartTick(MinecraftClient client) {
        if (client.player != null) {
            boolean hasCompleteSet = ArmorUtils.isArmorSetOfType(client.player, TransformerArmorItem.class);

            if (ModKeybindings.TRANSFORM_KEYBIND.wasPressed() && hasCompleteSet) {
                if (MinecraftClient.getInstance().world != null) {
                    if (!MinecraftClient.getInstance().world.isClient) {
                        TransformerArmorItem.transform();
                    }
                }
                ClientPlayNetworking.send(ModMessages.TRANSFORM_PACKET_ID, PacketByteBufs.create());
            }

            if (!hasCompleteSet) {
                TransformerArmorItem.useTransformedRenderer = false;
            }
        }
    }
}
