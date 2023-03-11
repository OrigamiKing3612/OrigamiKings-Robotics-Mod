package net.origamiking.orm.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.ArmorRegistry;
import net.origamiking.orm.items.custom.ItemRegistry;

public class ModGroups {
    private static final ItemGroup OEM_GROUP = FabricItemGroup.builder(new Identifier(OrmMain.MOD_ID, "orm_group"))
            .displayName(Text.literal("OrigamiKing's Robotics Mod"))
            .icon(() -> new ItemStack(Items.IRON_HELMET))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ArmorRegistry.ROBOT_1_ARMOR_HELMET);
                entries.add(ArmorRegistry.ROBOT_1_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.ROBOT_1_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.ROBOT_1_ARMOR_BOOTS);
                entries.add(ArmorRegistry.CAR_ARMOR_HELMET);
                entries.add(ArmorRegistry.CAR_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.CAR_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.CAR_ARMOR_BOOTS);
                entries.add(ArmorRegistry.ROBO_1_ARMOR_HELMET);
                entries.add(ArmorRegistry.ROBO_1_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.ROBO_1_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.ROBO_1_ARMOR_BOOTS);
                entries.add(ArmorRegistry.ROBOT_3_ARMOR_HELMET);
                entries.add(ArmorRegistry.ROBOT_3_ARMOR_CHESTPLATE);
                entries.add(ArmorRegistry.ROBOT_3_ARMOR_LEGGINGS);
                entries.add(ArmorRegistry.ROBOT_3_ARMOR_BOOTS);
                entries.add(ItemRegistry.ROBO_ADDON_1);

            }).build();
    public static void register() {
        OrmMain.LOGGER.info("Registering Groups");
    }
}
