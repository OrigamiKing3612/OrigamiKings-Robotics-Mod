package net.origamiking.mcmods.orm.armor.sideswipe.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.sideswipe.SideswipeArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SideswipeArmorRenderer extends GeoArmorRenderer<SideswipeArmorItem> {
    public SideswipeArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/sideswipe/sideswipe")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


