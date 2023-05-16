package net.origamiking.orm.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;

public class ModRecipes {
    public static void register() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OrmMain.MOD_ID, RefiningRecipe.Serializer.ID),
                RefiningRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(OrmMain.MOD_ID, RefiningRecipe.Type.ID),
                RefiningRecipe.Type.INSTANCE);
    }
}
