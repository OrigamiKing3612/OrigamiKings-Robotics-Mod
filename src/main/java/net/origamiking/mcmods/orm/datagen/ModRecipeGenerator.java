package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.origamiking.mcmods.orm.datagen.recipes.ArmorRecipes;
import net.origamiking.mcmods.orm.datagen.recipes.BlockRecipes;
import net.origamiking.mcmods.orm.datagen.recipes.ShapedRecipes;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipes.get(exporter);
        BlockRecipes.get(exporter);
        ArmorRecipes.get(exporter);
    }
}
