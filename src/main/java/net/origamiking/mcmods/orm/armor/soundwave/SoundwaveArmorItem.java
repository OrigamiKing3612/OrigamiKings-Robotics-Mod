package net.origamiking.mcmods.orm.armor.soundwave;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.soundwave.renderer.SoundwaveArmorRenderer;
import net.origamiking.mcmods.orm.armor.soundwave.renderer.SoundwaveRecorderArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class SoundwaveArmorItem extends TransformerArmorItem implements GeoItem {
    public SoundwaveArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof SoundwaveRecorderArmorRenderer)) {
                        renderer = new SoundwaveRecorderArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof SoundwaveArmorRenderer)) {
                        renderer = new SoundwaveArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String transformerName() {
        return "Soundwave";
    }

    @Override
    public String transformerId() {
        return "soundwave";
    }
}