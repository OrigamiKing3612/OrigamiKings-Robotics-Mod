package net.origamiking.orm.items.chips.thunder_cracker;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class ThunderCrackerChip extends ItemsUtils {
    public static final Item THUNDER_CRACKER_CHIP = registerItem(OrmMain.MOD_ID, "thunder_cracker_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
