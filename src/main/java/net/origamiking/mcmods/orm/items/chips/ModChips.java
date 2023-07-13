package net.origamiking.mcmods.orm.items.chips;

import net.origamiking.mcmods.orm.items.chips.astrotrain.AstrotrainChip;
import net.origamiking.mcmods.orm.items.chips.bumblebee.BumblebeeChip;
import net.origamiking.mcmods.orm.items.chips.galvatron.GalvatronChip;
import net.origamiking.mcmods.orm.items.chips.ironhide.IronhideChip;
import net.origamiking.mcmods.orm.items.chips.megatron.MegatronChip;
import net.origamiking.mcmods.orm.items.chips.optimus_prime.OptimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.skywarp.SkywarpChip;
import net.origamiking.mcmods.orm.items.chips.starscream.StarscreamChip;
import net.origamiking.mcmods.orm.items.chips.rodimus_prime.RodimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.scorpinok.ScorpinokChip;
import net.origamiking.mcmods.orm.items.chips.skystrike.SkystrikeChip;
import net.origamiking.mcmods.orm.items.chips.soundwave.SoundwaveChip;
import net.origamiking.mcmods.orm.items.chips.thunder_cracker.ThunderCrackerChip;

public class ModChips {
    public static void register() {
        AstrotrainChip.get();
        BumblebeeChip.get();
        IronhideChip.get();
        MegatronChip.get();
        OptimusPrimeChip.get();
        StarscreamChip.get();
        ScorpinokChip.get();
        SkystrikeChip.get();
        SoundwaveChip.get();
        ThunderCrackerChip.get();
        GalvatronChip.get();
        RodimusPrimeChip.get();
        SkywarpChip.get();
    }
}
