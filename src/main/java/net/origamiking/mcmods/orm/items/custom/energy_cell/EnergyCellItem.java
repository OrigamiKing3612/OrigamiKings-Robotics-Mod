package net.origamiking.mcmods.orm.items.custom.energy_cell;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.networking.ModMessages;
import net.origamiking.mcmods.orm.utils.IEntityEnergyCellsDataSaver;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

public class EnergyCellItem extends Item {

    public EnergyCellItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        //on both Client and Server
        if (ArmorUtils.isArmorSetOfType(player, TransformerArmorItem.class) && !(((IEntityEnergyCellsDataSaver) player).getPersistentData().getInt("energy_cells") >= 10)) {
            if (world.isClient()) {
                ClientPlayNetworking.send(ModMessages.ENERGY_CELLS_ID, PacketByteBufs.create());
            }
            if (!player.getAbilities().creativeMode) {
                player.getStackInHand(hand).decrement(1);
            }
            return TypedActionResult.consume(player.getStackInHand(hand));
        } else {
            return TypedActionResult.pass(player.getStackInHand(hand));
        }
    }
}
