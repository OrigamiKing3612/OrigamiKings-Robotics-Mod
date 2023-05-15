package net.origamiking.orm.client.armor.renderer.soundwave;

import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.soundwave.SoundwaveRecorderArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SoundwaveRecorderArmorRenderer extends GeoArmorRenderer<SoundwaveRecorderArmorItem>{
        public SoundwaveRecorderArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/soundwave_recorder")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


