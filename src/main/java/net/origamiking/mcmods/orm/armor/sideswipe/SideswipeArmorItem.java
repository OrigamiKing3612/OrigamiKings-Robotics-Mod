package net.origamiking.mcmods.orm.armor.sideswipe;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.sideswipe.renderer.SideswipeArmorRenderer;
import net.origamiking.mcmods.orm.armor.sideswipe.renderer.SideswipeCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class SideswipeArmorItem extends TransformerArmorItem implements GeoItem {
    public SideswipeArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof SideswipeCarArmorRenderer)) {
                        renderer = new SideswipeCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof SideswipeArmorRenderer)) {
                        renderer = new SideswipeArmorRenderer();
                    }
                }


                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Sideswipe";
    }

    @Override
    public String armorId() {
        return "sideswipe";
    }

    public static String armorItemName() {
        return "Sideswipe";
    }

    public static String armorItemId() {
        return "sideswipe";
    }

    @Override
    public boolean isAutobot() {
        return true;
    }
}