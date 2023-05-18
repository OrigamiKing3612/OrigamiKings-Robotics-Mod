package net.origamiking.mcmods.orm.commands.versioncommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;

import static net.minecraft.server.command.CommandManager.literal;

public class ModVersionCommand {
    public static void getVersionCommand() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("origamikings-api-version")
                .executes(context -> {
                    context.getSource().sendMessage(Text.of(OrmMain.VERSION)/*Text.literal("Called /oem with no arguments")*/);
                    return 1;
                })));
    }
}
