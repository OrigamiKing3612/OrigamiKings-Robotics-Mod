package net.origamiking.mcmods.orm.commands;


import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.commands.download_addons.DownloadAddonsCommands;
import net.origamiking.mcmods.orm.commands.energy_cell_commands.EnergyCellCommands;

public class ModCommands {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
                    LiteralArgumentBuilder<ServerCommandSource> command = LiteralArgumentBuilder.literal("orm");
                    EnergyCellCommands.register(command);
                    command.then(CommandManager.literal("wiki")
                            .executes(context -> {
                                context.getSource().sendMessage(Text.literal("Orm Wiki (Click me!)")
                                        .styled(style -> style.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://wiki.origamiking.net/orm/ORM.html")))
                                        .styled(style -> style.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Text.of("To the ORM wiki!!")))));
                                return 1;
                            }));
                    command.then(CommandManager.literal("version")
                            .executes(context -> {
                                context.getSource().sendMessage(Text.of("You are on " + OrmMain.VERSION + " of ORM"));
                                return 1;
                            }));
                    DownloadAddonsCommands.register(command);

                    dispatcher.register(command);
                }
        );
    }
}
