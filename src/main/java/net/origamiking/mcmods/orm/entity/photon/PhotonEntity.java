package net.origamiking.mcmods.orm.entity.photon;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.origamiking.mcmods.orm.entity.ModEntities;
import net.origamiking.mcmods.orm.items.custom.ItemRegistry;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class PhotonEntity extends PersistentProjectileEntity implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public PhotonEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }
    public PhotonEntity(World world, LivingEntity owner) {
        super(ModEntities.PhotonEntityType, owner, world);
    }

    public PhotonEntity(World world, double x, double y, double z) {
        super(ModEntities.PhotonEntityType, x, y, z, world);
    }

    @Override
    protected ItemStack asItemStack() {
        return ItemRegistry.PHOTON_ITEM.getDefaultStack();
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
    }

    @Override
    protected void onBlockCollision(BlockState state) {
        super.onBlockCollision(state);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
    }

    @Override
    public Direction getHorizontalFacing() {
        return super.getHorizontalFacing();
    }

    @Override
    public void changeLookDirection(double cursorDeltaX, double cursorDeltaY) {
        super.changeLookDirection(cursorDeltaX, cursorDeltaY);
    }

    @Override
    public Direction getMovementDirection() {
        return super.getMovementDirection();
    }
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
