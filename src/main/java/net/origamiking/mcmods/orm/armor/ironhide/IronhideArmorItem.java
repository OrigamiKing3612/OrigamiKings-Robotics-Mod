package net.origamiking.mcmods.orm.armor.ironhide;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.ironhide.renderer.IronhideArmorRenderer;
import net.origamiking.mcmods.orm.armor.ironhide.renderer.IronhideCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class IronhideArmorItem extends TransformerArmorItem implements GeoItem {
    public IronhideArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof IronhideCarArmorRenderer)) {
                        renderer = new IronhideCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof IronhideArmorRenderer)) {
                        renderer = new IronhideArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Ironhide";
    }

    @Override
    public String armorId() {
        return "ironhide";
    }

    public static String armorItemName() {
        return "Ironhide";
    }

    public static String armorItemId() {
        return "ironhide";
    }
    @Override
    public boolean isAutobot() {
        return true;
    }
}