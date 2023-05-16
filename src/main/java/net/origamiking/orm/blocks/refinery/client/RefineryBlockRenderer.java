package net.origamiking.orm.blocks.refinery.client;

import net.origamiking.orm.blocks.refinery.RefineryBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class RefineryBlockRenderer extends GeoBlockRenderer<RefineryBlockEntity> {
    public RefineryBlockRenderer() {
        super(new RefineryBlockModel());
    }
}
