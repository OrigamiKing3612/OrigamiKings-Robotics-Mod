package net.origamiking.mcmods.orm.armor.kickback.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.kickback.KickbackBugArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KickbackBugArmorRenderer extends GeoArmorRenderer<KickbackBugArmorItem> {
    public KickbackBugArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/kickback/kickback_bug")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


