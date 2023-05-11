package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.RobotStarscreamArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OptimusPrimeArmorRenderer extends GeoArmorRenderer<RobotStarscreamArmorItem>{
        public OptimusPrimeArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/optimus_prime")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


