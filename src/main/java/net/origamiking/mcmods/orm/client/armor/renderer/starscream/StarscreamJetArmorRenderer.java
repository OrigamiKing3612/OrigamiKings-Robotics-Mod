package net.origamiking.mcmods.orm.client.armor.renderer.starscream;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.starscream.StarscreamJetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class StarscreamJetArmorRenderer extends GeoArmorRenderer<StarscreamJetArmorItem> {
    public StarscreamJetArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/starscream/starscream_jet")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


