package net.origamiking.mcmods.orm.armor.skywarp;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.skywarp.renderer.SkywarpArmorRenderer;
import net.origamiking.mcmods.orm.armor.skywarp.renderer.SkywarpJetArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class SkywarpArmorItem extends TransformerArmorItem implements GeoItem {
    public SkywarpArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof SkywarpJetArmorRenderer)) {
                        renderer = new SkywarpJetArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof SkywarpArmorRenderer)) {
                        renderer = new SkywarpArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Skywarp";
    }

    @Override
    public String armorId() {
        return "skywarp";
    }

    public static String armorItemName() {
        return "Skywarp";
    }

    public static String armorItemId() {
        return "skywarp";
    }

    @Override
    public boolean isAutobot() {
        return false;
    }
}