package net.origamiking.orm.items.custom;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;

public class ItemRegistry {
    public static final Robo_Addon_1_Item ROBO_ADDON_1 = registerItem("robo_addon_1", new Robo_Addon_1_Item(new Item.Settings()));



    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OrmMain.MOD_ID, name), item);
    }
    public static void register() {}

}
