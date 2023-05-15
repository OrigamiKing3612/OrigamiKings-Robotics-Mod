package net.origamiking.orm.client.armor.renderer.robo_1;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.robo_1.Robo_1ArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Robo_1ArmorRenderer extends GeoArmorRenderer<Robo_1ArmorItem>{
        public Robo_1ArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/robo_1")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


