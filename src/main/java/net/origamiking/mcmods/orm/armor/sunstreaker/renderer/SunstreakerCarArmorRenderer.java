package net.origamiking.mcmods.orm.armor.sunstreaker.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.sunstreaker.SunstreakerCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SunstreakerCarArmorRenderer extends GeoArmorRenderer<SunstreakerCarArmorItem> {
    public SunstreakerCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/sunstreaker/sunstreaker_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


