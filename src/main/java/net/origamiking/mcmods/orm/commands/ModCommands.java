package net.origamiking.mcmods.orm.commands;


import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.commands.download_addons.DownloadAddonsCommands;

public class ModCommands {
    public static void register() {
        CommandsUtil.makeVersionCommand(OrmMain.MOD_ID, OrmMain.VERSION);
        CommandsUtil.linkReturnCommand(OrmMain.MOD_ID + "-wiki", "https://wiki.origamiking.net/orm/ORM.html", "To the ORM wiki!!");
//        DownloadAddonsCommands.register();
    }
}
