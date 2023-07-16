package net.origamiking.mcmods.orm.armor.shockwave.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.shockwave.ShockwaveArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ShockwaveArmorRenderer extends GeoArmorRenderer<ShockwaveArmorItem> {
    public ShockwaveArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/shockwave/shockwave")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


