package net.origamiking.mcmods.orm.compact.rei.refinery;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.items.energon.EnergonItems;

import java.util.LinkedList;
import java.util.List;

public class RefineryCategory implements DisplayCategory<BasicDisplay> {
    private static final Identifier TEXTURE = new Identifier(OrmMain.MOD_ID, "textures/gui/refinery_block_gui.png");
    public static final CategoryIdentifier<RefineryDisplay> REFINING = CategoryIdentifier.of(OrmMain.MOD_ID, "refining");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return REFINING;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("screen.orm.refinery_block_title");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(BlockRegistry.REFINERY_BLOCK.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 65);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 12, startPoint.y + 15)).entry(EntryStacks.of(new ItemStack(EnergonItems.ENERGON))));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 86, startPoint.y + 15)).entries(display.getInputEntries().get(0)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 86, startPoint.y + 60)).markOutput().entries(display.getOutputEntries().get(0)));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}
