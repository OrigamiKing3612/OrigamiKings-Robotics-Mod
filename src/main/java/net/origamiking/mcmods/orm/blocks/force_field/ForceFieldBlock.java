package net.origamiking.mcmods.orm.blocks.force_field;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class ForceFieldBlock extends Block {
    public ForceFieldBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canMobSpawnInside(BlockState state) {
        return false;
    }
}
