package net.origamiking.mcmods.orm.blocks.custom.compacter.renderer;

import net.origamiking.mcmods.orm.block_entities.compacter.CompacterBlockEntity;
import net.origamiking.mcmods.orm.blocks.custom.compacter.model.CompacterBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CompacterBlockRenderer extends GeoBlockRenderer<CompacterBlockEntity> {
    public CompacterBlockRenderer() {
        super(new CompacterBlockModel());
    }
}
