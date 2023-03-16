package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Robot_3ArmorItem;
import net.origamiking.orm.armor.Robot_3_CarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robot_3_CarArmorRenderer extends GeoArmorRenderer<Robot_3_CarArmorItem>{
        public Robot_3_CarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robot_3_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


