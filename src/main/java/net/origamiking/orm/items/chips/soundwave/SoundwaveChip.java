package net.origamiking.orm.items.chips.soundwave;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.orm.OrmMain;

public class SoundwaveChip extends ItemsUtils {
    public static final Item SOUNDWAVE_CHIP = registerItem(OrmMain.MOD_ID, "soundwave_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
