package net.origamiking.mcmods.orm.armor.starscream;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.starscream.renderer.StarscreamArmorRenderer;
import net.origamiking.mcmods.orm.armor.starscream.renderer.StarscreamJetArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class StarscreamArmorItem extends TransformerArmorItem implements GeoItem {
    public StarscreamArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof StarscreamJetArmorRenderer)) {
                        renderer = new StarscreamJetArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof StarscreamArmorRenderer)) {
                        renderer = new StarscreamArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Starscream";
    }

    @Override
    public String armorId() {
        return "starscream";
    }

    public static String armorItemName() {
        return "Starscream";
    }

    public static String armorItemId() {
        return "starscream";
    }

    @Override
    public boolean isAutobot() {
        return false;
    }
}