package net.origamiking.orm.client.armor.renderer.scorpinok;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.scorpinok.ScorpinokArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ScorpinokArmorRenderer extends GeoArmorRenderer<ScorpinokArmorItem>{
        public ScorpinokArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/scorpinok")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


