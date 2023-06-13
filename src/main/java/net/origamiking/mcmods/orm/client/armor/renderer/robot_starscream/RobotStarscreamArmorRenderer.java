package net.origamiking.mcmods.orm.client.armor.renderer.robot_starscream;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.starscream.RobotStarscreamArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RobotStarscreamArmorRenderer extends GeoArmorRenderer<RobotStarscreamArmorItem>{
        public RobotStarscreamArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robot_starscream")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


