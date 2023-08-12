package net.origamiking.mcmods.orm.armor.galvatron;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.galvatron.renderer.GalvatronArmorRenderer;
import net.origamiking.mcmods.orm.armor.galvatron.renderer.GalvatronGunArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class GalvatronArmorItem extends TransformerArmorItem implements GeoItem {

    public GalvatronArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof GalvatronGunArmorRenderer)) {
                        renderer = new GalvatronGunArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof GalvatronArmorRenderer)) {
                        renderer = new GalvatronArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Galvatron";
    }

    @Override
    public String armorId() {
        return "galvatron";
    }

    public static String armorItemName() {
        return "Galvatron";
    }

    public static String armorItemId() {
        return "galvatron";
    }

    @Override
    public boolean isAutobot() {
        return false;
    }
}