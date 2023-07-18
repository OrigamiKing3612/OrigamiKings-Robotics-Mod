package net.origamiking.mcmods.orm.armor;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.origamiking.mcmods.orm.armor.astrotrain.AstrotrainArmorItem;
import net.origamiking.mcmods.orm.armor.astrotrain.AstrotrainShuttleArmorItem;
import net.origamiking.mcmods.orm.armor.astrotrain.AstrotrainTrainArmorItem;
import net.origamiking.mcmods.orm.armor.bumblebee.BumblebeeArmorItem;
import net.origamiking.mcmods.orm.armor.bumblebee.BumblebeeCarArmorItem;
import net.origamiking.mcmods.orm.armor.galvatron.GalvatronArmorItem;
import net.origamiking.mcmods.orm.armor.galvatron.GalvatronGunArmorItem;
import net.origamiking.mcmods.orm.armor.ironhide.IronhideArmorItem;
import net.origamiking.mcmods.orm.armor.ironhide.IronhideCarArmorItem;
import net.origamiking.mcmods.orm.armor.megatron.MegatronArmorItem;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrimeArmorItem;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrimeCarArmorItem;
import net.origamiking.mcmods.orm.armor.ratchet.RatchetArmorItem;
import net.origamiking.mcmods.orm.armor.ratchet.RatchetCarArmorItem;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrimeArmorItem;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrimeCarArmorItem;
import net.origamiking.mcmods.orm.armor.scorpinok.ScorpinokArmorItem;
import net.origamiking.mcmods.orm.armor.scorpinok.ScorpinokCarArmorItem;
import net.origamiking.mcmods.orm.armor.shockwave.ShockwaveArmorItem;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeArmorItem;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeCarArmorItem;
import net.origamiking.mcmods.orm.armor.skywarp.SkywarpArmorItem;
import net.origamiking.mcmods.orm.armor.skywarp.SkywarpJetArmorItem;
import net.origamiking.mcmods.orm.armor.soundwave.SoundwaveArmorItem;
import net.origamiking.mcmods.orm.armor.soundwave.SoundwaveRecorderArmorItem;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamArmorItem;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamJetArmorItem;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCrackerArmorItem;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCrackerJetArmorItem;

public class SetEffects {
    public static void setEffects() {
        all();
    }

    public static void all() {
        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
            boolean hasCompleteSet = false;

            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof AstrotrainArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof AstrotrainArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof AstrotrainArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof BumblebeeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof BumblebeeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof BumblebeeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof BumblebeeArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof GalvatronArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof GalvatronArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof GalvatronArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof GalvatronArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof IronhideArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof IronhideArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof IronhideArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof IronhideArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof MegatronArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof MegatronArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof MegatronArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof MegatronArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof OptimusPrimeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof OptimusPrimeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof OptimusPrimeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof OptimusPrimeArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof RodimusPrimeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RodimusPrimeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof RodimusPrimeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof RodimusPrimeArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ScorpinokArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ScorpinokArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof ScorpinokArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ScorpinokArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof SkystrikeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkystrikeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof SkystrikeArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof SkystrikeArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof SoundwaveArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SoundwaveArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof SoundwaveArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof SoundwaveArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof StarscreamArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof StarscreamArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof StarscreamArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof StarscreamArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ThunderCrackerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ThunderCrackerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof ThunderCrackerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ThunderCrackerArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof SkywarpArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkywarpArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof SkywarpArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof SkywarpArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ShockwaveArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ShockwaveArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof ShockwaveArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ShockwaveArmorItem) {
                hasCompleteSet = true;
            } else if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof RatchetArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RatchetArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof RatchetArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof RatchetArmorItem) {
                hasCompleteSet = true;
            }

            if (hasCompleteSet || player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainTrainArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainShuttleArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof BumblebeeCarArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof GalvatronGunArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof IronhideCarArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof OptimusPrimeCarArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RodimusPrimeCarArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ScorpinokCarArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkystrikeCarArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SoundwaveRecorderArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof StarscreamJetArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ThunderCrackerJetArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkywarpJetArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RatchetCarArmorItem) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
            } else {
                player.removeStatusEffect(StatusEffects.INVISIBILITY);
            }
        }));

    }
}
