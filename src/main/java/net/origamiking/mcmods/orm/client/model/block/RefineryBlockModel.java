package net.origamiking.mcmods.orm.client.model.block;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.block_entities.refinery.RefineryBlockEntity;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class RefineryBlockModel extends DefaultedBlockGeoModel<RefineryBlockEntity> {
	public RefineryBlockModel() {
		super(new Identifier(OrmMain.MOD_ID, "refinery_block"));
	}

	@Override
	public RenderLayer getRenderType(RefineryBlockEntity animatable, Identifier texture) {
		return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
	}
}