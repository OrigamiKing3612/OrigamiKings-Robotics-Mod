package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Robot1ArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robot1ArmorRenderer extends GeoArmorRenderer<Robot1ArmorItem>{
        public Robot1ArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robot_model_1")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


