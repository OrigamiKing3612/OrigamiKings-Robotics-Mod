package net.origamiking.mcmods.orm.commands.download_addons;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;

public class DownloadAddonsCommands {
    public static void register() {
        // Addons are mods
        //example
//        downloadAddonCommand("Physics-Mod", "https://cdn.modrinth.com/data/Xy8aRQKS/versions/4xSgtf9P/physics-mod-3.0.5-mc-1.20-fabric.jar", "physics-mod-3.0.5-mc-1.20-fabric");
    }
    public static void downloadAddonCommand(String addon_name, String url, String mod_name) {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
                dispatcher.register(CommandManager.literal("orm-download-addon-" + addon_name).executes((context) -> {
                    (context.getSource()).sendMessage(Text.of("Downloading " + addon_name + " addon..."));
                    DownloadAddon.downloadAddon(context.getSource(), url, mod_name);
                    (context.getSource()).sendMessage(Text.of("Download Successful! Please restart your game to use the addon."));
                    return 1;
                })));
    }
}
