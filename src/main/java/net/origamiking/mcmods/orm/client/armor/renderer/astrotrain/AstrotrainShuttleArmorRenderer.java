package net.origamiking.mcmods.orm.client.armor.renderer.astrotrain;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.astrotrain.AstrotrainArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AstrotrainShuttleArmorRenderer extends GeoArmorRenderer<AstrotrainArmorItem>{
        public AstrotrainShuttleArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/astrotrain_shuttle")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }

