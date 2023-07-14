package net.origamiking.mcmods.orm.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.entity.photon.PhotonEntity;
import net.origamiking.mcmods.orm.entity.vector_guard.VectorGuardEntity;

public class ModEntities {
    public static final EntityType<VectorGuardEntity> VECTOR_GUARD = registerEntity("vector_guard", VectorGuardEntity::new, 1.0f, 2.2f, SpawnGroup.MONSTER);

    public static final EntityType<PhotonEntity> PhotonEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(OrmMain.MOD_ID, "photon"),
            FabricEntityTypeBuilder.<PhotonEntity>create(SpawnGroup.MISC, PhotonEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build()
    );

    public static <T extends MobEntity> EntityType<T> registerEntity(String name, EntityType.EntityFactory<T> entity, float width, float height, SpawnGroup spawnGroup) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(OrmMain.MOD_ID, name), FabricEntityTypeBuilder.create(spawnGroup, entity).dimensions(EntityDimensions.changing(width, height)).build());
    }

    public static void register() {
        FabricDefaultAttributeRegistry.register(ModEntities.VECTOR_GUARD, VectorGuardEntity.setAttributes());
    }
}
