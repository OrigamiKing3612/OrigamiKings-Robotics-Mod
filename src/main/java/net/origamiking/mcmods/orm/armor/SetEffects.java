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
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrimeArmorItem;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrimeCarArmorItem;
import net.origamiking.mcmods.orm.armor.scorpinok.ScorpinokArmorItem;
import net.origamiking.mcmods.orm.armor.scorpinok.ScorpinokCarArmorItem;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeArmorItem;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeCarArmorItem;
import net.origamiking.mcmods.orm.armor.soundwave.SoundwaveArmorItem;
import net.origamiking.mcmods.orm.armor.soundwave.SoundwaveRecorderArmorItem;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamArmorItem;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamJetArmorItem;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCrackerArmorItem;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCrackerJetArmorItem;

public class SetEffects {
    public static void setEffects() {
//        astrotrain();
//        bumblebee();
//        galvatron();
//        ironhide();
//        megatron();
//        optimusprime();
//        rodimusprime();
//        scorpinok();
//        skystrike();
//        soundwave();
//        starscream();
//        thundercracker();
        chestplates();
    }

    private static void chestplates() {
        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
            if (
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainTrainArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainShuttleArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof BumblebeeArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof BumblebeeCarArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof GalvatronArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof GalvatronGunArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof IronhideArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof IronhideCarArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof MegatronArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof OptimusPrimeArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof OptimusPrimeCarArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RodimusPrimeArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RodimusPrimeCarArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ScorpinokArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ScorpinokCarArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkystrikeArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkystrikeCarArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SoundwaveArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SoundwaveRecorderArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof StarscreamArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof StarscreamJetArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ThunderCrackerArmorItem ||
                            player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ThunderCrackerJetArmorItem
            ) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
            } else {
                player.removeStatusEffect(StatusEffects.INVISIBILITY);
            }
        }));
    }

//    private static void astrotrain() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof AstrotrainArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof AstrotrainArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof AstrotrainArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainTrainArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof AstrotrainShuttleArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void bumblebee() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof BumblebeeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof BumblebeeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof BumblebeeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof BumblebeeArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof BumblebeeCarArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void galvatron() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof GalvatronArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof GalvatronArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof GalvatronArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof GalvatronArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof GalvatronGunArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void ironhide() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof IronhideArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof IronhideArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof IronhideArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof IronhideArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof IronhideCarArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void megatron() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof MegatronArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof MegatronArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof MegatronArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof MegatronArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void optimusprime() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof OptimusPrimeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof OptimusPrimeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof OptimusPrimeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof OptimusPrimeArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof OptimusPrimeCarArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void rodimusprime() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof RodimusPrimeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RodimusPrimeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof RodimusPrimeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof RodimusPrimeArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof RodimusPrimeCarArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void scorpinok() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ScorpinokArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ScorpinokArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof ScorpinokArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ScorpinokArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ScorpinokCarArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void skystrike() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof SkystrikeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkystrikeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof SkystrikeArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof SkystrikeArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SkystrikeCarArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void soundwave() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof SoundwaveArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SoundwaveArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof SoundwaveArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof SoundwaveArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof SoundwaveRecorderArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void starscream() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof StarscreamArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof StarscreamArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof StarscreamArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof StarscreamArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof StarscreamJetArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
//
//    private static void thundercracker() {
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ThunderCrackerArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ThunderCrackerArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof ThunderCrackerArmorItem &&
//                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ThunderCrackerArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
//            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ThunderCrackerJetArmorItem) {
//                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
//            } else {
//                player.removeStatusEffect(StatusEffects.INVISIBILITY);
//            }
//        }));
//    }
}
