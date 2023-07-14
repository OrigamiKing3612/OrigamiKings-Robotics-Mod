package net.origamiking.mcmods.orm.client.armor.renderer.optimus_prime;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OptimusPrimeArmorRenderer extends GeoArmorRenderer<StarscreamArmorItem> {
    public OptimusPrimeArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/optimus_prime/optimus_prime")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


