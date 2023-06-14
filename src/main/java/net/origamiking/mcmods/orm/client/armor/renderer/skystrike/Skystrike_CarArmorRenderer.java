package net.origamiking.mcmods.orm.client.armor.renderer.skystrike;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Skystrike_CarArmorRenderer extends GeoArmorRenderer<SkystrikeCarArmorItem>{
        public Skystrike_CarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/skystrike_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


