package net.origamiking.mcmods.orm.items.energon;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class EnergonItems extends ItemsUtils {
    public static final Item ENERGON = registerItem(OrmMain.MOD_ID, "energon", new Item(new OrigamiItemSettings()));

    public static void get() {}
}
