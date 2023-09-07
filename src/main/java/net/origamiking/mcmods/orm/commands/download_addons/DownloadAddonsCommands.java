package net.origamiking.mcmods.orm.commands.download_addons;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.Set;

public class DownloadAddonsCommands {
    public static void register(LiteralArgumentBuilder<ServerCommandSource> command) {
        try {
            JsonObject jsonObject = getJsonObject();

            Set<Map.Entry<String, JsonElement>> addonEntries = jsonObject.entrySet();
            for (Map.Entry<String, JsonElement> addonEntry : addonEntries) {
                String addonKey = addonEntry.getKey();
                JsonArray addonArray = addonEntry.getValue().getAsJsonArray();
                String addonName = addonArray.get(0).getAsString();
                String addonUrl = addonArray.get(1).getAsString();
                String addonModName = addonArray.get(2).getAsString();
                downloadAddonCommand(command, addonKey, addonName, addonUrl, addonModName);
            }
        } catch (IOException e) {
            OrmMain.LOGGER.error(String.valueOf(e));
        }
    }

    @NotNull
    private static JsonObject getJsonObject() throws IOException {
        String urlString = "https://wiki.origamiking.net/orm/1.20.1/addons.json";
        URL url = new URL(urlString);

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder jsonBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBuilder.append(line);
        }
        reader.close();

        String jsonData = jsonBuilder.toString();
        Gson gson = new Gson();
        return gson.fromJson(jsonData, JsonObject.class);
    }

    public static void downloadAddonCommand(LiteralArgumentBuilder<ServerCommandSource> command, String addonKey, String addonName, String url, String modName) {
        command.then(CommandManager.literal("download-addon-" + addonKey)
                .requires(source -> source.hasPermissionLevel(2))
                .executes((context) -> {
                    if (OrmMain.getOrmConfig().enableDownloadAddonsCommands) {
                        (context.getSource()).sendMessage(Text.of("Downloading " + addonName + " addon..."));
                        DownloadAddon.downloadAddon(context.getSource(), url, modName);
                        (context.getSource()).sendMessage(Text.translatable("orm.download_addon.successful"));
                    } else {
                        (context.getSource()).sendMessage(Text.translatable("orm.download_addon.not_enabled"));
                    }
                    return 1;
                })
        );
    }
}
