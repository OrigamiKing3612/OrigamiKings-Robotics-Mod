package net.origamiking.orm.client.armor.renderer.thunder_cracker;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.thunder_cracker.ThunderCrackerArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ThunderCrackerArmorRenderer extends GeoArmorRenderer<ThunderCrackerArmorItem>{
        public ThunderCrackerArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/thunder_cracker")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


