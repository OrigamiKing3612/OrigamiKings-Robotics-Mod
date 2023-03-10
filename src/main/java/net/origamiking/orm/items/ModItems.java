package net.origamiking.orm.items;

import net.origamiking.orm.armor.ArmorRegistry;
import net.origamiking.orm.items.custom.ItemRegistry;

public class ModItems {
//    public static final Item NEW_ARMOR_STAND = new SpawnEggItem(, 0xc4c4c4, 0xadadad, new FabricItemSettings()));
    public static void register() {
        ArmorRegistry.getArmor();
        ItemRegistry.register();
    }

}
