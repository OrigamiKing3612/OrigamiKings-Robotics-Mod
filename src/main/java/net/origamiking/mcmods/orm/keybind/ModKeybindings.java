package net.origamiking.mcmods.orm.keybind;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.origamiking.mcmods.orm.OrmMain;
import org.lwjgl.glfw.GLFW;

public class ModKeybindings {
    public static final KeyBinding TRANSFORM_KEYBIND = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key." + OrmMain.MOD_ID + ".transform",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_T,
            "category." + OrmMain.MOD_ID + ".orm"
    ));

    public static void register() {}
}
