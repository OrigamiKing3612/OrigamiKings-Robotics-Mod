package net.origamiking.mcmods.orm.commands.download_addons;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class DownloadAddon {
    public static void downloadAddon(ServerCommandSource context, String fileURL, String name_of_resource_pack) {
        String savePath = FabricLoader.getInstance().getGameDir() + "/resourcepacks/" + name_of_resource_pack + ".zip";
        String destinationDirectory = FabricLoader.getInstance().getGameDir() + "/resourcepacks/";

        try {
            OrmMain.LOGGER.info("Your game directory: " + FabricLoader.getInstance().getGameDir());
            downloadFile(fileURL, savePath);
            moveFile(savePath, destinationDirectory);
            OrmMain.LOGGER.info("File downloaded and moved successfully!");
        } catch (IOException e) {
            OrmMain.LOGGER.error(String.valueOf(e));
            context.sendMessage(Text.of("There was an error; check your game log."));
        }
    }
    private static void downloadFile(String fileURL, String savePath) throws IOException {
        URL url = new URL(fileURL);
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(savePath);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }

        fileOutputStream.close();
        bufferedInputStream.close();
        inputStream.close();
    }

    private static void moveFile(String sourcePath, String destinationDirectory) throws IOException {
        Path source = Path.of(sourcePath);
        Path destination = Path.of(destinationDirectory, source.getFileName().toString());
        Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
