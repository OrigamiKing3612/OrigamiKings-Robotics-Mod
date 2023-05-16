package net.origamiking.orm.blocks.refinery;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.screens.RefineryScreenHandler;

public class ModRefineryBlock extends BlocksUtils {
    public static final RefineryBlock REFINERY_BLOCK = registerBlock("refinery_block", new RefineryBlock());
    public static final BlockEntityType<RefineryBlockEntity> REFINERY_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(OrmMain.MOD_ID, "refinery_block_entity"),
            FabricBlockEntityTypeBuilder.create(RefineryBlockEntity::new, ModRefineryBlock.REFINERY_BLOCK).build());
    public static <B extends Block> B registerBlock(String name, B block) {
        return register(block, new Identifier(OrmMain.MOD_ID, name));
    }

    private static <B extends Block> B register(B block, Identifier name) {
        Registry.register(Registries.BLOCK, name, block);
        BlockItem item = new BlockItem(block, (new Item.Settings()));

        item.appendBlocks(Item.BLOCK_ITEMS, item);
        Registry.register(Registries.ITEM, name, item);
        return block;
    }
    public static void get() {
    }
}
