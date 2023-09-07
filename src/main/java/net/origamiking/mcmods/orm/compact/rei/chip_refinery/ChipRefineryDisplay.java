package net.origamiking.mcmods.orm.compact.rei.chip_refinery;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.origamiking.mcmods.orm.recipe.chip_refining.ChipRefineryRecipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChipRefineryDisplay extends BasicDisplay {
    public ChipRefineryDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        super(inputs, outputs);
    }

    public ChipRefineryDisplay(ChipRefineryRecipe recipe) {
        super(getInputList(recipe), List.of(EntryIngredient.of(EntryStacks.of(recipe.getResult(null)))));
    }

    private static List<EntryIngredient> getInputList(ChipRefineryRecipe recipe) {
        if (recipe == null) return Collections.emptyList();
        List<EntryIngredient> list = new ArrayList<>();
        list.add(EntryIngredients.ofIngredient(recipe.getIngredients().get(0)));
        return list;
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return ChipRefineryCategory.CHIP_REFINING;
    }
}
