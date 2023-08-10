package net.origamiking.mcmods.orm.armor.thunder_cracker;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.thunder_cracker.renderer.ThunderCrackerArmorRenderer;
import net.origamiking.mcmods.orm.armor.thunder_cracker.renderer.ThunderCrackerJetArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class ThunderCrackerArmorItem extends TransformerArmorItem implements GeoItem {
    public ThunderCrackerArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof ThunderCrackerJetArmorRenderer)) {
                        renderer = new ThunderCrackerJetArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof ThunderCrackerArmorRenderer)) {
                        renderer = new ThunderCrackerArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String transformerName() {
        return "Thunder Cracker";
    }

    @Override
    public String transformerId() {
        return "thunder_cracker";
    }
}