package net.origamiking.mcmods.orm.client.items.renderer.pulse_rifle;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.pulse_rifle.PulseRifleItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PulseRifleItemRenderer extends GeoItemRenderer<PulseRifleItem> {
    public PulseRifleItemRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "pulse_rifle")));
    }
}
