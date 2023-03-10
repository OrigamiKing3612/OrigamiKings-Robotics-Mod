package net.origamiking.orm.items.custom.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.items.custom.Robo_Addon_1_Item;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class Robo_Addon_1_Item_Renderer extends GeoItemRenderer<Robo_Addon_1_Item> {
    public Robo_Addon_1_Item_Renderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "robo_addon_1")));
    }
}
