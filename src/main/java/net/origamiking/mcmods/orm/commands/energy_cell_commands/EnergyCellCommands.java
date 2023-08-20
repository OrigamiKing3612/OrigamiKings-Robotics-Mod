package net.origamiking.mcmods.orm.commands.energy_cell_commands;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.EnergyCellsData;
import net.origamiking.mcmods.orm.utils.IEntityEnergyCellsDataSaver;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class EnergyCellCommands {
    public static void register(LiteralArgumentBuilder<ServerCommandSource> command) {
        command.then(CommandManager.literal("energy-cells").requires(source -> source.hasPermissionLevel(2))
                .then(CommandManager.literal("add").requires(source -> source.hasPermissionLevel(2))
                        .then(CommandManager.argument("player", EntityArgumentType.player())
                                .then(CommandManager.argument("amount", IntegerArgumentType.integer())
                                        .executes(EnergyCellCommands::executeAddEnergyCells))))
                .then(CommandManager.literal("remove").requires(source -> source.hasPermissionLevel(2))
                        .then(CommandManager.argument("player", EntityArgumentType.player())
                                .then(CommandManager.argument("amount", IntegerArgumentType.integer())
                                        .executes(EnergyCellCommands::executeRemoveEnergyCells))))
        );
    }

    private static int executeAddEnergyCells(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        if (!OrmMain.getOrmConfig().disableEnergyCells) {
            ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            int amount = IntegerArgumentType.getInteger(context, "amount");

            EnergyCellsData.addEnergyCells((IEntityEnergyCellsDataSaver) player, amount);
            (context.getSource()).sendMessage(Text.translatable("message.orm.added_energy_cell"));
        } else {
            (context.getSource()).sendMessage(Text.translatable("message.orm.disabled_energy_cell"));
        }
        return SINGLE_SUCCESS;
    }

    private static int executeRemoveEnergyCells(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        if (!OrmMain.getOrmConfig().disableEnergyCells) {
            ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            int amount = IntegerArgumentType.getInteger(context, "amount");

            EnergyCellsData.removeEnergyCells((IEntityEnergyCellsDataSaver) player, amount);
            (context.getSource()).sendMessage(Text.translatable("message.orm.removed_energy_cell"));
        } else {
            (context.getSource()).sendMessage(Text.translatable("message.orm.disabled_energy_cell"));
        }
        return SINGLE_SUCCESS;
    }
}
