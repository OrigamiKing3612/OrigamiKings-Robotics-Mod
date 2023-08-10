package net.origamiking.mcmods.orm.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.IEntityDataSaver;
import net.origamiking.mcmods.orm.utils.TransformData;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

import static net.origamiking.mcmods.oapi.armor.ArmorUtils.*;

public class TransformingC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        // only on the Server
        ServerWorld world = (ServerWorld) player.getWorld();
        if (canTransform(player)) {

            // Play the transform sound
            world.playSound(null, player.getBlockPos(), SoundEvents.ENTITY_GENERIC_DRINK, SoundCategory.PLAYERS,
                    0.5F, world.random.nextFloat() * 0.1F + 0.9F);

            // transform
            TransformData.transform(((IEntityDataSaver) player));
        } else {
            TransformData.syncTransform(((IEntityDataSaver) player).getPersistentData().getBoolean(OrmMain.MOD_ID + ".is_transformed"), player);
        }
    }

    private static boolean canTransform(ServerPlayerEntity player) {
        return getHelmetItem(player) instanceof TransformerArmorItem &&
                getChestplateItem(player) instanceof TransformerArmorItem &&
                getLeggingsItem(player) instanceof TransformerArmorItem &&
                getBootsItem(player) instanceof TransformerArmorItem;
    }
}
