package net.origamiking.orm.client.armor.renderer.car;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.car.CarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CarArmorRenderer extends GeoArmorRenderer<CarArmorItem>{
        public CarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/car_model")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


