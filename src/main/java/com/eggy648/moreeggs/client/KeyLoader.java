package com.eggy648.moreeggs.client;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

/**
 * Created by Cheese on 2017/2/25.
 * bind keys
 */
public class KeyLoader {
    public static KeyBinding showTime;
    public KeyLoader()
    {
        KeyLoader.showTime= new KeyBinding("key.moreeggs.show_time", KeyConflictContext.IN_GAME,
                Keyboard.KEY_F,"key.category.moreeggs");

        ClientRegistry.registerKeyBinding(showTime);
    }
}
