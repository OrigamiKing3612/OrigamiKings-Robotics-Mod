package net.origamiking.mcmods.orm.block_entities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.refinery.RefineryBlockEntity;
import net.origamiking.mcmods.orm.blocks.refinery.RegisterRefineryBlock;

public class ModBlockEntities {
//    public static BlockEntityType<RefineryBlockEntity> REFINERY_BLOCK;
    public static final BlockEntityType<RefineryBlockEntity> REFINERY_BLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            OrmMain.MOD_ID + ":refinery_block",
            FabricBlockEntityTypeBuilder.create(RefineryBlockEntity::new, RegisterRefineryBlock.REFINERY_BLOCK).build(null));
    public static void register() {
//        REFINERY_BLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE,
//                new Identifier(OrmMain.MOD_ID, "gem_infusing_station"),
//                FabricBlockEntityTypeBuilder.create(RefineryBlockEntity::new,
//                        RegisterRefineryBlock.REFINERY_BLOCK).build(null));
    }
}
