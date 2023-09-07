package net.origamiking.mcmods.orm.recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.recipe.chip_refining.ChipRefineryRecipe;

public class ModRecipeSerializers<T extends Recipe<?>> {
    public static final RecipeSerializer<ChipRefineryRecipe> CHIP_REFINING = RecipeSerializer.register("chip_refining", new ChipRefineryRecipe.Serializer(ChipRefineryRecipe::new));

    public static void register() {

    }

    public static <S extends RecipeSerializer<T>, T extends Recipe<?>> S register(String id, S serializer) {
        return (S) Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OrmMain.MOD_ID, id), serializer);
    }
}
