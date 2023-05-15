package net.origamiking.orm.items;

import net.origamiking.orm.armor.ModArmor;
import net.origamiking.orm.items.custom.ItemRegistry;
import net.origamiking.orm.items.energon.EnergonItems;
import net.origamiking.orm.items.ore13.Ore13Items;
import net.origamiking.orm.items.transformium.TransformiumItems;

public class ModItems {
//    public static final Item NEW_ARMOR_STAND = new SpawnEggItem(, 0xc4c4c4, 0xadadad, new FabricItemSettings()));
    public static void register() {
        ItemRegistry.register();
        TransformiumItems.get();
        EnergonItems.get();
        Ore13Items.get();
    }
}
