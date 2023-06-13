package net.origamiking.mcmods.orm.armor;

import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.car.Robot_0;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.robo_1.Robo_1;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrime;
import net.origamiking.mcmods.orm.armor.starscream.Starscream;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;
import net.origamiking.mcmods.orm.armor.soundwave.Soundwave;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;

public class ModArmor {
    public static void register() {
        Robot_0.get();
        Robo_1.get();
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
    }
}
