package net.origamiking.orm.commands;


import net.origamiking.mcmods.oapi.commands.versioncommand.ModVersionCommand;

public class ModCommands {
    public static void register() {
        ModVersionCommand.getVersionCommand();
    }
}
