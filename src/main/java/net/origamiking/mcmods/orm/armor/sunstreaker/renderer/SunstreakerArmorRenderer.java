package net.origamiking.mcmods.orm.armor.sunstreaker.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.sunstreaker.SunstreakerArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SunstreakerArmorRenderer extends GeoArmorRenderer<SunstreakerArmorItem> {
    public SunstreakerArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/sunstreaker/sunstreaker")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


