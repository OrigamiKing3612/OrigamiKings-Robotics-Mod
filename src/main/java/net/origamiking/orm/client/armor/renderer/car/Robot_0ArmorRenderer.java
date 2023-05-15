package net.origamiking.orm.client.armor.renderer.car;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.car.Robot_0ArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robot_0ArmorRenderer extends GeoArmorRenderer<Robot_0ArmorItem>{
        public Robot_0ArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/car_model")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


