package net.origamiking.mcmods.orm.client.armor.renderer.ironhide;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.ironhide.IronhideCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IronhideCarArmorRenderer extends GeoArmorRenderer<IronhideCarArmorItem>{
        public IronhideCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/ironhide_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }

