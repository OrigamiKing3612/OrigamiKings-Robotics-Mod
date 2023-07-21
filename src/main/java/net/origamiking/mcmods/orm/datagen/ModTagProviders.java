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
import net.origamiking.mcmods.orm.fluid.ModFluids;
import net.origamiking.mcmods.orm.items.chips.astrotrain.AstrotrainChip;
import net.origamiking.mcmods.orm.items.chips.bumblebee.BumblebeeChip;
import net.origamiking.mcmods.orm.items.chips.galvatron.GalvatronChip;
import net.origamiking.mcmods.orm.items.chips.ironhide.IronhideChip;
import net.origamiking.mcmods.orm.items.chips.megatron.MegatronChip;
import net.origamiking.mcmods.orm.items.chips.optimus_prime.OptimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.ratchet.RatchetChip;
import net.origamiking.mcmods.orm.items.chips.rodimus_prime.RodimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.scorpinok.ScorpinokChip;
import net.origamiking.mcmods.orm.items.chips.shockwave.ShockwaveChip;
import net.origamiking.mcmods.orm.items.chips.skystrike.SkystrikeChip;
import net.origamiking.mcmods.orm.items.chips.skywarp.SkywarpChip;
import net.origamiking.mcmods.orm.items.chips.soundwave.SoundwaveChip;
import net.origamiking.mcmods.orm.items.chips.starscream.StarscreamChip;
import net.origamiking.mcmods.orm.items.chips.thunder_cracker.ThunderCrackerChip;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.tag.ModBlockTags;
import net.origamiking.mcmods.orm.tag.ModFluidTags;
import net.origamiking.mcmods.orm.tag.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class ModTagProviders {
    public static void getTags(FabricDataGenerator.Pack pack) {
        pack.addProvider(Blocks::new);
        pack.addProvider(Items::new);
        pack.addProvider(EntityType::new);
        pack.addProvider(Fluid::new);
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
                    TransformiumBlocks.TRANSFORMIUM_SLAB,
                    TransformiumBlocks.TRANSFORMIUM_STAIRS,
                    TransformiumBlocks.TRANSFORMIUM_WALL,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB,
                    TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL
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
                    EnergonBlocks.DARK_ENERGON_SLAB,
                    EnergonBlocks.RAW_ENERGON_BLOCK,
                    EnergonBlocks.RAW_DARK_ENERGON_BLOCK

            );
            getOrCreateTagBuilder(ModBlockTags.ORE_13_BLOCKS).add(
                    Ore13Blocks.ORE_13_BLOCK,
                    Ore13Blocks.ORE_13_SLAB,
                    Ore13Blocks.ORE_13_STAIRS
            );
            getOrCreateTagBuilder(ModBlockTags.ENERGON_ORES).add(EnergonBlocks.ENERGON_ORE, EnergonBlocks.DEEPSLATE_ENERGON_ORE, EnergonBlocks.DARK_ENERGON_ORE, EnergonBlocks.DEEPSLATE_DARK_ENERGON_ORE);
            getOrCreateTagBuilder(ModBlockTags.ORE_13_ORES).add(Ore13Blocks.ORE_13_ORE, Ore13Blocks.DEEPSLATE_ORE_13_ORE);
            getOrCreateTagBuilder(BlockTags.WALLS).add(TransformiumBlocks.TRANSFORMIUM_WALL).add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_WALL).add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_WALL);
        }
    }

    static class Items extends FabricTagProvider.ItemTagProvider {
        public Items(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup registries) {
            getOrCreateTagBuilder(ItemTags.ARROWS).add(ItemRegistry.PHOTON_ITEM);
            getOrCreateTagBuilder(ModItemTags.CHIPS)
                    .add(OptimusPrimeChip.CHIP)
                    .add(MegatronChip.CHIP)
                    .add(RodimusPrimeChip.CHIP)
                    .add(GalvatronChip.CHIP)
                    .add(BumblebeeChip.CHIP)
                    .add(IronhideChip.CHIP)
                    .add(AstrotrainChip.CHIP)
                    .add(SkystrikeChip.CHIP)
                    .add(StarscreamChip.CHIP)
                    .add(SoundwaveChip.CHIP)
                    .add(ThunderCrackerChip.CHIP)
                    .add(ScorpinokChip.CHIP)
                    .add(SkywarpChip.CHIP)
                    .add(ShockwaveChip.CHIP)
                    .add(RatchetChip.CHIP);
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
    static class Fluid extends FabricTagProvider.FluidTagProvider {

        public Fluid(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            getOrCreateTagBuilder(ModFluidTags.OIL)
                    .add(ModFluids.STILL_OIL)
                    .add(ModFluids.FLOWING_OIL);

            getOrCreateTagBuilder(ModFluidTags.RAW_ENERGON)
                    .add(ModFluids.STILL_RAW_ENERGON)
                    .add(ModFluids.FLOWING_RAW_ENERGON);

            getOrCreateTagBuilder(ModFluidTags.RAW_DARK_ENERGON)
                    .add(ModFluids.STILL_RAW_DARK_ENERGON)
                    .add(ModFluids.FLOWING_RAW_DARK_ENERGON);
        }
    }
}
