package net.origamiking.mcmods.orm.client.items.renderer.optimus_primes_ion_cannon;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.optimus_primes_ion_cannon.OptimusPrimesIonCannon;
import net.origamiking.mcmods.orm.items.custom.soundwave_ray_gun.SoundwaveRayGunItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class OptimusPrimesIonCannonRenderer extends GeoItemRenderer<OptimusPrimesIonCannon> {
    public OptimusPrimesIonCannonRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "optimus_primes_ion_cannon")));
    }
}
