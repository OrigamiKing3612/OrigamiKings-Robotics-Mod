package net.origamiking.mcmods.orm.recipe;

import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.recipe.chip_refining.ChipRefineryRecipe;
import net.origamiking.mcmods.orm.recipe.compacter.CompacterRecipe;
import net.origamiking.mcmods.orm.recipe.refining.RefineryRecipe;

public class ModRecipeType {
    public static final RecipeType<ChipRefineryRecipe> CHIP_REFINERY_RECIPE = Registry.register(Registries.RECIPE_TYPE, new Identifier(OrmMain.MOD_ID,
            ChipRefineryRecipe.Type.ID), ChipRefineryRecipe.Type.INSTANCE);

    public static final RecipeType<RefineryRecipe> REFINERY_RECIPE = Registry.register(Registries.RECIPE_TYPE, new Identifier(OrmMain.MOD_ID,
            RefineryRecipe.Type.ID), RefineryRecipe.Type.INSTANCE);
    public static void register() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OrmMain.MOD_ID, ChipRefineryRecipe.Serializer.ID),
                ChipRefineryRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OrmMain.MOD_ID, RefineryRecipe.Serializer.ID),
                RefineryRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OrmMain.MOD_ID, CompacterRecipe.Serializer.ID),
                CompacterRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_TYPE, new Identifier(OrmMain.MOD_ID, CompacterRecipe.Type.ID),
                CompacterRecipe.Type.INSTANCE);
    }
}
