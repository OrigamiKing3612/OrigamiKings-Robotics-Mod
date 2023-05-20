package net.origamiking.mcmods.orm.client.items.renderer.robo_addon_1;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.robo_addon_1.Robo_Addon_1_Item;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class Robo_Addon_1_Item_Renderer extends GeoItemRenderer<Robo_Addon_1_Item> {
    public Robo_Addon_1_Item_Renderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "robo_addon_1")));
    }
}
