package net.origamiking.mcmods.orm.armor.sunstreaker;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.sunstreaker.renderer.SunstreakerArmorRenderer;
import net.origamiking.mcmods.orm.armor.sunstreaker.renderer.SunstreakerCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class SunstreakerArmorItem extends TransformerArmorItem implements GeoItem {
    public SunstreakerArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof SunstreakerCarArmorRenderer)) {
                        renderer = new SunstreakerCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof SunstreakerArmorRenderer)) {
                        renderer = new SunstreakerArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Sunstreaker";
    }

    @Override
    public String armorId() {
        return "sunstreaker";
    }

    public static String armorItemName() {
        return "Sunstreaker";
    }

    public static String armorItemId() {
        return "sunstreaker";
    }

    @Override
    public boolean isAutobot() {
        return true;
    }
}