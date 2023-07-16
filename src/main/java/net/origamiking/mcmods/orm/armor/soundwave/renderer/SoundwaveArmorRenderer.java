package net.origamiking.mcmods.orm.armor.soundwave.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.soundwave.SoundwaveArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SoundwaveArmorRenderer extends GeoArmorRenderer<SoundwaveArmorItem> {
    public SoundwaveArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/soundwave/soundwave")));

        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}


