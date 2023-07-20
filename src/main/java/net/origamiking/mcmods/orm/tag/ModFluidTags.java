package net.origamiking.mcmods.orm.tag;

import net.minecraft.fluid.Fluid;
import net.minecraft.registry.tag.TagKey;
import net.origamiking.mcmods.orm.OrmMain;

import static net.origamiking.mcmods.oapi.tag.TagUtils.fluidTagKey;

public class ModFluidTags {
    public static final TagKey<Fluid> OIL = fluidTagKey(OrmMain.MOD_ID, "oil_fluid");
    public static final TagKey<Fluid> RAW_ENERGON = fluidTagKey(OrmMain.MOD_ID, "energon_fluid");
    public static final TagKey<Fluid> RAW_DARK_ENERGON = fluidTagKey(OrmMain.MOD_ID, "dark_energon_fluid");

    public static void get() {

    }
}
