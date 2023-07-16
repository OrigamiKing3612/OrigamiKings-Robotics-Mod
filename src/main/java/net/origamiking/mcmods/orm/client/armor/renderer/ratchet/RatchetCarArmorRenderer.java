package net.origamiking.mcmods.orm.client.armor.renderer.ratchet;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.ratchet.RatchetCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RatchetCarArmorRenderer extends GeoArmorRenderer<RatchetCarArmorItem> {
    public RatchetCarArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/ratchet/ratchet_car")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


