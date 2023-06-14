package net.origamiking.mcmods.orm.items.random;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class RandomItems extends ItemsUtils {
    public static final Item SPARK = registerItem(OrmMain.MOD_ID, "spark", new Item(new OrigamiItemSettings()));
    public static final Item ENERGY_CONDUCTOR = registerItem(OrmMain.MOD_ID, "energy_conductor", new Item(new OrigamiItemSettings()));

    public static void get() {

    }
}
