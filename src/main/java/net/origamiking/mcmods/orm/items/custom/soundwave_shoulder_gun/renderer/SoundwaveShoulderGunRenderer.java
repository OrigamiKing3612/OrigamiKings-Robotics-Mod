package net.origamiking.mcmods.orm.items.custom.soundwave_shoulder_gun.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.soundwave_shoulder_gun.SoundwaveShoulderGunItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SoundwaveShoulderGunRenderer extends GeoItemRenderer<SoundwaveShoulderGunItem> {
    public SoundwaveShoulderGunRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "soundwave_shoulder_gun")));
    }
}
