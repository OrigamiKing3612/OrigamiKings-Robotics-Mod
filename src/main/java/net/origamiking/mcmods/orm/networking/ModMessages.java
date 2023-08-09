package net.origamiking.mcmods.orm.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.networking.packet.TransformArmorPacket;

public class ModMessages {
    public static final Identifier TRANSFORM_ARMOR_PACKET_ID = new Identifier(OrmMain.MOD_ID, "transform_armor");
    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(TRANSFORM_ARMOR_PACKET_ID, TransformArmorPacket::handle);
    }
    public static void registerS2CPackets() {

    }
}
