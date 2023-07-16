package net.origamiking.mcmods.orm.blocks.custom.refinery.renderer;

import net.origamiking.mcmods.orm.block_entities.refinery.RefineryBlockEntity;
import net.origamiking.mcmods.orm.blocks.custom.refinery.model.RefineryBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class RefineryBlockRenderer extends GeoBlockRenderer<RefineryBlockEntity> {
    public RefineryBlockRenderer() {
        super(new RefineryBlockModel());
    }
}
