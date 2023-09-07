package net.origamiking.mcmods.orm.items.chips.ratchet;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class RatchetChip extends ItemsUtils {
    public static final Item CHIP = registerItem(OrmMain.MOD_ID, "ratchet_chip", new Item(new OrigamiItemSettings()));

    public static void get() {
    }
}
