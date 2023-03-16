package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.Robot_4ArmorItem;
import net.origamiking.orm.armor.Robot_4_CarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robot_4_CarArmorRenderer extends GeoArmorRenderer<Robot_4_CarArmorItem> {
    public Robot_4_CarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robot_4_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


