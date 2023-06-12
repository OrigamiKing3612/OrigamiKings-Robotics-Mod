package net.origamiking.mcmods.orm.client.renderer.block;

import net.origamiking.mcmods.orm.block_entities.RefineryBlockEntity;
import net.origamiking.mcmods.orm.client.model.block.RefineryBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class RefineryBlockRenderer extends GeoBlockRenderer<RefineryBlockEntity> {
	public RefineryBlockRenderer() {
		super(new RefineryBlockModel());
	}
}
