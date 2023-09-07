package net.origamiking.mcmods.orm.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.origamiking.mcmods.oapi.tag.TagUtils;
import net.origamiking.mcmods.orm.OrmMain;

public class ModItemTags extends TagUtils {
    public static final TagKey<Item> CHIPS = itemTagKey(OrmMain.MOD_ID,"chips");
    public static final TagKey<Item> REFINERY_FUELS = itemTagKey(OrmMain.MOD_ID,"refinery_fuels");

    public static void get() {

    }
}
