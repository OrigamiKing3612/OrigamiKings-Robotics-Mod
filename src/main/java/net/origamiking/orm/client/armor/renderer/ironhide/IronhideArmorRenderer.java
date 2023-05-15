package net.origamiking.orm.client.armor.renderer.ironhide;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.ironhide.IronhideArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IronhideArmorRenderer extends GeoArmorRenderer<IronhideArmorItem>{
        public IronhideArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/ironhide")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


