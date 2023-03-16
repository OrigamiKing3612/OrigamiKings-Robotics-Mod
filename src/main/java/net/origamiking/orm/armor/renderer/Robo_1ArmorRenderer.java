package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robo_1ArmorRenderer extends GeoArmorRenderer<Robot1ArmorItem>{
        public Robo_1ArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robo_1")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


