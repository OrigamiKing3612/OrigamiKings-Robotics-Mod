package net.origamiking.mcmods.orm.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.utils.EnergyCellsData;
import net.origamiking.mcmods.orm.utils.IEntityEnergyCellsDataSaver;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

import java.util.Random;

public class PlayerTickHandler implements ServerTickEvents.StartTick {
    @Override
    public void onStartTick(MinecraftServer server) {
        for (ServerPlayerEntity serverPlayerEntity : server.getPlayerManager().getPlayerList()) {
            IEntityEnergyCellsDataSaver dataPlayer = ((IEntityEnergyCellsDataSaver) serverPlayerEntity);
            if (ArmorUtils.isArmorSetOfType(serverPlayerEntity, TransformerArmorItem.class)) {
                if (new Random().nextFloat() < 0.050000f) {
                    EnergyCellsData.removeEnergyCells(dataPlayer, 1);
                }
                if (dataPlayer.getPersistentData().getInt("energy_cells") <= 0) {
                    serverPlayerEntity.getInventory().armor.set(0, ItemStack.EMPTY);
                    serverPlayerEntity.getInventory().armor.set(1, ItemStack.EMPTY);
                    serverPlayerEntity.getInventory().armor.set(2, ItemStack.EMPTY);
                    serverPlayerEntity.getInventory().armor.set(3, ItemStack.EMPTY);
                    EnergyCellsData.addEnergyCells(dataPlayer, 1);
                }
            }
        }
    }
}