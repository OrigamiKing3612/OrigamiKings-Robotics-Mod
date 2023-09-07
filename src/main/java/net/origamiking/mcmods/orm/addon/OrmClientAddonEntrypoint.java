package net.origamiking.mcmods.orm.addon;

/**
 * A client entry point for ORM.
 *
 * <p>In {@code fabric.mod.json}, the entrypoint is defined with {@code orm-client-addon} key.</p>
 */
@FunctionalInterface
public interface OrmClientAddonEntrypoint {
    void onClientInitializeOrmAddon();
}
