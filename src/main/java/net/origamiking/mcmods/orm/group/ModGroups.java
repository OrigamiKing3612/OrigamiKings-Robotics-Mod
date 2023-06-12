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
import net.origamiking.mcmods.orm.armor.car.Robot_0;
import net.origamiking.mcmods.orm.armor.ironhide.Ironhide;
import net.origamiking.mcmods.orm.armor.megatron.Megatron;
import net.origamiking.mcmods.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.mcmods.orm.armor.robo_1.Robo_1;
import net.origamiking.mcmods.orm.armor.robot_starscream.RobotStarscream;
import net.origamiking.mcmods.orm.armor.scorpinok.Scorpinok;
import net.origamiking.mcmods.orm.armor.skystrike.Skystrike;
import net.origamiking.mcmods.orm.armor.soundwave.Soundwave;
import net.origamiking.mcmods.orm.armor.thunder_cracker.ThunderCracker;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.refinery.RegisterRefineryBlock;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.items.chips.astrotrain.AstrotrainChip;
import net.origamiking.mcmods.orm.items.chips.bumblebee.BumblebeeChip;
import net.origamiking.mcmods.orm.items.chips.ironhide.IronhideChip;
import net.origamiking.mcmods.orm.items.chips.megatron.MegatronChip;
import net.origamiking.mcmods.orm.items.chips.optimus_prime.OptimusPrimeChip;
import net.origamiking.mcmods.orm.items.chips.robo_1.Robo_1Chip;
import net.origamiking.mcmods.orm.items.chips.robot_starscream.RobotStarsceamChip;
import net.origamiking.mcmods.orm.items.chips.scorpinok.ScorpinokChip;
import net.origamiking.mcmods.orm.items.chips.skystrike.SkystrikeChip;
import net.origamiking.mcmods.orm.items.chips.soundwave.SoundwaveChip;
import net.origamiking.mcmods.orm.items.chips.thunder_cracker.ThunderCrackerChip;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

public class ModGroups {
    public static final RegistryKey<ItemGroup> ORM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_group"));
    public static final RegistryKey<ItemGroup> ORM_STUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_stuff"));
    public static final RegistryKey<ItemGroup> ORM_ADDONS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_addons"));
    public static final RegistryKey<ItemGroup> ORM_CHIPS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OrmMain.MOD_ID, "orm_chips"));

    public static void register() {
        OrmMain.LOGGER.info("Registering Groups");
        Registry.register(Registries.ITEM_GROUP, ORM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.armor"))
                .icon(() -> new ItemStack(OptimusPrime.OPTIMUS_PRIME_ARMOR_HELMET))
                .entries((context, entries) -> {
                    entries.add(Robot_0.ROBOT_0_CAR);
                    entries.add(Robo_1.ROBO_1_ARMOR_HELMET);
                    entries.add(Robo_1.ROBO_1_ARMOR_CHESTPLATE);
                    entries.add(Robo_1.ROBO_1_ARMOR_LEGGINGS);
                    entries.add(Robo_1.ROBO_1_ARMOR_BOOTS);
                    entries.add(Robo_1.ROBO_1_CAR);
                    entries.add(Skystrike.SKYSTRIKE_ARMOR_HELMET);
                    entries.add(Skystrike.SKYSTRIKE_ARMOR_CHESTPLATE);
                    entries.add(Skystrike.SKYSTRIKE_ARMOR_LEGGINGS);
                    entries.add(Skystrike.SKYSTRIKE_ARMOR_BOOTS);
                    entries.add(Skystrike.SKYSTRIKE_JET);
                    entries.add(Scorpinok.SCORPINOK_ARMOR_HELMET);
                    entries.add(Scorpinok.SCORPINOK_ARMOR_CHESTPLATE);
                    entries.add(Scorpinok.SCORPINOK_ARMOR_LEGGINGS);
                    entries.add(Scorpinok.SCORPINOK_ARMOR_BOOTS);
                    entries.add(Scorpinok.SCORPINOK_CAR);
                    entries.add(RobotStarscream.ROBOT_STARSCREAM_ARMOR_HELMET);
                    entries.add(RobotStarscream.ROBOT_STARSCREAM_ARMOR_CHESTPLATE);
                    entries.add(RobotStarscream.ROBOT_STARSCREAM_ARMOR_LEGGINGS);
                    entries.add(RobotStarscream.ROBOT_STARSCREAM_ARMOR_BOOTS);
                    entries.add(RobotStarscream.ROBOT_STARSCREAM_JET_ARMOR);
                    entries.add(OptimusPrime.OPTIMUS_PRIME_ARMOR_HELMET);
                    entries.add(OptimusPrime.OPTIMUS_PRIME_ARMOR_CHESTPLATE);
                    entries.add(OptimusPrime.OPTIMUS_PRIME_ARMOR_LEGGINGS);
                    entries.add(OptimusPrime.OPTIMUS_PRIME_ARMOR_BOOTS);
                    entries.add(OptimusPrime.OPTIMUS_PRIME_CAR);
                    entries.add(Astrotrain.ASTROTRAIN_TRAIN);
                    entries.add(Astrotrain.ASTROTRAIN_SHUTTLE);
                    entries.add(Astrotrain.ASTROTRAIN_HELMET);
                    entries.add(Astrotrain.ASTROTRAIN_CHESTPLATE);
                    entries.add(Astrotrain.ASTROTRAIN_LEGGINGS);
                    entries.add(Astrotrain.ASTROTRAIN_BOOTS);
                    entries.add(Bumblebee.BUMBLEBEE_HELMET);
                    entries.add(Bumblebee.BUMBLEBEE_CHESTPLATE);
                    entries.add(Bumblebee.BUMBLEBEE_LEGGINGS);
                    entries.add(Bumblebee.BUMBLEBEE_BOOTS);
                    entries.add(Bumblebee.BUMBLEBEE_CAR);
                    entries.add(Ironhide.IRONHIDE_HELMET);
                    entries.add(Ironhide.IRONHIDE_CHESTPLATE);
                    entries.add(Ironhide.IRONHIDE_LEGGINGS);
                    entries.add(Ironhide.IRONHIDE_BOOTS);
                    entries.add(Ironhide.IRONHIDE_CAR);
                    entries.add(Soundwave.SOUNDWAVE_HELMET);
                    entries.add(Soundwave.SOUNDWAVE_CHESTPLATE);
                    entries.add(Soundwave.SOUNDWAVE_LEGGINGS);
                    entries.add(Soundwave.SOUNDWAVE_BOOTS);
                    entries.add(Soundwave.SOUNDWAVE_RECORDER);
                    entries.add(Megatron.MEGATRON_HELMET);
                    entries.add(Megatron.MEGATRON_CHESTPLATE);
                    entries.add(Megatron.MEGATRON_LEGGINGS);
                    entries.add(Megatron.MEGATRON_BOOTS);
                    entries.add(ItemRegistry.MEGATRON_TRANSFORMED);
                    entries.add(ThunderCracker.THUNDER_CRACKER_HELMET);
                    entries.add(ThunderCracker.THUNDER_CRACKER_CHESTPLATE);
                    entries.add(ThunderCracker.THUNDER_CRACKER_LEGGINGS);
                    entries.add(ThunderCracker.THUNDER_CRACKER_BOOTS);
                    entries.add(ThunderCracker.THUNDER_CRACKER_JET);


                }).build());
        Registry.register(Registries.ITEM_GROUP, ORM_STUFF, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.stuff"))
                .icon(() -> new ItemStack(EnergonBlocks.ENERGON_BLOCK))
                .entries((context, entries) -> {
                    entries.add(RegisterRefineryBlock.REFINERY_BLOCK);
                    entries.add(EnergonItems.ENERGON);
                    entries.add(EnergonBlocks.ENERGON_BLOCK);
                    entries.add(EnergonBlocks.ENERGON_ORE);
                    entries.add(EnergonBlocks.DEEPSLATE_ENERGON_ORE);
                    entries.add(Ore13Items.ORE_13);
                    entries.add(Ore13Blocks.ORE_13_BLOCK);
                    entries.add(Ore13Blocks.ORE_13_ORE);
                    entries.add(Ore13Blocks.DEEPSLATE_ORE_13_ORE);
                    entries.add(TransformiumItems.TRANSFORMIUM);
                    entries.add(TransformiumBlocks.TRANSFORMIUM_BLOCK);
                }).build());
        Registry.register(Registries.ITEM_GROUP, ORM_ADDONS, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.addons"))
                .icon(() -> new ItemStack(ItemRegistry.ROBO_ADDON_1))
                .entries((context, entries) -> {
                    entries.add(ItemRegistry.ROBO_ADDON_1);
                    entries.add(ItemRegistry.SOUNDWAVE_SHOULDER_GUN);
                    entries.add(ItemRegistry.SOUNDWAVE_RAY_GUN);
                    entries.add(ItemRegistry.OPTIMUS_PRIMES_ION_CANNON);
                }).build());
        Registry.register(Registries.ITEM_GROUP, ORM_CHIPS, FabricItemGroup.builder()
                .displayName(Text.translatable("group.orm.chips"))
                .icon(() -> new ItemStack(OptimusPrimeChip.OPTIMUS_PRIME_CHIP))
                .entries((context, entries) -> {
                    entries.add(AstrotrainChip.ASTROTRAIN_CHIP);
                    entries.add(BumblebeeChip.BUMBLEBEE_CHIP);
                    entries.add(IronhideChip.IRONHIDE_CHIP);
                    entries.add(MegatronChip.MEGATRON_CHIP);
                    entries.add(OptimusPrimeChip.OPTIMUS_PRIME_CHIP);
                    entries.add(Robo_1Chip.ROBO_1_CHIP);
                    entries.add(RobotStarsceamChip.ROBOT_STARSCREAM_CHIP);
                    entries.add(ScorpinokChip.SCORPINOK_CHIP);
                    entries.add(SkystrikeChip.SKYSTRIKE_CHIP);
                    entries.add(SoundwaveChip.SOUNDWAVE_CHIP);
                    entries.add(ThunderCrackerChip.THUNDER_CRACKER_CHIP);
                }).build());
    }
}
