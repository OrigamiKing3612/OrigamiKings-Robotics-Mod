package net.origamiking.mcmods.orm.client.armor.renderer.scorpinok;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok_CarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Scorpinok_CarArmorRenderer extends GeoArmorRenderer<Scorpinok_CarArmorItem> {
    public Scorpinok_CarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/scorpinok_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


