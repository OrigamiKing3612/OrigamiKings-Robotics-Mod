package net.origamiking.mcmods.orm.client.items.renderer.blaster;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.blaster.BlasterItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BlasterItemRenderer extends GeoItemRenderer<BlasterItem> {
    public BlasterItemRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "blaster")));
    }
}
