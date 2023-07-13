package net.origamiking.mcmods.orm.client.armor.renderer.skywarp;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.skywarp.SkywarpJetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SkywarpJetArmorRenderer extends GeoArmorRenderer<SkywarpJetArmorItem>{
        public SkywarpJetArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/skywarp/skywarp_jet")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


