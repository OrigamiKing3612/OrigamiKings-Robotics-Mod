package net.origamiking.mcmods.orm.commands.download_addons;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;

public class DownloadAddonsCommands {
    public static void register() {
        try {
            JSONObject jsonObject = getJsonObject();

            Iterator<String> addonKeys = jsonObject.keys();
            while (addonKeys.hasNext()) {
                String addonKey = addonKeys.next();
                JSONArray addonArray = jsonObject.getJSONArray(addonKey);
                String addonName = addonArray.getString(0);
                String addonUrl = addonArray.getString(1);
                String addonModName = addonArray.getString(2);
                downloadAddonCommand(addonKey, addonName, addonUrl, addonModName);
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    @NotNull
    private static JSONObject getJsonObject() throws IOException {
        String urlString = "https://wiki.origamiking.net/orm/addons.json";
        URL url = new URL(urlString);

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder jsonBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBuilder.append(line);
        }
        reader.close();

        String jsonData = jsonBuilder.toString();
        JSONObject jsonObject = new JSONObject(jsonData);
        return jsonObject;
    }

    public static void downloadAddonCommand(String addonKey, String addonName, String url, String modName) {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
                dispatcher.register(CommandManager.literal("orm-download-addon-" + addonKey).executes((context) -> {
                    (context.getSource()).sendMessage(Text.of("Downloading " + addonName + " addon..."));
                    DownloadAddon.downloadAddon(context.getSource(), url, modName);
                    (context.getSource()).sendMessage(Text.translatable("orm.download_addon.successful"));
                    return 1;
                })));
    }
}
