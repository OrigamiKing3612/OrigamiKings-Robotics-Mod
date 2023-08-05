package net.origamiking.mcmods.orm.world.dimension.cybertron;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.items.random.RandomItems;

public class CybertronDimension {
    public static void get() {
        registerPortal();
    }

    private static void registerPortal() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(OrmMain.getOrmConfig().ormPortalBlock)
                .lightWithItem(RandomItems.SPARK)
                .destDimID(new Identifier(OrmMain.MOD_ID, "cybertron"))
                .tintColor(0, 102, 255)
                .registerPortal();
    }
}
