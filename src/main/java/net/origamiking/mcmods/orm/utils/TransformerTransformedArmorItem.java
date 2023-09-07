package net.origamiking.mcmods.orm.utils;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.entity.Entity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.oapi.armor.IOrigamiArmorItem;
import net.origamiking.mcmods.oapi.armor.OrigamiArmorItem;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class TransformerTransformedArmorItem extends OrigamiArmorItem implements GeoItem, IOrigamiArmorItem, Transformer {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

    protected TransformerTransformedArmorItem(Type type, Settings settings) {
        super(ModArmorMaterials.TRANSFORMER, type, settings);
    }

    protected TransformerTransformedArmorItem(ArmorMaterial armorMaterial, Type type, Settings settings) {
        super(armorMaterial, type, settings);
    }

    protected TransformerTransformedArmorItem(Type type) {
        super(ModArmorMaterials.TRANSFORMER, type, new OrigamiItemSettings());
    }

    protected TransformerTransformedArmorItem(ArmorMaterial armorMaterial, Type type) {
        super(armorMaterial, type, new OrigamiItemSettings());
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return this.renderProvider;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 20, state -> {
            state.getController().setAnimation(DefaultAnimations.IDLE);

            Entity entity = state.getData(DataTickets.ENTITY);
            Set<Item> wornArmor = new ObjectOpenHashSet<>();

            for (ItemStack stack : entity.getArmorItems()) {
                if (stack.isEmpty())
                    return PlayState.STOP;

                wornArmor.add(stack.getItem());
            }

            return PlayState.STOP;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
