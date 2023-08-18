package net.origamiking.mcmods.orm.utils;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.origamiking.mcmods.orm.networking.ModMessages;

public class EnergyCellsData {
    public static int addEnergyCells(IEntityEnergyCellsDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int energy_cells = nbt.getInt("energy_cells");
        if(energy_cells + amount >= 10) {
            energy_cells = 10;
        } else {
            energy_cells += amount;
        }

        nbt.putInt("energy_cells", energy_cells);
        // sync the data
        syncEnergyCells(energy_cells, (ServerPlayerEntity) player);
        return energy_cells;
    }

    public static int removeEnergyCells(IEntityEnergyCellsDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int energy_cells = nbt.getInt("energy_cells");
        if(energy_cells - amount < 0) {
            energy_cells = 0;
        } else {
            energy_cells -= amount;
        }

        nbt.putInt("energy_cells", energy_cells);
        syncEnergyCells(energy_cells, (ServerPlayerEntity) player);
        return energy_cells;
    }


    public static void syncEnergyCells(int energy_cells, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(energy_cells);
        ServerPlayNetworking.send(player, ModMessages.ENERGY_CELLS_SYNC_ID, buffer);
    }
}
