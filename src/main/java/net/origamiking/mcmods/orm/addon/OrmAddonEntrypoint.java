package net.origamiking.mcmods.orm.addon;

/**
 * An entry point for ORM.
 *
 * <p>In {@code fabric.mod.json}, the entrypoint is defined with {@code orm-addon} key.</p>
 */
@FunctionalInterface
public interface OrmAddonEntrypoint {
    void onInitializeOrmAddon(OrmAddonHelper addonHelper);
}
