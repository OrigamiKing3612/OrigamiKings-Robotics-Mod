package net.origamiking.mcmods.orm.entity.vector_guard;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.origamiking.mcmods.orm.entity.group.ModEntityGroup;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class VectorGuardEntity extends HostileEntity implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public VectorGuardEntity(EntityType<? extends HostileEntity> type, World world) {
        super(type, world);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 40.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 10.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f)
                ;
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 1.1, false));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.8D));
//        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(1, new LookAroundGoal(this));
        this.targetSelector.add(6, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
        super.initGoals();
    }
    @Override
    public int getXpToDrop() {
        return super.getXpToDrop();
    }

    @Override
    public EntityGroup getGroup() {
        return ModEntityGroup.ORM_NONE;
    }

//    @Override
//    public ItemStack getProjectileType(ItemStack stack) {
//        if (stack.getItem() instanceof RangedWeaponItem) {
//            Predicate<ItemStack> predicate = ((RangedWeaponItem)stack.getItem()).getHeldProjectiles();
//            ItemStack itemStack = RangedWeaponItem.getHeldProjectile(this, predicate);
//            return itemStack.isEmpty() ? new ItemStack(Items.ARROW) : itemStack;
//        }
//        return ItemStack.EMPTY;
//    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(DefaultAnimations.genericWalkIdleController(this));
        controllers.add(DefaultAnimations.genericAttackAnimation(this, DefaultAnimations.ATTACK_STRIKE));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
