package net.origamiking.mcmods.orm.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oapi.fluid.FluidUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.blocks.custom.fluid.OrmFluidBlock;
import net.origamiking.mcmods.orm.fluid.oil.OilFluid;
import net.origamiking.mcmods.orm.fluid.raw_dark_energon.RawDarkEnergonFluid;
import net.origamiking.mcmods.orm.fluid.raw_energon.RawEnergonFluid;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlockWithOutBlockItem;
import static net.origamiking.mcmods.oapi.items.ItemsUtils.registerItem;

public class ModFluids extends FluidUtils {
    public static FlowableFluid STILL_RAW_ENERGON = registerFluid(OrmMain.MOD_ID, "still_raw_energon", new RawEnergonFluid.Still());
    public static FlowableFluid FLOWING_RAW_ENERGON = registerFluid(OrmMain.MOD_ID, "flowing_raw_energon", new RawEnergonFluid.Flowing());
    public static Item RAW_ENERGON_BUCKET = registerItem(OrmMain.MOD_ID, "raw_energon_bucket", new BucketItem(ModFluids.STILL_RAW_ENERGON, new OrigamiItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    public static Block RAW_ENERGON_BLOCK = registerBlockWithOutBlockItem(OrmMain.MOD_ID, "raw_energon_fluid_block", new OrmFluidBlock(ModFluids.STILL_RAW_ENERGON, OrigamiBlockSettings.copyOf(Blocks.WATER).replaceable().liquid()));

    public static FlowableFluid STILL_RAW_DARK_ENERGON = registerFluid(OrmMain.MOD_ID, "still_raw_dark_energon", new RawDarkEnergonFluid.Still());
    public static FlowableFluid FLOWING_RAW_DARK_ENERGON = registerFluid(OrmMain.MOD_ID, ":flowing_raw_dark_energon", new RawDarkEnergonFluid.Flowing());
    public static Item RAW_DARK_ENERGON_BUCKET = registerItem(OrmMain.MOD_ID, "raw_dark_energon_bucket", new BucketItem(ModFluids.STILL_RAW_DARK_ENERGON, new OrigamiItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    public static Block RAW_DARK_ENERGON_BLOCK = registerBlockWithOutBlockItem(OrmMain.MOD_ID, "raw_dark_energon_fluid_block", new OrmFluidBlock(ModFluids.STILL_RAW_DARK_ENERGON, OrigamiBlockSettings.copyOf(Blocks.WATER).replaceable().liquid()));

    public static FlowableFluid STILL_OIL = registerFluid(OrmMain.MOD_ID, "still_oil", new OilFluid.Still());
    public static FlowableFluid FLOWING_OIL = registerFluid(OrmMain.MOD_ID, "flowing_oil", new OilFluid.Flowing());
    public static Item OIL_BUCKET = registerItem(OrmMain.MOD_ID, "oil_bucket", new BucketItem(ModFluids.STILL_OIL, new OrigamiItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    public static Block OIL_BLOCK = registerBlockWithOutBlockItem(OrmMain.MOD_ID, "oil_fluid_block", new OrmFluidBlock(ModFluids.STILL_OIL, OrigamiBlockSettings.copyOf(Blocks.WATER).replaceable().liquid()));

    public static void register() {

    }
}
