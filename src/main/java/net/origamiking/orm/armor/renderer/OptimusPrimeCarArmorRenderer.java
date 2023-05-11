package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.RobotStarscreamJetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OptimusPrimeCarArmorRenderer extends GeoArmorRenderer<RobotStarscreamJetArmorItem>{
        public OptimusPrimeCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/optimus_prime_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


