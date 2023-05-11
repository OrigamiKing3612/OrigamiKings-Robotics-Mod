package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Skystrike_CarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Skystrike_CarArmorRenderer extends GeoArmorRenderer<Skystrike_CarArmorItem>{
        public Skystrike_CarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/skystrike_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


