package net.origamiking.mcmods.orm.client.armor.renderer.rodimus_prime;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrimeArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RodimusPrimeArmorRenderer extends GeoArmorRenderer<RodimusPrimeArmorItem>{
        public RodimusPrimeArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/rodimus_prime/rodimus_prime")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


