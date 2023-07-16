package net.origamiking.mcmods.orm.armor.scorpinok.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.scorpinok.ScorpinokCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ScorpinokCarArmorRenderer extends GeoArmorRenderer<ScorpinokCarArmorItem> {
    public ScorpinokCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/scorpinok/scorpinok_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


