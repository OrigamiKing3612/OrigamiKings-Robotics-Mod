package net.origamiking.orm.items.chips.scorpinok;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class ScorpinokChip extends ItemsUtils {
    public static final Item SCORPINOK_CHIP = registerItem(OrmMain.MOD_ID, "scorpinok_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
