package net.origamiking.orm.items.chips.skystrike;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class SkystrikeChip extends ItemsUtils {
    public static final Item SKYSTRIKE_CHIP = registerItem(OrmMain.MOD_ID, "skystrike_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
