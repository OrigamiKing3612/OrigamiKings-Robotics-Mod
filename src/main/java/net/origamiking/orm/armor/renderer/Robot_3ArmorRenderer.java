package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Robot_3ArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robot_3ArmorRenderer extends GeoArmorRenderer<Robot_3ArmorItem>{
        public Robot_3ArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robot_3")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


