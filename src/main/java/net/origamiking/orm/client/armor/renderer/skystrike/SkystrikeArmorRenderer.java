package net.origamiking.orm.client.armor.renderer.skystrike;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.skystrike.SkystrikeArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SkystrikeArmorRenderer extends GeoArmorRenderer<SkystrikeArmorItem>{
        public SkystrikeArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/skystrike")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


