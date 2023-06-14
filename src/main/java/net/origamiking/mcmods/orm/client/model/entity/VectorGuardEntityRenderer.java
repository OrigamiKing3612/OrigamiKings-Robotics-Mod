package net.origamiking.mcmods.orm.client.model.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.origamiking.mcmods.orm.client.renderer.entity.VectorGuardEntityModel;
import net.origamiking.mcmods.orm.entity.vector_guard.VectorGuardEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class VectorGuardEntityRenderer extends GeoEntityRenderer<VectorGuardEntity> {
    private int currentTick = -1;

    public VectorGuardEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new VectorGuardEntityModel());

        // Add the glow layer to the bat so that it can live out its dreams of being rudolph
//        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }

    // Add some particles around the ear when rendering
//    @Override
//    public void renderFinal(MatrixStack poseStack, VectorGuardEntity animatable, BakedGeoModel model, VertexConsumerProvider bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//        if (this.currentTick < 0 || this.currentTick != animatable.age) {
//            this.currentTick = animatable.age;
//
//            // Find the earbone and use it as the point of reference
//            this.model.getBone("Body").ifPresent(ear -> {
//                Random rand = animatable.getRandom();
//                Vector3d earPos = ear.getWorldPosition();
//
//                animatable.getEntityWorld().addParticle(ParticleTypes.PORTAL,
//                        earPos.x(),
//                        earPos.y(),
//                        earPos.z(),
//                        rand.nextDouble() - 0.5D,
//                        -rand.nextDouble(),
//                        rand.nextDouble() - 0.5D);
//            });
//        }
//
//        super.renderFinal(poseStack, animatable, model, bufferSource, buffer, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
//    }
}
