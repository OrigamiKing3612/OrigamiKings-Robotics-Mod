package net.origamiking.mcmods.orm.client.entity.renderer.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.origamiking.mcmods.orm.client.entity.model.entity.PhotonEntityModel;
import net.origamiking.mcmods.orm.entity.photon.PhotonEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class PhotonEntityRenderer extends GeoEntityRenderer<PhotonEntity> {
    public PhotonEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new PhotonEntityModel());

        // Add the glow layer
//        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
