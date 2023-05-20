package net.origamiking.mcmods.orm.client.items.renderer.megatron_transformed;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.megatron_transformed.MegatronTransformedItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MegatronTransformedRenderer extends GeoItemRenderer<MegatronTransformedItem> {
    public MegatronTransformedRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "megatron_transformed")));
    }
}
