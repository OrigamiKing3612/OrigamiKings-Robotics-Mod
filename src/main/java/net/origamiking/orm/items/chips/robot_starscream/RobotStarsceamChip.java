package net.origamiking.orm.items.chips.robot_starscream;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class RobotStarsceamChip extends ItemsUtils {
    public static final Item ROBOT_STARSCREAM_CHIP = registerItem(OrmMain.MOD_ID, "robot_starscream_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
