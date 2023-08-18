package net.origamiking.mcmods.orm.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.origamiking.mcmods.orm.utils.IEntityEnergyCellsDataSaver;

public class EnergyCellsSyncDataS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        ((IEntityEnergyCellsDataSaver) client.player).getPersistentData().putInt("energy_cells", buf.readInt());
    }
}
