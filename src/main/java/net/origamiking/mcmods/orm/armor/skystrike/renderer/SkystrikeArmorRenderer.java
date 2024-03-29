package net.origamiking.mcmods.orm.armor.skystrike.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SkystrikeArmorRenderer extends GeoArmorRenderer<SkystrikeArmorItem> {
    public SkystrikeArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/skystrike/skystrike")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


