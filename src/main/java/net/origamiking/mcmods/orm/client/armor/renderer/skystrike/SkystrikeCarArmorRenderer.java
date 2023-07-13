package net.origamiking.mcmods.orm.client.armor.renderer.skystrike;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.skystrike.SkystrikeCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SkystrikeCarArmorRenderer extends GeoArmorRenderer<SkystrikeCarArmorItem> {
    public SkystrikeCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/skystrike/skystrike_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


