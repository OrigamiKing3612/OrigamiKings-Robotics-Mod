package net.origamiking.mcmods.orm.items.spawnegg;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.entity.ModEntities;

public class ModSpawnEggs {
    public static final SpawnEggItem VECTOR_GUARD_SPAWN_EGG = registerItem("vector_guard_spawn_egg", new SpawnEggItem(ModEntities.VECTOR_GUARD, 0x07A806, 0x44FF00, new OrigamiItemSettings()));
    public static void get() {

    }
    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OrmMain.MOD_ID, name), item);
    }
}
