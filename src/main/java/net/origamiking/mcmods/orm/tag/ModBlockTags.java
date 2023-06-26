package net.origamiking.mcmods.orm.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;

public class ModBlockTags {
    public static final TagKey<Block> ENERGON_BLOCKS = ModBlockTags.of("energon_blocks");
    public static final TagKey<Block> ORE_13_BLOCKS = ModBlockTags.of("ore_13_blocks");
    public static final TagKey<Block> TRANSFORMIUM_BLOCKS = ModBlockTags.of("transformium_blocks");
    public static void get() {

    }
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(OrmMain.MOD_ID, id));
    }
}
