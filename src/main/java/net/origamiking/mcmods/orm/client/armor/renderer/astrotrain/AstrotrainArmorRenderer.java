package net.origamiking.mcmods.orm.client.armor.renderer.astrotrain;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.astrotrain.AstrotrainArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AstrotrainArmorRenderer extends GeoArmorRenderer<AstrotrainArmorItem>{
        public AstrotrainArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/astrotrain/astrotrain")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


