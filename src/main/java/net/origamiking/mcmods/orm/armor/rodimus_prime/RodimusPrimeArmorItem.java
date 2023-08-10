package net.origamiking.mcmods.orm.armor.rodimus_prime;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.rodimus_prime.renderer.RodimusPrimeArmorRenderer;
import net.origamiking.mcmods.orm.armor.rodimus_prime.renderer.RodimusPrimeCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class RodimusPrimeArmorItem extends TransformerArmorItem implements GeoItem {
    public RodimusPrimeArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof RodimusPrimeCarArmorRenderer)) {
                        renderer = new RodimusPrimeCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof RodimusPrimeArmorRenderer)) {
                        renderer = new RodimusPrimeArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String transformerName() {
        return "Rodimus Prime";
    }

    @Override
    public String transformerId() {
        return "rodimus_prime";
    }

//    @Override
//    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
//        controllers.add(new AnimationController<>(this, 20, state -> {
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
//                    RodimusPrime.HELMET,
//                    RodimusPrime.CHESTPLATE,
//                    RodimusPrime.LEGGINGS,
//                    RodimusPrime.BOOTS));
//
//            return PlayState.STOP;
//        }));
//    }
}