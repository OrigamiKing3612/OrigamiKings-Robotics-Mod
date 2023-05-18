package net.origamiking.mcmods.orm.commands;


import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import net.origamiking.mcmods.orm.OrmMain;

public class ModCommands {
    public static void register() {
        CommandsUtil.makeVersionCommand(OrmMain.MOD_ID, OrmMain.VERSION);
    }
}
