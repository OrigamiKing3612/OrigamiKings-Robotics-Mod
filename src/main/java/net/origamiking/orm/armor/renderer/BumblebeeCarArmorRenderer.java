package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.BumblebeeArmorItem;
import net.origamiking.orm.armor.BumblebeeCarArmorItem;
import net.origamiking.orm.armor.RobotStarscreamJetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BumblebeeCarArmorRenderer extends GeoArmorRenderer<BumblebeeCarArmorItem>{
        public BumblebeeCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/bumblebee_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


