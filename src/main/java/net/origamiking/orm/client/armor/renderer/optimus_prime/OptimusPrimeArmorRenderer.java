package net.origamiking.orm.client.armor.renderer.optimus_prime;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.robot_starscream.RobotStarscreamArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OptimusPrimeArmorRenderer extends GeoArmorRenderer<RobotStarscreamArmorItem>{
        public OptimusPrimeArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/optimus_prime")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


