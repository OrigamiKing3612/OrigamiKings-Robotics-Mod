package net.origamiking.mcmods.orm.items.custom;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.blaster.BlasterItem;
import net.origamiking.mcmods.orm.items.custom.energon_axe.EnergonAxeItem;
import net.origamiking.mcmods.orm.items.custom.megatron_transformed.MegatronTransformedItem;
import net.origamiking.mcmods.orm.items.custom.optimus_primes_ion_cannon.OptimusPrimesIonCannon;
import net.origamiking.mcmods.orm.items.custom.photon.PhotonItem;
import net.origamiking.mcmods.orm.items.custom.pulse_rifle.PulseRifleItem;
import net.origamiking.mcmods.orm.items.custom.soundwave_ray_gun.SoundwaveRayGunItem;
import net.origamiking.mcmods.orm.items.custom.soundwave_shoulder_gun.SoundwaveShoulderGunItem;

import static net.origamiking.mcmods.oapi.items.ItemsUtils.registerItem;

public class ItemRegistry {
    public static final Item PHOTON_ITEM = registerItem(OrmMain.MOD_ID, "photon_item", new PhotonItem(new OrigamiItemSettings()));
    public static final SoundwaveShoulderGunItem SOUNDWAVE_SHOULDER_GUN = registerItem(OrmMain.MOD_ID, "soundwave_shoulder_gun", new SoundwaveShoulderGunItem(new OrigamiItemSettings().maxCount(1)));
    public static final SoundwaveRayGunItem SOUNDWAVE_RAY_GUN = registerItem(OrmMain.MOD_ID, "soundwave_ray_gun", new SoundwaveRayGunItem(new OrigamiItemSettings().maxCount(1)));
    public static final OptimusPrimesIonCannon OPTIMUS_PRIMES_ION_CANNON = registerItem(OrmMain.MOD_ID, "optimus_primes_ion_cannon", new OptimusPrimesIonCannon(new OrigamiItemSettings().maxCount(1)));
    public static final MegatronTransformedItem MEGATRON_TRANSFORMED = registerItem(OrmMain.MOD_ID, "megatron_transformed", new MegatronTransformedItem(new OrigamiItemSettings().maxCount(1)));
    public static final BlasterItem BLASTER = registerItem(OrmMain.MOD_ID, "blaster", new BlasterItem(new OrigamiItemSettings().maxCount(1)));
    public static final PulseRifleItem PULSE_RIFLE = registerItem(OrmMain.MOD_ID, "pulse_rifle", new PulseRifleItem(new OrigamiItemSettings().maxCount(1)));
    public static final EnergonAxeItem ENERGON_AXE = registerItem(OrmMain.MOD_ID, "energon_axe", new EnergonAxeItem(new OrigamiItemSettings().maxCount(1)));

    public static void register() {
    }

}
