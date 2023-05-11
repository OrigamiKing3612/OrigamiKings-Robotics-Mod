package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.BumblebeeArmorItem;
import net.origamiking.orm.armor.RobotStarscreamArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BumblebeeArmorRenderer extends GeoArmorRenderer<BumblebeeArmorItem>{
        public BumblebeeArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/bumblebee")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


