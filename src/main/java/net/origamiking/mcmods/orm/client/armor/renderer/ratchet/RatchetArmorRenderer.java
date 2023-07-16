package net.origamiking.mcmods.orm.client.armor.renderer.ratchet;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.ratchet.RatchetArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RatchetArmorRenderer extends GeoArmorRenderer<RatchetArmorItem> {
    public RatchetArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/ratchet/ratchet")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


