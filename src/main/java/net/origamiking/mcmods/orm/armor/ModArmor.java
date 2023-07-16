package net.origamiking.mcmods.orm.armor;

import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.ratchet.Ratchet;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrime;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.shockwave.Shockwave;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;
import net.origamiking.mcmods.orm.armor.skywarp.Skywarp;
import net.origamiking.mcmods.orm.armor.soundwave.Soundwave;
import net.origamiking.mcmods.orm.armor.starscream.Starscream;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;

public class ModArmor {
    public static void register() {
        Skystrike.get();
        Scorpinok.get();
        Starscream.get();
        OptimusPrime.get();
        Astrotrain.get();
        Bumblebee.get();
        Ironhide.get();
        Megatron.get();
        Soundwave.get();
        ThunderCracker.get();
        Galvatron.get();
        RodimusPrime.get();
        Skywarp.get();
        Shockwave.get();
        Ratchet.get();

        SetEffects.setEffects();
    }
}
