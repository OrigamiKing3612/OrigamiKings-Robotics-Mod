package net.origamiking.mcmods.orm.commands;


import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.commands.download_addons.DownloadAddonsCommands;
import net.origamiking.mcmods.orm.commands.energy_cell_commands.EnergyCellCommands;

import static net.minecraft.server.command.CommandManager.literal;

public class ModCommands {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            LiteralArgumentBuilder<ServerCommandSource> command = LiteralArgumentBuilder.literal("orm");
            EnergyCellCommands.register(command);

            linkReturnCommand(command, "wiki", "https://wiki.origamiking.net/orm/ORM.html", "Orm Wiki (Click me!)");
            versionCommand(command, OrmMain.VERSION, OrmMain.MOD_ID);
            DownloadAddonsCommands.register(command);

            dispatcher.register(command);
        });
    }
    //todo oapi
    public static void linkReturnCommand(LiteralArgumentBuilder<ServerCommandSource> command, String commandName, String link, String hoverText) {
        command.then(literal(commandName).executes(context -> {
            context.getSource().sendMessage(Text.literal(link).styled(style -> style.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, link))).styled(style -> style.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Text.of(hoverText)))));
            return 1;
        }));
    }

    public static void versionCommand(LiteralArgumentBuilder<ServerCommandSource> command, String version, String modid) {
        command.then(literal("version").executes(context -> {
            context.getSource().sendMessage(Text.of("You are on " + version + " of " + modid));
            return 1;
        }));
    }
}
