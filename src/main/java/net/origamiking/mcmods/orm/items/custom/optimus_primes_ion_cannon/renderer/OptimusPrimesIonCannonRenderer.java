package net.origamiking.mcmods.orm.items.custom.optimus_primes_ion_cannon.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.optimus_primes_ion_cannon.OptimusPrimesIonCannon;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class OptimusPrimesIonCannonRenderer extends GeoItemRenderer<OptimusPrimesIonCannon> {
    public OptimusPrimesIonCannonRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "optimus_primes_ion_cannon")));
    }
}
