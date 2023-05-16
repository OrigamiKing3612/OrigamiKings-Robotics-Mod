package net.origamiking.orm.items.chips.bumblebee;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class BumblebeeChip extends ItemsUtils {
    public static final Item BUMBLEBEE_CHIP = registerItem(OrmMain.MOD_ID, "bumblebee_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
