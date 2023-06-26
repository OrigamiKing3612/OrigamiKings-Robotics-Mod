package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.registry.tag.ItemTags;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium_alloy.TransformiumAlloyBlocks;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.tag.ModBlockTags;

import java.util.concurrent.CompletableFuture;

public class ModTagProviders {
    public static void getTags(FabricDataGenerator.Pack pack) {
        pack.addProvider(Blocks::new);
        pack.addProvider(Items::new);
        pack.addProvider(EntityType::new);
    }

    static class Blocks extends FabricTagProvider.BlockTagProvider {
        public Blocks(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup registries) {
            getOrCreateTagBuilder(BlockTags.STAIRS).add(
                    TransformiumBlocks.TRANSFORMIUM_STAIRS,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS,
                    Ore13Blocks.ORE_13_STAIRS,
                    EnergonBlocks.DARK_ENERGON_STAIRS
            );
            getOrCreateTagBuilder(BlockTags.SLABS).add(
                    TransformiumBlocks.TRANSFORMIUM_SLAB,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB,
                    Ore13Blocks.ORE_13_SLAB,
                    EnergonBlocks.DARK_ENERGON_SLAB
            );
            getOrCreateTagBuilder(ModBlockTags.TRANSFORMIUM_BLOCKS).add(
                    TransformiumBlocks.TRANSFORMIUM_BLOCK,
                    TransformiumBlocks.TRANSFORMIUM_STAIRS,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB
            );
            getOrCreateTagBuilder(ModBlockTags.ENERGON_BLOCKS).add(
                    EnergonBlocks.ENERGON_BLOCK,
                    EnergonBlocks.ENERGON_ORE,
                    EnergonBlocks.DEEPSLATE_ENERGON_ORE,
                    EnergonBlocks.COMPACT_ENERGON_BLOCK,
                    EnergonBlocks.DARK_ENERGON_BLOCK,
                    EnergonBlocks.DARK_ENERGON_ORE,
                    EnergonBlocks.DEEPSLATE_DARK_ENERGON_ORE,
                    EnergonBlocks.ENERGON_STAIRS,
                    EnergonBlocks.ENERGON_SLAB,
                    EnergonBlocks.DARK_ENERGON_STAIRS,
                    EnergonBlocks.DARK_ENERGON_SLAB
            );
            getOrCreateTagBuilder(ModBlockTags.ORE_13_BLOCKS).add(
                    Ore13Blocks.ORE_13_BLOCK,
                    Ore13Blocks.ORE_13_SLAB,
                    Ore13Blocks.ORE_13_STAIRS
            );
            getOrCreateTagBuilder(ModBlockTags.ENERGON_ORES).add(EnergonBlocks.ENERGON_ORE, EnergonBlocks.DEEPSLATE_ENERGON_ORE, EnergonBlocks.DARK_ENERGON_ORE, EnergonBlocks.DEEPSLATE_DARK_ENERGON_ORE);
            getOrCreateTagBuilder(ModBlockTags.ORE_13_ORES).add(Ore13Blocks.ORE_13_ORE, Ore13Blocks.DEEPSLATE_ORE_13_ORE);
        }
    }

    static class Items extends FabricTagProvider.ItemTagProvider {
        public Items(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup registries) {
            getOrCreateTagBuilder(ItemTags.ARROWS).add(ItemRegistry.PHOTON_ITEM);
        }
    }

    static class EntityType extends FabricTagProvider.EntityTypeTagProvider {

        public EntityType(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            getOrCreateTagBuilder(EntityTypeTags.ARROWS)
                    .add(ModEntities.PhotonEntityType);
        }
    }
}
