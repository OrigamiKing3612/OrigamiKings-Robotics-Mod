package net.origamiking.mcmods.orm.client.armor.renderer.rodimus_prime;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrimeCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RodimusPrimeCarArmorRenderer extends GeoArmorRenderer<RodimusPrimeCarArmorItem> {
    public RodimusPrimeCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/rodimus_prime/rodimus_prime_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


