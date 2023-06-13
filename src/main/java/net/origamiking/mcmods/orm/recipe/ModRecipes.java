package net.origamiking.mcmods.orm.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

public class ModRecipes {
    public static void register() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OrmMain.MOD_ID, CompactingRecipe.Serializer.ID),
                CompactingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(OrmMain.MOD_ID, CompactingRecipe.Type.ID),
                CompactingRecipe.Type.INSTANCE);
    }
}