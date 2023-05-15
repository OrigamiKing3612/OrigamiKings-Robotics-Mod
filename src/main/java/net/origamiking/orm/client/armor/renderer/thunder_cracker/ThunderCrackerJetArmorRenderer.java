package net.origamiking.orm.client.armor.renderer.thunder_cracker;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.thunder_cracker.ThunderCrackerJetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ThunderCrackerJetArmorRenderer extends GeoArmorRenderer<ThunderCrackerJetArmorItem>{
        public ThunderCrackerJetArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/thunder_cracker_jet")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


