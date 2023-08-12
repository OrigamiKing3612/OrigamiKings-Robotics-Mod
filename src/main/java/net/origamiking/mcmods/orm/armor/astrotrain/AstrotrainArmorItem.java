package net.origamiking.mcmods.orm.armor.astrotrain;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.astrotrain.renderer.AstrotrainArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class AstrotrainArmorItem extends TransformerArmorItem implements GeoItem {
    public AstrotrainArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;
            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (this.renderer == null)
                    this.renderer = new AstrotrainArmorRenderer();

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }
    @Override
    public String armorName() {
        return "Astrotrain";
    }
    @Override
    public String armorId() {
        return "astrotrain";
    }
    public static String armorItemName() {
        return "Astrotrain";
    }

    public static String armorItemId() {
        return "astrotrain";
    }
    @Override
    public boolean isAutobot() {
        return false;
    }
}