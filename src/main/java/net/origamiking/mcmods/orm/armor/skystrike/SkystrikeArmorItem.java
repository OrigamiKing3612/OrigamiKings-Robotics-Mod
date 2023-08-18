package net.origamiking.mcmods.orm.armor.skystrike;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.skystrike.renderer.SkystrikeArmorRenderer;
import net.origamiking.mcmods.orm.armor.skystrike.renderer.SkystrikeCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class SkystrikeArmorItem extends TransformerArmorItem implements GeoItem {
    public SkystrikeArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof SkystrikeCarArmorRenderer)) {
                        renderer = new SkystrikeCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof SkystrikeArmorRenderer)) {
                        renderer = new SkystrikeArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Skystrike";
    }

    @Override
    public String armorId() {
        return "skystrike";
    }

    public static String armorItemName() {
        return "Skystrike";
    }

    public static String armorItemId() {
        return "skystrike";
    }

    @Override
    public boolean isAutobot() {
        return true;
    }
}