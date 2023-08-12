package net.origamiking.mcmods.orm.utils;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.origamiking.mcmods.oapi.armor.IOrigamiArmorItem;
import net.origamiking.mcmods.oapi.armor.OrigamiArmorItem;
import net.origamiking.mcmods.orm.OrmMain;
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

public abstract class TransformerArmorItem extends OrigamiArmorItem implements GeoItem, IOrigamiArmorItem, Transformer {
    public static boolean useTransformedRenderer = false;
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

    protected TransformerArmorItem(ArmorMaterial material, ArmorItem.Type type, Settings settings) {
        super(material, type, settings);
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

    public static void transform() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (OrmMain.getOrmConfig().enableTransforming) {
            useTransformedRenderer = !useTransformedRenderer;
        } else {
            OrmMain.LOGGER.info("Transforming is not enabled in config.");
            if (client.player != null) client.player.sendMessage(Text.translatable("message." + OrmMain.MOD_ID + "transform_not_enabled"));
            useTransformedRenderer = false;
        }
    }
    public static String armorItemName() {
        return "TransformerArmorItem";
    }

    public static String armorItemId() {
        return "transformer_armor_item";
    }
}
