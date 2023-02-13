package net.bern.tbatemod.event;

import net.bern.tbatemod.networking.ModMessages;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_TBATE = "key.tbate.tbate";
    public static final String KEY_MENU = "key.tbate.menu";

    public static KeyBinding keyBinding;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (keyBinding.wasPressed()) {
                ClientPlayNetworking.send(ModMessages.TBATE_ID, PacketByteBufs.create());
                // this happens when custom key is pressed
            }
        });
    }

    public static void register() {
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_MENU,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_0,
                KEY_CATEGORY_TBATE
        ));
        registerKeyInputs();
    }
}
