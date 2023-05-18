package net.origamiking.mcmods.orm.client.armor.renderer.soundwave;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.soundwave.SoundwaveRecorderArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SoundwaveRecorderArmorRenderer extends GeoArmorRenderer<SoundwaveRecorderArmorItem>{
        public SoundwaveRecorderArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/soundwave_recorder")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


