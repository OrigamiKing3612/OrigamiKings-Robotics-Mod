package net.origamiking.mcmods.orm.items.chips.skystrike;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class SkystrikeChip extends ItemsUtils {
    public static final Item CHIP = registerItem(OrmMain.MOD_ID, "skystrike_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
