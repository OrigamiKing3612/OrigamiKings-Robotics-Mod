package net.origamiking.mcmods.orm.recipe.chip_refining;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.World;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;
import net.origamiking.mcmods.orm.recipe.ModRecipeSerializers;
import net.origamiking.mcmods.orm.recipe.ModRecipeType;

public class ChipRefineryRecipe implements Recipe<Inventory> {
    protected final Ingredient ingredient;
    protected final ItemStack result;
    protected final RecipeType<?> type;
    protected final RecipeSerializer<?> serializer;
    protected final String group;

    public ChipRefineryRecipe(String group, Ingredient ingredient, ItemStack result) {
        this.type = ModRecipeType.CHIP_REFINERY_RECIPE;
        this.serializer = ModRecipeSerializers.CHIP_REFINING;
        this.group = group;
        this.ingredient = ingredient;
        this.result = result;
    }

    public ChipRefineryRecipe(String group, Ingredient ingredient, Item result, int count) {
        this(group, ingredient, new ItemStack(result, count));
    }

    @Override
    public RecipeType<?> getType() {
        return this.type;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return this.serializer;
    }

    @Override
    public String getGroup() {
        return this.group;
    }

    @Override
    public ItemStack getResult(DynamicRegistryManager registryManager) {
        return this.result;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> defaultedList = DefaultedList.of();
        defaultedList.add(this.ingredient);
        return defaultedList;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack craft(Inventory inventory, DynamicRegistryManager registryManager) {
        return this.result.copy();
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return this.ingredient.test(inventory.getStack(0));
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockRegistry.CHIP_REFINERY_BLOCK);
    }

    public static class Serializer implements RecipeSerializer<ChipRefineryRecipe> {
        final RecipeFactory recipeFactory;
        private final Codec<ChipRefineryRecipe> codec;

        public Serializer(RecipeFactory recipeFactory) {
            this.recipeFactory = recipeFactory;
            this.codec = RecordCodecBuilder.create(instance -> instance
                    .group(Codecs.createStrictOptionalFieldCodec(Codec.STRING, "group", "")
                            .forGetter(recipe -> recipe.group), (Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient"))
                            .forGetter(recipe -> recipe.ingredient), (Registries.ITEM.getCodec().fieldOf("result"))
                            .forGetter(recipe -> recipe.result.getItem()), (Codec.INT.fieldOf("count"))
                            .forGetter(recipe -> recipe.result.getCount()))
                    .apply(/*(Applicative<ChipRefineryRecipe, ?>)*/instance, recipeFactory::create));
        }

        @Override
        public Codec<ChipRefineryRecipe> codec() {
            return this.codec;
        }

        @Override
        public ChipRefineryRecipe read(PacketByteBuf packetByteBuf) {
            String string = packetByteBuf.readString();
            Ingredient ingredient = Ingredient.fromPacket(packetByteBuf);
            ItemStack itemStack = packetByteBuf.readItemStack();
            return this.recipeFactory.create(string, ingredient, itemStack.getItem(), itemStack.getCount());
        }

        @Override
        public void write(PacketByteBuf packetByteBuf, ChipRefineryRecipe chipRefineryRecipe) {
            packetByteBuf.writeString(((ChipRefineryRecipe) chipRefineryRecipe).group);
            ((ChipRefineryRecipe) chipRefineryRecipe).ingredient.write(packetByteBuf);
            packetByteBuf.writeItemStack(((ChipRefineryRecipe) chipRefineryRecipe).result);
        }

        public static interface RecipeFactory {
            public ChipRefineryRecipe create(String var1, Ingredient var2, Item var3, int var4);
        }
    }
}