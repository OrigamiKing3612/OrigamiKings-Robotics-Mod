package net.origamiking.mcmods.orm.armor;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.server.network.ServerPlayerEntity;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import net.origamiking.mcmods.orm.utils.TransformerTransformedArmorItem;

public class SetEffects {
    public static void setEffects() {
        all();
    }

    public static void all() {
        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
            boolean hasCompleteSet = player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof TransformerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof TransformerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof TransformerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof TransformerArmorItem;
            boolean hasTransformedVersion = getChestplateItem(player) instanceof TransformerTransformedArmorItem;

            if (hasCompleteSet || hasTransformedVersion) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
            } else {
                player.removeStatusEffect(StatusEffects.INVISIBILITY);
            }
        }));

    }
    //todo move to oapi
    private static Item getChestplateItem(ServerPlayerEntity player) {
        return player.getEquippedStack(EquipmentSlot.CHEST).getItem();
    }
}
