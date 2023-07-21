package net.origamiking.mcmods.orm.armor.sideswipe.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.sideswipe.SideswipeCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SideswipeCarArmorRenderer extends GeoArmorRenderer<SideswipeCarArmorItem> {
    public SideswipeCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/sideswipe/sideswipe_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


