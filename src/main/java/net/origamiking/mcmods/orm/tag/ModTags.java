package net.origamiking.mcmods.orm.tag;

public class ModTags {
    public static void register() {
        ModBlockTags.get();
        ModItemTags.get();
        ModFluidTags.get();
    }
}
