package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.AstrotrainArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AstrotrainTrainArmorRenderer extends GeoArmorRenderer<AstrotrainArmorItem>{
        public AstrotrainTrainArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/astrotrain_train")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


