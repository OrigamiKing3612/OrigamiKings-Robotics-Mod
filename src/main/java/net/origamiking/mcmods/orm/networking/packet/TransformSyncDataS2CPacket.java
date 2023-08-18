package net.origamiking.mcmods.orm.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.IEntityDataSaver;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

public class TransformSyncDataS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        //Only on client
        ((IEntityDataSaver)client.player).getPersistentData().putBoolean(OrmMain.MOD_ID + ".is_transformed", buf.readBoolean());
        TransformerArmorItem.transform();
    }
}
