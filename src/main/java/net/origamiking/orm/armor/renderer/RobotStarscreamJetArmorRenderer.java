package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Robo_1_CarArmorItem;
import net.origamiking.orm.armor.RobotStarscreamArmorItem;
import net.origamiking.orm.armor.RobotStarscreamJetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RobotStarscreamJetArmorRenderer extends GeoArmorRenderer<RobotStarscreamJetArmorItem>{
        public RobotStarscreamJetArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robot_starscream_jet")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


