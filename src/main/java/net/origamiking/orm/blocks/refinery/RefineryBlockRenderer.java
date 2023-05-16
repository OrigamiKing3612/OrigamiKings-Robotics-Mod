package net.origamiking.orm.blocks.refinery;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class RefineryBlockRenderer extends GeoBlockRenderer<RefineryBlockEntity> {
    public RefineryBlockRenderer() {
        super(new RefineryBlockModel());
    }
}
