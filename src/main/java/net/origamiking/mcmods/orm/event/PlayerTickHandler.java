package net.origamiking.mcmods.orm.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
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
                if (new Random().nextFloat() < 0.00005f) {
                    EnergyCellsData.removeEnergyCells(dataPlayer, 1);
                    OrmMain.LOGGER.info("Removed Energy Cell Cells Left:" + dataPlayer.getPersistentData().getInt("energy_cells"));
                }
            }
            if (dataPlayer.getPersistentData().getInt("energy_cells") <= 0) {
                serverPlayerEntity.damageArmor(MinecraftClient.getInstance().world.getDamageSources().outOfWorld(), 10000.0f);
                EnergyCellsData.addEnergyCells(dataPlayer, 1);
            }
        }
    }
}