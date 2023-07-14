package net.origamiking.mcmods.orm.client.blocks.model.block;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.block_entities.compacter.CompacterBlockEntity;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class CompacterBlockModel extends DefaultedBlockGeoModel<CompacterBlockEntity> {
    public CompacterBlockModel() {
        super(new Identifier(OrmMain.MOD_ID, "compacter_block"));
    }

    @Override
    public RenderLayer getRenderType(CompacterBlockEntity animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}