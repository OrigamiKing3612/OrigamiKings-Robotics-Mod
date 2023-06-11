package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oapi.recipes.ModRecipeProvider;
import net.origamiking.mcmods.orm.blocks.energon.EnergonBlocks;
import net.origamiking.mcmods.orm.blocks.ore13.Ore13Blocks;
import net.origamiking.mcmods.orm.blocks.transformium.TransformiumBlocks;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;
import net.origamiking.mcmods.orm.items.ore13.Ore13Items;
import net.origamiking.mcmods.orm.items.transformium.TransformiumItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, EnergonBlocks.ENERGON_BLOCK, EnergonItems.ENERGON);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, Ore13Blocks.ORE_13_BLOCK, Ore13Items.ORE_13);
        ModRecipeProvider.offer3x3CommpressandUncommpress(exporter, RecipeCategory.BUILDING_BLOCKS, TransformiumBlocks.TRANSFORMIUM_BLOCK, TransformiumItems.TRANSFORMIUM);
    }
}
