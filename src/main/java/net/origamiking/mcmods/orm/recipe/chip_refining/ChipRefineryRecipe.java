package net.origamiking.mcmods.orm.recipe.chip_refining;

import com.mojang.serialization.Codec;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.world.World;
import net.origamiking.mcmods.orm.blocks.custom.BlockRegistry;

public class ChipRefineryRecipe extends CuttingRecipe {
    public ChipRefineryRecipe(String group, Ingredient input, ItemStack output) {
        super(new Type(), new Serializer(), group, input, output);
    }

    public boolean matches(Inventory inventory, World world) {
        return this.ingredient.test(inventory.getStack(0));
    }

    public ItemStack createIcon() {
        return new ItemStack(BlockRegistry.CHIP_REFINERY_BLOCK);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<ChipRefineryRecipe> {
        public Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "chip_refining";
    }

    public static class Serializer implements RecipeSerializer<ChipRefineryRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "chip_refining";
        private static final Codec<ChipRefineryRecipe> codec =

//        @Override
//        public ChipRefineryRecipe read(Identifier id, JsonObject json) {
//            String string = JsonHelper.getString(json, "group", "");
//            Ingredient ingredient;
//            if (JsonHelper.hasArray(json, "ingredient")) {
//                ingredient = Ingredient.fromJson(JsonHelper.getArray(json, "ingredient"));
//            } else {
//                ingredient = Ingredient.fromJson(JsonHelper.getObject(json, "ingredient"));
//            }
//
//            String string2 = JsonHelper.getString(json, "result");
//            int i = JsonHelper.getInt(json, "count");
//            ItemStack itemStack = new ItemStack((ItemConvertible) Registries.ITEM.get(new Identifier(string2)), i);
//            return new ChipRefineryRecipe(string, ingredient, itemStack);
//        }

        @Override
        public ChipRefineryRecipe read(PacketByteBuf buf) {
            String string = buf.readString();
            Ingredient ingredient = Ingredient.fromPacket(buf);
            ItemStack itemStack = buf.readItemStack();
            return new ChipRefineryRecipe(string, ingredient, itemStack);
        }

        @Override
        public Codec<ChipRefineryRecipe> codec() {
            return ;
        }
        @Override
        public void write(PacketByteBuf buf, ChipRefineryRecipe recipe) {
            buf.writeString(recipe.group);
            recipe.ingredient.write(buf);
            buf.writeItemStack(recipe.result);
        }
    }
}