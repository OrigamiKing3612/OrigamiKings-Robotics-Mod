package net.origamiking.mcmods.orm.client.items.renderer.shockwave_transformed;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.shockwave_transformed.ShockwaveTransformedItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ShockwaveTransformedRenderer extends GeoItemRenderer<ShockwaveTransformedItem> {
    public ShockwaveTransformedRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "shockwave_transformed")));
    }
}
