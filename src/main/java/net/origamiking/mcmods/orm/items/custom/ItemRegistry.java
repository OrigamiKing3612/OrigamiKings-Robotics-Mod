package net.origamiking.mcmods.orm.items.custom;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.blaster.BlasterItem;
import net.origamiking.mcmods.orm.items.custom.energon_axe.EnergonAxeItem;
import net.origamiking.mcmods.orm.items.custom.megatron_transformed.MegatronTransformedItem;
import net.origamiking.mcmods.orm.items.custom.optimus_primes_ion_cannon.OptimusPrimesIonCannon;
import net.origamiking.mcmods.orm.items.custom.pulse_rifle.PulseRifleItem;
import net.origamiking.mcmods.orm.items.custom.soundwave_ray_gun.SoundwaveRayGunItem;
import net.origamiking.mcmods.orm.items.custom.soundwave_shoulder_gun.SoundwaveShoulderGunItem;

public class ItemRegistry {
    public static final SoundwaveShoulderGunItem SOUNDWAVE_SHOULDER_GUN = registerItem("soundwave_shoulder_gun", new SoundwaveShoulderGunItem(new OrigamiItemSettings()));
    public static final SoundwaveRayGunItem SOUNDWAVE_RAY_GUN = registerItem("soundwave_ray_gun", new SoundwaveRayGunItem(new OrigamiItemSettings()));
    public static final OptimusPrimesIonCannon OPTIMUS_PRIMES_ION_CANNON = registerItem("optimus_primes_ion_cannon", new OptimusPrimesIonCannon(new OrigamiItemSettings()));
    public static final MegatronTransformedItem MEGATRON_TRANSFORMED = registerItem("megatron_transformed", new MegatronTransformedItem(new OrigamiItemSettings()));
    public static final BlasterItem BLASTER = registerItem("blaster", new BlasterItem(new OrigamiItemSettings()));
    public static final PulseRifleItem PULSE_RIFLE = registerItem("pulse_rifle", new PulseRifleItem(new OrigamiItemSettings()));
    public static final EnergonAxeItem ENERGON_AXE = registerItem("energon_axe", new EnergonAxeItem(new OrigamiItemSettings()));



    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OrmMain.MOD_ID, name), item);
    }
    public static void register() {}

}
