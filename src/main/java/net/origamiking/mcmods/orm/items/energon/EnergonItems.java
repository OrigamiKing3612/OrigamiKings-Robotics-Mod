package net.origamiking.mcmods.orm.items.energon;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class EnergonItems extends ItemsUtils {
    public static final Item ENERGON = registerItem(OrmMain.MOD_ID, "energon", new Item(new OrigamiItemSettings().rarity(Rarity.RARE)));
    public static final Item DARK_ENERGON = registerItem(OrmMain.MOD_ID, "dark_energon", new Item(new OrigamiItemSettings().rarity(Rarity.RARE)));

    public static void get() {}
}
