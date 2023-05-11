package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.ScorpinokArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ScorpinokArmorRenderer extends GeoArmorRenderer<ScorpinokArmorItem>{
        public ScorpinokArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/scorpinok")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


