package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.CarArmorItem;
import net.origamiking.orm.armor.Robot1ArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CarArmorRenderer extends GeoArmorRenderer<CarArmorItem>{
        public CarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/car_model")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


