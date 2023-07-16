package net.origamiking.mcmods.orm.entity.photon.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.origamiking.mcmods.orm.entity.photon.PhotonEntity;
import net.origamiking.mcmods.orm.entity.photon.model.PhotonEntityModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class PhotonEntityRenderer extends GeoEntityRenderer<PhotonEntity> {
    public PhotonEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new PhotonEntityModel());

        // Add the glow layer
//        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
