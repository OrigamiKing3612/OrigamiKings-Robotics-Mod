package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.AstrotrainArmorItem;
import net.origamiking.orm.armor.MegatronArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MegatronArmorRenderer extends GeoArmorRenderer<MegatronArmorItem>{
        public MegatronArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/megatron")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


