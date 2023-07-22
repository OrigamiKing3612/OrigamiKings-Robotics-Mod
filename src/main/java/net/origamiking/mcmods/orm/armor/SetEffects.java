package net.origamiking.mcmods.orm.armor;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import net.origamiking.mcmods.orm.utils.TransformerTransformedArmorItem;

import static net.origamiking.mcmods.oapi.armor.ArmorUtils.*;

public class SetEffects {
    public static void setEffects() {
        all();
    }

    public static void all() {
        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
            boolean hasCompleteSet = getHelmetItem(player) instanceof TransformerArmorItem &&
                    getChestplateItem(player) instanceof TransformerArmorItem &&
                    getLeggingsItem(player) instanceof TransformerArmorItem &&
                    getBootsItem(player) instanceof TransformerArmorItem;
            boolean hasTransformedVersion = getChestplateItem(player) instanceof TransformerTransformedArmorItem;

            if (hasCompleteSet || hasTransformedVersion) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
            } else {
                player.removeStatusEffect(StatusEffects.INVISIBILITY);
            }
        }));

    }
}
