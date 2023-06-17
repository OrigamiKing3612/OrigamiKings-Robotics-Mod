package net.origamiking.mcmods.orm.client.blocks.renderer.entity;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.entity.vector_guard.VectorGuardEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class VectorGuardEntityModel extends DefaultedEntityGeoModel<VectorGuardEntity> {
    public VectorGuardEntityModel() {
        super(new Identifier(OrmMain.MOD_ID, "vector_guard"), true);
    }
}
