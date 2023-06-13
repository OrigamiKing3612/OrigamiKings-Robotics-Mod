package net.origamiking.mcmods.orm.items.chips.galvatron;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class GalvatronChip extends ItemsUtils {
    public static final Item GALVATRON_CHIP = registerItem(OrmMain.MOD_ID, "galvatron_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
