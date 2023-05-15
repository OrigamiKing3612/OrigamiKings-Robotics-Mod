package net.origamiking.orm.client.armor.renderer.ironhide;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.ironhide.IronhideCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IronhideCarArmorRenderer extends GeoArmorRenderer<IronhideCarArmorItem>{
        public IronhideCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/ironhide_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


