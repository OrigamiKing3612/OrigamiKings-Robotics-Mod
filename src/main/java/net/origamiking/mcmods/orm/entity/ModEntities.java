package net.origamiking.mcmods.orm.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.entity.photon.PhotonEntity;
import net.origamiking.mcmods.orm.entity.vector_guard.VectorGuardEntity;

import static net.origamiking.mcmods.oapi.entity.EntityUtils.registerEntity;

public class ModEntities {
    public static final EntityType<VectorGuardEntity> VECTOR_GUARD = registerEntity(OrmMain.MOD_ID, "vector_guard", VectorGuardEntity::new, 1.0f, 2.2f, SpawnGroup.MONSTER);

    public static final EntityType<PhotonEntity> PhotonEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(OrmMain.MOD_ID, "photon"),
            FabricEntityTypeBuilder.<PhotonEntity>create(SpawnGroup.MISC, PhotonEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build()
    );

    public static void register() {
        FabricDefaultAttributeRegistry.register(ModEntities.VECTOR_GUARD, VectorGuardEntity.setAttributes());
    }
}
