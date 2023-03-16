package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Robo_1ArmorItem;
import net.origamiking.orm.armor.Robo_1_CarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robo_1_CarArmorRenderer extends GeoArmorRenderer<Robo_1_CarArmorItem>{
        public Robo_1_CarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robo_1_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


