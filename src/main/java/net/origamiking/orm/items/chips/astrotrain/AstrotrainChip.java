package net.origamiking.orm.items.chips.astrotrain;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class AstrotrainChip extends ItemsUtils {
    public static final Item ASTROTRAIN_CHIP = registerItem(OrmMain.MOD_ID, "astrotrain_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
