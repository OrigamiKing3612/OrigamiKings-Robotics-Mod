package net.origamiking.orm.armor;

import net.origamiking.orm.armor.astrotrain.Astrotrain;
import net.origamiking.orm.armor.bumblebee.Bumblebee;
import net.origamiking.orm.armor.car.Robot_0;
import net.origamiking.orm.armor.ironhide.Ironhide;
import net.origamiking.orm.armor.megatron.Megatron;
import net.origamiking.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.orm.armor.robo_1.Robo_1;
import net.origamiking.orm.armor.robot_starscream.RobotStarscream;
import net.origamiking.orm.armor.scorpinok.Scorpinok;
import net.origamiking.orm.armor.skystrike.Skystrike;
import net.origamiking.orm.armor.soundwave.Soundwave;
import net.origamiking.orm.armor.thunder_cracker.ThunderCracker;

public class ModArmor {
    public static void register() {
        Robot_0.get();
        Robo_1.get();
        Skystrike.get();
        Scorpinok.get();
        RobotStarscream.get();
        OptimusPrime.get();
        Astrotrain.get();
        Bumblebee.get();
        Ironhide.get();
        Megatron.get();
        Soundwave.get();
        ThunderCracker.get();
    }
}
