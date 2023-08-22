package net.origamiking.mcmods.orm.armor.ratchet;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.ratchet.renderer.RatchetArmorRenderer;
import net.origamiking.mcmods.orm.armor.ratchet.renderer.RatchetCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class RatchetArmorItem extends TransformerArmorItem implements GeoItem {
    public RatchetArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof RatchetCarArmorRenderer)) {
                        renderer = new RatchetCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof RatchetArmorRenderer)) {
                        renderer = new RatchetArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Ratchet";
    }

    @Override
    public String armorId() {
        return "ratchet";
    }

    public static String armorItemName() {
        return "Ratchet";
    }

    public static String armorItemId() {
        return "ratchet";
    }

    @Override
    public boolean isAutobot() {
        return true;
    }
}