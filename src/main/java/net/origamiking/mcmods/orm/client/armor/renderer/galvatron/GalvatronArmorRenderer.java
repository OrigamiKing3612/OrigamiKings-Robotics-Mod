package net.origamiking.mcmods.orm.client.armor.renderer.galvatron;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.ironhide.IronhideArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GalvatronArmorRenderer extends GeoArmorRenderer<IronhideArmorItem>{
        public GalvatronArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/galvatron/galvatron")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


