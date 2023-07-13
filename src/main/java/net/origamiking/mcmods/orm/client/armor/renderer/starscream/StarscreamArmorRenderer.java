package net.origamiking.mcmods.orm.client.armor.renderer.starscream;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class StarscreamArmorRenderer extends GeoArmorRenderer<StarscreamArmorItem> {
    public StarscreamArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/starscream/starscream")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


