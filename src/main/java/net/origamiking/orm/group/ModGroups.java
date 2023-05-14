package net.origamiking.orm.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.data.client.Models;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.ArmorRegistry;
import net.origamiking.orm.blocks.energon.EnergonBlocks;
import net.origamiking.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.orm.items.custom.ItemRegistry;
import net.origamiking.orm.items.energon.EnergonItems;
import net.origamiking.orm.items.ore13.Ore13Items;
import net.origamiking.orm.items.transformium.TransformiumItems;

public class ModGroups {
    private static final ItemGroup ORM_GROUP = FabricItemGroup.builder(new Identifier(OrmMain.MOD_ID, "orm_group"))
            .displayName(Text.literal("OrigamiKing's Robotics Armor Mod"))
            .icon(() -> new ItemStack(ArmorRegistry.OPTIMUS_PRIME_ARMOR_HELMET))
            .entries((context, entries) -> {
                entries.add(ArmorRegistry.ROBO_1_ARMOR_HELMET);
                entries.add(ArmorRegistry.ROBO_1_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.ROBO_1_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.ROBO_1_ARMOR_BOOTS);
                entries.add(ItemRegistry.ROBO_ADDON_1);
                entries.add(ArmorRegistry.SKYSTRIKE_ARMOR_HELMET);
                entries.add(ArmorRegistry.SKYSTRIKE_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.SKYSTRIKE_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.SKYSTRIKE_ARMOR_BOOTS);
                entries.add(ArmorRegistry.SCORPINOK_ARMOR_HELMET);
                entries.add(ArmorRegistry.SCORPINOK_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.SCORPINOK_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.SCORPINOK_ARMOR_BOOTS);
                entries.add(ArmorRegistry.SKYSTRIKE_JET);
                entries.add(ArmorRegistry.SCORPINOK_CAR);
                entries.add(ArmorRegistry.ROBO_1_CAR);
                entries.add(ArmorRegistry.CAR_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.ROBOT_STARSCREAM_ARMOR_HELMET);
                entries.add(ArmorRegistry.ROBOT_STARSCREAM_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.ROBOT_STARSCREAM_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.ROBOT_STARSCREAM_ARMOR_BOOTS);
                entries.add(ArmorRegistry.ROBOT_STARSCREAM_JET_ARMOR);
                entries.add(ArmorRegistry.OPTIMUS_PRIME_ARMOR_HELMET);
                entries.add(ArmorRegistry.OPTIMUS_PRIME_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.OPTIMUS_PRIME_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.OPTIMUS_PRIME_ARMOR_BOOTS);
                entries.add(ArmorRegistry.OPTIMUS_PRIME_CAR);
                entries.add(ArmorRegistry.ASTROTRAIN_TRAIN);
                entries.add(ArmorRegistry.ASTROTRAIN_SHUTTLE);
                entries.add(ArmorRegistry.ASTROTRAIN_HELMET);
                entries.add(ArmorRegistry.ASTROTRAIN_CHESTPLATE);
                entries.add(ArmorRegistry.ASTROTRAIN_LEGGINGS);
                entries.add(ArmorRegistry.ASTROTRAIN_BOOTS);
                entries.add(ArmorRegistry.BUMBLEBEE_HELMET);
                entries.add(ArmorRegistry.BUMBLEBEE_CHESTPLATE);
                entries.add(ArmorRegistry.BUMBLEBEE_LEGGINGS);
                entries.add(ArmorRegistry.BUMBLEBEE_BOOTS);
                entries.add(ArmorRegistry.BUMBLEBEE_CAR);
                entries.add(ArmorRegistry.IRONHIDE_HELMET);
                entries.add(ArmorRegistry.IRONHIDE_CHESTPLATE);
                entries.add(ArmorRegistry.IRONHIDE_LEGGINGS);
                entries.add(ArmorRegistry.IRONHIDE_BOOTS);
                entries.add(ArmorRegistry.IRONHIDE_CAR);
                entries.add(ArmorRegistry.SOUNDWAVE_HELMET);
                entries.add(ArmorRegistry.SOUNDWAVE_CHESTPLATE);
                entries.add(ArmorRegistry.SOUNDWAVE_LEGGINGS);
                entries.add(ArmorRegistry.SOUNDWAVE_BOOTS);
                entries.add(ArmorRegistry.SOUNDWAVE_RECORDER);
                entries.add(ArmorRegistry.MEGATRON_HELMET);
                entries.add(ArmorRegistry.MEGATRON_CHESTPLATE);
                entries.add(ArmorRegistry.MEGATRON_LEGGINGS);
                entries.add(ArmorRegistry.MEGATRON_BOOTS);



            }).build();
    private static final ItemGroup ORE_STUFF = FabricItemGroup.builder(new Identifier(OrmMain.MOD_ID, "ore_stuff"))
            .displayName(Text.literal("OrigamiKing's Robotics Armor Mod"))
            .icon(() -> new ItemStack(EnergonBlocks.ENERGON_BLOCK))
            .entries((context, entries) -> {
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
            }).build();
    public static void register() {
        OrmMain.LOGGER.info("Registering Groups");
    }
}
