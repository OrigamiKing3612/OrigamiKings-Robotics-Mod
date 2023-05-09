package net.origamiking.orm.commands;


import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import net.origamiking.orm.OrmMain;

public class ModCommands {
    public static void register() {
        CommandsUtil.makeVersionCommand(OrmMain.MOD_ID, OrmMain.VERSION);
    }
}
