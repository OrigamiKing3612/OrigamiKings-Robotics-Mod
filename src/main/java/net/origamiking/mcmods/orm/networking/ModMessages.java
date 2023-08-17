package net.origamiking.mcmods.orm.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.networking.packet.EnergyCellsC2SPacket;
import net.origamiking.mcmods.orm.networking.packet.EnergyCellsSyncDataS2CPacket;
import net.origamiking.mcmods.orm.networking.packet.TransformSyncDataS2CPacket;
import net.origamiking.mcmods.orm.networking.packet.TransformingC2SPacket;

public class ModMessages {
    public static final Identifier TRANSFORM_PACKET_ID = new Identifier(OrmMain.MOD_ID, "transform");
    public static final Identifier TRANSFORM_SYNC_ID = new Identifier(OrmMain.MOD_ID, "transform_sync");
    public static final Identifier ENERGY_CELLS_ID = new Identifier(OrmMain.MOD_ID, "energy_cells");
    public static final Identifier ENERGY_CELLS_SYNC_ID = new Identifier(OrmMain.MOD_ID, "energy_cells_sync");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(TRANSFORM_PACKET_ID, TransformingC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(ENERGY_CELLS_ID, EnergyCellsC2SPacket::receive);
    }
    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(TRANSFORM_SYNC_ID, TransformSyncDataS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(ENERGY_CELLS_SYNC_ID, EnergyCellsSyncDataS2CPacket::receive);
    }
}
