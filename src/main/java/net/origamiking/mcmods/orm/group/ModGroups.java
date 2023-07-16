package net.origamiking.mcmods.orm.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.astrotrain.Astrotrain;
import net.origamiking.mcmods.orm.armor.bumblebee.Bumblebee;
import net.origamiking.mcmods.orm.armor.galvatron.Galvatron;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.ratchet.Ratchet;
import net.origamiking.mcmods.orm.armor.rodimus_prime.RodimusPrime;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.shockwave.Shockwave;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;
import net.origamiking.mcmods.orm.armor.skywarp.Skywarp;
import net.origamiking.mcmods.orm.armor.soundwave.Soundwave;
import net.origamiking.mcmods.orm.armor.starscream.Starscream;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;
import net.origamiking.mcmods.orm.blocks.chip_refinery.RegisterChipRefineryBlock;
import net.origamiking.mcmods.orm.blocks.compacter.RegisterCompacterBlock;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.random.RandomBlocks;
import net.origamiking.mcmods.orm.blocks.refinery.RegisterRefineryBlock;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.blocks.transformium_alloy.TransformiumAlloyBlocks;
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
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.spawnegg.ModSpawnEggs;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;
import net.origamiking.mcmods.orm.items.transformium_alloy.TransformiumAlloyItems;

public class ModGroups {
    public static final RegistryKey<ItemGroup> ORM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_group"));
    public static final RegistryKey<ItemGroup> ORM_STUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_stuff"));
    public static final RegistryKey<ItemGroup> ORM_ADDONS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_addons"));
    public static final RegistryKey<ItemGroup> ORM_CHIPS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_chips"));

    public static void register() {
        armor();
        stuff();
        addons();
        chips();
    }

    public static void armor() {
        Registry.register(Registries.ITEM_GROUP, ORM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.armor"))
                .icon(() -> new ItemStack(OptimusPrime.HELMET))
                .entries((context, entries) -> {
                    entries.add(OptimusPrime.HELMET);
                    entries.add(OptimusPrime.CHESTPLATE);
                    entries.add(OptimusPrime.LEGGINGS);
                    entries.add(OptimusPrime.BOOTS);
                    entries.add(OptimusPrime.CAR);
                    entries.add(Megatron.HELMET);
                    entries.add(Megatron.CHESTPLATE);
                    entries.add(Megatron.LEGGINGS);
                    entries.add(Megatron.BOOTS);
                    entries.add(ItemRegistry.MEGATRON_TRANSFORMED);
                    entries.add(RodimusPrime.HELMET);
                    entries.add(RodimusPrime.CHESTPLATE);
                    entries.add(RodimusPrime.LEGGINGS);
                    entries.add(RodimusPrime.BOOTS);
                    entries.add(RodimusPrime.CAR);
                    entries.add(Galvatron.HELMET);
                    entries.add(Galvatron.CHESTPLATE);
                    entries.add(Galvatron.LEGGINGS);
                    entries.add(Galvatron.BOOTS);
                    entries.add(Galvatron.GALVATRON_GUN);
                    entries.add(Bumblebee.HELMET);
                    entries.add(Bumblebee.CHESTPLATE);
                    entries.add(Bumblebee.LEGGINGS);
                    entries.add(Bumblebee.BOOTS);
                    entries.add(Bumblebee.CAR);
                    entries.add(Ironhide.HELMET);
                    entries.add(Ironhide.CHESTPLATE);
                    entries.add(Ironhide.LEGGINGS);
                    entries.add(Ironhide.BOOTS);
                    entries.add(Ironhide.CAR);
                    entries.add(Ratchet.HELMET);
                    entries.add(Ratchet.CHESTPLATE);
                    entries.add(Ratchet.LEGGINGS);
                    entries.add(Ratchet.BOOTS);
                    entries.add(Ratchet.CAR);
                    entries.add(Astrotrain.TRAIN);
                    entries.add(Astrotrain.SHUTTLE);
                    entries.add(Astrotrain.HELMET);
                    entries.add(Astrotrain.CHESTPLATE);
                    entries.add(Astrotrain.LEGGINGS);
                    entries.add(Astrotrain.BOOTS);
                    entries.add(Skystrike.HELMET);
                    entries.add(Skystrike.CHESTPLATE);
                    entries.add(Skystrike.LEGGINGS);
                    entries.add(Skystrike.BOOTS);
                    entries.add(Skystrike.JET);
                    entries.add(Starscream.HELMET);
                    entries.add(Starscream.CHESTPLATE);
                    entries.add(Starscream.LEGGINGS);
                    entries.add(Starscream.BOOTS);
                    entries.add(Starscream.JET);
                    entries.add(Soundwave.HELMET);
                    entries.add(Soundwave.CHESTPLATE);
                    entries.add(Soundwave.LEGGINGS);
                    entries.add(Soundwave.BOOTS);
                    entries.add(Soundwave.RECORDER);
                    entries.add(ThunderCracker.HELMET);
                    entries.add(ThunderCracker.CHESTPLATE);
                    entries.add(ThunderCracker.LEGGINGS);
                    entries.add(ThunderCracker.BOOTS);
                    entries.add(ThunderCracker.JET);
                    entries.add(Skywarp.HELMET);
                    entries.add(Skywarp.CHESTPLATE);
                    entries.add(Skywarp.LEGGINGS);
                    entries.add(Skywarp.BOOTS);
                    entries.add(Skywarp.JET);
                    entries.add(Scorpinok.HELMET);
                    entries.add(Scorpinok.CHESTPLATE);
                    entries.add(Scorpinok.LEGGINGS);
                    entries.add(Scorpinok.BOOTS);
                    entries.add(Scorpinok.CAR);
                    entries.add(Shockwave.HELMET);
                    entries.add(Shockwave.CHESTPLATE);
                    entries.add(Shockwave.LEGGINGS);
                    entries.add(Shockwave.BOOTS);
                    entries.add(ItemRegistry.SHOCKWAVE_TRANSFORMED);
                }).build());
    }

    public static void stuff() {
        Registry.register(Registries.ITEM_GROUP, ORM_STUFF, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.stuff"))
                .icon(() -> new ItemStack(EnergonItems.ENERGON))
                .entries((context, entries) -> {
                    entries.add(EnergonItems.ENERGON);
                    entries.add(EnergonItems.DARK_ENERGON);
                    entries.add(Ore13Items.ORE_13);
                    entries.add(TransformiumItems.TRANSFORMIUM);
                    entries.add(TransformiumAlloyItems.TRANSFORMIUM_ALLOY);
                    entries.add(TransformiumAlloyItems.TRANSFORMIUM_ALLOY_BRICK);
                    entries.add(RandomItems.SPARK);
                    entries.add(RandomItems.ENERGY_CONDUCTOR);
                    entries.add(ModSpawnEggs.VECTOR_GUARD_SPAWN_EGG);
                    entries.add(ItemRegistry.PHOTON_ITEM);
                    entries.add(EnergonBlocks.ENERGON_BLOCK);
                    entries.add(EnergonBlocks.ENERGON_STAIRS);
                    entries.add(EnergonBlocks.ENERGON_SLAB);
                    entries.add(Ore13Blocks.ORE_13_BLOCK);
                    entries.add(Ore13Blocks.ORE_13_STAIRS);
                    entries.add(Ore13Blocks.ORE_13_SLAB);
                    entries.add(TransformiumBlocks.TRANSFORMIUM_BLOCK);
                    entries.add(TransformiumBlocks.TRANSFORMIUM_STAIRS);
                    entries.add(TransformiumBlocks.TRANSFORMIUM_SLAB);
                    entries.add(EnergonBlocks.ENERGON_ORE);
                    entries.add(EnergonBlocks.DEEPSLATE_ENERGON_ORE);
                    entries.add(EnergonBlocks.DARK_ENERGON_BLOCK);
                    entries.add(EnergonBlocks.DARK_ENERGON_STAIRS);
                    entries.add(EnergonBlocks.DARK_ENERGON_SLAB);
                    entries.add(EnergonBlocks.DARK_ENERGON_ORE);
                    entries.add(EnergonBlocks.DEEPSLATE_DARK_ENERGON_ORE);
                    entries.add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BLOCK);
                    entries.add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_STAIRS);
                    entries.add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_SLAB);
                    entries.add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_BLOCK);
                    entries.add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_STAIRS);
                    entries.add(TransformiumAlloyBlocks.TRANSFORMIUM_ALLOY_BRICK_SLAB);
                    entries.add(Ore13Blocks.ORE_13_ORE);
                    entries.add(Ore13Blocks.DEEPSLATE_ORE_13_ORE);
                    entries.add(EnergonBlocks.COMPACT_ENERGON_BLOCK);
                    entries.add(RegisterRefineryBlock.REFINERY_BLOCK);
                    entries.add(RegisterCompacterBlock.COMPACTER_BLOCK);
                    entries.add(RegisterChipRefineryBlock.CHIP_REFINERY_BLOCK);
                    entries.add(RandomBlocks.FORCE_FIELD_BLOCK);
                }).build());
    }

    public static void addons() {
        Registry.register(Registries.ITEM_GROUP, ORM_ADDONS, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.addons"))
                .icon(() -> new ItemStack(ItemRegistry.OPTIMUS_PRIMES_ION_CANNON))
                .entries((context, entries) -> {
                    entries.add(ItemRegistry.OPTIMUS_PRIMES_ION_CANNON);
                    entries.add(ItemRegistry.ENERGON_AXE);
                    entries.add(ItemRegistry.BLASTER);
                    entries.add(ItemRegistry.PULSE_RIFLE);
                    entries.add(ItemRegistry.SOUNDWAVE_SHOULDER_GUN);
                    entries.add(ItemRegistry.SOUNDWAVE_RAY_GUN);
                }).build());
    }

    public static void chips() {
        Registry.register(Registries.ITEM_GROUP, ORM_CHIPS, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.chips"))
                .icon(() -> new ItemStack(OptimusPrimeChip.CHIP))
                .entries((context, entries) -> {
                    entries.add(OptimusPrimeChip.CHIP);
                    entries.add(MegatronChip.CHIP);
                    entries.add(RodimusPrimeChip.CHIP);
                    entries.add(GalvatronChip.CHIP);
                    entries.add(BumblebeeChip.CHIP);
                    entries.add(IronhideChip.CHIP);
                    entries.add(AstrotrainChip.CHIP);
                    entries.add(SkystrikeChip.CHIP);
                    entries.add(StarscreamChip.CHIP);
                    entries.add(SoundwaveChip.CHIP);
                    entries.add(ThunderCrackerChip.CHIP);
                    entries.add(ScorpinokChip.CHIP);
                    entries.add(SkywarpChip.CHIP);
                    entries.add(ShockwaveChip.CHIP);
                    entries.add(RatchetChip.CHIP);
                }).build());
    }
}
