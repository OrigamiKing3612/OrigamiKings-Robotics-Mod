package net.origamiking.mcmods.orm.client.armor.renderer.thunder_cracker;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCrackerArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ThunderCrackerArmorRenderer extends GeoArmorRenderer<ThunderCrackerArmorItem> {
    public ThunderCrackerArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/thunder_cracker/thunder_cracker")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


