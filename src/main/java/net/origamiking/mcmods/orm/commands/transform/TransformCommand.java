package net.origamiking.mcmods.orm.commands.transform;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.IEntityDataSaver;
import net.origamiking.mcmods.orm.utils.TransformData;

public class TransformCommand {
    public static void register(LiteralArgumentBuilder<ServerCommandSource> command) {
        command.then(CommandManager.literal("transform").requires(source -> source.hasPermissionLevel(2))
                .then(CommandManager.argument("player", EntityArgumentType.player())
                        .executes(TransformCommand::transform)));
    }

    private static int transform(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        if (OrmMain.getOrmConfig().enableTransforming) {
            ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            TransformData.transform(((IEntityDataSaver) player));
        } else {
            (context.getSource()).sendMessage(Text.translatable("message.orm.transform_not_enabled"));
        }
        return 1;
    }
}
