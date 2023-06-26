package net.origamiking.mcmods.orm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.origamiking.mcmods.orm.datagen.advancements.OrmAdvancements;

import java.util.function.Consumer;

public class ModAdvancementGenerator extends FabricAdvancementProvider {
    protected ModAdvancementGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        new OrmAdvancements().accept(consumer);
    }
}
