package net.origamiking.mcmods.orm.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class TransformKey {

    public static final String KEY_CATEGORY_TUTORIAL = "key.category.orm.main";
    public static final String KEY_TRANSFORM = "key.orm.transform";

    public static KeyBinding transformKey;

    private static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (transformKey.wasPressed()) {
                // This happens when our custom key is pressed
//                client.player.sendChatMessage("Hello I pressed a Key");
            }
        });
    }

    public static void register() {
        transformKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_TRANSFORM,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_TUTORIAL
        ));

        registerKeyInputs();
    }
}
