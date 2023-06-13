package net.origamiking.mcmods.orm.items.chips.robot_starscream;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;

public class StarsceamChip extends ItemsUtils {
    public static final Item CHIP = registerItem(OrmMain.MOD_ID, "robot_starscream_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
