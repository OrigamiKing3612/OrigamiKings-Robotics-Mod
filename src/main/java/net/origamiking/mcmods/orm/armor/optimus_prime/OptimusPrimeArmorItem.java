package net.origamiking.mcmods.orm.armor.optimus_prime;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.optimus_prime.renderer.OptimusPrimeArmorRenderer;
import net.origamiking.mcmods.orm.armor.optimus_prime.renderer.OptimusPrimeCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class OptimusPrimeArmorItem extends TransformerArmorItem implements GeoItem {
    public OptimusPrimeArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof OptimusPrimeCarArmorRenderer)) {
                        renderer = new OptimusPrimeCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof OptimusPrimeArmorRenderer)) {
                        renderer = new OptimusPrimeArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Optimus Prime";
    }

    @Override
    public String armorId() {
        return "optimus_prime";
    }

    public static String armorItemName() {
        return "Optimus Prime";
    }

    public static String armorItemId() {
        return "optimus_prime";
    }

    @Override
    public boolean isAutobot() {
        return true;
    }
}