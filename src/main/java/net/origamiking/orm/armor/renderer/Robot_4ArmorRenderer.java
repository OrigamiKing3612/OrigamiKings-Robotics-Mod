package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Robot_4ArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robot_4ArmorRenderer extends GeoArmorRenderer<Robot_4ArmorItem>{
        public Robot_4ArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robot_4")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


