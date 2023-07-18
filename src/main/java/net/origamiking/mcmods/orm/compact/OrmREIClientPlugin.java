package net.origamiking.mcmods.orm.compact;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.compact.chip_refinery.ChipRefineryCategory;
import net.origamiking.mcmods.orm.compact.chip_refinery.ChipRefineryDisplay;
import net.origamiking.mcmods.orm.compact.compacter.CompacterCategory;
import net.origamiking.mcmods.orm.compact.compacter.CompacterDisplay;
import net.origamiking.mcmods.orm.compact.refinery.RefineryCategory;
import net.origamiking.mcmods.orm.compact.refinery.RefineryDisplay;
import net.origamiking.mcmods.orm.recipe.chip_refining.ChipRefineryRecipe;
import net.origamiking.mcmods.orm.recipe.compacter.CompacterRecipe;
import net.origamiking.mcmods.orm.recipe.refining.RefineryRecipe;
import net.origamiking.mcmods.orm.screen.chip_refinery.ChipRefineryScreen;
import net.origamiking.mcmods.orm.screen.compacter.CompacterBlockScreen;
import net.origamiking.mcmods.orm.screen.refinery.RefineryBlockScreen;

public class OrmREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new ChipRefineryCategory());
        registry.add(new RefineryCategory());
        registry.add(new CompacterCategory());

        registry.addWorkstations(RefineryCategory.REFINING, EntryStacks.of(BlockRegistry.REFINERY_BLOCK));
        registry.addWorkstations(ChipRefineryCategory.CHIP_REFINING, EntryStacks.of(BlockRegistry.CHIP_REFINERY_BLOCK));
        registry.addWorkstations(CompacterCategory.COMPACTER, EntryStacks.of(BlockRegistry.COMPACTER_BLOCK));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(ChipRefineryRecipe.class, ChipRefineryRecipe.Type.INSTANCE,
                ChipRefineryDisplay::new);

        registry.registerRecipeFiller(RefineryRecipe.class, RefineryRecipe.Type.INSTANCE,
                RefineryDisplay::new);

        registry.registerRecipeFiller(CompacterRecipe.class, CompacterRecipe.Type.INSTANCE,
                CompacterDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(((screen.width - 176) / 2) + 78,
                        ((screen.height - 166) / 2) + 30, 20, 25),
                ChipRefineryScreen.class,
                ChipRefineryCategory.CHIP_REFINING);

        registry.registerClickArea(screen -> new Rectangle(((screen.width - 176) / 2) + 78,
                        ((screen.height - 166) / 2) + 30, 20, 25),
                RefineryBlockScreen.class,
                RefineryCategory.REFINING);

        registry.registerClickArea(screen -> new Rectangle(((screen.width - 176) / 2) + 78,
                        ((screen.height - 166) / 2) + 30, 20, 25),
                CompacterBlockScreen.class,
                CompacterCategory.COMPACTER);
    }
}
