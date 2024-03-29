package net.origamiking.mcmods.orm.items.custom.soundwave_ray_gun.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.custom.soundwave_ray_gun.SoundwaveRayGunItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SoundwaveRayGunRenderer extends GeoItemRenderer<SoundwaveRayGunItem> {
    public SoundwaveRayGunRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "soundwave_ray_gun")));
    }
}
