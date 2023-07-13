package net.origamiking.mcmods.orm.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

public class ModRecipeType {
    public static void register() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OrmMain.MOD_ID, ChipRefineryRecipe.Serializer.ID),
                ChipRefineryRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(OrmMain.MOD_ID, ChipRefineryRecipe.Type.ID),
                ChipRefineryRecipe.Type.INSTANCE);
    }

}
