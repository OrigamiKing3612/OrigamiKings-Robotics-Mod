package net.origamiking.mcmods.orm.armor.bumblebee.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.bumblebee.BumblebeeArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BumblebeeArmorRenderer extends GeoArmorRenderer<BumblebeeArmorItem> {
    public BumblebeeArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/bumblebee/bumblebee")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


