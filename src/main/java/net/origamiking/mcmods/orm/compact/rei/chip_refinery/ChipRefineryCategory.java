package net.origamiking.mcmods.orm.compact.rei.chip_refinery;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;

import java.util.LinkedList;
import java.util.List;

public class ChipRefineryCategory implements DisplayCategory<BasicDisplay> {
    private static final Identifier TEXTURE = new Identifier("textures/gui/container/stonecutter.png");
    public static final CategoryIdentifier<ChipRefineryDisplay> CHIP_REFINING = CategoryIdentifier.of(OrmMain.MOD_ID, "chip_refining");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return CHIP_REFINING;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("screen.orm.chip_refinery_block_title");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(BlockRegistry.CHIP_REFINERY_BLOCK.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 65);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 20, startPoint.y + 33)).entries(display.getInputEntries().get(0)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 143, startPoint.y + 33)).markOutput().entries(display.getOutputEntries().get(0)));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}
