package net.origamiking.orm.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.ArmorRegistry;
import net.origamiking.orm.items.custom.ItemRegistry;

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
    public static void register() {
        OrmMain.LOGGER.info("Registering Groups");
    }
}
