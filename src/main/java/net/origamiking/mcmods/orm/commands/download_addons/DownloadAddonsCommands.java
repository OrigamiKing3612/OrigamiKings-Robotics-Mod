package net.origamiking.mcmods.orm.commands.download_addons;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;

public class DownloadAddonsCommands {
    public static void register() {
//        downloadAddonCommand("Alacrity", "https://cdn.modrinth.com/data/PUUpX2qq/versions/ZuLy4v1B/Alacrity.zip");
//        downloadAddonCommand("SimpleHotbar", "https://cdn.modrinth.com/data/d0w6GHbr/versions/Y0ccfZy0/SimpleHotbar.zip");
    }
    public static void downloadAddonCommand(String addon_name, String url) {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
                dispatcher.register(CommandManager.literal("orm-download-addon-" + addon_name).executes((context) -> {
                    (context.getSource()).sendMessage(Text.of("Downloading " + addon_name + " addon..."));
                    DownloadAddon.downloadAddon(context.getSource(), url, addon_name);
                    (context.getSource()).sendMessage(Text.of("Download Successful! Go to your Resource Packs to use!"));
                    return 1;
                })));
    }
}
