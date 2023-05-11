package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.AstrotrainArmorItem;
import net.origamiking.orm.armor.ScorpinokArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AstrotrainArmorRenderer extends GeoArmorRenderer<AstrotrainArmorItem>{
        public AstrotrainArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/astrotrain")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


