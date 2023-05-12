package net.origamiking.orm.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.BumblebeeArmorItem;
import net.origamiking.orm.armor.SoundwaveArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SoundwaveArmorRenderer extends GeoArmorRenderer<SoundwaveArmorItem>{
        public SoundwaveArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/soundwave")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


