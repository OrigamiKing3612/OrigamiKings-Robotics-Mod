package net.origamiking.mcmods.orm.items.chips.ironhide;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class IronhideChip extends ItemsUtils {
    public static final Item IRONHIDE_CHIP = registerItem(OrmMain.MOD_ID, "ironhide_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
