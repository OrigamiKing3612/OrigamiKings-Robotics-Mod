package net.origamiking.mcmods.orm.compact.rei.compacter;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.origamiking.mcmods.orm.recipe.compacter.CompacterRecipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompacterDisplay extends BasicDisplay {
    public CompacterDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        super(inputs, outputs);
    }

    public CompacterDisplay(CompacterRecipe recipe) {
        super(getInputList(recipe), List.of(EntryIngredient.of(EntryStacks.of(recipe.getOutput(null)))));
    }

    private static List<EntryIngredient> getInputList(CompacterRecipe recipe) {
        if(recipe == null) return Collections.emptyList();
        List<EntryIngredient> list = new ArrayList<>();
        list.add(EntryIngredients.ofIngredient(recipe.getIngredients().get(0)));
        return list;
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return CompacterCategory.COMPACTER;
    }
}
