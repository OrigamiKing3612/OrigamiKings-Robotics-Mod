package net.origamiking.mcmods.orm.armor.rodimus_prime;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.rodimus_prime.renderer.RodimusPrimeArmorRenderer;
import net.origamiking.mcmods.orm.armor.rodimus_prime.renderer.RodimusPrimeCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class RodimusPrimeArmorItem extends TransformerArmorItem implements GeoItem {
    public RodimusPrimeArmorItem(Type slot) {
        super(slot);
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
    public String armorName() {
        return "Rodimus Prime";
    }

    @Override
    public String armorId() {
        return "rodimus_prime";
    }

    public static String armorItemName() {
        return "Rodimus Prime";
    }

    public static String armorItemId() {
        return "rodimus_prime";
    }

    @Override
    public boolean isAutobot() {
        return true;
    }
}