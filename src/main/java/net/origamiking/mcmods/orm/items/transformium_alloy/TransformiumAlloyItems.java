package net.origamiking.mcmods.orm.items.transformium_alloy;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class TransformiumAlloyItems extends ItemsUtils {
    public static final Item TRANSFORMIUM_ALLOY = registerItem(OrmMain.MOD_ID, "transformium_alloy", new Item(new OrigamiItemSettings()));
    public static final Item TRANSFORMIUM_ALLOY_BRICK = registerItem(OrmMain.MOD_ID, "transformium_alloy_brick", new Item(new OrigamiItemSettings()));

    public static void get() {

    }
}
