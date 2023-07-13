package net.origamiking.mcmods.orm.items;

import net.origamiking.mcmods.orm.items.chips.ModChips;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.random.RandomItems;
import net.origamiking.mcmods.orm.items.spawnegg.ModSpawnEggs;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;
import net.origamiking.mcmods.orm.items.transformium_alloy.TransformiumAlloyItems;

public class ModItems {
    //    public static final Item NEW_ARMOR_STAND = new SpawnEggItem(, 0xc4c4c4, 0xadadad, new FabricItemSettings()));
    public static void register() {
        ItemRegistry.register();
        TransformiumItems.get();
        EnergonItems.get();
        Ore13Items.get();
        ModChips.register();
        RandomItems.get();
        ModSpawnEggs.get();
        TransformiumAlloyItems.get();
    }
}
