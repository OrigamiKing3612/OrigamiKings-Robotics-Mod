package net.origamiking.mcmods.orm.recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.recipe.chip_refining.ChipRefineryRecipe;
import net.origamiking.mcmods.orm.recipe.compacter.CompacterRecipe;
import net.origamiking.mcmods.orm.recipe.refining.RefineryRecipe;

public class ModRecipeType {
    public static final RecipeType<ChipRefineryRecipe> CHIP_REFINERY_RECIPE = register("chip_refining");

    public static final RecipeType<RefineryRecipe> REFINERY_RECIPE = register("refining");
    public static final RecipeType<CompacterRecipe> COMPACTER_RECIPE = register("compacting");
    public static void register() {
    }
    public static <T extends Recipe<?>> RecipeType<T> register(final String id) {
        return Registry.register(Registries.RECIPE_TYPE, new Identifier(OrmMain.MOD_ID, id), new RecipeType<T>(){

            public String toString() {
                return id;
            }
        });
    }
}
