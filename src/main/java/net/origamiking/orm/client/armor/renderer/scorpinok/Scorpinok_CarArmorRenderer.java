package net.origamiking.orm.client.armor.renderer.scorpinok;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.scorpinok.Scorpinok_CarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Scorpinok_CarArmorRenderer extends GeoArmorRenderer<Scorpinok_CarArmorItem> {
    public Scorpinok_CarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/scorpinok_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


