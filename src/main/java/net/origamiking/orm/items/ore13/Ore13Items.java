package net.origamiking.orm.items.ore13;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class Ore13Items extends ItemsUtils {
    public static final Item ORE_13 = registerItem(OrmMain.MOD_ID, "ore_13", new Item(new OrigamiItemSettings()));

    public static void get() {}
}
