package net.origamiking.mcmods.orm.networking.packet;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

import static net.origamiking.mcmods.oapi.armor.ArmorUtils.*;

public class TransformArmorPacket {
    public static final Identifier ID = new Identifier(OrmMain.MOD_ID, "transform_armor");

    public static void send() {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        ClientPlayNetworking.send(ID, buf);
    }

    public static void handle(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        boolean hasCompleteSet = getHelmetItem(player) instanceof TransformerArmorItem &&
                getChestplateItem(player) instanceof TransformerArmorItem &&
                getLeggingsItem(player) instanceof TransformerArmorItem &&
                getBootsItem(player) instanceof TransformerArmorItem;

        if (hasCompleteSet) {
            TransformerArmorItem.transform();
        }
    }
}