package net.origamiking.mcmods.orm.client.armor.renderer.skywarp;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.skywarp.SkywarpArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SkywarpArmorRenderer extends GeoArmorRenderer<SkywarpArmorItem> {
    public SkywarpArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/skywarp/skywarp")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


