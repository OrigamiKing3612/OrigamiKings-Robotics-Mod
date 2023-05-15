package net.origamiking.orm.client.armor.renderer.bumblebee;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.bumblebee.BumblebeeCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BumblebeeCarArmorRenderer extends GeoArmorRenderer<BumblebeeCarArmorItem>{
        public BumblebeeCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/bumblebee_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


