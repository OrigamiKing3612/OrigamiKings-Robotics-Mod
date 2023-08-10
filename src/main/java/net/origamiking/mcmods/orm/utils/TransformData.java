package net.origamiking.mcmods.orm.utils;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.networking.ModMessages;

public class TransformData {
    public static boolean transform(IEntityDataSaver player) {
        NbtCompound nbt = player.getPersistentData();
        boolean transform = !nbt.getBoolean(OrmMain.MOD_ID + ".is_transformed");
        nbt.putBoolean(OrmMain.MOD_ID + ".is_transformed", transform);
        syncTransform(transform, (ServerPlayerEntity) player);
        return transform;
    }
    public static void syncTransform(boolean transform, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeBoolean(transform);
        ServerPlayNetworking.send(player, ModMessages.TRANSFORM_SYNC_ID, buffer);
    }
}
