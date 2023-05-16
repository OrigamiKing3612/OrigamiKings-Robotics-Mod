package net.origamiking.orm.blocks.refinery;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class RefineryBlockModel extends DefaultedBlockGeoModel<RefineryBlockEntity> {
    private final Identifier REFINERY_BLOCK_MODEL = buildFormattedModelPath(new Identifier(OrmMain.MOD_ID, "refinery_block"));
    private final Identifier REFINERY_BLOCK_TEXTURE = buildFormattedTexturePath(new Identifier(OrmMain.MOD_ID, "refinery_block"));
    private final Identifier REFINERY_BLOCK_ANIMATIONS = buildFormattedAnimationPath(new Identifier(OrmMain.MOD_ID, "refinery_block"));
    public RefineryBlockModel() {
        super(new Identifier(OrmMain.MOD_ID, "refinery_block"));
    }

    @Override
    public Identifier getAnimationResource(RefineryBlockEntity animatable) {
            return REFINERY_BLOCK_ANIMATIONS;
    }
    @Override
    public Identifier getModelResource(RefineryBlockEntity animatable) {
            return REFINERY_BLOCK_MODEL;
    }
    @Override
    public Identifier getTextureResource(RefineryBlockEntity animatable) {
            return REFINERY_BLOCK_TEXTURE;
    }
    @Override
    public RenderLayer getRenderType(RefineryBlockEntity animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}