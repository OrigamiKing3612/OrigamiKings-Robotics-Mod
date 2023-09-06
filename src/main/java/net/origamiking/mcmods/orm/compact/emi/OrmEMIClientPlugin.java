package net.origamiking.mcmods.orm.compact.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.compact.emi.chip_refinery.ChipRefineryEmiRecipe;
import net.origamiking.mcmods.orm.recipe.ModRecipeType;
import net.origamiking.mcmods.orm.recipe.chip_refining.ChipRefineryRecipe;

public class OrmEMIClientPlugin implements EmiPlugin {
    public static final Identifier CHIP_REFINERY_SHEET = new Identifier("minecraft", "textures/gui/container/stonecutter.png");
    public static final EmiStack CHIP_REFINERY = EmiStack.of(BlockRegistry.CHIP_REFINERY_BLOCK);
    public static final EmiRecipeCategory CHIP_REFINERY_CATEGORY = new EmiRecipeCategory(new Identifier(OrmMain.MOD_ID, "chip_refinery"), CHIP_REFINERY, new EmiTexture(CHIP_REFINERY_SHEET, 0, 0, 16, 16));

    @Override
    public void register(EmiRegistry registry) {
        registry.addCategory(CHIP_REFINERY_CATEGORY);
        registry.addWorkstation(CHIP_REFINERY_CATEGORY, CHIP_REFINERY);

        RecipeManager manager = registry.getRecipeManager();

        // Use vanilla's concept of your recipes and pass them to your EmiRecipe representation
        for (RecipeEntry<ChipRefineryRecipe> recipe : manager.listAllOfType(ModRecipeType.CHIP_REFINERY_RECIPE)) {
            registry.addRecipe(new ChipRefineryEmiRecipe(recipe.value()));
        }
    }
}
