package net.origamiking.mcmods.orm.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.utils.EnergyCellsData;
import net.origamiking.mcmods.orm.utils.IEntityEnergyCellsDataSaver;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

public class EnergyCellsC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        if (ArmorUtils.isArmorSetOfType(player, TransformerArmorItem.class)) {
            EnergyCellsData.addEnergyCells(((IEntityEnergyCellsDataSaver) player), 1);
            EnergyCellsData.syncEnergyCells(((IEntityEnergyCellsDataSaver) player).getPersistentData().getInt("energy_cells"), player);
        }
    }
}
