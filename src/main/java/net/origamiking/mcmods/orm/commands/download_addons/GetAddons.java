package net.origamiking.mcmods.orm.commands.download_addons;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetAddons {
    public static void getAddons() {
        try {
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

            JSONArray movieCharactersArray = jsonObject.getJSONArray("movie_characters");
            handleAddon(movieCharactersArray);

            JSONArray newAddonArray = jsonObject.getJSONArray("new_addon");
            handleAddon(newAddonArray);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleAddon(JSONArray addonArray) {
        String name = addonArray.getString(0);
        String downloadUrl = addonArray.getString(1);
        String version = addonArray.getString(2);

        System.out.println("Name: " + name);
        System.out.println("Download URL: " + downloadUrl);
        System.out.println("Version: " + version);
        System.out.println();
    }
}