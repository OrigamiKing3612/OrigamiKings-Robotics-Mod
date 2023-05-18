package net.origamiking.mcmods.orm.client.armor.renderer.scorpinok;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.scorpinok.ScorpinokArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ScorpinokArmorRenderer extends GeoArmorRenderer<ScorpinokArmorItem>{
        public ScorpinokArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/scorpinok")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


