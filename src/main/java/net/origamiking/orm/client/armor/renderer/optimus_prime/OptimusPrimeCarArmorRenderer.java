package net.origamiking.orm.client.armor.renderer.optimus_prime;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.robot_starscream.RobotStarscreamJetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OptimusPrimeCarArmorRenderer extends GeoArmorRenderer<RobotStarscreamJetArmorItem>{
        public OptimusPrimeCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/optimus_prime_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


