package net.origamiking.mcmods.orm.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.IEntityDataSaver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class ModEntityDataSaverMixin implements IEntityDataSaver {
    private NbtCompound persistentData;

    @Override
    public NbtCompound getPersistentData() {
        if (this.persistentData == null) {
            this.persistentData = new NbtCompound();
        }
        return persistentData;
    }

    @Inject(method = "writeNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable<NbtCompound> info) {
        if (this.persistentData != null) {
            nbt.put(OrmMain.MOD_ID + ".is_transformed", persistentData);
        }
    }

    @Inject(method = "readNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info) {
        if (nbt.contains(OrmMain.MOD_ID + ".is_transformed", 10)) {
            this.persistentData = nbt.getCompound(OrmMain.MOD_ID + ".is_transformed");
        }
    }
}
