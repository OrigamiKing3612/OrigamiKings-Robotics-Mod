package net.origamiking.mcmods.orm.client.armor.renderer.optimus_prime;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrimeCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OptimusPrimeCarArmorRenderer extends GeoArmorRenderer<OptimusPrimeCarArmorItem> {
    public OptimusPrimeCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/optimus_prime/optimus_prime_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


