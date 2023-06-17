package net.origamiking.mcmods.orm.client.armor.renderer.ironhide;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.ironhide.IronhideArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IronhideArmorRenderer extends GeoArmorRenderer<IronhideArmorItem>{
        public IronhideArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/ironhide/ironhide")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


