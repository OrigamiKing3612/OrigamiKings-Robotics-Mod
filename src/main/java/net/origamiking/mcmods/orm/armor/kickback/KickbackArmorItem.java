package net.origamiking.mcmods.orm.armor.kickback;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.kickback.renderer.KickbackArmorRenderer;
import net.origamiking.mcmods.orm.armor.kickback.renderer.KickbackBugArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class KickbackArmorItem extends TransformerArmorItem implements GeoItem {
    public KickbackArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof KickbackBugArmorRenderer)) {
                        renderer = new KickbackBugArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof KickbackArmorRenderer)) {
                        renderer = new KickbackArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Kickback";
    }

    @Override
    public String armorId() {
        return "kickback";
    }

    public static String armorItemName() {
        return "Kickback";
    }

    public static String armorItemId() {
        return "kickback";
    }
    @Override
    public boolean isAutobot() {
        return true;
    }
}