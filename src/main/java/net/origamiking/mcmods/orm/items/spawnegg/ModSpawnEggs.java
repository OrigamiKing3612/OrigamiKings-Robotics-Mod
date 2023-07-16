package net.origamiking.mcmods.orm.items.spawnegg;

import net.minecraft.item.SpawnEggItem;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.entity.ModEntities;

public class ModSpawnEggs extends ItemsUtils {
    public static final SpawnEggItem VECTOR_GUARD_SPAWN_EGG = registerItem(OrmMain.MOD_ID, "vector_guard_spawn_egg", new SpawnEggItem(ModEntities.VECTOR_GUARD, 0x07A806, 0x44FF00, new OrigamiItemSettings()));

    public static void get() {

    }
}
