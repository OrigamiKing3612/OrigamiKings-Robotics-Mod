package net.origamiking.mcmods.orm.items.ore13;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class Ore13Items extends ItemsUtils {
    public static final Item ORE_13 = registerItem(OrmMain.MOD_ID, "ore_13", new Item(new OrigamiItemSettings().rarity(Rarity.RARE)));

    public static void get() {
    }
}
