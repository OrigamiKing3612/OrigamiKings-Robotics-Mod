package net.origamiking.mcmods.orm.armor.scorpinok;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.armor.scorpinok.renderer.ScorpinokArmorRenderer;
import net.origamiking.mcmods.orm.armor.scorpinok.renderer.ScorpinokCarArmorRenderer;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class ScorpinokArmorItem extends TransformerArmorItem implements GeoItem {
    public ScorpinokArmorItem(Type slot) {
        super(slot);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (useTransformedRenderer) {
                    if (renderer == null || !(renderer instanceof ScorpinokCarArmorRenderer)) {
                        renderer = new ScorpinokCarArmorRenderer();
                    }
                } else {
                    if (renderer == null || !(renderer instanceof ScorpinokArmorRenderer)) {
                        renderer = new ScorpinokArmorRenderer();
                    }
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public String armorName() {
        return "Scorpinok";
    }

    @Override
    public String armorId() {
        return "scorpinok";
    }

    public static String armorItemName() {
        return "Scorpinok";
    }

    public static String armorItemId() {
        return "scorpinok";
    }

    @Override
    public boolean isAutobot() {
        return false;
    }
}