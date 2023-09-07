package net.origamiking.mcmods.orm.armor.bumblebee;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.bumblebee.renderer.BumblebeeArmorRenderer;
import net.origamiking.mcmods.orm.armor.bumblebee.renderer.BumblebeeCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class BumblebeeArmorItem extends TransformerArmorItem implements GeoItem {

    public BumblebeeArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof BumblebeeCarArmorRenderer)) {
                        renderer = new BumblebeeCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof BumblebeeArmorRenderer)) {
                        renderer = new BumblebeeArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Bumblebee";
    }

    @Override
    public String armorId() {
        return "bumblebee";
    }

    public static String armorItemName() {
        return "Bumblebee";
    }

    public static String armorItemId() {
        return "bumblebee";
    }

    @Override
    public boolean isAutobot() {
        return true;
    }
}