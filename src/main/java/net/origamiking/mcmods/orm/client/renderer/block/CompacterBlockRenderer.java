package net.origamiking.mcmods.orm.client.renderer.block;

import net.origamiking.mcmods.orm.block_entities.compacter.CompacterBlockEntity;
import net.origamiking.mcmods.orm.client.model.block.CompacterBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CompacterBlockRenderer extends GeoBlockRenderer<CompacterBlockEntity> {
	public CompacterBlockRenderer() {
		super(new CompacterBlockModel());
	}
}
