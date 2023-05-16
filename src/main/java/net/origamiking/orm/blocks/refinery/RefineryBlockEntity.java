package net.origamiking.orm.blocks.refinery;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class RefineryBlockEntity extends BlockEntity implements GeoBlockEntity, ImplementedInventory, NamedScreenHandlerFactory {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);


    // We statically instantiate our RawAnimations for efficiency, consistency, and error-proofing
//    private static final RawAnimation FERTILIZER_ANIMS = RawAnimation.begin().thenPlay("fertilizer.deploy").thenLoop("fertilizer.idle");
//    private static final RawAnimation BOTARIUM_ANIMS = RawAnimation.begin().thenPlay("botarium.deploy").thenLoop("botarium.idle");

    public RefineryBlockEntity(BlockPos pos, BlockState state) {
        super(ModRefineryBlock.REFINERY_BLOCK_ENTITY, pos, state);
    }

    // Let's set our animations up
    // For this one, we want it to play the "Fertilizer" animation set if it's raining,
    // or switch to a botarium if it's not.
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, state -> {
//            if (state.getAnimatable().getWorld().isRaining()) {
//                return state.setAndContinue(FERTILIZER_ANIMS);
//            }
//            else {
//                return state.setAndContinue(BOTARIUM_ANIMS);
//            }
            return PlayState.STOP;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        //We provide *this* to the screenHandler as our class Implements Inventory
        //Only the Server has the Inventory at the start, this will be synced to the client in the ScreenHandler
        return new RefineryScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public Text getDisplayName() {
        // for 1.19+
        return Text.translatable(getCachedState().getBlock().getTranslationKey());
        // for earlier versions
        // return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.inventory);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
    }
}