package net.origamiking.mcmods.orm.armor.ironhide;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.ironhide.renderer.IronhideArmorRenderer;
import net.origamiking.mcmods.orm.armor.ironhide.renderer.IronhideCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class IronhideArmorItem extends TransformerArmorItem implements GeoItem {
    public IronhideArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof IronhideCarArmorRenderer)) {
                        renderer = new IronhideCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof IronhideArmorRenderer)) {
                        renderer = new IronhideArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

//    @Override
//    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
//        controllers.add(new AnimationController<>(this, 20, state -> {
//
//            state.getController().setAnimation(DefaultAnimations.IDLE);
//
//            Entity entity = state.getData(DataTickets.ENTITY);
//
//            Set<Item> wornArmor = new ObjectOpenHashSet<>();
//
//            for (ItemStack stack : entity.getArmorItems()) {
//                if (stack.isEmpty())
//                    return PlayState.STOP;
//
//                wornArmor.add(stack.getItem());
//            }
//
//            boolean isFullSet = wornArmor.containsAll(ObjectArrayList.of(
//                    Ironhide.HELMET,
//                    Ironhide.CHESTPLATE,
//                    Ironhide.LEGGINGS,
//                    Ironhide.BOOTS));
//
//            return PlayState.STOP;
//        }));
//    }
}