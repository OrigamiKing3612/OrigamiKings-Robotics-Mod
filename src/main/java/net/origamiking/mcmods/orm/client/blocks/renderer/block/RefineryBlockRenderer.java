package net.origamiking.mcmods.orm.client.blocks.renderer.block;

import net.origamiking.mcmods.orm.block_entities.refinery.RefineryBlockEntity;
import net.origamiking.mcmods.orm.client.blocks.model.block.RefineryBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class RefineryBlockRenderer extends GeoBlockRenderer<RefineryBlockEntity> {
    public RefineryBlockRenderer() {
        super(new RefineryBlockModel());
    }
}
