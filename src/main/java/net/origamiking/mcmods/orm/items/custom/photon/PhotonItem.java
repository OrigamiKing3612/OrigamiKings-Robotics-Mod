package net.origamiking.mcmods.orm.items.custom.photon;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.origamiking.mcmods.orm.entity.photon.PhotonEntity;

public class PhotonItem extends Item {

    public PhotonItem(Settings settings) {
        super(settings);
    }

    public PersistentProjectileEntity createPhoton(World world, ItemStack stack, LivingEntity shooter) {
        return new PhotonEntity(world, shooter);
    }
}
