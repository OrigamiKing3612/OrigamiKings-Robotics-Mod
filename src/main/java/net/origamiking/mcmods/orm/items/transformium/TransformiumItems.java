package net.origamiking.mcmods.orm.items.transformium;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class TransformiumItems extends ItemsUtils {
    public static final Item TRANSFORMIUM = registerItem(OrmMain.MOD_ID, "transformium", new Item(new OrigamiItemSettings()));

    public static void get() {}
}
