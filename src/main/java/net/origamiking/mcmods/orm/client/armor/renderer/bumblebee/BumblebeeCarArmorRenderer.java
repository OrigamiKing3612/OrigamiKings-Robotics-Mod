package net.origamiking.mcmods.orm.client.armor.renderer.bumblebee;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.bumblebee.BumblebeeCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BumblebeeCarArmorRenderer extends GeoArmorRenderer<BumblebeeCarArmorItem> {
    public BumblebeeCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/bumblebee/bumblebee_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


