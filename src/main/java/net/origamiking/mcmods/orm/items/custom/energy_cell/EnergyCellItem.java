package net.origamiking.mcmods.orm.items.custom.energy_cell;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.networking.ModMessages;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

public class EnergyCellItem extends Item {

    public EnergyCellItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        //on both Client and Server
        if (world.isClient()) ClientPlayNetworking.send(ModMessages.ENERGY_CELLS_ID, PacketByteBufs.create());
        return TypedActionResult.pass(player.getStackInHand(hand));
    }

    private static boolean hasTransformerArmorOn(ServerPlayerEntity player) {
        return ArmorUtils.isArmorSetOfType(player, TransformerArmorItem.class);
    }
}
