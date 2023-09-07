package net.origamiking.mcmods.orm.items.chips.scorpinok;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class ScorpinokChip extends ItemsUtils {
    public static final Item CHIP = registerItem(OrmMain.MOD_ID, "scorpinok_chip", new Item(new OrigamiItemSettings()));

    public static void get() {
    }
}
