package net.origamiking.mcmods.orm.armor.kickback.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.kickback.KickbackArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KickbackArmorRenderer extends GeoArmorRenderer<KickbackArmorItem> {
    public KickbackArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/kickback/kickback")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


