package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.BumblebeeCarArmorItem;
import net.origamiking.orm.armor.IronhideCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IronhideCarArmorRenderer extends GeoArmorRenderer<IronhideCarArmorItem>{
        public IronhideCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/ironhide_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


