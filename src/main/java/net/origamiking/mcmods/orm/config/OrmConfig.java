package net.origamiking.mcmods.orm.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.origamiking.mcmods.orm.OrmMain;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class OrmConfig {
    public static void load() {
        File configFile = new File(FabricLoader.getInstance().getConfigDir().toFile(), OrmMain.MOD_ID + "_config.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if (configFile.exists()) {
            try {
                FileReader fileReader = new FileReader(configFile);
                OrmMain.ORM_CONFIG = gson.fromJson(fileReader, OrmConfigHandler.class);
                fileReader.close();
                save();
            } catch (IOException e) {
                OrmMain.LOGGER.warn("Orm config was not loaded: " + e.getLocalizedMessage());
            }
        } else {
            OrmMain.ORM_CONFIG = new OrmConfigHandler();
            save();
        }
    }

    public static void save() {
        File configFile = new File(FabricLoader.getInstance().getConfigDir().toFile(), OrmMain.MOD_ID + "_config.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if (!configFile.getParentFile().exists()) {
            configFile.getParentFile().mkdir();
        }
        try {
            FileWriter fileWriter = new FileWriter(configFile);
            fileWriter.write(gson.toJson(OrmMain.ORM_CONFIG));
            fileWriter.close();
        } catch (IOException e) {
            OrmMain.LOGGER.warn("Orm config was not saved: " + e.getLocalizedMessage());
        }
    }
}
