package net.origamiking.mcmods.orm.client.armor.renderer.galvatron;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.ironhide.IronhideCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GalvatronGunArmorRenderer extends GeoArmorRenderer<IronhideCarArmorItem>{
        public GalvatronGunArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/galvatron/galvatron_gun")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


