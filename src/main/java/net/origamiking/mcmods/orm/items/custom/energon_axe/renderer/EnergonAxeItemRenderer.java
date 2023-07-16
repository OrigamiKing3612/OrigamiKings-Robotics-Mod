package net.origamiking.mcmods.orm.items.custom.energon_axe.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.energon_axe.EnergonAxeItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class EnergonAxeItemRenderer extends GeoItemRenderer<EnergonAxeItem> {
    public EnergonAxeItemRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "energon_axe")));
    }
}
